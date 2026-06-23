package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0603l;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class TianYiSou extends Pan {
    public static String a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public static String encrypt(String str, String str2, String str3) {
        if (str2 != null) {
            try {
                if (str2.length() >= 16) {
                    if (str3 == null || str3.length() != 16) {
                        throw new IllegalArgumentException("IV must be 16 bytes");
                    }
                    byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                    byte[] bytes2 = str3.getBytes(StandardCharsets.UTF_8);
                    byte[] bytes3 = str.getBytes(StandardCharsets.UTF_8);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    byte[] bArrDoFinal = cipher.doFinal(bytes3);
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDoFinal) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        throw new IllegalArgumentException("Key must be at least 16 bytes");
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int iIndexOf;
        int i;
        int iIndexOf2;
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "https://www.tianyiso.com" + list.get(0);
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://www.tianyiso.com/");
            map.put("cookie", "ck_ml_sea_=" + encrypt(a(C0575b.l(str, map), "start_load\\(\"(.*)\"\\)"), "1234567812345678", "1234567812345678").replace("\n", ""));
            String strL = C0575b.l(str, map);
            int iIndexOf3 = strL.indexOf("<title>");
            if (iIndexOf3 != -1 && (iIndexOf2 = strL.indexOf("</title>", (i = iIndexOf3 + 7))) != -1) {
                String strSubstring = strL.substring(i, iIndexOf2);
                int iIndexOf4 = strSubstring.indexOf(" - 云盘资源 - 天逸搜");
                if (iIndexOf4 != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf4);
                }
                jSONObject.put("vod_name", strSubstring);
            }
            String strA = a(strL, "<van-cell title=\"密码\">\\s*<b[^>]*>(.*?)</b>\\s*</van-cell>");
            String strReplace = str.replace("/s/", "/cv/");
            map.put("Referer", str);
            String strB = C0575b.b(strReplace, map);
            if (strB.contains("cloud.189.cn/web/share") && (iIndexOf = strB.indexOf("code=")) != -1) {
                int i2 = iIndexOf + 5;
                int iIndexOf5 = strB.indexOf("&", i2);
                if (iIndexOf5 == -1) {
                    iIndexOf5 = strB.length();
                }
                strB = C0529a.filterCloudDiskLinks("https://cloud.189.cn/t/" + strB.substring(i2, iIndexOf5));
            }
            if (strL.contains("密码") && strA != null) {
                strB = strB + "访问码：" + strA;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(strB);
            if (arrayList.size() > 0) {
                PanOrder.sort(arrayList);
                String strDetailContentVodPlayFrom = detailContentVodPlayFrom(arrayList);
                String strDetailContentVodPlayUrl = detailContentVodPlayUrl(arrayList);
                jSONObject.put("vod_play_from", strDetailContentVodPlayFrom);
                jSONObject.put("vod_play_url", strDetailContentVodPlayUrl);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return C0529a.processVodData(jSONObject2.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, String str2) {
        int iIndexOf;
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://www.tianyiso.com/");
            StringBuilder sb = new StringBuilder();
            sb.append("https://www.tianyiso.com/search?k=").append(str).append("&page=").append(str2);
            String string = sb.toString();
            map.put("cookie", "ck_ml_sea_=" + encrypt(a(C0575b.l(string, map), "start_load\\(\"(.*)\"\\)"), "1234567812345678", "1234567812345678").replace("\n", ""));
            String strL = C0575b.l(string, map);
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (i < strL.length() && (iIndexOf = strL.indexOf("<a href=\"/s/", i)) != -1) {
                int i2 = iIndexOf + 9;
                int iIndexOf2 = strL.indexOf("\"", i2);
                if (iIndexOf2 == -1) {
                    i = iIndexOf + 1;
                } else {
                    String strSubstring = strL.substring(i2, iIndexOf2);
                    int iIndexOf3 = strL.indexOf(">", iIndexOf2);
                    if (iIndexOf3 == -1) {
                        i = iIndexOf + 1;
                    } else {
                        int i3 = iIndexOf3 + 1;
                        int iIndexOf4 = strL.indexOf("</div>", i3);
                        if (iIndexOf4 == -1) {
                            i = iIndexOf + 1;
                        } else {
                            String strSubstring2 = strL.substring(i3, iIndexOf4);
                            StringBuilder sb2 = new StringBuilder();
                            boolean z = false;
                            for (int i4 = 0; i4 < strSubstring2.length(); i4++) {
                                char cCharAt = strSubstring2.charAt(i4);
                                if (cCharAt == '<') {
                                    z = true;
                                } else if (cCharAt == '>') {
                                    z = false;
                                } else if (!z) {
                                    if (cCharAt == ' ' && sb2.length() > 0) {
                                        sb2.append(cCharAt);
                                    } else if (!z) {
                                        sb2.append(cCharAt);
                                    }
                                }
                            }
                            String strTrim = sb2.toString().replace("\n", "").replace("  ", " ").trim();
                            if (strTrim.length() == 0) {
                                i = iIndexOf + 1;
                            } else if (strTrim.contains("🈲") || strTrim.contains("🔞")) {
                                i = iIndexOf + 1;
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("vod_id", strSubstring);
                                jSONObject.put("vod_name", strTrim);
                                jSONObject.put("vod_pic", "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/xiFH/1200X800/189.jpg");
                                jSONArray.put(jSONObject);
                                i = iIndexOf4;
                            }
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return "{\"list\":[]}";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"list\":[]}";
        }
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
