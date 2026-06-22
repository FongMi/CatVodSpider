package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.fb.FilterGroup;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class XBPQAli extends Spider {
    public static final Pattern a = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    public static Object[] proxy(Map<String, String> map) throws UnsupportedEncodingException {
        String str = map.get("type");
        if (str.equals("sub")) {
            return com.github.catvod.spider.merge.dp.p.o().H(map);
        }
        if (str.equals("token")) {
            return com.github.catvod.spider.merge.dp.p.o().w();
        }
        return null;
    }

    public String detailContent(List<String> list) {
        try {
            String strReplace = list.get(0).trim().replace("www.alipan.com", "www.aliyundrive.com");
            Matcher matcher = a.matcher(strReplace);
            if (!matcher.find()) {
                return "";
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.groupCount() == 3 ? matcher.group(3) : "";
            com.github.catvod.spider.merge.dp.p.o().K(strGroup);
            return com.github.catvod.spider.merge.fb.FilterGroup.e(com.github.catvod.spider.merge.dp.p.o().z(strReplace, strGroup2));
        } catch (Exception unused) {
            return "";
        }
    }

    public void init(Context context, String str) {
        com.github.catvod.spider.merge.dp.p.o().J(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("\\+");
            if (!str.equals(">原画<")) {
                return com.github.catvod.spider.merge.dp.p.o().F(strArrSplit, str);
            }
            com.github.catvod.spider.merge.dp.p pVarO = com.github.catvod.spider.merge.dp.p.o();
            pVarO.getClass();
            FilterGroup dVar = new FilterGroup();
            dVar.i(pVarO.p(strArrSplit[0]));
            dVar.h(pVarO.v(strArrSplit));
            dVar.a(pVarO.q());
            return dVar.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
