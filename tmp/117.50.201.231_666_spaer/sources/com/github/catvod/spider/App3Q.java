package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class App3Q extends Spider {
    private String a;
    private String b;
    private String c;
    private static final String e = "SF-C3B2B41F6EFFFF9869176CF68F6790E8F07506FC88632C94B4F5F0430D5498CA";
    private static final String f = "com.sunshine.tv";
    private static final String g = "SK-thanks";
    private static final String h = "4";
    private static final Random d = new Random();

    private String a(String str) {
        try {
            return new JSONObject(C0575b.l(this.a + str, b())).toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private HashMap<String, String> b() {
        String upperCase;
        HashMap<String, String> map = new HashMap<>();
        map.put("user-agent", "okhttp/4.12.0");
        String str = h;
        map.put("x-ave", str);
        String str2 = f;
        map.put("x-aid", str2);
        map.put("x-time", this.b);
        map.put("x-nonc", this.c);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(String.format("finger=%s&id=%s&nonce=%s&sk=%s&time=%s&v=%s", e, str2, this.c, g, this.b, str).getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            upperCase = sb.toString().toUpperCase();
        } catch (Exception e2) {
            upperCase = "";
        }
        map.put("x-sign", upperCase);
        map.put("x-device-id", "0b4328287a5d953e");
        map.put("x-device-brand", "OnePlus");
        map.put("x-device-model", "HD1900");
        map.put("x-update-id", "73dc2ffc-8350-c022-fac9-da982c95f513");
        return map;
    }

    private String c(String str) {
        try {
            Matcher matcher = Pattern.compile("_0x1\\s*=\\s*\\[(.*?)\\];").matcher(str);
            if (!matcher.find()) {
                System.out.println("未匹配到JS中的组，解析失败");
                return "";
            }
            String[] strArrSplit = matcher.group(1).split(",");
            String strTrim = strArrSplit[0].replaceAll("['\"]", "").trim();
            String strTrim2 = strArrSplit[1].replaceAll("['\"]", "").trim();
            String str2 = String.format("%s:%s:%s:%s", strTrim, strTrim2, strArrSplit[2].replaceAll("['\"]", "").trim(), strArrSplit[3].replaceAll("['\"]", "").trim());
            long jCharAt = 0;
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                jCharAt = (((jCharAt << 5) - jCharAt) + ((long) str2.charAt(i))) & 4294967295L;
            }
            return String.format("%s:%s:%s", strTrim, Long.toHexString(Math.abs(jCharAt)), strTrim2.substring(0, 8));
        } catch (Exception e2) {
            System.out.println("异常信息：" + e2.getMessage());
            e2.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        new ArrayList();
        List<C0554e> vodList = parseVodList(new JSONObject(a("/api.php/app/filter/vod?type_name=" + str + "&page=" + str2 + "&sort=hits")).optJSONArray("data"));
        C0552c c0552c = new C0552c();
        c0552c.i(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c0552c.w(vodList);
        return c0552c.toString();
    }

    public String detailContent(List<String> list) {
        C0554e c0554e = new C0554e();
        try {
            JSONObject jSONObject = new JSONObject(a("/api.php/app/vod/get_detail?vod_id=" + list.get(0)));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("data").optJSONObject(0);
            c0554e.j(list.get(0));
            c0554e.k(jSONObjectOptJSONObject.optString("vod_name"));
            c0554e.l(jSONObjectOptJSONObject.optString("vod_pic"));
            c0554e.e(jSONObjectOptJSONObject.optString("vod_class"));
            c0554e.o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c0554e.h(jSONObjectOptJSONObject.optString("vod_content").trim());
            c0554e.f(jSONObjectOptJSONObject.optString("vod_actor"));
            c0554e.i(jSONObjectOptJSONObject.optString("vod_director"));
            String strOptString = jSONObjectOptJSONObject.optString("vod_name");
            HashMap map = new HashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vodplayer");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    map.put(jSONObject2.optString("from"), jSONObject2.optString("show"));
                }
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("vod_play_from");
            String strOptString3 = jSONObjectOptJSONObject.optString("vod_play_url");
            String[] strArrSplit = strOptString2.split("\\$\\$\\$");
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit2 = strOptString3.split("\\$\\$\\$");
            for (String str : strArrSplit) {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append(str);
                }
                sb.append("$$$");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 3, sb.length());
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            while (i2 < strArrSplit2.length) {
                String str3 = i2 < strArrSplit.length ? strArrSplit[i2] : "";
                String[] strArrSplit3 = strArrSplit2[i2].split("#");
                StringBuilder sb3 = new StringBuilder();
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= strArrSplit3.length) {
                        break;
                    }
                    String[] strArrSplit4 = strArrSplit3[i4].split("\\$");
                    String str4 = strArrSplit4[0];
                    String str5 = str4 + "$" + strArrSplit4[1] + "@" + str3 + "@" + strOptString + "@" + (str4.replaceAll("\\D+", "").isEmpty() ? "1" : str4.replaceAll("\\D+", ""));
                    if (sb3.length() > 0) {
                        sb3.append("#");
                    }
                    sb3.append(str5);
                    i3 = i4 + 1;
                }
                if (sb2.length() > 0 && sb3.length() > 0) {
                    sb2.append("$$$");
                }
                sb2.append((CharSequence) sb3);
                i2++;
            }
            c0554e.m(sb.toString());
            c0554e.n(sb2.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) throws JSONException {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject(a("/api.php/app/index/home")).getJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("categories");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recommend");
        int i2 = 0;
        while (true) {
            jSONArrayOptJSONArray.getClass();
            if (i2 >= jSONArrayOptJSONArray.length()) {
                break;
            }
            String string = jSONArrayOptJSONArray.getJSONObject(i2).getString("type_name");
            arrayList.add(new C0550a(string, string));
            i2++;
        }
        while (true) {
            jSONArrayOptJSONArray2.getClass();
            if (i >= jSONArrayOptJSONArray2.length()) {
                return C0552c.p(arrayList, parseVodList(jSONArray));
            }
            jSONArray.put(jSONArrayOptJSONArray2.getJSONObject(i));
            i++;
        }
    }

    public void init(Context context, String str) {
        if (str == null || str.isEmpty()) {
            str = "https://bbys.app";
        }
        this.a = str;
        this.b = String.valueOf(System.currentTimeMillis() / 1000);
        this.c = String.valueOf(d.nextInt(999) + 1);
    }

    public List<C0554e> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C0554e(jSONObject.optString("vod_id"), jSONObject.optString("vod_name"), jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                i++;
            } catch (Exception e2) {
            }
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("@");
            String strTrim = strArrSplit[0].trim();
            String strTrim2 = strArrSplit[1].trim();
            String str3 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[2].trim() + "&vodIndex=" + strArrSplit[3].trim() + "&vodUrl=";
            if (strTrim.matches(".*(m3u8|mp4|flv|avi|mov|mkv).*")) {
                return C0552c.e().u(strTrim).a(str3).o();
            }
            for (int i = 0; i < 3; i++) {
                String strL = C0575b.l(this.a + "/api.php/app/decode/url/?url=" + URLEncoder.encode(strTrim, "UTF-8") + "&vodFrom=" + strTrim2 + "", b());
                if (strL != null && !strL.trim().isEmpty()) {
                    JSONObject jSONObject = new JSONObject(strL);
                    if (jSONObject.optInt("code", -1) == 2 && jSONObject.has("challenge")) {
                        String strTrim3 = jSONObject.optString("challenge").trim();
                        if (!strTrim3.isEmpty()) {
                            String strC = c(strTrim3);
                            if (!strC.trim().isEmpty()) {
                                String str4 = "&token=" + strC;
                            }
                        }
                    }
                    String strTrim4 = jSONObject.optString("data").trim();
                    return strTrim4.startsWith("http") ? C0552c.e().u(strTrim4).a(str3).o() : strTrim4;
                }
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return C0552c.n("播放链接解析失败，请更换其他源播放");
        }
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArrayOptJSONArray = new JSONObject(a("/api.php/app/search/index?wd=" + URLEncoder.encode(str) + "&page=1&limit=15")).optJSONArray("data");
        new ArrayList();
        return C0552c.n(parseVodList(jSONArrayOptJSONArray));
    }
}
