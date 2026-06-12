package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TvLive extends Spider {
    private String liveUrl;
    private final String authKey = "okhttp/3.12.11";

    private Map<String, String> buildHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", this.liveUrluthKey);
        return headers;
    }

    private void parseM3uChannels(BufferedReader reader, JSONArray channels, String groupName) {
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (!line.equals("") && !line.contains("#EXTM3U") && line.contains("#EXTINF")) {
                    String strTrim = extractBetween("tvg-name=\"", "\" tvg-logo=", line).trim();
                    String strE = extractBetween("tvg-logo=\"", "\" group-title=", line);
                    if (!str.equals("")) {
                        strE = str;
                    }
                    String strE2 = extractBetween("group-title=\"", "\",", line);
                    if (strTrim.equals("")) {
                        strTrim = line.substring(line.lastIndexOf(",") + 1);
                    }
                    jSONArray.put(new JSONObject().put("vod_id", new JSONObject().put("vod_play_url", strTrim + "$" + bufferedReader.readLine().trim()).put("pic", strE).toString()).put("vod_name", strTrim).put("vod_pic", strE).put("vod_remarks", strE2));
                }
            } catch (Exception e) {
                StringUtils.printStackTrace();
                return;
            }
        }
    }

    private void parseM3uGroups(BufferedReader reader, JSONArray channels, String groupName) {
        try {
            ArrayList<com.github.catvod.spider.merge.KI.d> arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.equals("") && !line.contains("#EXTM3U") && line.contains("#EXTINF")) {
                    String strE = extractBetween("tvg-name=\"", "\" tvg-logo=", line);
                    String strE2 = extractBetween("group-title=\"", "\",", line);
                    if (strE.equals("")) {
                        strE = line.substring(line.lastIndexOf(",") + 1);
                    }
                    arrayList.add(new com.github.catvod.spider.merge.KI.d(strE, bufferedReader.readLine().trim(), strE2));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (com.github.catvod.spider.merge.KI.FilterGroup dVar : arrayList) {
                String strA = dVar.a();
                if (linkedHashMap.containsKey(strA)) {
                    ((List) linkedHashMap.get(strA)).add(dVar);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dVar);
                    linkedHashMap.put(strA, arrayList2);
                }
            }
            for (String str2 : linkedHashMap.keySet()) {
                List<com.github.catvod.spider.merge.KI.d> list = (List) linkedHashMap.get(str2);
                ArrayList arrayList3 = new ArrayList();
                for (com.github.catvod.spider.merge.KI.FilterGroup dVar2 : list) {
                    arrayList3.add(dVar2.b() + "$" + dVar2.c());
                }
                jSONArray.put(new JSONObject().put("vod_id", new JSONObject().put("vod_play_url", TextUtils.join("#", arrayList3)).put("pic", str).toString()).put("vod_name", str2).put("vod_pic", str).put("vod_remarks", ""));
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    private void parseTxtChannels(BufferedReader reader, JSONArray channels, String groupName) {
        int i;
        try {
            ArrayList<com.github.catvod.spider.merge.KI.d> arrayList = new ArrayList();
            String strSubstring = "";
            while (true) {
                String line = bufferedReader.readLine();
                i = 1;
                if (line == null) {
                    break;
                }
                if (!line.equals("") && line.contains(",")) {
                    if (line.contains(",#genre#")) {
                        strSubstring = line.substring(0, line.indexOf(","));
                    } else {
                        String[] strArrSplit = line.split(",");
                        arrayList.add(new com.github.catvod.spider.merge.KI.d(strArrSplit[0], strArrSplit[1], strSubstring));
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (com.github.catvod.spider.merge.KI.FilterGroup dVar : arrayList) {
                String strA = dVar.a();
                if (linkedHashMap.containsKey(strA)) {
                    ((List) linkedHashMap.get(strA)).add(dVar);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dVar);
                    linkedHashMap.put(strA, arrayList2);
                }
            }
            for (String str2 : linkedHashMap.keySet()) {
                List<com.github.catvod.spider.merge.KI.d> list = (List) linkedHashMap.get(str2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (com.github.catvod.spider.merge.KI.FilterGroup dVar2 : list) {
                    String strB = dVar2.b();
                    if (linkedHashMap2.containsKey(strB)) {
                        ((List) linkedHashMap2.get(strB)).add(dVar2);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(dVar2);
                        linkedHashMap2.put(strB, arrayList3);
                    }
                }
                int size = 0;
                for (List list2 : linkedHashMap2.values()) {
                    if (list2.size() > size) {
                        size = list2.size();
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                int i2 = 0;
                while (i2 < size) {
                    ArrayList arrayList4 = new ArrayList();
                    for (String str3 : linkedHashMap2.keySet()) {
                        try {
                            com.github.catvod.spider.merge.KI.FilterGroup dVar3 = (com.github.catvod.spider.merge.KI.d) ((List) linkedHashMap2.get(str3)).get(i2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            byte[] bArr = new byte[i];
                            bArr[0] = 73;
                            sb.append(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{109, -23, 44, 78, 8, 53, -98, -47}));
                            sb.append(dVar3.c());
                            arrayList4.add(sb.toString());
                        } catch (Exception unused) {
                        }
                        i = 1;
                    }
                    if (arrayList4.size() > 0) {
                        linkedHashMap3.put("线路" + (i2 + 1), TextUtils.join("#", arrayList4));
                    }
                    i2++;
                    i = 1;
                }
                jSONArray.put(new JSONObject().put("vod_id", new JSONObject().put("vod_play_url", TextUtils.join("$$", linkedHashMap3.values())).put("vod_play_from", TextUtils.join("$$", linkedHashMap3.keySet())).put("pic", str).toString()).put("vod_name", str2).put("vod_pic", str).put("vod_remarks", ""));
                i = 1;
            }
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    private String extractBetween(String startTag, String endTag, String text) {
        try {
            int start = text.indexOf(startTag);
            return text.substring(start + startTag.length(), text.indexOf(endTag, start));
        } catch (Exception e) {
            StringUtils.printStackTrace();
            System.out.println("-------------->  截取产生异常了");
            return "";
        }
    }

    public String categoryContent(String typeId, String filterId, boolean filterGenre, HashMap<String, String> extend) throws IOException {
        char c = 0;
        byte b = 49;
        int i = 8;
        if (!str2.equals("1")) {
            return "";
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("pic");
        String strOptString3 = jSONObject.optString("group");
        String strOptString4 = jSONObject.optString("circuit");
        String strL = com.github.catvod.spider.merge.nU.FilterValue.l(strOptString, buildHeaders());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strL.getBytes());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        JSONArray jSONArray = new JSONArray();
        if (strL.contains("#genre#")) {
            if (strOptString4.equals("1")) {
                parseTxtChannels(bufferedReader, jSONArray, strOptString2);
            } else {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    String strSubstring = "";
                    int i2 = 0;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.equals("")) {
                            byte[] bArr = new byte[i];
                            bArr[c] = b;
                            bArr[1] = -112;
                            bArr[2] = -128;
                            bArr[3] = -46;
                            bArr[4] = 81;
                            bArr[5] = 24;
                            bArr[6] = -74;
                            bArr[7] = 60;
                            byte[] bArr2 = new byte[i];
                            bArr2[c] = 29;
                            bArr2[1] = -77;
                            bArr2[2] = -25;
                            bArr2[3] = -73;
                            bArr2[4] = 63;
                            bArr2[5] = 106;
                            bArr2[6] = -45;
                            bArr2[7] = 31;
                            if (line.contains(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2))) {
                                int i3 = i2 + 1;
                                if (i3 > 1) {
                                    byte[] bArr3 = new byte[1];
                                    bArr3[c] = -116;
                                    linkedHashMap.put(strSubstring, TextUtils.join(com.github.catvod.spider.merge.XI.f.a(bArr3, new byte[]{-81, -87, 35, 70, 101, -102, -71, -126}), arrayList));
                                    arrayList.clear();
                                }
                                strSubstring = line.substring(0, line.indexOf(","));
                                i2 = i3;
                            } else {
                                arrayList.add(line.replacextractBetween(",", "$"));
                            }
                        }
                        c = 0;
                        b = 49;
                        i = 8;
                    }
                    byte b2 = 44;
                    if (arrayList.size() > 0) {
                        linkedHashMap.put(strSubstring, TextUtils.join("#", arrayList));
                    }
                    for (String str3 : linkedHashMap.keySet()) {
                        jSONArray.put(new JSONObject().put("vod_id", new JSONObject().put("vod_play_u^l", (String) linkedHashMap.get(str3)).put("pic", strOptString2).toString()).put("vod_name", str3).put("vod_pic", strOptString2).put("vod_remarks", ""));
                        b2 = 44;
                    }
                } catch (Exception e) {
                    StringUtils.printStackTrace();
                }
            }
        }
        if (strL.contains("#EXTM3U")) {
            if (strOptString3.equals("1")) {
                parseM3uGroups(bufferedReader, jSONArray, strOptString2);
            } else {
                parseM3uChannels(bufferedReader, jSONArray, strOptString2);
            }
        }
        bufferedReader.close();
        byteArrayInputStream.close();
        return new JSONObject().put("pagecount", 1).put("list", jSONArray).toString();
    }

    public String detailContent(List<String> ids) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject(list.get(0));
        String string = jSONObject.getString("vod_play_url");
        String string2 = jSONObject.getString("pic");
        String strA = "选台";
        String strOptString = jSONObject.optString("vod_play_from");
        if (!strOptString.equals("")) {
            strA = strOptString;
        }
        String[] strArrSplit = string.split("\\$");
        String strA2 = "电视直播";
        if (strArrSplit.length == 2) {
            strA2 = strArrSplit[0];
            str = "播放地址：" + strArrSplit[1];
        } else {
            str = "";
        }
        JSONObject jSONObjectPut = new JSONObject().put("vod_id", list.get(0)).put("vod_name", strA2).put("vod_pic", string2).put("type_name", "电视直播").put("vod_year", "").put("vod_area", "").put("vod_remarks", "").put("vod_actor", "").put("vod_director", "").put("vod_content", str);
        if (string.length() > 0) {
            jSONObjectPut.put("vod_play_from", strA);
            jSONObjectPut.put("vod_play_url", string);
        }
        return new JSONObject().put("list", new JSONArray().put(jSONObjectPut)).toString();
    }

    public String homeContent(boolean filterGenre) throws JSONException {
        char c;
        int i;
        String str;
        JSONObject jSONObject;
        String strA;
        String str2;
        JSONArray jSONArray = new JSONArray();
        int i2 = 1;
        char c2 = 0;
        int i3 = 4;
        int i4 = 7;
        if (this.liveUrl.contains("$")) {
            String str3 = this.liveUrl;
            if (str3.contains("&&&")) {
                String[] strArrSplit = this.liveUrl.split("&&&");
                c = 0;
                String str4 = strArrSplit[0];
                i = 1;
                str = strArrSplit.length > 1 ? strArrSplit[1] : "";
                str3 = str4;
            } else {
                c = 0;
                i = 1;
                str = "";
            }
            byte[] bArr = new byte[i];
            bArr[c] = 114;
            String[] strArrSplit2 = str3.split(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{81, -38, 29, 90, -67, 85, 6, -113}));
            for (String str5 : strArrSplit2) {
                String[] strArrSplit3 = str5.split("\\$");
                String str6 = strArrSplit3[0];
                String str7 = strArrSplit3[1];
                jSONArray.put(new JSONObject().put("type_id", new JSONObject().put("url", str7).put("pic", str7.contains(".txt") ? str : "").toString()).put("type_name", str6));
            }
            jSONObject = new JSONObject();
            strA = "class";
        } else {
            JSONArray jSONArray2 = new JSONArray(com.github.catvod.spider.merge.nU.FilterValue.l(this.liveUrl, buildHeaders()));
            int i5 = 0;
            while (i5 < jSONArray2.length()) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                byte[] bArr2 = new byte[i3];
                // fill-array-data instruction
                bArr2[0] = 125;
                bArr2[1] = 90;
                bArr2[2] = -32;
                bArr2[3] = -24;
                String strOptString = jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(bArr2, new byte[]{19, 59, -115, -115, 96, -9, -48, 126}));
                String strOptString2 = jSONObject2.optString("url");
                String strOptString3 = jSONObject2.optString("group");
                byte[] bArr3 = new byte[i4];
                // fill-array-data instruction
                bArr3[0] = 26;
                bArr3[1] = -10;
                bArr3[2] = 52;
                bArr3[3] = -12;
                bArr3[4] = -7;
                bArr3[5] = 98;
                bArr3[6] = -18;
                String strOptString4 = jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(bArr3, new byte[]{121, -97, 70, -105, -116, 11, -102, -4}));
                if (strOptString2.contains("&&&")) {
                    String[] strArrSplit4 = strOptString2.split("&&&");
                    String str8 = strArrSplit4[c2];
                    str2 = strArrSplit4.length > i2 ? strArrSplit4[i2] : "";
                    strOptString2 = str8;
                } else {
                    str2 = "";
                }
                jSONArray.put(new JSONObject().put("type_id", new JSONObject().put("url", strOptString2).put("pic", str2).put("group", strOptString3).put("circuit", strOptString4).toString()).put("type_name", strOptString));
                i5++;
                i2 = 1;
                c2 = 0;
                i3 = 4;
                i4 = 7;
            }
            jSONObject = new JSONObject();
            strA = "class";
        }
        return jSONObject.put(strA, jSONArray).toString();
    }

    public void init(Context context, String config) {
        super.init(context, config);
        this.liveUrl = config;
    }

    public String playerContent(String key, String playFlag, List<String> vipFlags) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", this.liveUrluthKey);
        return new JSONObject().put("parse", 0).put("header", headers.toString()).put("playUrl", "").put("url", playFlag).toString();
    }
}
