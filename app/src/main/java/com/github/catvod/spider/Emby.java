package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.AliDriveApi;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Emby extends NetPan {
    private static final ConcurrentHashMap<String, JSONObject> authCache = new ConcurrentHashMap<>();
    private Map<String, String> headers;
    private String serverUrl = "";
    private String username = "";
    private String password = "";
    private String clientName = "";
    private String clientVersion = "0.2.3";
    private String deviceName = "";
    private String deviceId = "";

    private String buildUrlWithParams(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("?");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                sb.append("&");
            } catch (Exception unused) {
            }
        }
        if (sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private String cleanHtmlText(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(" ", " ").replace("&nbsp;", " ").replace("&amp;", "&").trim();
    }

    public static long getRandomPositionTicksSafe(long j) {
        long jNextLong;
        do {
            jNextLong = new Random().nextLong() % j;
        } while (jNextLong < 0);
        return jNextLong;
    }

    private JSONObject authenticate() {
        try {
            String cacheKey = String.format("emby_%s_%s_%s", this.serverUrl, this.username, this.password);
            ConcurrentHashMap<String, JSONObject> cache = authCache;
            JSONObject cached = cache.get(cacheKey);
            if (cached != null) {
                return cached;
            }
            String url = String.format("%s/emby/Users/AuthenticateByName", this.serverUrl);
            HashMap<String, String> authHeaders = new HashMap<>(this.headers);
            authHeaders.put("Content-Type", "application/json; charset=UTF-8");
            HashMap<String, String> authBody = new HashMap<>();
            authBody.put("Username", this.username);
            authBody.put("Password", this.password);
            authBody.put("Pw", this.password);
            authBody.put("X-Emby-Client", this.clientName);
            authBody.put("X-Emby-Device-Name", this.deviceName);
            authBody.put("X-Emby-Device-Id", this.deviceId);
            authBody.put("X-Emby-Client-Version", this.clientVersion);
            JSONObject authResult = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.i("Username=" + this.username + "&Pw=" + this.password, buildUrlWithParams(url, authBody), authHeaders));
            cache.put(cacheKey, authResult);
            return authResult;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private List<com.github.catvod.spider.merge.K.FilterGroup> buildFilterList() {
        ArrayList<com.github.catvod.spider.merge.K.FilterGroup> filterGroups = new ArrayList<>();
        List<String> list = GeneralUtils.a;
        int currentYear = Calendar.getInstance().get(1);
        ArrayList<com.github.catvod.spider.merge.K.FilterValue> yearValues = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String year = String.valueOf(currentYear - i);
            yearValues.add(new com.github.catvod.spider.merge.K.FilterValue(year, year));
        }
        filterGroups.add(new com.github.catvod.spider.merge.K.FilterGroup("year", "年份筛选", yearValues));
        filterGroups.add(new com.github.catvod.spider.merge.K.FilterGroup("type", "排序类型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("IMDb评分", "CommunityRating,SortName"), new com.github.catvod.spider.merge.K.FilterValue("加入日期", "DateCreated,SortName"), new com.github.catvod.spider.merge.K.FilterValue("播放日期", "SeriesDatePlayed,SortName"), new com.github.catvod.spider.merge.K.FilterValue("年份", "ProductionYear,SortName"), new com.github.catvod.spider.merge.K.FilterValue("发行日期", "ProductionYear,PremiereDate,SortName"))));
        filterGroups.add(new com.github.catvod.spider.merge.K.FilterGroup("order", "排序方式", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("⬆", "Ascending"), new com.github.catvod.spider.merge.K.FilterValue("⬇", "Descending"))));
        return filterGroups;
    }

    private void reportPlayback(JSONObject auth, String[] playParts, Map<String, String> map, JSONObject mediaInfo) throws JSONException {
        long runtimeTicks;
        String url = String.format("%s/emby/Sessions/Playing", this.serverUrl);
        HashMap<String, String> params = new HashMap<>();
        params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
        params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
        params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
        params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
        params.put("X-Emby-Token", auth.getString("AccessToken"));
        params.put("reqformat", "json");
        String fullUrl = buildUrlWithParams(url, params);
        String mediaSourceId = mediaInfo.getJSONArray("MediaSources").getJSONObject(0).getString("Id");
        String playSessionId = mediaInfo.getString("PlaySessionId");
        try {
            runtimeTicks = mediaInfo.getJSONArray("MediaSources").getJSONObject(0).getLong("RunTimeTicks");
        } catch (Exception unused) {
            runtimeTicks = 255;
        }
        com.github.catvod.spider.merge.f0.HttpClient.f(fullUrl, "{\"VolumeLevel\":100,\"IsMuted\":false,\"IsPaused\":false,\"RepeatMode\":\"RepeatNone\",\"Shuffle\":false,\"SubtitleOffset\":0,\"PlaybackRate\":1,\"MaxStreamingBitrate\":3570000,\"PositionTicks\":" + getRandomPositionTicksSafe(runtimeTicks) + ",\"PlaybackStartTimeTicks\":" + (System.currentTimeMillis() * 10000) + ",\"SubtitleStreamIndex\":-1,\"AudioStreamIndex\":1,\"BufferedRanges\":[{\"start\":3269220000.0000005,\"end\":3302400000},{\"start\":5224970000,\"end\":5283330000}],\"SeekableRanges\":[{\"start\":0,\"end\":" + runtimeTicks + "}],\"PlayMethod\":\"DirectStream\",\"PlaySessionId\":\"" + playSessionId + "\",\"MediaSourceId\":\"" + mediaSourceId + "\",\"CanSeek\":true,\"ItemId\":\"" + playParts[0] + "\",\"PlaylistIndex\":0,\"PlaylistLength\":15,\"NowPlayingQueue\":[{\"Id\":\"" + playParts[0] + "\",\"PlaylistItemId\":\"playlistItem0\"},{\"Id\":\"50175\",\"PlaylistItemId\":\"playlistItem1\"},{\"Id\":\"50173\",\"PlaylistItemId\":\"playlistItem2\"},{\"Id\":\"50172\",\"PlaylistItemId\":\"playlistItem3\"},{\"Id\":\"50174\",\"PlaylistItemId\":\"playlistItem4\"},{\"Id\":\"50171\",\"PlaylistItemId\":\"playlistItem5\"},{\"Id\":\"50176\",\"PlaylistItemId\":\"playlistItem6\"},{\"Id\":\"50377\",\"PlaylistItemId\":\"playlistItem7\"},{\"Id\":\"50378\",\"PlaylistItemId\":\"playlistItem8\"},{\"Id\":\"51133\",\"PlaylistItemId\":\"playlistItem9\"},{\"Id\":\"51134\",\"PlaylistItemId\":\"playlistItem10\"},{\"Id\":\"51332\",\"PlaylistItemId\":\"playlistItem11\"},{\"Id\":\"51452\",\"PlaylistItemId\":\"playlistItem12\"},{\"Id\":\"51608\",\"PlaylistItemId\":\"playlistItem13\"},{\"Id\":\"51938\",\"PlaylistItemId\":\"playlistItem14\"}]}", map).a();
    }

    @Override
    public String categoryContent(String typeId, String filter, boolean filterGenre, HashMap<String, String> extend) {
        try {
            JSONObject auth = authenticate();
            if (auth == null) {
                return VodResult.c("获取Emby服务器信息出错");
            }
            HashMap<String, String> headersMap = new HashMap<>(this.headers);
            headersMap.put("Content-Type", "application/json; charset=UTF-8");
            String url = String.format("%s/emby/Users/%s/Items", this.serverUrl, auth.getJSONObject("User").getString("Id"));
            HashMap<String, String> params = new HashMap<>();
            params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
            params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
            params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
            params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            params.put("X-Emby-Token", auth.getString("AccessToken"));
            params.put("ParentId", typeId);
            params.put("Fields", "BasicSyncInfo,CanDelete,Container,PrimaryImageAspectRatio,ProductionYear,Status,EndDate,CommunityRating");
            params.put("StartIndex", String.valueOf((Integer.parseInt(extend.getOrDefault("page", "1")) - 1) * 50));
            params.put("EnableImageTypes", "Primary,Backdrop,Thumb");
            params.put("ImageTypeLimit", "1");
            params.put("Recursive", "true");
            params.put("IncludeItemTypes", "Movie,Series,BoxSet");
            params.put("GroupProgramsBySeries", "true");
            params.put("Limit", "50");
            params.put("EnableTotalRecordCount", "true");
            if (extend.containsKey("year")) {
                params.put("Years", extend.get("year"));
            }
            if (extend.containsKey("type")) {
                params.put("SortBy", extend.get("type"));
            }
            if (extend.containsKey("order")) {
                params.put("SortOrder", extend.get("order"));
            }
            JSONObject response = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(url, params), headersMap, null));
            JSONArray items = response.getJSONArray("Items");
            ArrayList<VodItem> vodItems = new ArrayList<>();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                VodItem vodItem = new VodItem();
                vodItem.l(item.getString("Id"));
                vodItem.m(cleanHtmlText(item.getString("Name")));
                if (item.has("ImageTags") && item.getJSONObject("ImageTags").has("Primary")) {
                    vodItem.n(String.format("%s/emby/Items/%s/Images/Primary?maxWidth=400&tag=%s&quality=90", this.serverUrl, item.getString("Id"), item.getJSONObject("ImageTags").getString("Primary")));
                }
                try {
                    vodItem.q("⭐" + item.getString("CommunityRating") + " 📺" + item.getJSONObject("UserData").getString("UnplayedItemCount") + " " + item.getInt("ProductionYear") + "年");
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
                vodItems.add(vodItem);
            }
            return VodResult.q(vodItems, buildFilterList());
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return VodResult.c("分类获取失败: " + e2.getMessage());
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            JSONObject auth = authenticate();
            if (auth == null) {
                return VodResult.c("获取Emby服务器信息出错");
            }
            HashMap<String, String> headersMap = new HashMap<>(this.headers);
            headersMap.put("Content-Type", "application/json; charset=UTF-8");
            String id = ids.get(0);
            String url = String.format("%s/emby/Items/%s", this.serverUrl, id);
            HashMap<String, String> params = new HashMap<>();
            params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
            params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
            params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
            params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            params.put("X-Emby-Token", auth.getString("AccessToken"));
            params.put("Fields", "BasicSyncInfo,CanDelete,Container,PrimaryImageAspectRatio,ProductionYear,Overview,Genres,CommunityRating,Status,EndDate");
            JSONObject item = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(url, params), headersMap, null));
            VodItem vodItem = new VodItem();
            vodItem.l(item.getString("Id"));
            vodItem.m(cleanHtmlText(item.getString("Name")));
            if (item.has("ImageTags") && item.getJSONObject("ImageTags").has("Primary")) {
                vodItem.n(String.format("%s/emby/Items/%s/Images/Primary?maxWidth=400&tag=%s&quality=90", this.serverUrl, item.getString("Id"), item.getJSONObject("ImageTags").getString("Primary")));
            }
            try {
                vodItem.q(String.valueOf(item.getInt("ProductionYear")));
            } catch (Exception unused) {
            }
            try {
                JSONArray genres = item.getJSONArray("Genres");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < genres.length(); i++) {
                    if (i > 0) sb.append("/");
                    sb.append(genres.getString(i));
                }
                vodItem.r(sb.toString());
            } catch (Exception unused2) {
            }
            try {
                vodItem.s(item.optString("Overview", ""));
            } catch (Exception unused3) {
            }
            String type = item.optString("Type", "");
            StringBuilder playFrom = new StringBuilder();
            StringBuilder playUrl = new StringBuilder();
            if ("Series".equals(type)) {
                String seasonsUrl = String.format("%s/emby/Shows/%s/Seasons", this.serverUrl, id);
                JSONObject seasonsResp = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(seasonsUrl, params), headersMap, null));
                JSONArray seasons = seasonsResp.getJSONArray("Items");
                for (int s = 0; s < seasons.length(); s++) {
                    JSONObject season = seasons.getJSONObject(s);
                    String seasonId = season.getString("Id");
                    String seasonName = season.getString("Name");
                    String episodesUrl = String.format("%s/emby/Shows/%s/Episodes", this.serverUrl, id);
                    HashMap<String, String> epParams = new HashMap<>(params);
                    epParams.put("SeasonId", seasonId);
                    JSONObject episodesResp = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(episodesUrl, epParams), headersMap, null));
                    JSONArray episodes = episodesResp.getJSONArray("Items");
                    if (s > 0) {
                        playFrom.append("$$$");
                        playUrl.append("$$$");
                    }
                    playFrom.append(seasonName);
                    for (int e = 0; e < episodes.length(); e++) {
                        JSONObject episode = episodes.getJSONObject(e);
                        if (e > 0) playUrl.append("#");
                        playUrl.append(episode.getString("Name")).append("$").append(episode.getString("Id"));
                    }
                }
            } else {
                playFrom.append("播放");
                playUrl.append(item.getString("Name")).append("$").append(item.getString("Id"));
            }
            vodItem.t(playFrom.toString());
            vodItem.u(playUrl.toString());
            ArrayList<VodItem> vodItems = new ArrayList<>();
            vodItems.add(vodItem);
            return VodResult.m(vodItem);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return VodResult.c("详情获取失败: " + e2.getMessage());
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject auth = authenticate();
            if (auth == null) {
                return VodResult.c("获取Emby服务器信息出错");
            }
            HashMap<String, String> headersMap = new HashMap<>(this.headers);
            headersMap.put("Content-Type", "application/json; charset=UTF-8");
            String url = String.format("%s/emby/Users/%s/Views", this.serverUrl, auth.getJSONObject("User").getString("Id"));
            HashMap<String, String> params = new HashMap<>();
            params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
            params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
            params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
            params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            params.put("X-Emby-Token", auth.getString("AccessToken"));
            JSONArray items = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(url, params), headersMap, null)).getJSONArray("Items");
            ArrayList<com.github.catvod.spider.merge.K.VodCategory> categories = new ArrayList<>();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                String name = item.getString("Name");
                if (!name.contains("播放列表") && !name.contains("相机")) {
                    categories.add(new com.github.catvod.spider.merge.K.VodCategory(item.getString("Id"), name));
                }
            }
            LinkedHashMap<String, List<com.github.catvod.spider.merge.K.FilterGroup>> filterMap = new LinkedHashMap<>();
            Iterator<com.github.catvod.spider.merge.K.VodCategory> it = categories.iterator();
            while (it.hasNext()) {
                filterMap.put(it.next().b(), buildFilterList());
            }
            return VodResult.p(categories, filterMap);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return VodResult.c("获取失败: " + StringUtils.getMessage());
        }
    }

    public String homeVideoContent() {
        return VodResult.q(new ArrayList(), new ArrayList());
    }

    @Override
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            JSONObject config = new JSONObject(str);
            this.serverUrl = config.optString("server", "").replaceAll("/$", "");
            this.username = config.optString("username", "");
            this.password = config.optString("password", "");
            this.deviceName = config.optString("deviceName", "");
            this.deviceId = com.github.catvod.spider.merge.P0.StringUtils.d(config.optString("deviceId")) ? config.optString("deviceId", "") : UUID.randomUUID().toString();
            this.clientName = config.optString("client", "");
            if (com.github.catvod.spider.merge.P0.StringUtils.d(config.optString("clientVersion"))) {
                this.clientVersion = config.optString("clientVersion", "");
            }
            this.headers = new HashMap();
            if (com.github.catvod.spider.merge.P0.StringUtils.d(config.optString("ua"))) {
                this.headers.put("User-Agent", config.optString("ua"));
            } else {
                this.headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            }
        } catch (Exception unused) {
            this.serverUrl = "";
            this.username = "";
            this.password = "";
        }
    }

    @Override
    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (BaseApi.isOk("emby")) {
                return "";
            }
            SpiderDebug.log("emby playerContent pid:" + str2);
            String[] playParts = str2.split("\\+");
            JSONObject auth = authenticate();
            if (auth == null) {
                return VodResult.c("获取Emby服务器信息出错");
            }
            HashMap<String, String> headersMap = new HashMap<>(this.headers);
            headersMap.put("Content-Type", "application/json; charset=UTF-8");
            String playbackUrl = String.format("%s/emby/Items/%s/PlaybackInfo", this.serverUrl, playParts[0]);
            HashMap<String, String> params = new HashMap<>();
            params.put("UserId", auth.getJSONObject("User").getString("Id"));
            params.put("IsPlayback", "false");
            params.put("AutoOpenLiveStream", "false");
            params.put("StartTimeTicks", "0");
            params.put("MaxStreamingBitrate", "2147483647");
            params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
            params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
            params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
            params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            params.put("X-Emby-Token", auth.getString("AccessToken"));
            JSONObject mediaInfo = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.f(buildUrlWithParams(playbackUrl, params), "{\"DeviceProfile\":{\"SubtitleProfiles\":[{\"Method\":\"Embed\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"Embed\"},{\"Format\":\"subrip\",\"Method\":\"Embed\"},{\"Format\":\"sub\",\"Method\":\"Embed\"},{\"Method\":\"Embed\",\"Format\":\"pgssub\"},{\"Format\":\"subrip\",\"Method\":\"External\"},{\"Method\":\"External\",\"Format\":\"sub\"},{\"Method\":\"External\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"External\"},{\"Method\":\"External\",\"Format\":\"vtt\"},{\"Method\":\"External\",\"Format\":\"ass\"},{\"Format\":\"ssa\",\"Method\":\"External\"}],\"CodecProfiles\":[{\"Codec\":\"h264\",\"Type\":\"Video\",\"ApplyConditions\":[{\"Property\":\"IsAnamorphic\",\"Value\":\"true\",\"Condition\":\"NotEquals\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"high|main|baseline|constrained baseline\",\"Condition\":\"EqualsAny\",\"Property\":\"VideoProfile\"},{\"IsRequired\":false,\"Value\":\"80\",\"Condition\":\"LessThanEqual\",\"Property\":\"VideoLevel\"},{\"IsRequired\":false,\"Value\":\"true\",\"Condition\":\"NotEquals\",\"Property\":\"IsInterlaced\"}]},{\"Codec\":\"hevc\",\"ApplyConditions\":[{\"Property\":\"IsAnamorphic\",\"Value\":\"true\",\"Condition\":\"NotEquals\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"high|main|main 10\",\"Condition\":\"EqualsAny\",\"Property\":\"VideoProfile\"},{\"Property\":\"VideoLevel\",\"Value\":\"175\",\"Condition\":\"LessThanEqual\",\"IsRequired\":false},{\"IsRequired\":false,\"Value\":\"true\",\"Condition\":\"NotEquals\",\"Property\":\"IsInterlaced\"}],\"Type\":\"Video\"}],\"MaxStreamingBitrate\":40000000,\"TranscodingProfiles\":[{\"Container\":\"ts\",\"AudioCodec\":\"aac,mp3,wav,ac3,eac3,flac,opus\",\"VideoCodec\":\"hevc,h264,mpeg4\",\"BreakOnNonKeyFrames\":true,\"Type\":\"Video\",\"MaxAudioChannels\":\"6\",\"Protocol\":\"hls\",\"Context\":\"Streaming\",\"MinSegments\":2}],\"DirectPlayProfiles\":[{\"Container\":\"mov,mp4,mkv,hls,webm\",\"Type\":\"Video\",\"VideoCodec\":\"h264,hevc,dvhe,dvh1,h264,hevc,hev1,mpeg4,vp9\",\"AudioCodec\":\"aac,mp3,wav,ac3,eac3,flac,truehd,dts,dca,opus,pcm,pcm_s24le\"}],\"ResponseProfiles\":[{\"MimeType\":\"video/mp4\",\"Type\":\"Video\",\"Container\":\"m4v\"}],\"ContainerProfiles\":[],\"MusicStreamingTranscodingBitrate\":40000000,\"MaxStaticBitrate\":40000000}}", headersMap).a());
            reportPlayback(auth, playParts, headersMap, mediaInfo);
            JSONArray mediaSources = mediaInfo.getJSONArray("MediaSources");
            ArrayList<String> streamList = new ArrayList<>();
            for (int i = 0; i < mediaSources.length(); i++) {
                String directStreamUrl = mediaSources.getJSONObject(i).getString("DirectStreamUrl");
                String streamLabel = "[" + GeneralUtils.n(Double.parseDouble(mediaSources.getJSONObject(i).getString("Size"))) + "]" + mediaSources.getJSONObject(i).getString("Name");
                String fullStreamUrl = this.serverUrl + "/emby" + directStreamUrl;
                streamList.add(streamLabel);
                streamList.add(fullStreamUrl);
            }
            VodResult result = new VodResult();
            result.x(streamList);
            result.a(AliDriveApi.r().t(playParts));
            result.g(this.headers);
            result.l();
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return VodResult.c("播放失败: " + StringUtils.getMessage());
        }
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String keyword, boolean z, String page) {
        try {
            JSONObject auth = authenticate();
            if (auth == null) {
                return VodResult.c("获取Emby服务器信息出错");
            }
            int pageNum = Integer.parseInt(page);
            HashMap<String, String> headersMap = new HashMap<>(this.headers);
            headersMap.put("Content-Type", "application/json; charset=UTF-8");
            String url = String.format("%s/emby/Users/%s/Items", this.serverUrl, auth.getJSONObject("User").getString("Id"));
            HashMap<String, String> params = new HashMap<>();
            params.put("X-Emby-Client", auth.getJSONObject("SessionInfo").getString("Client"));
            params.put("X-Emby-Device-Name", auth.getJSONObject("SessionInfo").getString("DeviceName"));
            params.put("X-Emby-Device-Id", auth.getJSONObject("SessionInfo").getString("DeviceId"));
            params.put("X-Emby-Client-Version", auth.getJSONObject("SessionInfo").getString("ApplicationVersion"));
            params.put("X-Emby-Token", auth.getString("AccessToken"));
            params.put("SortBy", "SortName");
            params.put("SortOrder", "Ascending");
            params.put("Fields", "BasicSyncInfo,CanDelete,Container,PrimaryImageAspectRatio,ProductionYear,Status,EndDate,CommunityRating");
            params.put("StartIndex", String.valueOf((pageNum - 1) * 50));
            params.put("EnableImageTypes", "Primary,Backdrop,Thumb");
            params.put("ImageTypeLimit", "1");
            params.put("Recursive", "true");
            params.put("SearchTerm", keyword);
            params.put("IncludeItemTypes", "Movie,Series,BoxSet");
            params.put("GroupProgramsBySeries", "true");
            params.put("Limit", "50");
            params.put("EnableTotalRecordCount", "true");
            JSONArray items = new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m(buildUrlWithParams(url, params), headersMap, null)).getJSONArray("Items");
            ArrayList<VodItem> vodItems = new ArrayList<>();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                VodItem vodItem = new VodItem();
                vodItem.l(item.getString("Id"));
                vodItem.m(cleanHtmlText(item.getString("Name")));
                if (item.has("ImageTags") && item.getJSONObject("ImageTags").has("Primary")) {
                    vodItem.n(String.format("%s/emby/Items/%s/Images/Primary?maxWidth=400&tag=%s&quality=90", this.serverUrl, item.getString("Id"), item.getJSONObject("ImageTags").getString("Primary")));
                }
                try {
                    vodItem.q("⭐" + item.getString("CommunityRating") + " 📺" + item.getJSONObject("UserData").getString("UnplayedItemCount") + " " + item.getInt("ProductionYear") + "年");
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
                vodItems.add(vodItem);
            }
            return VodResult.n(vodItems);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return VodResult.c("搜索失败: " + e2.getMessage());
        }
    }
}
