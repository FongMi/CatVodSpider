package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Ali extends Spider {
    public static final Pattern a = Pattern.compile(C0098a.a(new byte[]{84, 28, 44, 125, -108, -80, -57, -5, 5, 30, 53, 110, -56, -72, -35, -9, 82, 8, 52, 103, -58, -90, -36, -27, 82, 10, 55, 99, -54, -80, -59, -68, 31, 4, 54, 35, -107, -94, -124, -70, 39, 53, 116, 87, -111, -8, -125, -67, 26, 4, 55, 110, -33, -93, -124, -70, 39, 53, 116, 87, -111, -8, -126, -83}, new byte[]{124, 107, 91, 10, -70, -47, -85, -110}));

    private k a(Matcher matcher, String str) {
        return x.p().z(str, matcher.group(2), matcher.groupCount() == 4 ? matcher.group(4) : "");
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get(C0098a.a(new byte[]{-2, 14, 79, 34}, new byte[]{-118, 119, 63, 71, 119, 24, -83, -125}));
        if (C0098a.a(new byte[]{-51, 124, 42, 70, -101}, new byte[]{-69, 21, 78, 35, -12, 103, 112, -107}).equals(str)) {
            return x.p().H(map);
        }
        if (C0098a.a(new byte[]{122, 82, 95}, new byte[]{9, 39, 61, -5, 31, 122, 69, 58}).equals(str)) {
            return x.p().G(map);
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String strTrim = list.get(0).trim();
        Matcher matcher = a.matcher(strTrim);
        return matcher.find() ? h.p(a(matcher, strTrim)) : "";
    }

    public String detailContentVodPlayFrom(List<String> list) {
        String strA;
        List listAsList;
        ArrayList arrayList = new ArrayList();
        if (list.size() < 2) {
            strA = C0098a.a(new byte[]{65, -11, -5}, new byte[]{101, -47, -33, -85, 21, -64, 70, -68});
            listAsList = Arrays.asList(C0098a.a(new byte[]{56, -85, 29, -32, -99, -76}, new byte[]{-34, 50, -77, 7, 9, 15, -74, 124}), C0098a.a(new byte[]{64, -118, -107, 42, -5, -15}, new byte[]{-91, 4, 10, -51, 111, 74, 77, 90}));
        } else {
            for (int i = 1; i <= list.size(); i++) {
                arrayList.add(String.format(Locale.getDefault(), C0098a.a(new byte[]{19, 114, 93, 123, 104, 19, 4, 100, -58, -50, -90}, new byte[]{-10, -4, -62, -100, -4, -88, 39, 65}), Integer.valueOf(i)));
                arrayList.add(String.format(Locale.getDefault(), C0098a.a(new byte[]{68, 87, 122, 119, 120, 75, -119, 27, -110, -4, -80}, new byte[]{-94, -50, -44, -112, -20, -16, -86, 62}), Integer.valueOf(i)));
            }
            strA = C0098a.a(new byte[]{85, 57, 71}, new byte[]{113, 29, 99, 22, -54, 71, 61, -103});
            listAsList = arrayList;
        }
        return TextUtils.join(strA, listAsList);
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                arrayList.add(a(matcher, str).a());
            }
        }
        return TextUtils.join(C0098a.a(new byte[]{-78, -43, 7}, new byte[]{-106, -15, 35, 61, -71, -25, -36, -73}), arrayList);
    }

    public void init(Context context, String str) {
        x.p().L(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        return x.p().E(str2.split(C0098a.a(new byte[]{110, -95}, new byte[]{50, -118, -86, 123, -62, 118, 30, 58})), str);
    }
}
