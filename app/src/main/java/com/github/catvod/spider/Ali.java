package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.api.AliYun;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali extends Spider {

    public static final Pattern pattern = Pattern.compile("(www.aliyundrive.com|www.alipan.com)/s/([^/]+)(/folder/([^/]+))?");

    @Override
    public void init(Context context, String extend) {
        AliYun.get().setRefreshToken(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0).trim();
        Matcher matcher = pattern.matcher(id);
        return matcher.find() ? Result.string(parseVod(matcher, id)) : "";
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return AliYun.get().playerContent(id.split("\\+"), flag);
    }

    private Vod parseVod(Matcher matcher, String id) {
        String shareId = matcher.group(2);
        String fileId = matcher.groupCount() == 4 ? matcher.group(4) : "";
        return AliYun.get().getVod(id, shareId, fileId);
    }

    /**
     * 獲取詳情內容視頻播放來源（多 shared_link）
     *
     * @param ids share_link 集合
     * @return 詳情內容視頻播放來源
     */
    public String detailContentVodPlayFrom(List<String> ids) {
        List<String> playFrom = new ArrayList<>();
        if (ids.size() < 2) return TextUtils.join("$$$", Arrays.asList("轉存原畫", "分享原畫", "代理普畫"));
        for (int i = 1; i <= ids.size(); i++) {
            playFrom.add(String.format(Locale.getDefault(), "轉存原畫#%02d", i));
            playFrom.add(String.format(Locale.getDefault(), "分享原畫#%02d", i));
            playFrom.add(String.format(Locale.getDefault(), "代理普畫#%02d", i));
        }
        return TextUtils.join("$$$", playFrom);
    }

    /**
     * 獲取詳情內容視頻播放地址（多 share_link）
     *
     * @param ids share_link 集合
     * @return 詳情內容視頻播放地址
     */
    public String detailContentVodPlayUrl(List<String> ids) {
        List<String> playUrl = new ArrayList<>();
        for (String id : ids) {
            Matcher matcher = pattern.matcher(id);
            if (matcher.find()) playUrl.add(parseVod(matcher, id).getVodPlayUrl());
        }
        return TextUtils.join("$$$", playUrl);
    }

    public static Object[] proxy(Map<String, String> params) throws Exception {
        String type = params.get("type");
        if ("video".equals(type)) return AliYun.get().proxyVideo(params);
        if ("sub".equals(type)) return AliYun.get().proxySub(params);
        return null;
    }
}
