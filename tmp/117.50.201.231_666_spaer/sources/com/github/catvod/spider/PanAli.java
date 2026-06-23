package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0545i;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.d.C0558b;
import com.github.catvod.spider.merge.d.g;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PanAli extends Pan {
    private C0545i i;

    private void b(g gVar, List<C0554e> list, String str, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("drive_id", C0545i.d().g().a().a());
        jsonObject.addProperty("limit", 100);
        jsonObject.addProperty("parent_file_id", gVar.c());
        jsonObject.addProperty("order_by", "name_enhanced");
        jsonObject.addProperty("order_direction", "ASC");
        jsonObject.addProperty("category", "video");
        if (str.length() > 0) {
            jsonObject.addProperty("marker", str);
        }
        HashMap map = new HashMap();
        map.put("Authorization", C0545i.d().g().b().a());
        String strA = C0575b.f("https://openapi.alipan.com/adrive/v1.0/openFile/list", jsonObject.toString(), map).a();
        if (strA.contains("AccessTokenExpired") || strA.contains("AccessTokenInvalid") || strA.contains("TokenVerifyFailed")) {
            C0545i.d().s();
            b(gVar, list, str, z);
            return;
        }
        g gVar2 = (g) new Gson().fromJson(strA, g.class);
        for (g gVar3 : gVar2.e()) {
            C0554e c0554e = new C0554e();
            c0554e.j(C0590I.n("", gVar3.c(), ""));
            c0554e.k(gVar3.b());
            c0554e.l("folder".equals(gVar3.k()) ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            c0554e.o(gVar3.i());
            c0554e.p(gVar3.k());
            if (!z || "file".equals(gVar3.k())) {
                list.add(c0554e);
            }
        }
        if (gVar2.g().length() > 0) {
            b(gVar, list, gVar2.g(), z);
        }
    }

    private void c(String str, String str2, g gVar, List<C0554e> list, String str3, boolean z) {
        String string;
        g gVarL = this.i.l(str, gVar, str3);
        for (g gVar2 : gVarL.e()) {
            C0554e c0554e = new C0554e();
            c0554e.j(C0590I.n(str, gVar2.c(), str2));
            c0554e.k(gVar2.b());
            c0554e.l("folder".equals(gVar2.k()) ? "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_f.png" : "https://images.cnblogs.com/cnblogs_com/blogs/815326/galleries/2404886/o_240619005852_v.png");
            StringBuilder sb = new StringBuilder();
            sb.append(gVar2.l().split("T")[0]);
            if ("folder".equals(gVar2.k())) {
                string = "";
            } else {
                StringBuilder sbA = C0529a.a("|");
                sbA.append(gVar2.i());
                string = sbA.toString();
            }
            sb.append(string);
            c0554e.o(sb.toString());
            c0554e.p(gVar2.k());
            if (!z || "file".equals(gVar2.k())) {
                list.add(c0554e);
            }
        }
        if (gVarL.g().length() > 0) {
            c(str, str2, gVar, list, gVarL.g(), z);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("shareId");
                String strOptString2 = jSONObjectOptJSONObject.optString("folder");
                String strOptString3 = jSONObjectOptJSONObject.optString("sharePwd");
                if (TextUtils.isEmpty(strOptString)) {
                    b(new g(strOptString2), arrayList, "", false);
                } else {
                    this.i.v(strOptString, strOptString3);
                    c(strOptString, strOptString3, new g(strOptString2), arrayList, "", false);
                }
            }
            C0552c c0552c = new C0552c();
            c0552c.i(1, 1, 0, 0);
            c0552c.w(arrayList);
            return c0552c.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        JSONObject jSONObjectOptJSONObject = new JSONArray(list.get(0)).optJSONObject(0);
        String strOptString = jSONObjectOptJSONObject.optString("shareId");
        String strOptString2 = jSONObjectOptJSONObject.optString("folder");
        String strOptString3 = jSONObjectOptJSONObject.optString("sharePwd");
        C0554e c0554e = new C0554e();
        c0554e.j(list.get(0));
        c0554e.k("");
        c0554e.l("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
        c0554e.m(TextUtils.join("$$$", Config.getAliOptions()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0554e> arrayList3 = new ArrayList();
        if (TextUtils.isEmpty(strOptString)) {
            b(new g(this.i.o(strOptString2)), arrayList3, "", true);
        } else {
            c(strOptString, strOptString3, new g(this.i.w(strOptString, strOptString2)), arrayList3, "", true);
        }
        for (C0554e c0554e2 : arrayList3) {
            arrayList2.add(c0554e2.b() + "$" + new JSONArray(c0554e2.a()).optJSONObject(0).optString("folder") + Marker.ANY_NON_NULL_MARKER + strOptString);
        }
        for (int i = 0; i < Config.getAliOptions().size(); i++) {
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        c0554e.n(TextUtils.join("$$$", arrayList));
        return C0552c.m(c0554e);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray("[{\"name\":\"我的阿里云盘\",\"folders\":[{\"shareId\":\"\",\"folder\":\"root\"}]},{\"name\":\"短剧合集\",\"folders\":[{\"shareId\":\"Y5wMKfVDD6K\",\"folder\":\"6616613853041ba53f2842918e02346943d980b4\"}]},{\"name\":\"动漫合集\",\"folders\":[{\"shareId\":\"LEaepiYfxcw\",\"folder\":\"61019a966975bfef583449a39b36da512384b2d7\"}]},{\"name\":\"电影合集\",\"folders\":[{\"shareId\":\"ZHNChQfiPfk\",\"folder\":\"root\"},{\"shareId\":\"XUH7r6BZuML\",\"folder\":\"root\"}]},{\"name\":\"电视剧合集\",\"folders\":[{\"shareId\":\"ftMhRaKUfYp\",\"folder\":\"root\"},{\"shareId\":\"8Fg4TNsd2A2\",\"folder\":\"root\"},{\"shareId\":\"GMYSz3AHFaA\",\"folder\":\"root\"}]}]");
            C0558b c0558bG = this.i.g();
            if (c0558bG == null || TextUtils.isEmpty(c0558bG.c().b())) {
                arrayList.add(new C0550a("0", "还未登录阿里账号,请前往【配置中心】登录", "1"));
            } else {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    arrayList.add(new C0550a(jSONObjectOptJSONObject.optString("folders"), jSONObjectOptJSONObject.optString("name"), "1"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C0552c.p(arrayList, new ArrayList());
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            this.i = C0545i.d();
        } catch (Exception unused) {
        }
    }
}
