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
        header.put("cookie", "_uuid=5E4B2B98-1014A-84D8-FA33-EC210C5BEC10DA82367infoc; buvid3=E9D0A426-85E9-E6C7-C75E-206A3E1BEB4D81910infoc; b_nut=1666168082; buvid4=4FC87B9C-3540-2275-688C-8612D3EA719B81910-022101916-ZLe640jXRAMHySuaCe9aUw==; rpdid=|(k|u)YYm)uY0J'uYYYuY)uuu; i-wanna-go-back=-1; fingerprint=9c214a6da0197a48e576ccf22e9f0ac7; buvid_fp_plain=undefined; nostalgia_conf=-1; bsource=search_google; SESSDATA=812a26d8,1682867071,bd749*b1; bili_jct=00fb1a02247592c6876c7a502aec8785; DedeUserID=3493076028885079; DedeUserID__ckMd5=60a8757a1f4d6ae9; buvid_fp=9c214a6da0197a48e576ccf22e9f0ac7; sid=5hnizp80; CURRENT_QUALITY=80; innersign=0; b_ut=5; b_lsid=4D21BEAC_18434540FF6; CURRENT_FNVAL=4048; PVID=1");
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
            playlist.add(Trans.get(title) + "$" + aid + "+ " + page.getLong("cid"));
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
        String url = "https://api.bilibili.com/x/player/playurl?avid=" + aid + "&cid= " + cid + "&qn=120&fnver&128=128&fourk=1";
        JSONObject resp = new JSONObject(OkHttpUtil.string(url, header));
        url = resp.getJSONObject("data").getJSONArray("durl").getJSONObject(0).getString("url");
        return Result.get().url(url).header(header).string();
    }
}
