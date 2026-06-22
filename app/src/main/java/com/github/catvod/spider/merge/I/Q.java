package com.github.catvod.spider.merge.I;

import com.github.catvod.en.BaseApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Q {
    Q() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r17, java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.Q.a(java.lang.String, java.util.List):java.lang.String");
    }

    public static Q b() {
        return P.a;
    }

    private Map<String, String> c() {
        HashMap mapB = com.github.catvod.spider.merge.B.e.b("Content-Type", "application/json", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        mapB.put("Referer", "https://www.guangyapan.com/");
        mapB.put("Origin", "https://www.guangyapan.com");
        mapB.put("dt", "4");
        if (com.github.catvod.spider.merge.P0.e.d(N.a.f.b())) {
            mapB.put("Authorization", N.a.f.b());
        }
        return mapB;
    }

    private boolean e(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("mineType", "");
        String lowerCase = jSONObject.optString("ext", "").toLowerCase();
        if (strOptString.startsWith("video/")) {
            return true;
        }
        String[] strArr = {".mp4", ".mkv", ".avi", ".wmv", ".flv", ".mov", ".rmvb", ".rm", ".3gp", ".ts", ".m4v", ".webm", ".mpg", ".mpeg", ".m2ts"};
        for (int i = 0; i < 15; i++) {
            if (lowerCase.equals(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    private void f(String str, List<JSONObject> list, String str2) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parentId", str);
            jSONObject.put("pageSize", 200);
            jSONObject.put("orderBy", 0);
            jSONObject.put("sortType", 0);
            String strH = h("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_file_list", jSONObject, true);
            if (com.github.catvod.spider.merge.P0.e.d(strH)) {
                JSONObject jSONObject2 = new JSONObject(strH);
                if (!"success".equals(jSONObject2.optString("msg")) || (jSONArrayOptJSONArray = jSONObject2.getJSONObject("data").optJSONArray("list")) == null) {
                    return;
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    if (jSONObject3.optInt("resType") == 2) {
                        String string = jSONObject3.getString("fileName");
                        String string2 = jSONObject3.getString("fileId");
                        if (com.github.catvod.spider.merge.P0.e.d(str2)) {
                            string = str2 + "/" + string;
                        }
                        f(string2, list, string);
                    } else if (jSONObject3.optInt("resType") == 1 && e(jSONObject3)) {
                        jSONObject3.put("_parentName", str2 != null ? str2 : "");
                        list.add(jSONObject3);
                    }
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("光鸭云盘自有盘 listAllVideoFiles 异常: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String h(java.lang.String r7, org.json.JSONObject r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L70
            java.util.Map r1 = r6.c()     // Catch: java.lang.Exception -> L70
            com.github.catvod.spider.merge.f0.i r0 = com.github.catvod.spider.merge.f0.d.j(r7, r0, r1)     // Catch: java.lang.Exception -> L70
            if (r9 == 0) goto L47
            int r9 = r0.b()     // Catch: java.lang.Exception -> L70
            r1 = 1
            r2 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r9 != r2) goto L19
            goto L38
        L19:
            java.lang.String r9 = r0.a()     // Catch: java.lang.Exception -> L70
            boolean r9 = com.github.catvod.spider.merge.P0.e.d(r9)     // Catch: java.lang.Exception -> L70
            if (r9 == 0) goto L37
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r0.a()     // Catch: java.lang.Exception -> L37
            r9.<init>(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = "code"
            r5 = 200(0xc8, float:2.8E-43)
            int r9 = r9.optInt(r4, r5)     // Catch: java.lang.Exception -> L37
            if (r9 != r2) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L47
            com.github.catvod.spider.merge.I.O r9 = com.github.catvod.spider.merge.I.N.a     // Catch: java.lang.Exception -> L70
            boolean r9 = r9.w()     // Catch: java.lang.Exception -> L70
            if (r9 == 0) goto L47
            java.lang.String r7 = r6.h(r7, r8, r3)     // Catch: java.lang.Exception -> L70
            return r7
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L70
            r9.<init>()     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = "光鸭云盘自有盘 POST "
            r9.append(r1)     // Catch: java.lang.Exception -> L70
            r9.append(r7)     // Catch: java.lang.Exception -> L70
            java.lang.String r7 = " body:"
            r9.append(r7)     // Catch: java.lang.Exception -> L70
            r9.append(r8)     // Catch: java.lang.Exception -> L70
            java.lang.String r7 = " result:"
            r9.append(r7)     // Catch: java.lang.Exception -> L70
            r9.append(r0)     // Catch: java.lang.Exception -> L70
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Exception -> L70
            com.github.catvod.crawler.SpiderDebug.log(r7)     // Catch: java.lang.Exception -> L70
            java.lang.String r7 = r0.a()     // Catch: java.lang.Exception -> L70
            return r7
        L70:
            r7 = move-exception
            java.lang.String r8 = "光鸭云盘自有盘 POST 异常: "
            java.lang.StringBuilder r8 = com.github.catvod.spider.merge.I.t0.b(r8)
            com.github.catvod.spider.merge.A.c.e(r7, r8)
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.I.Q.h(java.lang.String, org.json.JSONObject, boolean):java.lang.String");
    }

    public final List<com.github.catvod.spider.merge.K.VodItem> d(com.github.catvod.spider.merge.K.j jVar) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        String strC = jVar.c();
        String strE = jVar.e();
        String strB = com.github.catvod.spider.merge.P0.e.b(jVar.b()) ? "" : jVar.b();
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("光鸭云盘自有盘 getVodFolder 异常: "));
        }
        if (com.github.catvod.spider.merge.P0.e.b(N.a.f.b())) {
            com.github.catvod.spider.merge.i0.m.w("请先登录光鸭云盘");
            return arrayList;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("parentId", strB);
        jSONObject.put("pageSize", 200);
        jSONObject.put("orderBy", 0);
        jSONObject.put("sortType", 0);
        String strH = h("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_file_list", jSONObject, true);
        if (com.github.catvod.spider.merge.P0.e.d(strH)) {
            JSONObject jSONObject2 = new JSONObject(strH);
            if ("success".equals(jSONObject2.optString("msg")) && (jSONArrayOptJSONArray = jSONObject2.getJSONObject("data").optJSONArray("list")) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    com.github.catvod.spider.merge.K.VodItem iVar = new com.github.catvod.spider.merge.K.VodItem();
                    String string = jSONObject3.getString("fileName");
                    String string2 = jSONObject3.getString("fileId");
                    if (jSONObject3.optInt("resType") == 2) {
                        iVar.l(strC + "*#" + string2 + "*#" + string);
                        iVar.m(string);
                        str = "folder";
                    } else if (jSONObject3.optInt("resType") == 1 && (e(jSONObject3) || com.github.catvod.spider.merge.P0.e.d(com.github.catvod.spider.merge.i0.m.m(string)))) {
                        iVar.l(strE + "_" + jSONObject3.getString("parentId") + "*#" + string2 + "*#" + string);
                        iVar.m(string);
                        str = "file";
                    }
                    iVar.r(str);
                    arrayList.add(iVar);
                }
            }
        }
        return arrayList;
    }

    public final String g(String str) {
        if (BaseApi.isOk("guangya")) {
            return "";
        }
        String[] strArrSplit = str.split("\\+");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[1];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fileId", str2);
                String strH = h("https://api.guangyapan.com/nd.bizuserres.s/v1/get_res_download_url", jSONObject, true);
                if (com.github.catvod.spider.merge.P0.e.d(strH)) {
                    JSONObject jSONObject2 = new JSONObject(strH);
                    if ("success".equals(jSONObject2.optString("msg"))) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                        String strOptString = jSONObject3.optString("signedURL", "");
                        if (com.github.catvod.spider.merge.P0.e.b(strOptString)) {
                            strOptString = jSONObject3.optString("downloadUrl", "");
                        }
                        if (com.github.catvod.spider.merge.P0.e.d(strOptString)) {
                            com.github.catvod.spider.merge.K.g gVar = new com.github.catvod.spider.merge.K.g();
                            gVar.w(strOptString);
                            gVar.g(c());
                            return gVar.toString();
                        }
                    }
                }
            } catch (Exception e) {
                com.github.catvod.spider.merge.A.c.e(e, t0.b("光鸭云盘自有盘 playerContent 异常: "));
            }
        }
        return "";
    }

    public final JSONArray i(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", N.a.f.b());
            jSONObject.put("name", str);
            jSONObject.put("page", 0);
            jSONObject.put("pageSize", 100);
            String strH = h("https://api.guangyapan.com/nd.bizuserres.s/v1/file/search_files", jSONObject, true);
            if (com.github.catvod.spider.merge.P0.e.d(strH)) {
                JSONObject jSONObject2 = new JSONObject(strH);
                if ("success".equals(jSONObject2.optString("msg"))) {
                    return jSONObject2.optJSONObject("data").optJSONArray("list");
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.c.e(e, t0.b("光鸭云盘 searchFiles 异常: "));
        }
        return new JSONArray();
    }
}
