package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import com.github.catvod.spider.merge.a.C0529a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class JianPian extends Spider {
    public String a = "";
    public String b = "";

    /* JADX INFO: renamed from: com.github.catvod.spider.JianPian$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public String aaaa(String str) {
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return str;
        }
        return "https://" + generateRandomString(6) + "." + str;
    }

    public final String c(String str) {
        try {
            if (!str.startsWith("/")) {
                return str;
            }
            return "https://" + this.b + str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            String strReplace = (str.equals("67") ? this.a + "/api/crumb/shortList?fcate_pid={cateId}&category_id={category_id}&sort=update&page={page}" : this.a + "/api/crumb/list?fcate_pid={cateId}&category_id={category_id}&area={area}&year={year}&type={type}&sort={sort}&page={page}").replace("{page}", str2).replace("{cateId}", str);
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            String strReplace2 = strReplace.replace("{category_id}", "").replace("{area}", "").replace("{year}", "").replace("{type}", "").replace("{sort}", "");
            String strK = yi.k(strReplace2, d(this.a));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strK).getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("title");
                String strC = str.equals("67") ? c(jSONObject2.getString("cover_image")) : c(jSONObject2.getString("path"));
                String string2 = jSONObject2.getString("mask");
                if (string2.isEmpty()) {
                    string2 = jSONObject2.getString("score");
                }
                Integer numValueOf = Integer.valueOf(jSONObject2.getInt("id"));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", numValueOf + "$$$" + string + "$$$" + strC + "$$$" + str);
                jSONObject3.put("vod_name", string);
                jSONObject3.put("vod_pic", strC);
                jSONObject3.put("vod_remarks", string2);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("page", strReplace2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public final HashMap d(String str) {
        return wb.f("User-Agent", "Mozilla/5.0 (Linux; Android 7.1.2; V2049A Build/UP1A.231005.007; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.117 Mobile Safari/537.36;webank/h5face;webank/1.0;netType:NETWORK_WIFI;appVersion:422;packageName:com.jp3.xg3");
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        String str4;
        String str5 = "$$$";
        try {
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            String[] strArrSplit = list.get(0).split("\\$\\$\\$");
            String str6 = this.a + "/api/video/detailv2?id=" + strArrSplit[0];
            if (strArrSplit[3].equals("67")) {
                str6 = this.a + "/api/detail?vid=" + strArrSplit[0];
            }
            JSONObject jSONObject2 = new JSONObject(yi.k(str6, d(this.a))).getJSONObject("data");
            jSONObject.put("vod_id", list.get(0));
            jSONObject.put("vod_name", strArrSplit[1]);
            jSONObject.put("vod_pic", c(strArrSplit[2]));
            jSONObject.put("vod_content", jSONObject2.getString("description"));
            if (strArrSplit[3].equals("67")) {
                if (jSONObject2.has("playlist") && (jSONObject2.get("playlist") instanceof JSONArray)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("playlist");
                    ArrayList arrayList3 = new ArrayList();
                    while (i < jSONArray2.length()) {
                        if (jSONArray2.length() >= 1) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                            String strOptString = jSONObject3.optString("title");
                            String strOptString2 = jSONObject3.optString("url");
                            if (!strOptString2.isEmpty()) {
                                arrayList3.add(strOptString + "$" + strOptString2);
                            }
                        }
                        i++;
                    }
                    if (arrayList3.size() > 0) {
                        arrayList2.add("常规线路");
                        arrayList.add(TextUtils.join("#", arrayList3));
                    }
                }
                str3 = "$$$";
            } else {
                String string = jSONObject2.getString("year");
                String string2 = jSONObject2.getString("area");
                JSONArray jSONArray3 = jSONObject2.getJSONArray("actors");
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    str = str5;
                    str2 = "name";
                    if (i >= jSONArray3.length()) {
                        break;
                    }
                    arrayList4.add(jSONArray3.getJSONObject(i).get("name"));
                    i++;
                    str5 = str;
                }
                jSONObject.put("vod_year", string);
                jSONObject.put("vod_area", string2);
                jSONObject.put("vod_actor", arrayList4.toString());
                jSONObject.put("type_name", "");
                jSONObject.put("vod_remarks", "");
                jSONObject.put("vod_director", "");
                if (jSONObject2.has("source_list_source") && (jSONObject2.get("source_list_source") instanceof JSONArray)) {
                    JSONArray jSONArray4 = jSONObject2.getJSONArray("source_list_source");
                    int i2 = 0;
                    while (i2 < jSONArray4.length()) {
                        String string3 = jSONArray4.getJSONObject(i2).getString(str2);
                        JSONArray jSONArray5 = jSONArray4.getJSONObject(i2).getJSONArray("source_list");
                        ArrayList arrayList5 = new ArrayList();
                        int i3 = 0;
                        while (i3 < jSONArray5.length()) {
                            JSONObject jSONObject4 = jSONArray5.getJSONObject(i3);
                            String strOptString3 = jSONObject4.optString("source_name");
                            String strOptString4 = jSONObject4.optString("url");
                            if (strOptString4.isEmpty()) {
                                jSONArray = jSONArray4;
                                str4 = str2;
                            } else {
                                jSONArray = jSONArray4;
                                if (strOptString4.startsWith("ftp")) {
                                    StringBuilder sb = new StringBuilder();
                                    str4 = str2;
                                    sb.append("tvbox-xg:");
                                    sb.append(strOptString4);
                                    strOptString4 = sb.toString();
                                } else {
                                    str4 = str2;
                                }
                                arrayList5.add(strOptString3 + "$" + strOptString4);
                            }
                            i3++;
                            jSONArray4 = jSONArray;
                            str2 = str4;
                        }
                        JSONArray jSONArray6 = jSONArray4;
                        String str7 = str2;
                        if (arrayList5.size() > 0) {
                            arrayList2.add(string3);
                            arrayList.add(TextUtils.join("#", arrayList5));
                        }
                        i2++;
                        jSONArray4 = jSONArray6;
                        str2 = str7;
                    }
                }
                str3 = str;
            }
            String strJoin = TextUtils.join(str3, arrayList2);
            String strJoin2 = TextUtils.join(str3, arrayList);
            jSONObject.put("vod_play_from", strJoin);
            jSONObject.put("vod_play_url", strJoin2);
            JSONObject jSONObject5 = new JSONObject();
            JSONArray jSONArray7 = new JSONArray();
            jSONArray7.put(jSONObject);
            jSONObject5.put("list", jSONArray7);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String generateRandomString(int i) {
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(36)));
        }
        return sb.toString();
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&电视剧&动漫&综艺&短剧".split("&");
            String[] strArrSplit2 = "1&2&3&4&67".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{\"1\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"1\"},{\"n\":\"中国香港\",\"v\":\"3\"},{\"n\":\"中国台湾\",\"v\":\"6\"},{\"n\":\"美国\",\"v\":\"5\"},{\"n\":\"韩国\",\"v\":\"18\"},{\"n\":\"日本\",\"v\":\"2\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"162\"},{\"n\":\"2025\",\"v\":\"107\"},{\"n\":\"2024\",\"v\":\"119\"},{\"n\":\"2023\",\"v\":\"153\"},{\"n\":\"2022\",\"v\":\"101\"},{\"n\":\"2021\",\"v\":\"118\"},{\"n\":\"2020\",\"v\":\"16\"},{\"n\":\"2019\",\"v\":\"7\"},{\"n\":\"2018\",\"v\":\"2\"},{\"n\":\"2017\",\"v\":\"3\"},{\"n\":\"2016\",\"v\":\"22\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"更新\",\"v\":\"update\"},{\"n\":\"评分\",\"v\":\"rating\"}]}],\"2\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"1\"},{\"n\":\"中国香港\",\"v\":\"3\"},{\"n\":\"中国台湾\",\"v\":\"6\"},{\"n\":\"美国\",\"v\":\"5\"},{\"n\":\"韩国\",\"v\":\"18\"},{\"n\":\"日本\",\"v\":\"2\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"162\"},{\"n\":\"2025\",\"v\":\"107\"},{\"n\":\"2024\",\"v\":\"119\"},{\"n\":\"2023\",\"v\":\"153\"},{\"n\":\"2022\",\"v\":\"101\"},{\"n\":\"2021\",\"v\":\"118\"},{\"n\":\"2020\",\"v\":\"16\"},{\"n\":\"2019\",\"v\":\"7\"},{\"n\":\"2018\",\"v\":\"2\"},{\"n\":\"2017\",\"v\":\"3\"},{\"n\":\"2016\",\"v\":\"22\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"更新\",\"v\":\"update\"},{\"n\":\"评分\",\"v\":\"rating\"}]}],\"3\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"1\"},{\"n\":\"中国香港\",\"v\":\"3\"},{\"n\":\"中国台湾\",\"v\":\"6\"},{\"n\":\"美国\",\"v\":\"5\"},{\"n\":\"韩国\",\"v\":\"18\"},{\"n\":\"日本\",\"v\":\"2\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"162\"},{\"n\":\"2025\",\"v\":\"107\"},{\"n\":\"2024\",\"v\":\"119\"},{\"n\":\"2023\",\"v\":\"153\"},{\"n\":\"2022\",\"v\":\"101\"},{\"n\":\"2021\",\"v\":\"118\"},{\"n\":\"2020\",\"v\":\"16\"},{\"n\":\"2019\",\"v\":\"7\"},{\"n\":\"2018\",\"v\":\"2\"},{\"n\":\"2017\",\"v\":\"3\"},{\"n\":\"2016\",\"v\":\"22\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"更新\",\"v\":\"update\"},{\"n\":\"评分\",\"v\":\"rating\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"1\"},{\"n\":\"中国香港\",\"v\":\"3\"},{\"n\":\"中国台湾\",\"v\":\"6\"},{\"n\":\"美国\",\"v\":\"5\"},{\"n\":\"韩国\",\"v\":\"18\"},{\"n\":\"日本\",\"v\":\"2\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"162\"},{\"n\":\"2025\",\"v\":\"107\"},{\"n\":\"2024\",\"v\":\"119\"},{\"n\":\"2023\",\"v\":\"153\"},{\"n\":\"2022\",\"v\":\"101\"},{\"n\":\"2021\",\"v\":\"118\"},{\"n\":\"2020\",\"v\":\"16\"},{\"n\":\"2019\",\"v\":\"7\"},{\"n\":\"2018\",\"v\":\"2\"},{\"n\":\"2017\",\"v\":\"3\"},{\"n\":\"2016\",\"v\":\"22\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"更新\",\"v\":\"update\"},{\"n\":\"评分\",\"v\":\"rating\"}]}],\"67\":[{\"key\":\"category_id\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"言情\",\"v\":\"70\"},{\"n\":\"爱情\",\"v\":\"71\"},{\"n\":\"战神\",\"v\":\"72\"},{\"n\":\"古代\",\"v\":\"73\"},{\"n\":\"萌娃\",\"v\":\"74\"},{\"n\":\"神医\",\"v\":\"75\"},{\"n\":\"玄幻\",\"v\":\"76\"},{\"n\":\"重生\",\"v\":\"77\"},{\"n\":\"激情\",\"v\":\"79\"},{\"n\":\"时尚\",\"v\":\"82\"},{\"n\":\"剧情演绎\",\"v\":\"83\"},{\"n\":\"影视\",\"v\":\"84\"},{\"n\":\"人文社科\",\"v\":\"85\"},{\"n\":\"二次元\",\"v\":\"86\"},{\"n\":\"明星八卦\",\"v\":\"87\"},{\"n\":\"随拍\",\"v\":\"88\"},{\"n\":\"个人管理\",\"v\":\"89\"},{\"n\":\"音乐\",\"v\":\"90\"},{\"n\":\"汽车\",\"v\":\"91\"},{\"n\":\"休闲\",\"v\":\"92\"},{\"n\":\"校园教育\",\"v\":\"93\"},{\"n\":\"游戏\",\"v\":\"94\"},{\"n\":\"科普\",\"v\":\"95\"},{\"n\":\"科技\",\"v\":\"96\"},{\"n\":\"时政社会\",\"v\":\"97\"},{\"n\":\"萌宠\",\"v\":\"98\"},{\"n\":\"体育\",\"v\":\"99\"},{\"n\":\"穿越\",\"v\":\"80\"},{\"n\":\"\",\"v\":\"81\"},{\"n\":\"闪婚\",\"v\":\"112\"}]}]}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            String strK = yi.k(this.a + "/api/dyTag/list?category_id=88", d(this.a));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strK).getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i).getJSONArray("dataList");
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i2);
                    String string = jSONObject2.getString("title");
                    String strC = c(jSONObject2.getString("path"));
                    String string2 = jSONObject2.getString("mask");
                    Integer numValueOf = Integer.valueOf(jSONObject2.getInt("id"));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", numValueOf + "$$$" + string + "$$$" + strC + "$$$1");
                    jSONObject3.put("vod_name", string);
                    jSONObject3.put("vod_pic", strC);
                    jSONObject3.put("vod_remarks", string2);
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public void init(Context context) {
        super.init(context);
        try {
            String[] strArrSplit = new JSONObject(yi.k("https://dns.alidns.com/resolve?name=swrdsfeiujo25sw.cc&type=TXT", null)).getJSONArray("Answer").getJSONObject(0).getString("data").replaceAll("^\"|\"$", "").split(",");
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length) {
                    break;
                }
                String strAaaa = aaaa(strArrSplit[i]);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                yi.g(yi.f(), strAaaa, null, anonymousClass1);
                if (((Response) anonymousClass1.getResult()).code() == 200) {
                    this.a = strAaaa;
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                this.a = aaaa(strArrSplit[0]);
            }
            this.b = new JSONObject(yi.k(this.a + "/api/v2/settings/resourceDomainConfig", null)).getJSONObject("data").getString("imgDomain").split(",")[0];
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (ku.f(str2) && str2.startsWith("http")) {
                jSONObject.put("parse", 1);
                jSONObject.put("jx", "1");
                jSONObject.put("url", str2);
                return C0529a.addDanmaku(jSONObject.toString());
            }
            jSONObject.put("url", str2);
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            return C0529a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String strK = yi.k(this.a + "/api/v2/search/videoV2?key=" + URLEncoder.encode(str) + "&category_id=88&page=1&pageSize=20", d(this.a));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(strK).getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String string = jSONObject2.getString("title");
                String strC = c(jSONObject2.getString("thumbnail"));
                String string2 = jSONObject2.getString("mask");
                Integer numValueOf = Integer.valueOf(jSONObject2.getInt("id"));
                Integer numValueOf2 = Integer.valueOf(jSONObject2.getJSONObject("top_category").getInt("id"));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", numValueOf + "$$$" + string + "$$$" + strC + "$$$" + numValueOf2);
                jSONObject3.put("vod_name", string);
                jSONObject3.put("vod_pic", strC);
                jSONObject3.put("vod_remarks", string2);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
