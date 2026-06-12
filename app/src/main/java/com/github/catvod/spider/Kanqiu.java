package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.KI.h;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.Mp.P;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0924s;
import com.github.catvod.spider.merge.bY.C0925t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
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
        C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(com.github.catvod.spider.merge.bY.v.b(new StringBuilder(), a, (str == null || str.isEmpty()) ? "" : String.format("/match/%s/live", str)), a())).o0(".list-group-item");
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c0724gO0) {
            String str3 = a + mVar.o0(".btn.btn-primary").a("href");
            String strA = P.a(new byte[]{58, -102, 13, -24, -67, 38, 119, -103, 123, -122, 7}, new byte[]{20, -24, 98, -97, -109, 66, 90, -9}, mVar);
            if (strA.isEmpty()) {
                strA = mVar.v0();
            }
            String strA2 = mVar.o0(".col-xs-1").d(0).g("img").a("src");
            if (strA2.isEmpty()) {
                strA2 = "https://pic.imgdb.cn/item/657673d6c458853aeff94ab9.jpg";
            }
            if (!strA2.startsWith("http")) {
                strA2 = com.github.catvod.spider.merge.bY.v.b(new StringBuilder(), a, strA2);
            }
            C0924s.b(str3, strA, strA2, P.a(new byte[]{-123, 123, -56, 113, 28, 97, -9, -26, -122, 105, -50, 118, 95, 98, -15, -15}, new byte[]{-85, 25, -68, 31, 50, 3, -125, -120}, mVar), arrayList);
        }
        Subtitle hVar = new Subtitle();
        hVar.k(1, 1, 0, c0724gO0.size());
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        if (list.get(0).equals(a)) {
            return Subtitle.c("比赛尚未开始");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        JSONArray jSONArray = new JSONObject(new String(Base64.decode(new JSONObject(com.github.catvod.spider.merge.nU.FilterValue.l(C0925t.a(new byte[]{36, -66, 110, -99}, new byte[]{9, -53, 28, -15, 100, 66, -115, 94}, sb), a())).optString("data").substring(6).substring(0, r1.length() - 2), 0))).getJSONArray("links");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("name");
            String strReplace = jSONObject.optString("url").replace("#", "***");
            StringBuilder sbB = C0925t.b(strOptString);
            sbB.append("$");
            sbB.append(strReplace);
            arrayList.add(sbB.toString());
        }
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.j("Qile");
        kVar.k(TextUtils.join("#", arrayList));
        return Subtitle.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("", "1", "8", "21");
        List listAsList2 = Arrays.asList("全部直播", "篮球直播", "足球直播", "其他直播");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.KI.a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return Subtitle.w(arrayList, new JSONObject(ZrJ.d("02617A6F7265223869262D3C5B796B6F2B240D2602296A695961252C25205B796B6FAFF4C2A6D5C66A6959613D2C24301C61716D133E5B2D6977686737010A6F64655B356977686748613661683E5B2D697768673A010A6F64655B35697768674B613661683E5B2D697768679EECE5AAD8C69EF8F7A8D8CD5B6F6B6F3E67436369796A385563306F2667436369AAF2E99FDEEEA9F5D691C1F96F64655B35697768674B7269301538246F69756A7F5918306F23200061716D6A2618372E042C675563692329281C61716D6AA2C8F8AED3C3675563693B29290C266977681E0261256F72655BABC0FCA0F3FC61676D6A335B796B6F7067046F6B366A2B5B796B6FA0E0C6A4DFFF6A6959613D6F72655B7A693064650261256F72655BA5CFC2AFD1CB61676D6A335B796B6F79755B3E676D33671761716D6AA3D5E4AECBE8675563693B6A7F59617A7F6A385563306F2667436369ABE4E291C2DF6F64655B35697768674870693064650261256F72655BA6F5FAAFD1CB61676D6A335B796B6F79715B3E676D33671761716D6AA3CAD6ACD9FA675563693B6A7F59617A786A385563306F2667436369ABE4E29CD8F6A5C9D15B6F6B6F3E674363697C7E67046F6B366A2B5B796B6FA0F3CAA5CBF6AED8D661676D6A335B796B6F7A725B3E676D33671761716D6AA0E2FEACC3C3A3E4EC696168670F61716D6A764A613661683E5B2D697768679DFBE6A5FEC05B6F6B6F3E674363697A6A385563306F2667436369A9F2DF9CC5EB6F64655B35697768674872693064650261256F72655BABFDFEAFD5FAA4F0F1ADD5F161676D6A335B796B6F7A765B3E676D33671761716D6AA3D5E4AEC0C7ADF8D7696168670F61716D6A7741613661683E5B2D697768679EFDC5A5C9C991C2DF6F64655B35697768674B7569301538246F6B6F7A7C5B796B1633671226326F72655B202A392D0C1D61676D6A2B182E2E6F72655BA4FAF6ADDBF261676D6A33182F3E286A7F5918306F2667436369AAF5D49ED3C86F64655B35697768674B7A693064650261256F72655BA5DDE2AEF1E2A6CEC66A6959613D6F72655B707B6F3569593869236A7F596106010A675563693B6A7F596178756A385563306F2667436369180E065B6F6B6F3E674363697E7A67046F6B366A2B5B796B6F06033561676D6A335B796B6F7A705B3E676D33671761716D6A063A171D786A6959613D6F72655B72736F3518041E36")));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Subtitle hVar = new Subtitle();
        hVar.y(str2.replace("***", "#"));
        hVar.l();
        hVar.f(a());
        return hVar.toString();
    }
}
