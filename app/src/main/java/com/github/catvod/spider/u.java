package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.M3uParser;
import com.github.catvod.utils.LiveVodParser;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class u extends Spider {
    public static int l8 = -1;

    private static final short[] f1315short = {1704, 1716, 1716, 1712, 1786, 1775, 1775, 1777, 1778, 1783, 1774, 1776, 1774, 1776, 1774, 1777, 1786, 2792, 2743, 2741, 2728, 2751, 2750, 2808, 2723, 2728, 2810, 2724, 2732, 2809, 2813, 831, 790, 780, 791, 797, 857, 789, 790, 794, 792, 789, 857, 778, 796, 779, 783, 796, 779, 857, 777, 790, 779, 781, 857, 612, 632, 632, 636, 566, 547, 547, 573, 574, 571, 546, 572, 546, 572, 546, 573, 566, 2916, 2875, 2873, 2852, 2867, 2866, 2093, 2086, 271, 266, 277, 262, 660, 661, 647, 748, 761, 3061, 3064, 3057, 3044, 1442, 1454, 1442, 2856, 2869, 2873, 729, 721, 2741, 2724, 2745, 2741, 2798, 2737, 2733, 2720, 2728, 2735, 2810, 2785, 2722, 2729, 2720, 2739, 2738, 2724, 2741, 2812, 2740, 2741, 2727, 2796, 2809, 875, 879, 2577, 2580, 2578, 2569, 720, 713, 704, 707, 707, 1852, 1851, 1829, 1716, 1716, 1698, 1723, 2860, 2857, 2877, 2871};

    public u() {
    }

    static void l8() {
    }

    public static String localProxyUrl() {
        l8();
        int i = l8;
        StringBuilder sb = new StringBuilder();
        String string = "http://127.0.0.1:";
        sb.append(string);
        sb.append(i);
        string = "/proxy";
        sb.append(string);
        string = sb.toString();
        return string;
    }

    public static Object[] proxy(Map<String, String> map) {
        Object[] objArrVod = null;
        try {
            String str = map.get("do");
            String strE = "UTF-8";
            if (str.equals("live")) {
                if (map.get("type").equals("txt")) {
                    objArrVod = M3uParser.S(new String(Base64.decode(map.get("ext"), 10), strE));
                }
            } else if (str.equals("ck")) {
                objArrVod = new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(strE))};
            } else if (str.equals("push")) {
                objArrVod = LiveVodParser.vod(map);
            } else if (str.equals("czspp")) {
                objArrVod = Ddrk.loadsub(map.get("url"));
            } else if (str.equals("ddrk")) {
                objArrVod = Ddrk.loadsub(map.get("url"));
            } else if (str.equals("hmys")) {
                objArrVod = Hmys.vod(map);
            }
        } catch (Throwable th) {
        }
        return objArrVod;
    }
}
