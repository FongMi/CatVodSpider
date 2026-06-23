package com.github.catvod.spider.merge.m;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.k.C0575b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0598g {
    private static final Pattern a = Pattern.compile("src = '(.*?)'");
    private static final Pattern b = Pattern.compile("mac_show\\[\"([^\"]+)\"\\]");

    private static String a(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; PCLM10 Build/PQ3B.190801.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Mobile Safari/537.36");
        map.put("Referer", "https://m.wwgz.cn");
        return C0575b.l(str, map);
    }

    public static Map<String, List<String>> b() {
        HashMap map = new HashMap();
        try {
            Matcher matcher = b.matcher(a("https://m.wwgz.cn/js/playerconfig.js"));
            while (matcher.find()) {
                ArrayList arrayList = new ArrayList();
                String strGroup = matcher.group(1);
                String strL = com.github.catvod.spider.merge.y.f.l(a("https://m.wwgz.cn/player/" + strGroup + ".js"), "src=\"", "'");
                if (!TextUtils.isEmpty(strL)) {
                    SpiderDebug.log(strGroup + "->" + strL);
                    String strA = a(strL);
                    if (strA.contains("<title>")) {
                        Matcher matcher2 = a.matcher(strA);
                        while (matcher2.find()) {
                            String strGroup2 = matcher2.group(1);
                            if (strGroup2.startsWith("http") && !arrayList.contains(strGroup2)) {
                                arrayList.add(strGroup2.replace("'", ""));
                            }
                        }
                        if (strA.contains("var url=''")) {
                            arrayList.add(strL);
                        }
                        map.put(strGroup, arrayList);
                    }
                }
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return map;
        }
    }
}
