package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.FM.A.l;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.b.v;
import com.github.catvod.spider.merge.FM.c.C0323a;
import com.github.catvod.spider.merge.FM.c.C0329g;
import com.github.catvod.spider.merge.FM.c.C0332j;
import com.github.catvod.spider.merge.FM.m.C0378c;
import com.github.catvod.spider.merge.FM.n.C0384b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Kanqiu extends Spider {
    private static String a = "http://www.88kanqiu.one";

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        C0274g c0274gO0 = l.g(C0378c.n(v.b(new StringBuilder(), a, (str == null || str.isEmpty()) ? "" : String.format("/match/%s/live", str)), a())).o0(".list-group-item");
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0274gO0) {
            String str3 = a + mVar.o0(".btn.btn-primary").a("href");
            String strI = mVar.o0(".row.d-none").i();
            if (strI.isEmpty()) {
                strI = mVar.v0();
            }
            String strA = mVar.o0(".col-xs-1").d(0).h("img").a("src");
            if (strA.isEmpty()) {
                strA = "https://pic.imgdb.cn/item/657673d6c458853aeff94ab9.jpg";
            }
            if (!strA.startsWith("http")) {
                strA = v.b(new StringBuilder(), a, strA);
            }
            C0384b.a(str3, strI, strA, mVar.o0(".btn.btn-primary").i(), arrayList);
        }
        C0329g c0329g = new C0329g();
        c0329g.k(1, 1, 0, c0274gO0.size());
        c0329g.z(arrayList);
        return c0329g.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        if (list.get(0).equals(a)) {
            return C0329g.c("比赛尚未开始");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        JSONArray jSONArray = new JSONObject(new String(Base64.decode(new JSONObject(C0378c.n(P.a(new byte[]{-102, -71, 33, -47}, new byte[]{-73, -52, 83, -67, 26, -110, 57, -95}, sb), a())).optString("data").substring(6).substring(0, r1.length() - 2), 0))).getJSONArray("links");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("name");
            String strReplace = jSONObject.optString("url").replace("#", "***");
            StringBuilder sbB = P.b(strOptString);
            sbB.append("$");
            sbB.append(strReplace);
            arrayList.add(sbB.toString());
        }
        C0332j c0332j = new C0332j();
        c0332j.g(list.get(0));
        c0332j.j("Qile");
        c0332j.k(TextUtils.join("#", arrayList));
        return C0329g.p(c0332j);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("", "1", "8", "21");
        List listAsList2 = Arrays.asList("全部直播", "篮球直播", "足球直播", "其他直播");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0323a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return C0329g.v(arrayList, new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"NBA\", \"v\": \"1\"}, {\"n\": \"CBA\", \"v\": \"2\"}, {\"n\": \"篮球综合\", \"v\": \"4\"}, {\"n\": \"纬来体育\", \"v\": \"21\"}]}],\"8\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"英超\", \"v\": \"8\"}, {\"n\": \"西甲\", \"v\": \"9\"}, {\"n\": \"意甲\", \"v\": \"10\"}, {\"n\": \"欧冠\", \"v\": \"12\"}, {\"n\": \"欧联\", \"v\": \"13\"}, {\"n\": \"德甲\", \"v\": \"14\"}, {\"n\": \"法甲\", \"v\": \"15\"}, {\"n\": \"欧国联\", \"v\": \"16\"}, {\"n\": \"足总杯\", \"v\": \"27\"}, {\"n\": \"国王杯\", \"v\": \"33\"}, {\"n\": \"中超\", \"v\": \"7\"}, {\"n\": \"亚冠\", \"v\": \"11\"}, {\"n\": \"足球综合\", \"v\": \"23\"}, {\"n\": \"欧协联\", \"v\": \"28\"}, {\"n\": \"美职联\", \"v\": \"26\"}]}], \"29\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"网球\", \"v\": \"29\"}, {\"n\": \"斯洛克\", \"v\": \"30\"}, {\"n\": \"MLB\", \"v\": \"38\"}, {\"n\": \"UFC\", \"v\": \"32\"}, {\"n\": \"NFL\", \"v\": \"25\"}, {\"n\": \"CCTV5\", \"v\": \"18\"}]}]}"));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0329g c0329g = new C0329g();
        c0329g.x(str2.replace("***", "#"));
        c0329g.l();
        c0329g.f(a());
        return c0329g.toString();
    }
}
