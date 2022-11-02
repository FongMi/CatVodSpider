package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.Trans;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ColaMint & FongMi
 */
public class Bili extends Spider {

    private static final String url = "https://www.bilibili.com";
    private HashMap<String, String> header;
    private JSONObject ext;

    private void initHeader() {
        header = new HashMap<>();
        header.put("cookie", "_uuid=5D5B10137-1328-6FA7-F1078-7299610109934F45334infoc; bg_view_12044=386583; buvid3=185689C8-03A5-751C-1AAF-03F69282AA9E47110infoc; b_nut=1667308447; buvid4=1AB69C99-50B4-D973-BF32-2CB8367580C147110-122110121-JleLtcqrjFz2MFF2u1deMQ%3D%3D; buvid_fp_plain=undefined; fingerprint3=dd53d137790289498f103b2fbf3fb252; fingerprint=7cc2faedec7082808a3099d0e3188c38; DedeUserID=429617357; DedeUserID__ckMd5=58f591cbe4b64558; SESSDATA=b70d8210%2C1682860530%2C600cd*b1; bili_jct=30fa4e1fd12981b4ae980d7ad5252894; i-wanna-go-back=-1; b_ut=5; buvid_fp=18ca78cc62eef7ce8dba4a806e9fdfa6; bg_view_41410=691613%7C478176; bg_view_43141=690880; sid=5tu2zjlx; b_lsid=10515334D_184366495CB; theme_style=light; nostalgia_conf=-1; innersign=1; rpdid=|(J|k~|)lk~k0J'uYY~JY|)|Y; CURRENT_FNVAL=16; CURRENT_QUALITY=120");
        header.put("User-Agent", Misc.CHROME);
        header.put("Referer", url);
    }

    @Override
    public void init(Context context, String extend) {
        try {
            if (extend.startsWith("http")) extend = OkHttpUtil.string(extend);
            ext = new JSONObject(extend);
            initHeader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        return Result.string(Class.arrayFrom(ext.getJSONArray("classes").toString()), ext.getJSONObject("filter"));
    }

    @Override
    public String homeVideoContent() throws Exception {
        return categoryContent("窗 白噪音", "1", true, new HashMap<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String duration = extend.containsKey("duration") ? extend.get("duration") : "0";
        if (extend.containsKey("tid")) tid = tid + " " + extend.get("tid");
        String url = "https://api.bilibili.com/x/web-interface/search/type?search_type=video&keyword=" + URLEncoder.encode(tid) + "&duration=" + duration + "&page=" + pg;
        JSONObject resp = new JSONObject(OkHttpUtil.string(url, header));
        JSONArray result = resp.getJSONObject("data").getJSONArray("result");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < result.length(); ++i) {
            JSONObject object = result.getJSONObject(i);
            String pic = object.getString("pic");
            Vod vod = new Vod();
            vod.setVodId(object.getString("bvid"));
            vod.setVodName(Jsoup.parse(object.getString("title")).text());
            vod.setVodRemarks(object.getString("duration").split(":")[0] + "分鐘");
            vod.setVodPic(pic.startsWith("//") ? "https:" + pic : pic);
            list.add(vod);
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String bvid = ids.get(0);
        String bvid2aidUrl = "https://api.bilibili.com/x/web-interface/archive/stat?bvid=" + bvid;
        JSONObject bvid2aidResp = new JSONObject(OkHttpUtil.string(bvid2aidUrl, header));
        String aid = bvid2aidResp.getJSONObject("data").getLong("aid") + "";
        String detailUrl = "https://api.bilibili.com/x/web-interface/view?aid=" + aid;
        JSONObject detailResp = new JSONObject(OkHttpUtil.string(detailUrl, header));
        JSONObject detailData = detailResp.getJSONObject("data");
        List<String> playlist = new ArrayList<>();
        JSONArray pages = detailData.getJSONArray("pages");
        for (int i = 0; i < pages.length(); ++i) {
            JSONObject page = pages.getJSONObject(i);
            String title = page.getString("part").replace("$", "_").replace("#", "_");
            playlist.add(Trans.get(title) + "$" + aid + "+" + page.getLong("cid"));
        }
        Vod vod = new Vod();
        vod.setVodId(bvid);
        vod.setVodName(detailData.getString("title"));
        vod.setVodPic(detailData.getString("pic"));
        vod.setTypeName(detailData.getString("tname"));
        vod.setVodRemarks(detailData.getLong("duration") / 60 + "分鐘");
        vod.setVodContent(detailData.getString("desc"));
        vod.setVodPlayFrom("B站");
        vod.setVodPlayUrl(TextUtils.join("#", playlist));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return categoryContent(key, "1", true, new HashMap<>());
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] ids = id.split("\\+");
        String aid = ids[0];
        String cid = ids[1];
        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid=" + cid + "&qn=120&fourk=1";
        JSONObject resp = new JSONObject(OkHttpUtil.string(url, header));
        url = resp.getJSONObject("data").getJSONArray("durl").getJSONObject(0).getString("url");
        return Result.get().url(url).header(header).string();
    }
}
