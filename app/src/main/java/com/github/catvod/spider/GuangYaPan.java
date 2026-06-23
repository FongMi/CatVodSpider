package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.utils.merge.GuangYaPanApi;
import com.github.catvod.bean.VodItem;
import com.github.catvod.bean.VodResult;
import org.json.JSONObject;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GuangYaPan extends Spider {
    public static final Pattern SHARE_PATTERN = Pattern.compile("www\\.guangyapan\\.com/s/([^/#?]*)(?:\\?code=([\\w]+))?(?:#/share/([\\w-]+))?");

    public String detailContent(String str, List<String> list) {
        try {
            SpiderDebug.log("光鸭云盘 detailContent vodName:" + str + " ids:" + list);
            String url = list.get(0).trim();
            Matcher matcher = SHARE_PATTERN.matcher(url);
            if (!matcher.find()) {
                return "";
            }
            return VodResult.m(GuangYaPanApi.getInstance().buildVodItem(url,
                    matcher.group(1) != null ? matcher.group(1) : "",
                    matcher.group(3) != null ? matcher.group(3) : "",
                    matcher.group(2) != null ? matcher.group(2) : "",
                    str));
        } catch (Exception e) {
            SpiderDebug.log("光鸭云盘 detailContent 异常: " + e.getMessage());
            return VodResult.m(new VodItem("1", "无效", ""));
        }
    }

    public void init(Context context, String str) {
        SpiderDebug.log("光鸭云盘 init");
    }

    public String playerContent(String playFlag, String playUrl, List<String> vipFlags) {
        SpiderDebug.log("光鸭云盘 playerContent flag:" + playFlag + " id:" + playUrl);
        if (BaseApi.isOk("guangya")) {
            return "";
        }
        String[] parts = playUrl.split("\\+");
        GuangYaPanApi client = GuangYaPanApi.getInstance();
        try {
            String downloadUrl = client.getDownloadUrl(parts[0], parts[1], parts.length > 2 ? parts[2] : "");
            if (downloadUrl == null || downloadUrl.isEmpty()) {
                return "";
            }
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("url", downloadUrl);
            result.put("header", new JSONObject());
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log("光鸭云盘 playerContent 异常: " + e.getMessage());
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String url = list.get(0).trim();
        SpiderDebug.log("光鸭云盘 detailContent url:" + url);
        Matcher matcher = SHARE_PATTERN.matcher(url);
        if (!matcher.find()) {
            return "";
        }
        return VodResult.m(GuangYaPanApi.getInstance().buildVodItem(url,
                matcher.group(1) != null ? matcher.group(1) : "",
                matcher.group(3) != null ? matcher.group(3) : "",
                matcher.group(2) != null ? matcher.group(2) : "",
                ""));
    }
}
