package com.github.catvod.spider;

import android.text.TextUtils;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XPathMacFilter extends XPathMac {

    @Override
    protected String categoryUrl(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String cateUrl = rule.getCateUrl();
        if (filter && extend != null && extend.size() > 0) {
            for (String key : extend.keySet()) {
                String value = extend.get(key);
                if (TextUtils.isEmpty(value)) continue;
                cateUrl = cateUrl.replace("{" + key + "}", URLEncoder.encode(value));
            }
        }
        cateUrl = cateUrl.replace("{cateId}", tid).replace("{catePg}", pg);
        Matcher m = Pattern.compile("\\{(.*?)\\}").matcher(cateUrl);
        while (m.find()) {
            String n = m.group(0).replace("{", "").replace("}", "");
            cateUrl = cateUrl.replace(m.group(0), "").replace("/" + n + "/", "");
        }
        return cateUrl;
    }
}