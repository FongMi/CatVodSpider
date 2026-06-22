package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.C.C0595a;

import com.github.catvod.spider.merge.I1.h;
import com.github.catvod.bean.VodItem;
import com.github.catvod.spider.merge.KI.Subtitle;
import com.github.catvod.spider.merge.e0.C1026b;
import com.github.catvod.spider.merge.g0.C1202A;
import com.github.catvod.spider.merge.g0.z;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import com.github.catvod.spider.merge.l.ConcatUtils;
import com.github.catvod.spider.merge.m0.C1307b;
import com.github.catvod.spider.merge.p0.C1363a;
import com.github.catvod.spider.merge.r0.C1384c;
import com.github.catvod.spider.merge.y.C1416e;
import com.github.catvod.spider.merge.z0.C1452b;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONObject;

import java.net.Proxy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Youtube extends NetPan {
    private static final Pattern CODECS_PATTERN = Pattern.compile("codecs=\"(.+)\"");
    public static final /* synthetic */ int t = 0;
    private JsonObject config;
    public com.github.catvod.spider.merge.m0.FilterGroup filterGroup;
    private com.github.catvod.spider.merge.m0.C1308c httpClient;
    private final Map<String, C1452b> videoInfoCache = new ConcurrentHashMap();
    private final Map<String, Subtitle> subtitleCache = new ConcurrentHashMap();
    private final Map<String, com.github.catvod.spider.merge.v0.d> filterCache = new ConcurrentHashMap();
    private final Map<String, List<VodItem>> vodListCache = new ConcurrentHashMap();

    class Loader {
        static volatile Youtube instance = new Youtube();

        private Loader() {
        }
    }

    public Youtube() {
        Uri.parse("http://192.168.28.12:8118");
        C1026b c1026bO = C1026b.o();
        Locale locale = Locale.getDefault();
        k.d(c1026bO, new com.github.catvod.spider.merge.r1.e(locale.getLanguage(), locale.getCountry()));
    }

    public static Youtube get() {
        return Loader.instance;
    }

    private String buildAdaptationSetXml(com.github.catvod.spider.merge.A0.FilterValue cVar, String extraAttrs) {
        int bandwidth = cVar.f().a();
        String mimeType = cVar.g().split("/")[0];
        String contentType = cVar.g().split(";")[0];
        Matcher matcher = CODECS_PATTERN.matcher(cVar.g());
        String segmentBaseXml = "";
        String codecs = matcher.find() ? matcher.group(1) : "";
        String baseUrl = Server.H(cVar.h()).replace("&", "&amp;");
        StringBuilder template = new StringBuilder("<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%d\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%d\">\n<BaseURL>%s</BaseURL>\n");
        if (cVar.d() != null && cVar.c() != null) {
            StringBuilder segmentBuilder = new StringBuilder("<SegmentBase indexRange=\"");
            segmentBuilder.append(cVar.c().b());
            segmentBuilder.append("-");
            segmentBuilder.append(cVar.c().a());
            segmentBuilder.append("\">\n<Initialization range=\"");
            segmentBuilder.append(cVar.d().b());
            segmentBuilder.append("-");
            segmentBuilder.append(cVar.d().a());
            segmentBuilder.append("\"/>\n</SegmentBase>\n");
            segmentBaseXml = segmentBuilder.toString();
        }
        return String.format(ConcatUtils.b(template, segmentBaseXml, "</Representation>\n</AdaptationSet>\n"), mimeType, Integer.valueOf(bandwidth), cVar.a(), codecs, contentType, extraAttrs, Integer.valueOf(cVar.f().c() ? 1 : 0), baseUrl);
    }

    public static String hasYouTube(String str) {
        Matcher matcher = Pattern.compile("https?://(?:(?:www|m)\\.)?(?:youtube\\.com/watch\\?v=|youtu\\.be/)([a-zA-Z0-9_-]{11})").matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public String buildMediaAttributes(String str, String str2, com.github.catvod.spider.merge.A0.FilterValue cVar) {
        String attrsXml;
        if (cVar.f().c()) {
            com.github.catvod.spider.merge.A0.f fVar = (com.github.catvod.spider.merge.A0.f) cVar;
            attrsXml = String.format("height=\"%s\" width=\"%s\" frameRate=\"%d\" sar=\"1:1\"", fVar.j(), fVar.l(), Integer.valueOf(fVar.i()));
        } else {
            if (!cVar.f().b()) {
                return "";
            }
            attrsXml = String.format("numChannels=\"2\" sampleRate=\"%s\"", ((com.github.catvod.spider.merge.A0.a) cVar).i());
        }
        return buildAdaptationSetXml(cVar, attrsXml);
    }

    private String searchAndPaginate(String str, int i) {
        String displayText;
        com.github.catvod.spider.merge.v0.FilterGroup cachedFilter;
        com.github.catvod.spider.merge.r0.InterfaceC1382a<com.github.catvod.spider.merge.v0.d> interfaceC1382aE = (i <= 1 || !this.filterCache.containsKey(str) || (cachedFilter = (com.github.catvod.spider.merge.v0.d) this.filterCache.get(str)) == null || !(cachedFilter instanceof com.github.catvod.spider.merge.v0.b)) ? null : this.GeneralUtils.e(new com.github.catvod.spider.merge.q0.d(cachedFilter));
        if (interfaceC1382aE == null) {
            interfaceC1382aE = this.GeneralUtils.d(new com.github.catvod.spider.merge.q0.f(str));
        }
        C1384c resultWrapper = (C1384c) interfaceC1382aE;
        this.filterCache.put(str, (com.github.catvod.spider.merge.v0.d) resultWrapper.a());
        ArrayList vodItems = new ArrayList();
        for (VodResult searchResult : ((com.github.catvod.spider.merge.v0.d) resultWrapper.a()).a()) {
            VodItem item = new VodItem();
            if (searchResult.c() == 1) {
                JsonUtils videoInfo = searchResult.a();
                item.l(videoInfo.i());
                item.m(searchResult.b());
                if (videoInfo.j() != null && !((ArrayList) videoInfo.j()).isEmpty()) {
                    item.n(Server.C((String) (((ArrayList) videoInfo.h()).size() >= 2 ? ((ArrayList) videoInfo.h()).get(1) : ((ArrayList) videoInfo.h()).get(0)), "jpg"));
                }
                displayText = videoInfo.f() ? "直播" : formatDuration(videoInfo.g());
            } else if (searchResult.c() == 2) {
                com.github.catvod.spider.merge.v0.StringUtils channelInfo = searchResult.d();
                StringBuilder channelPrefix = new StringBuilder("channel@");
                channelPrefix.append(channelInfo.g());
                item.l(channelPrefix.toString());
                item.m(searchResult.b());
                if (channelInfo.f() != null && !channelInfo.f().isEmpty()) {
                    item.n("https://qph.cf2.quoracdn.net/main-qimg-8bdee2979d96b5494991bcbb72f52d32");
                }
                displayText = channelInfo.h() == null ? "频道" : channelInfo.h();
            } else if (searchResult.c() == 3) {
                com.github.catvod.spider.merge.v0.Subtitle playlistInfo = searchResult.e();
                StringBuilder playlistPrefix = new StringBuilder("playlist@");
                playlistPrefix.append(playlistInfo.g());
                item.l(playlistPrefix.toString());
                item.m(searchResult.b());
                if (playlistInfo.f() != null && !playlistInfo.f().isEmpty()) {
                    item.n(Server.C(playlistInfo.f().size() >= 4 ? playlistInfo.f().get(3) : playlistInfo.f().get(0), "jpg"));
                }
                displayText = playlistInfo.h() + "个视频";
            }
            item.q(displayText);
            vodItems.add(item);
        }
        com.github.catvod.bean.VodResult vodResult = new com.github.catvod.bean.VodResult();
        vodResult.y(vodItems);
        vodResult.j(i + 1, vodItems.size(), vodItems.size(), vodItems.size());
        return vodResult.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if ("时下流行-刚刚发布视频".equals(str) || "时下流行-近期热门视频".equals(str)) {
            List<VodItem> feedTrend = getFeedTrend(str);
            this.vodListCache.put(str, feedTrend);
            com.github.catvod.bean.VodResult vodResult = new com.github.catvod.bean.VodResult();
            vodResult.y(feedTrend);
            vodResult.j(1, 1, 1, 1);
            return vodResult.toString();
        }
        AtomicReference queryRef = new AtomicReference("");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            queryRef.set(((String) queryRef.get()) + it.next().getValue() + " ");
        }
        if (!TextUtils.isEmpty((CharSequence) queryRef.get())) {
            str = (String) queryRef.get();
        }
        return searchAndPaginate(str, Integer.parseInt(str2));
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        String strHasYouTube = list.get(0);
        if (!TextUtils.isEmpty(hasYouTube(strHasYouTube))) {
            strHasYouTube = hasYouTube(strHasYouTube);
        }
        if (strHasYouTube.startsWith("channel@") || strHasYouTube.startsWith("playlist@")) {
            com.github.catvod.spider.merge.u0.VodCategory category = strHasYouTube.startsWith("channel@") ? (com.github.catvod.spider.merge.u0.b) ((C1384c) this.GeneralUtils.a(new com.github.catvod.spider.merge.q0.b(strHasYouTube.substring(8)))).a() : (com.github.catvod.spider.merge.u0.b) ((C1384c) this.GeneralUtils.b(new com.github.catvod.spider.merge.q0.c(strHasYouTube.substring(9)))).a();
            VodItem item = new VodItem();
            item.l(strHasYouTube);
            item.m(category.a().b());
            item.k(category.a().a());
            item.o(strHasYouTube.startsWith("channel@") ? "频道" : "播放列表");
            ArrayList episodeList = new ArrayList();
            for (com.github.catvod.spider.merge.u0.FilterValue filterVal : category.b()) {
                episodeList.add(filterVal.b().replace("#", "").replace("$", "") + "$" + filterVal.i());
            }
            // Common prefix logic removed (was a no-op side-effect call)
            StringBuilder sb = new StringBuilder();
            Iterator it = episodeList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "#");
                }
            }
            item.p(sb.toString());
            return com.github.catvod.bean.VodResult.m(item);
        }
        if ("时下流行-刚刚发布视频".equals(strHasYouTube) || "时下流行-近期热门视频".equals(strHasYouTube)) {
            VodItem trendItem = new VodItem();
            trendItem.l(strHasYouTube);
            trendItem.m(strHasYouTube);
            trendItem.k(strHasYouTube);
            trendItem.o(strHasYouTube);
            ArrayList trendEpisodes = new ArrayList();
            for (VodItem cachedItem : (List) this.vodListCache.get(strHasYouTube)) {
                if (!cachedItem.c().equals(strHasYouTube)) {
                    trendEpisodes.add(cachedItem.d().replace("#", "").replace("$", "") + "$" + cachedItem.c());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = trendEpisodes.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "#");
                }
            }
            trendItem.p(sb2.toString());
            return com.github.catvod.bean.VodResult.m(trendItem);
        }
        Subtitle videoInfo = getNewPipeVideoInfo(strHasYouTube);
        if (videoInfo == null) {
            return com.github.catvod.bean.VodResult.c("获取视频信息失败");
        }
        ArrayList episodeUrls = new ArrayList();
        ArrayList playSources = new ArrayList();
        VodItem detailItem = new VodItem();
        detailItem.l(strHasYouTube);
        detailItem.m(videoInfo.c());
        detailItem.j(videoInfo.j() != null ? videoInfo.j().a() : "");
        detailItem.k(videoInfo.p());
        if (videoInfo.o() != null && !videoInfo.o().isEmpty()) {
            detailItem.n(Server.C(videoInfo.o().get(videoInfo.o().size() - 1).a(), "jpg"));
        }
        episodeUrls.add("https://www.youtube.com/watch?v=" + strHasYouTube);
        boolean isLive = C0595a.b(videoInfo.n()).contains("LIVE");
        playSources.add(isLive ? "直播" : "视频");
        try {
            C1384c resultWrapper = (C1384c) this.GeneralUtils.d(new com.github.catvod.spider.merge.q0.f(videoInfo.p()));
            if (resultWrapper.f()) {
                com.github.catvod.spider.merge.u0.VodCategory channelCategory = (com.github.catvod.spider.merge.u0.b) ((C1384c) this.GeneralUtils.a(new com.github.catvod.spider.merge.q0.b(((com.github.catvod.spider.merge.v0.d) resultWrapper.a()).a().get(0).d().g()))).a();
                ArrayList channelEpisodes = new ArrayList();
                for (com.github.catvod.spider.merge.u0.FilterValue channelFilter : channelCategory.b()) {
                    channelEpisodes.add(channelFilter.b().replace("#", "").replace("$", "") + "$https://www.youtube.com/watch?v=" + channelFilter.i());
                }
                StringBuilder sb3 = new StringBuilder();
                Iterator it3 = channelEpisodes.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        }
                        sb3.append((CharSequence) "#");
                    }
                }
                episodeUrls.add(sb3.toString());
                playSources.add("Up主频道视频");
            }
        } catch (Exception unused) {
        }
        detailItem.q(isLive ? "" : formatDuration(videoInfo.k()));
        StringBuilder sourcesBuilder = new StringBuilder();
        Iterator it4 = playSources.iterator();
        if (it4.hasNext()) {
            while (true) {
                sourcesBuilder.append((CharSequence) it4.next());
                if (!it4.hasNext()) {
                    break;
                }
                sourcesBuilder.append((CharSequence) "$$$");
            }
        }
        detailItem.o(sourcesBuilder.toString());
        StringBuilder urlsBuilder = new StringBuilder();
        Iterator it5 = episodeUrls.iterator();
        if (it5.hasNext()) {
            while (true) {
                urlsBuilder.append((CharSequence) it5.next());
                if (!it5.hasNext()) {
                    break;
                }
                urlsBuilder.append((CharSequence) "$$$");
            }
        }
        detailItem.p(urlsBuilder.toString());
        return com.github.catvod.bean.VodResult.m(detailItem);
    }

    public List<VodItem> getFeedTrend(String str) {
        HashMap headers = new HashMap();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/2.5.20 Chrome/100.0.4896.160 Electron/18.3.5.4-b478491100 Safari/537.36 Channel/pckk_other_ch");
        try {
            try {
                com.github.catvod.spider.merge.y.C1413b trendItems = new com.github.catvod.spider.merge.s0.C1387b(new C1363a(this.httpClient)).b(com.github.catvod.spider.merge.f0.VodResult.g("https://www.youtube.com/feed/trending", headers)).u("contents").u("twoColumnBrowseResultsRenderer").t("tabs").o(0).u("tabRenderer").u("content").u("sectionListRenderer").t("contents").o(str.equals("时下流行-近期热门视频") ? r2.size() - 1 : r2.size() - 2).u("itemSectionRenderer").t("contents").o(0).u("shelfRenderer").u("content").u("expandedShelfContentsRenderer").t("items");
                ArrayList vodItems = new ArrayList();
                vodItems.add(new VodItem(str, "合集", "", "共" + trendItems.size() + "个视频"));
                for (int i = 0; i < trendItems.size(); i++) {
                    C1416e videoRenderer = trendItems.o(i).u("videoRenderer");
                    VodItem item = new VodItem();
                    item.l(videoRenderer.x("videoId"));
                    item.m(videoRenderer.u("title").t("runs").o(0).x("text"));
                    item.n(Server.C(videoRenderer.u("thumbnail").t("thumbnails").o(r5.size() - 1).x("url"), "jpg"));
                    item.q(videoRenderer.u("lengthText").x("simpleText"));
                    vodItems.add(item);
                }
                return vodItems;
            } catch (NullPointerException unused) {
                throw new com.github.catvod.spider.merge.m0.e("Search result root contents not found");
            }
        } catch (com.github.catvod.spider.merge.m0.Subtitle e) {
            SpiderDebug.log(StringUtils.getMessage());
            return null;
        }
    }

    public String getMpd(Subtitle hVar) {
        final String signature = hVar.d().substring(hVar.d().lastIndexOf("=") + 1);
        return Build.VERSION.SDK_INT >= 24 ? String.format("<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT1.5S\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", Long.valueOf(hVar.k()), Long.valueOf(hVar.k()), hVar.q().stream().map(new Function(signature) { // from class: com.github.catvod.spider.merge.g0.D
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Youtube youtube = this.a;
                com.github.catvod.spider.merge.I1.q videoTrack = (com.github.catvod.spider.merge.I1.q) obj;
                int i = Youtube.t;
                youtube.getClass();
                String videoAttrs = String.format(Locale.getDefault(), "height='%d' width='%d' frameRate='%d' maxPlayoutRate='1' startWithSAP='1'", Integer.valueOf(videoTrack.h()), Integer.valueOf(videoTrack.n()), Integer.valueOf(videoTrack.g()));
                int representationId = videoTrack.m();
                int bandwidth = videoTrack.e();
                return String.format("<AdaptationSet>\n<ContentComponent contentType=\"video\"/>\n<Representation id=\"%d\" bandwidth=\"%d\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"1\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>\n", Integer.valueOf(representationId), Integer.valueOf(bandwidth), videoTrack.f(), videoTrack.d().d, videoAttrs, Server.H(videoTrack.c()).replace("&", "&amp;"), videoTrack.j() + "-" + videoTrack.i(), videoTrack.l() + "-" + videoTrack.k());
            }
        }).collect(Collectors.joining()), hVar.h().stream().map(new Function(signature) { // from class: com.github.catvod.spider.merge.g0.C
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Youtube youtube = this.a;
                com.github.catvod.spider.merge.I1.VodCategory audioTrack = (com.github.catvod.spider.merge.I1.b) obj;
                int i = Youtube.t;
                youtube.getClass();
                String audioAttrs = String.format(Locale.getDefault(), "subsegmentAlignment='true' audioSamplingRate='%d'", Integer.valueOf(audioTrack.l().n()));
                int representationId = audioTrack.k();
                int bandwidth = audioTrack.e();
                return String.format("<AdaptationSet>\n<ContentComponent contentType=\"audio\"/>\n<Representation id=\"%d\" bandwidth=\"%d\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"0\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>\n", Integer.valueOf(representationId), Integer.valueOf(bandwidth), audioTrack.f(), audioTrack.d().d, audioAttrs, Server.H(audioTrack.c()).replace("&", "&amp;"), audioTrack.h() + "-" + audioTrack.g(), audioTrack.j() + "-" + audioTrack.i());
            }
        }).collect(Collectors.joining())) : "";
    }

    public Subtitle getNewPipeVideoInfo(String str) {
        if (!this.subtitleCache.containsKey(str)) {
            try {
                SpiderDebug.log("getNewPipeVideoInfo: https://www.youtube.com/watch?v=" + str);
                Subtitle videoDetail = Subtitle.m("https://www.youtube.com/watch?v=" + str);
                if (!videoDetail.q().isEmpty()) {
                    SpiderDebug.log("getNewPipeVideoInfo:" + new Gson().toJson(videoDetail));
                    this.subtitleCache.put(str, videoDetail);
                }
            } catch (Throwable th) {
                SpiderDebug.log(th.getMessage());
                return null;
            }
        }
        return (h) this.subtitleCache.get(str);
    }

    public C1452b getVideoInfo(String str) {
        if (get().videoInfoCache.get(str) != null) {
            return (C1452b) get().videoInfoCache.get(str);
        }
        C1384c resultWrapper = (C1384c) get().GeneralUtils.c(new com.github.catvod.spider.merge.q0.g(str));
        if (resultWrapper.c() != null) {
            StringBuilder errorBuilder = new StringBuilder("获取播放地址失败 请配置下youtube cookie或到配置中心手动更换节点重试");
            errorBuilder.append(resultWrapper.c().getMessage());
            SpiderDebug.log(errorBuilder.toString());
            return null;
        }
        C1452b videoInfo = (C1452b) resultWrapper.a();
        StringBuilder logBuilder = new StringBuilder("getVideoInfo:");
        logBuilder.append(new Gson().toJson(videoInfo));
        SpiderDebug.log(logBuilder.toString());
        get().videoInfoCache.put(str, videoInfo);
        return videoInfo;
    }

    public String homeContent(boolean z) {
        if (this.config.has("json")) {
            return com.github.catvod.spider.merge.f0.HttpClient.l(this.config.get("json").getAsString());
        }
        ArrayList categories = new ArrayList();
        LinkedHashMap filterMap = new LinkedHashMap();
        for (String type : this.config.get("type").getAsString().split("#")) {
            categories.add(new com.github.catvod.bean.VodCategory(type, type));
            ArrayList filterGroups = new ArrayList();
            filterGroups.add(new com.github.catvod.bean.FilterGroup("order", "排序", Arrays.asList(new com.github.catvod.bean.FilterValue("預設", "totalrank"), new com.github.catvod.bean.FilterValue("最多點擊", "click"), new com.github.catvod.bean.FilterValue("最新發布", "pubdate"), new com.github.catvod.bean.FilterValue("最多彈幕", "dm"), new com.github.catvod.bean.FilterValue("最多收藏", "stow"))));
            filterGroups.add(new com.github.catvod.bean.FilterGroup("duration", "時長", Arrays.asList(new com.github.catvod.bean.FilterValue("全部時長", "0"), new com.github.catvod.bean.FilterValue("60分鐘以上", "4"), new com.github.catvod.bean.FilterValue("30~60分鐘", "3"), new com.github.catvod.bean.FilterValue("10~30分鐘", "2"), new com.github.catvod.bean.FilterValue("10分鐘以下", "1"))));
            filterMap.put(type, filterGroups);
        }
        return com.github.catvod.bean.VodResult.p(categories, filterMap);
    }

    public String homeVideoContent() {
        return "";
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.config = JsonParser.parseString(str).getAsJsonObject();
        SpiderDebug.log("extend:" + str);
        C1307b c1307b = new C1307b();
        c1307b.g();
        c1307b.f("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
        c1307b.f("Accept-language", "en-US,en;");
        this.httpClient = c1307b.e();
        try {
            JsonObject configJson = this.config;
            if (configJson.get("commonConfig") != null) {
                String configStr = configJson.get("commonConfig").getAsString();
                if (configStr.startsWith("http")) {
                    configStr = com.github.catvod.spider.merge.f0.HttpClient.l(configStr);
                }
                JSONObject commonConfig = new JSONObject(configStr.trim());
                if (commonConfig.has("proxy") && !TextUtils.isEmpty(commonConfig.getString("proxy"))) {
                    String proxyUrl = commonConfig.getString("proxy");
                    com.github.catvod.spider.merge.i0.Subtitle proxyParser = new com.github.catvod.spider.merge.i0.h();
                    proxyParser.f(proxyUrl);
                    String proxyHost = proxyParser.a();
                    int proxyPort = proxyParser.c();
                    String proxyUser = proxyParser.e();
                    String proxyPass = proxyParser.b();
                    String userInfo = "";
                    if (!TextUtils.isEmpty(proxyUser) && !proxyUser.equals("null")) {
                        userInfo = proxyUser + ":" + proxyPass;
                    }
                    SpiderDebug.log("uri.getUserInfo :" + userInfo);
                    if (userInfo.contains(":")) {
                        com.github.catvod.spider.merge.f0.VodResult.f(userInfo);
                    }
                    this.httpClient.h(proxyUrl.startsWith("http") ? Proxy.Type.HTTP : Proxy.Type.SOCKS, proxyHost, proxyPort);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        this.filterGroup = new com.github.catvod.spider.merge.m0.d(this.httpClient);
        get().httpClient = this.httpClient;
        get().filterGroup = this.filterGroup;
    }

    @Override // com.github.catvod.en.NetPan
    public String playerContent(String str, String str2, List<String> list) {
        String playUrl;
        String liveUrl = "";
        if (BaseApi.isOk("youtube")) {
            return "";
        }
        if (!TextUtils.isEmpty(hasYouTube(str2))) {
            str2 = hasYouTube(str2);
        }
        Subtitle videoInfo = getNewPipeVideoInfo(str2);
        if (videoInfo == null) {
            return com.github.catvod.bean.VodResult.c("获取视频信息失败");
        }
        com.github.catvod.bean.VodResult vodResult = new com.github.catvod.bean.VodResult();
        if (C0595a.b(videoInfo.n()).contains("LIVE")) {
            if (!TextUtils.isEmpty(videoInfo.l())) {
                liveUrl = videoInfo.l();
            } else if (!TextUtils.isEmpty(videoInfo.i())) {
                liveUrl = videoInfo.i();
            }
            playUrl = Server.G(liveUrl);
        } else {
            playUrl = Server.I(str2);
        }
        vodResult.w(playUrl);
        HashMap headers = new HashMap();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        headers.put("Referer", "https://www.youtube.com");
        headers.put("cookie", (String) ((HashMap) this.httpClient.c()).get("cookie"));
        vodResult.g(headers);
        return vodResult.toString();
    }

    public String searchContent(String str, boolean z) {
        return searchAndPaginate(str, 0);
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchAndPaginate(str, Integer.valueOf(str2).intValue());
    }

    public String getMpd(C1452b c1452b) {
        final ArrayList videoFormats = new ArrayList();
        int sdkVersion = Build.VERSION.SDK_INT;
        if (sdkVersion >= 24) {
            c1452b.c().stream().filter(z.b).filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.x
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    com.github.catvod.spider.merge.A0.f fVar = (com.github.catvod.spider.merge.A0.f) obj;
                    int i2 = Youtube.t;
                    if (com.github.catvod.spider.merge.i0.GeneralUtils.q()) {
                        return true;
                    }
                    return fVar.g().contains("avc");
                }
            }).filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.v
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = Youtube.t;
                    return ((com.github.catvod.spider.merge.A0.f) obj).k().ordinal() >= 7;
                }
            }).sorted(Comparator.comparing(BilibiliApi.a).reversed()).forEach(new C1202A(videoFormats, 0));
            if (videoFormats.isEmpty()) {
                c1452b.c().stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.u
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((com.github.catvod.spider.merge.A0.f) obj).e();
                    }
                }).filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.y
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        com.github.catvod.spider.merge.A0.f fVar = (com.github.catvod.spider.merge.A0.f) obj;
                        int i2 = Youtube.t;
                        if (com.github.catvod.spider.merge.i0.GeneralUtils.q()) {
                            return true;
                        }
                        return fVar.g().contains("avc");
                    }
                }).filter(z.c).sorted(Comparator.comparing(BilibiliApi.a).reversed()).forEach(new Consumer() { // from class: com.github.catvod.spider.merge.g0.B
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        videoFormats.add((com.github.catvod.spider.merge.A0.f) obj);
                    }
                });
            }
        }
        List audioFormats = sdkVersion >= 24 ? (List) c1452b.a().stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.H
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((com.github.catvod.spider.merge.A0.a) obj).e();
            }
        }).filter(new Predicate() { // from class: com.github.catvod.spider.merge.g0.w
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = Youtube.t;
                return ((com.github.catvod.spider.merge.A0.a) obj).b() == com.github.catvod.spider.merge.BuilderUtils.FilterValue.f;
            }
        }).collect(Collectors.toList()) : null;
        final String token = c1452b.b().i();
        return sdkVersion >= 24 ? String.format("<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT1.5S\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", Integer.valueOf(c1452b.b().g()), Integer.valueOf(c1452b.b().g()), videoFormats.stream().map(new Function() { // from class: com.github.catvod.spider.merge.g0.JsoupParser
            public final /* synthetic */ String b = "token";

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.buildMediaAttributes(this.b, token, (com.github.catvod.spider.merge.A0.c) obj);
            }
        }).collect(Collectors.joining()), audioFormats.stream().map(new Function() { // from class: com.github.catvod.spider.merge.g0.E
            public final /* synthetic */ String b = "token";

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.buildMediaAttributes(this.b, token, (com.github.catvod.spider.merge.A0.c) obj);
            }
        }).collect(Collectors.joining())) : "";
    }

    private static String formatDuration(long seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds - (3600 * hours)) / 60;
        return hours > 0 ? String.format("%d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds % 60)) : String.format("%d:%02d", Long.valueOf(minutes), Long.valueOf(seconds % 60));
    }
}
