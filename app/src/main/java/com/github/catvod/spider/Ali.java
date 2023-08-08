package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.ali.API;
import com.github.catvod.bean.Result;
import com.github.catvod.crawler.Spider;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali extends Spider {

    public static final Pattern pattern = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    @Override
    public void init(Context context, String extend) {
        API.get().setRefreshToken(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) return "";
        String shareId = matcher.group(1);
        String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
        API.get().setShareId(shareId);
        return Result.string(API.get().getVod(url, fileId));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return API.get().playerContent(id.split("\\+"), flag.equals("原畫"));
    }

    public static Object[] proxy(Map<String, String> params) throws Exception {
        String type = params.get("type");
        if (type.equals("sub")) return API.get().proxySub(params);
        if (type.equals("token")) return API.get().getToken();
        return null;
    }
}