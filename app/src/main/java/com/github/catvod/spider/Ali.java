package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.api.AliYun;
import android.text.TextUtils;
import com.github.catvod.bean.Result;
import com.github.catvod.crawler.Spider;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali extends Spider {

    public static final Pattern pattern = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    @Override
    public void init(Context context, String extend) {
        AliYun.get().setRefreshToken(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) return "";
        String shareId = matcher.group(1);
        String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
        AliYun.get().setShareId(shareId);
        return Result.string(AliYun.get().getVod(url, fileId));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        API.get().setShareId(id.split("@")[0]);
        return AliYun.get().playerContent(id.split("@")[1].split("\\+"), flag.split("#")[0].equals("原畫"));
    }
    
    /**
     * 获取详情内容视频播放地址（多 share_link 模式）
     *
     * @param ids share_link 集合
     * @return 详情内容视频播放地址
     */
    public String detailContentVodPlayUrl(List<String> ids) throws Exception {
        List<String> playUrl = new ArrayList<>();
        for (String id : ids) {
            Matcher matcher = pattern.matcher(id);
            if (matcher.find()) {
                String shareId = matcher.group(1);
                String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
                API.get().setShareId(shareId);
                playUrl.add(API.get().getVod(id, fileId).getVodPlayUrl());
            }
        }
        return TextUtils.join("$$$", playUrl);
    }
    
    /**
     * 获取详情内容视频播放来源（多 shared_link 模式）
     *
     * @param ids share_link 集合
     * @return 详情内容视频播放来源
     */
    public String detailContentVodPlayFrom(List<String> ids) {
        List<String> playFrom = new ArrayList<>();
        if (ids.size() > 1) {
            for (int i = 1; i <= ids.size(); i++) {
                playFrom.addAll(Arrays.asList(String.format(Locale.CHINA, "原畫#%02d", i), String.format(Locale.CHINA, "普畫#%02d", i)));
            }
        } else {
            playFrom.addAll(Arrays.asList("原畫", "普畫"));
        }
        return TextUtils.join("$$$", playFrom);
    }

    public static Object[] proxy(Map<String, String> params) throws Exception {
        String type = params.get("type");
        if ("sub".equals(type)) return AliYun.get().proxySub(params);
        if ("token".equals(type)) return AliYun.get().getToken();
        return null;
    }
}