package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.m.C0603l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class QuPanSo extends Pan {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:6:0x0065
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String E(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "https://b.funletu.com/search"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "{\"keyword\":\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = "\",\"categoryid\":0,\"filetypeid\":1,\"courseid\":1,\"page\":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = ",\"pageSize\":15,\"sortBy\":\"sort\",\"order\":\"desc\",\"offset\":0}"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r1.toString()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "content-type"
            java.lang.String r6 = "application/json"
            r4.put(r5, r6)
            java.lang.String r5 = "Origin"
            java.lang.String r6 = "https://b.funletu.com"
            r4.put(r5, r6)
            java.lang.String r5 = "Referer"
            r4.put(r5, r0)
            com.github.catvod.spider.merge.k.d r5 = com.github.catvod.spider.merge.k.C0575b.f(r0, r3, r4)
            java.lang.String r6 = r5.a()
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r6)
            java.lang.String r5 = "code"
            int r5 = r7.getInt(r5)
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L6d
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r7.getJSONObject(r5)
            java.lang.String r6 = "list"
            org.json.JSONArray r5 = r5.getJSONArray(r6)
            java.lang.String r0 = parseItemsToJson(r5)
        L64:
            return r0
            java.lang.String r0 = "{\"list\":[]}"
            goto L64
        L68:
            r1 = move-exception
            r9 = r1
            java.lang.String r0 = "{\"list\":[]}"
            goto L64
        L6d:
            java.lang.String r0 = "{\"list\":[]}"
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.QuPanSo.E(java.lang.String, java.lang.String):java.lang.String");
    }

    private static String parseItemsToJson(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"list\":[");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("url");
            String strReplace = jSONObject.getString("title").replace("<em>", "").replace("</em>", "");
            String str = string.contains("pan.quark.cn") ? "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/El1L/1200X800/quark.jpg" : "";
            if (string.contains("drive.uc.cn")) {
                str = "https://test.fukit.cn/autoupload/f/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20251213/OSYH/1200X800/uc.jpg";
            }
            if (string.contains("pan.baidu.com")) {
                str = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/0rBz/1200X800/baidu.jpg";
            }
            if (string.contains("aliyundrive.com")) {
                str = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg";
            }
            if (string.contains("alipan.com")) {
                str = "https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260311/50zE/1200X800/aliyun.jpg";
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append("{\"vod_id\":\"");
            sb.append(string);
            sb.append("\",\"vod_name\":\"");
            sb.append(strReplace);
            sb.append("\",\"vod_pic\":\"");
            sb.append(str);
            sb.append("\"");
            String strOptString = jSONObject.optString("updatetime");
            if (!TextUtils.isEmpty(strOptString)) {
                sb.append(",\"vod_remarks\":\"");
                sb.append(strOptString);
                sb.append("\"");
            }
            sb.append("}");
        }
        sb.append("]}");
        return sb.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        C0603l.a("searchvodname", str);
        return E(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return E(str, str2);
    }
}
