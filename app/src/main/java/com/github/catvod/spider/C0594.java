package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.JuheShortDrama;
import com.github.catvod.spider.merge.I.*;
import com.github.catvod.spider.merge.K.JsonUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.KI.Subtitle;
import com.github.catvod.spider.merge.L.k;
import com.github.catvod.spider.merge.b0.C0902a;
import com.google.gson.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.github.catvod.spider.网盘集合, reason: contains not printable characters */

public class C0594 extends NetPan {
    public static final /* synthetic */ int m = 0;
    public List<k> l = new ArrayList();

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strL;
        if (Build.VERSION.SDK_INT >= 24 && this.l.stream().anyMatch(new Subtitle(str, 3))) {
            ArrayList arrayList = new ArrayList();
            for (k kVar : this.l) {
                if (kVar.h().equals(str)) {
                    VodItem iVar = new VodItem();
                    iVar.l(kVar.g());
                    iVar.m(kVar.i());
                    iVar.r("folder");
                    arrayList.add(iVar);
                }
            }
            VodResult gVar = new VodResult();
            gVar.y(arrayList);
            gVar.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar.toString();
        }
        String[] strArrSplit = str.split("\\*#");
        String str3 = strArrSplit[0];
        String strJ = "";
        String str4 = strArrSplit.length >= 2 ? strArrSplit[1] : "";
        String str5 = strArrSplit.length >= 3 ? strArrSplit[2] : "";
        Iterator<k> it = this.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                strL = "";
                break;
            }
            k next = it.next();
            if (next.g().equals(str3)) {
                strJ = next.j();
                strL = next.l();
                break;
            }
        }
        JsonUtils jVar = new JsonUtils();
        jVar.i(str3);
        jVar.j(strJ);
        jVar.h(str4);
        jVar.g(map);
        jVar.l(str5);
        SpiderDebug.log("categoryContent tid>>" + str);
        SpiderDebug.log("categoryContent vodFolderParm>>" + jVar);
        if (isSelfQuark(strL, str3)) {
            jVar.k(str3);
            VodResult gVar2 = new VodResult();
            gVar2.y(C0758h0.e().k(jVar));
            gVar2.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar2.toString();
        }
        if (isQuarkForSharedId(str3)) {
            jVar.k("https://pan.quark.cn/s/" + str3 + "#/list/share/");
            VodResult gVar3 = new VodResult();
            gVar3.y(QuarkDriveApi.o().z(jVar));
            gVar3.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar3.toString();
        }
        if (isGuangyaForSharedId(strL, str3)) {
            jVar.k("https://www.guangyapan.com/s/" + str3 + "#/share/");
            VodResult gVar4 = new VodResult();
            gVar4.y(O.l().s(jVar));
            gVar4.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar4.toString();
        }
        if (isSelfGuangya(strL, str3)) {
            jVar.k(str3);
            VodResult gVar5 = new VodResult();
            gVar5.y(Q.b().d(jVar));
            gVar5.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar5.toString();
        }
        if (is115ForSharedId(strL, str3)) {
            jVar.k("https://115.com/s/" + str3 + "?password=" + strJ + "#");
            VodResult gVar6 = new VodResult();
            gVar6.y(Q0.c().h(jVar));
            gVar6.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar6.toString();
        }
        if (isSelf115(strL, str3)) {
            jVar.k("self115" + str3);
            VodResult gVar7 = new VodResult();
            gVar7.y(E0.c().e(jVar));
            gVar7.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar7.toString();
        }
        if (isSelfUc(strL, str3)) {
            jVar.k(str3);
            VodResult gVar8 = new VodResult();
            gVar8.y(C0758h0.g().k(jVar));
            gVar8.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar8.toString();
        }
        if (isSelfBaidu(strL, str3)) {
            jVar.k(str3);
            VodResult gVar9 = new VodResult();
            gVar9.y(C0783y.c().g(jVar));
            gVar9.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar9.toString();
        }
        if (!isUcForSharedId(str3)) {
            jVar.k("https://www.aliyundrive.com/s/" + str3);
            VodResult gVar10 = new VodResult();
            gVar10.y(AliDriveApi.r().N(jVar));
            gVar10.j(1, 1, 100, Integer.MAX_VALUE);
            return gVar10.toString();
        }
        jVar.k("https://drive.uc.cn/s/" + str3 + "#/list/share/");
        VodResult gVar11 = new VodResult();
        gVar11.y(v0.r().B(jVar));
        gVar11.j(1, 1, 100, Integer.MAX_VALUE);
        return gVar11.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) throws JSONException {
        SpiderDebug.log("网盘集合 detailContent ids 1:" + list);
        String[] strArrSplit = list.get(0).split("\\*#");
        StringBuilder sbB = BuilderUtils.b("网盘集合 detailContent parts:");
        sbB.append(strArrSplit);
        SpiderDebug.log(sbB.toString());
        JSONObject jSONObject = new JSONObject(super.detailContent(strArrSplit.length > 2 ? strArrSplit[2] : "", strArrSplit[1], Arrays.asList(strArrSplit[0])));
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray.getJSONObject(i).put("vod_name", strArrSplit[1]);
        }
        jSONObject.put("list", jSONArray);
        return jSONObject.toString().replaceAll("\\\\", "");
    }

    public void get115List(k kVar, String str, List<VodItem> list, String str2) {
        for (C0902a c0902a : ((C0902a) com.github.catvod.spider.merge.C.u.a(new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.m("https://115cdn.com/webapi/share/search?search_value=" + str + "&share_code=" + kVar.g() + "&receive_code=" + kVar.j() + "&limit=9999", Q0.c().e(), null)).getJSONObject("data").toString(), C0902a.class)).e()) {
            if ("folder".equals(c0902a.m())) {
                VodItem iVar = new VodItem();
                StringBuilder sbB = BuilderUtils.b("https://115.com/s/");
                sbB.append(kVar.g());
                sbB.append("?password=");
                sbB.append(kVar.j());
                sbB.append("#_");
                sbB.append(c0902a.g());
                sbB.append("*#");
                sbB.append(str);
                iVar.l(sbB.toString());
                iVar.n(str2);
                iVar.m(c0902a.f());
                iVar.q(iVar.c());
                SpiderDebug.log("getList VodId" + iVar.c());
                list.add(iVar);
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final k kVar : this.l) {
            if (Build.VERSION.SDK_INT < 24 || !arrayList.stream().anyMatch(new Predicate() { // from class: com.github.catvod.spider.merge.g0.Q
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    com.github.catvod.spider.merge.L.k kVar2 = kVar;
                    int i = C0594.m;
                    return ((com.github.catvod.spider.merge.K.VodCategory) obj).b().equals(kVar2.h());
                }
            })) {
                arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(com.github.catvod.spider.merge.P0.StringUtils.d(kVar.h()) ? kVar.h() : kVar.g(), com.github.catvod.spider.merge.P0.StringUtils.d(kVar.h()) ? kVar.h() : kVar.i(), "1"));
                String strG = kVar.g();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("type", "排序類型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("名稱", "name"), new com.github.catvod.spider.merge.K.FilterValue("修改時間", "updated_at"))));
                arrayList2.add(new com.github.catvod.spider.merge.K.FilterGroup("order", "排序方式", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("⬆", "ASC"), new com.github.catvod.spider.merge.K.FilterValue("⬇", "DESC"))));
                linkedHashMap.put(strG, arrayList2);
            }
        }
        return VodResult.p(arrayList, linkedHashMap);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        String asString = JsonParser.parseString(str).getAsJsonObject().get("share").getAsString();
        if (asString != null && asString.startsWith("http")) {
            asString = com.github.catvod.spider.merge.f0.HttpClient.l(asString).trim();
        }
        SpiderDebug.log("shares extend:" + asString);
        this.l = k.b(asString);
    }

    public boolean is115ForSharedId(String str, String str2) {
        SpiderDebug.log("shareType>>" + str);
        return str.contains("115") && !str2.contains("self");
    }

    public boolean isAliForSharedId(String str, String str2) {
        SpiderDebug.log("shareType>>" + str);
        return str.contains("ali") && !str2.contains("self");
    }

    public boolean isGuangyaForSharedId(String str, String str2) {
        return str.contains("guangya") && !str2.contains("self");
    }

    public boolean isQuarkForSharedId(String str) {
        return str.length() == 12;
    }

    public boolean isSelf115(String str, String str2) {
        SpiderDebug.log("shareType>>" + str);
        return str.contains("115") && str2.contains("self");
    }

    public boolean isSelfBaidu(String str, String str2) {
        return str.contains("baidu") && str2.contains("self");
    }

    public boolean isSelfGuangya(String str, String str2) {
        return str.contains("guangya") && str2.contains("self");
    }

    public boolean isSelfQuark(String str, String str2) {
        return str.contains("quark") && str2.contains("self");
    }

    public boolean isSelfUc(String str, String str2) {
        return str.contains("uc") && str2.contains("self");
    }

    public boolean isUcForSharedId(String str) {
        return str.length() == 13;
    }

    public String searchContent(final String str, boolean z) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            ArrayList arrayList = new ArrayList();
            for (final k kVar : this.l) {
                SpiderDebug.log("阿里云搜索集合 开始" + kVar.j() + kVar.f());
                if (kVar.f()) {
                    if (isQuarkForSharedId(kVar.g()) || isUcForSharedId(kVar.g())) {
                        if (kVar.i().contains(str)) {
                            VodItem iVar = new VodItem();
                            iVar.l(kVar.g());
                            iVar.n(isQuarkForSharedId(kVar.g()) ? "https://pan.quark.cn/s/" : "https://drive.uc.cn/s/");
                            iVar.m(kVar.i());
                            iVar.q(kVar.i());
                            iVar.r("folder");
                            SpiderDebug.log("getList VodId" + iVar.c());
                            copyOnWriteArrayList.add(iVar);
                        }
                    }
                    if (isAliForSharedId(kVar.l(), kVar.g())) {
                        arrayList.add(new Callable() { // from class: com.github.catvod.spider.merge.g0.P
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException {
                                C0594 c0594 = this.a;
                                com.github.catvod.spider.merge.L.k kVar2 = kVar;
                                String str2 = str;
                                List list = copyOnWriteArrayList;
                                int i = C0594.m;
                                c0594.getClass();
                                String str3 = "https://www.aliyundrive.com/s/" + kVar2.g();
                                StringBuilder sbB = BuilderUtils.b("getList parm");
                                sbB.append(kVar2.i());
                                sbB.append(str2);
                                sbB.append(str3);
                                SpiderDebug.log(sbB.toString());
                                HashMap map = new HashMap();
                                Matcher matcher = NetPan.a.matcher(str3);
                                if (matcher.find()) {
                                    map.put("share_id", matcher.group(2));
                                }
                                map.put("keyword", str2);
                                HashMap<String, String> mapB = com.github.catvod.spider.merge.f0.HttpClient.b();
                                if (!kVar2.a(matcher.group(2))) {
                                    com.github.catvod.spider.merge.L.k kVarN = com.github.catvod.spider.merge.L.k.n(AliDriveApi.r().I(matcher.group(2), kVar2.j()));
                                    kVar2.q();
                                    kVar2.p(kVarN.k());
                                }
                                if (kVar2.k().isEmpty()) {
                                    return null;
                                }
                                mapB.put("x-share-token", kVar2.k());
                                String strA = com.github.catvod.spider.merge.f0.HttpClient.j("https://api.aliyundrive.com/recommend/v1/shareLink/search", new JSONObject(map).toString(), mapB).a();
                                SpiderDebug.log("getList res" + strA);
                                if (!strA.contains("file_id")) {
                                    return null;
                                }
                                JSONArray jSONArray = new JSONObject(strA).getJSONArray("items");
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                    if (!jSONObject.getString("type").equals("file")) {
                                        com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
                                        iVar2.l(str3 + "/folder/" + jSONObject.getString("file_id") + "*#" + str2 + "*#" + kVar2.j());
                                        iVar2.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png");
                                        iVar2.m(jSONObject.getString("name"));
                                        iVar2.q(kVar2.i());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("getList VodId");
                                        sb.append(iVar2.c());
                                        SpiderDebug.log(sb.toString());
                                        list.add(iVar2);
                                    }
                                }
                                return null;
                            }
                        });
                    }
                    if (is115ForSharedId(kVar.l(), kVar.g())) {
                        arrayList.add(new Callable() { // from class: com.github.catvod.spider.merge.g0.N
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C0594 c0594 = this.a;
                                com.github.catvod.spider.merge.L.k kVar2 = kVar;
                                String str2 = str;
                                List<com.github.catvod.spider.merge.K.VodItem> list = copyOnWriteArrayList;
                                int i = C0594.m;
                                c0594.get115List(kVar2, str2, list, "https://is1-ssl.mzstatic.com/image/thumb/Purple221/v4/5f/ed/bf/5fedbfb2-1431-a324-97c5-327487d5817d/AppIcon-0-0-1x_U007emarketing-0-8-0-0-sRGB-85-220.png/350x350.png");
                                return null;
                            }
                        });
                    }
                    if (isGuangyaForSharedId(kVar.l(), kVar.g())) {
                        final int i = 1;
                        arrayList.add(new Callable(this, kVar, str, copyOnWriteArrayList, i) { // from class: com.github.catvod.spider.a
                            public final /* synthetic */ int a;
                            public final /* synthetic */ String b;
                            public final /* synthetic */ NetPan c;
                            public final /* synthetic */ Object d;
                            public final /* synthetic */ Object e;

                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException {
                                switch (this.a) {
                                    case 0:
                                        return JuheShortDrama.f(this.c, (JuheShortDrama.Platform) this.d, this.b, (String) this.e);
                                    default:
                                        C0594 c0594 = (C0594) this.c;
                                        k kVar2 = (k) this.d;
                                        String str2 = this.b;
                                        List list = (List) this.e;
                                        int i2 = C0594.m;
                                        c0594.getClass();
                                        JSONArray jSONArrayX = O.l().x(kVar2.g(), kVar2.j(), str2);
                                        if (jSONArrayX == null) {
                                            return null;
                                        }
                                        for (int i3 = 0; i3 < jSONArrayX.length(); i3++) {
                                            JSONObject jSONObject = jSONArrayX.getJSONObject(i3);
                                            if (jSONObject.optInt("resType") == 2) {
                                                VodItem iVar2 = new VodItem();
                                                String string = jSONObject.getString("fileId");
                                                StringBuilder sbB = BuilderUtils.b("https://www.guangyapan.com/s/");
                                                sbB.append(kVar2.g());
                                                String string2 = sbB.toString();
                                                if (com.github.catvod.spider.merge.P0.StringUtils.d(kVar2.j())) {
                                                    StringBuilder sbA = com.github.catvod.spider.merge.C1.a.a(string2, "?code=");
                                                    sbA.append(kVar2.j());
                                                    string2 = sbA.toString();
                                                }
                                                iVar2.l(BuilderUtils.a(string2, "#/share/", string) + "*#" + str2 + "*#" + kVar2.j());
                                                iVar2.n("https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256");
                                                iVar2.m(jSONObject.getString("fileName"));
                                                iVar2.q(kVar2.i());
                                                SpiderDebug.log("getList VodId" + iVar2.c());
                                                list.add(iVar2);
                                            }
                                        }
                                        return null;
                                }
                            }
                        });
                    }
                    if (isSelfGuangya(kVar.l(), kVar.g())) {
                        arrayList.add(new Callable() { // from class: com.github.catvod.spider.merge.g0.O
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException {
                                C0594 c0594 = this.a;
                                com.github.catvod.spider.merge.L.k kVar2 = kVar;
                                String str2 = str;
                                List list = copyOnWriteArrayList;
                                int i2 = C0594.m;
                                c0594.getClass();
                                JSONArray jSONArrayI = com.github.catvod.spider.merge.I.Q.b().i(str2);
                                if (jSONArrayI == null) {
                                    return null;
                                }
                                for (int i3 = 0; i3 < jSONArrayI.length(); i3++) {
                                    JSONObject jSONObject = jSONArrayI.getJSONObject(i3);
                                    if (jSONObject.optInt("resType") == 2) {
                                        com.github.catvod.spider.merge.K.VodItem iVar2 = new com.github.catvod.spider.merge.K.VodItem();
                                        iVar2.l(kVar2.g() + "_" + jSONObject.getString("fileId") + "*#" + str2 + "*#" + kVar2.j());
                                        iVar2.n("https://pp.myapp.com/ma_icon/0/icon_54641066_1776429411/256");
                                        iVar2.m(jSONObject.getString("fileName"));
                                        iVar2.q(kVar2.i());
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("getList VodId");
                                        sb.append(iVar2.c());
                                        SpiderDebug.log(sb.toString());
                                        list.add(iVar2);
                                    }
                                }
                                return null;
                            }
                        });
                    }
                }
            }
            ExecutorService executorServiceNewFixedThreadPool = null;
            try {
                try {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(5);
                    Iterator it = executorServiceNewFixedThreadPool.invokeAll(arrayList).iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).get();
                    }
                } finally {
                    executorServiceNewFixedThreadPool.shutdown();
                }
            } catch (InterruptedException | ExecutionException e) {
                StringUtils.printStackTrace();
            }
            SpiderDebug.log("网盘集合 结束");
        } catch (Exception e2) {
            SpiderDebug.log("网盘集合 error" + e2);
        }
        return VodResult.n(copyOnWriteArrayList);
    }
}
