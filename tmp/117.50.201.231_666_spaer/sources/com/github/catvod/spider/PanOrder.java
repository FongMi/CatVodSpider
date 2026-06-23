package com.github.catvod.spider;

import android.util.Log;
import com.github.catvod.spider.merge.m.C0602k;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
class PanOrder implements Comparator {
    private final Map<String, Integer> orderMap;
    private final Pattern[] patterns;

    public PanOrder(String[] strArr) {
        HashMap map = new HashMap();
        this.orderMap = map;
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i], Integer.valueOf(i));
        }
        this.patterns = new Pattern[]{Pattern.compile("pan\\.baidu\\.com"), Pattern.compile("pan\\.quark\\.cn"), Pattern.compile("drive\\.uc\\.cn"), Pattern.compile("cloud\\.189\\.cn"), Pattern.compile("www\\.123\\w{3}\\.com"), Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)"), Pattern.compile("caiyun\\.139\\.com")};
    }

    private static String[] getDefaultPanOrder() {
        return new String[]{"百度", "夸克", "UC", "天翼", "123", "阿里", "移动"};
    }

    private static String[] getPanOrderFromConfig() {
        JsonObject jsonObject;
        String asString;
        try {
            String strA = C0602k.a(C0602k.c("/config.json"));
            return (strA == null || strA.isEmpty() || (jsonObject = (JsonObject) new Gson().fromJson(strA, JsonObject.class)) == null || !jsonObject.has("panOrder") || (asString = jsonObject.get("panOrder").getAsString()) == null || asString.isEmpty()) ? getDefaultPanOrder() : asString.split(",");
        } catch (Exception e) {
            Log.e("PanUrlComparator", "Error reading config: " + e.getMessage());
            return getDefaultPanOrder();
        }
    }

    private String getPanType(String str) {
        for (int i = 0; i < this.patterns.length; i++) {
            if (this.patterns[i].matcher(str).find()) {
                switch (i) {
                    case 0:
                        return "百度";
                    case 1:
                        return "夸克";
                    case 2:
                        return "UC";
                    case 3:
                        return "天翼";
                    case 4:
                        return "123";
                    case 5:
                        return "阿里";
                    case 6:
                        return "移动";
                }
            }
        }
        return "other";
    }

    public static void sort(List list) {
        Collections.sort(list, new PanOrder(getPanOrderFromConfig()));
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        String string = obj == null ? "" : !(obj instanceof String) ? obj.toString() : (String) obj;
        String string2 = obj2 == null ? "" : !(obj2 instanceof String) ? obj2.toString() : (String) obj2;
        String panType = getPanType(string);
        String panType2 = getPanType(string2);
        Integer num = this.orderMap.get(panType);
        int iIntValue = num == null ? Integer.MAX_VALUE : num.intValue();
        Integer num2 = this.orderMap.get(panType2);
        int iIntValue2 = num2 == null ? Integer.MAX_VALUE : num2.intValue();
        if (iIntValue < iIntValue2) {
            return -1;
        }
        return iIntValue > iIntValue2 ? 1 : 0;
    }
}
