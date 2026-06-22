package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.d1.JsoupParser;
import com.github.catvod.spider.merge.e1.JsoupElements;
import com.google.gson.JsonParser;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.*;


public class Qiwei extends NetPan {
    public String l = "https://www.qwnull.com";
    public String m = "PHPSESSID=mhru8eqqsqll0odfgtgbua4uug; path=/";

    private void f() {
        try {
            Request requestBuild = new Request.Builder().url(this.l + "/index.php/verify/index.html?").addHeader("Cookie", this.m).build();
            OkHttpClient okHttpClient = new OkHttpClient();
            String strH = h(g(okHttpClient, requestBuild), okHttpClient);
            SpiderDebug.log("ocr Response ocr data: " + strH);
            if (!com.github.catvod.spider.merge.Q0.a.b(strH)) {
                strH = h(g(okHttpClient, requestBuild), okHttpClient);
            }
            if (!com.github.catvod.spider.merge.Q0.a.b(strH)) {
                strH = h(g(okHttpClient, requestBuild), okHttpClient);
            }
            if (com.github.catvod.spider.merge.Q0.a.b(strH)) {
                SpiderDebug.log("ocr Response ocr data: " + strH);
                String strM = HttpClient.m(this.l + "/index.php/ajax/verify_check?type=search&verify=" + strH, getHeader(), null);
                StringBuilder sb = new StringBuilder();
                sb.append("ocr Response data: ");
                sb.append(strM);
                SpiderDebug.log(sb.toString());
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.FilterValue.e(e, BuilderUtils.b("ocr error: "));
        }
    }

    private static String g(OkHttpClient okHttpClient, Request request) throws IOException {
        Response responseExecute = okHttpClient.newCall(request).execute();
        if (!responseExecute.isSuccessful()) {
            StringBuilder sbB = BuilderUtils.b("Failed to fetch image: ");
            sbB.append(responseExecute.code());
            throw new IOException(sbB.toString());
        }
        InputStream inputStreamByteStream = responseExecute.body().byteStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStreamByteStream.read(bArr);
            if (i == -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private static String h(String str, OkHttpClient okHttpClient) {
        FormBody formBodyBuild = new FormBody.Builder().add("image", str).add("probability", "false").add("png_fix", "false").build();
        SpiderDebug.log("ocr Response encodedString data: " + str);
        return new JSONObject(okHttpClient.newCall(new Request.Builder().url("https://jianghu2000-ocr.hf.space/ocr").post(formBodyBuild).build()).execute().body().string()).getString("data");
    }

    private List i(JsoupElements c1036g) {
        ArrayList arrayList = new ArrayList();
        for (GeneralUtils mVar : c1036g) {
            GeneralUtils mVarM0 = mVar.m0("a");
            String strS0 = com.github.catvod.spider.merge.P0.StringUtils.b(mVarM0.c("title")) ? mVar.m0("strong").s0() : mVarM0.c("title");
            VodItem iVar = new VodItem();
            iVar.r("file");
            iVar.l(mVarM0.l0("a").a("href") + "#" + strS0);
            iVar.m(strS0);
            iVar.q(mVarM0.s0());
            String strC = mVar.m0("img").c("src");
            if (!strC.startsWith("https")) {
                strC = ConcatUtils.b(new StringBuilder(), this.l, strC);
            }
            iVar.n(strC);
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String[] strArrSplit = str.split("\\.html");
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        sb.append(strArrSplit[0]);
        sb.append(strArrSplit[0].equals("/") ? "" : BuilderUtils.a("-", str2, "\\.html"));
        JsoupElements c1036gL0 = JsoupParser.d(com.github.catvod.spider.merge.f0.HttpClient.l(sb.toString())).l0(".pic-list li");
        VodResult gVar = new VodResult();
        gVar.y(i(c1036gL0));
        gVar.j(-1, -1, -1, -1);
        return gVar.toString();
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        if (NetPan.isNetPan(list.get(0))) {
            return super.detailContent("", list.get(0).split("#")[1], Collections.singletonList(list.get(0).split("#")[0]));
        }
        List listFindMatches = NetPan.findMatches(com.github.catvod.spider.merge.f0.HttpClient.l(this.l + list.get(0).split("#")[0]), "(https?://www\\.(?:123684|123865|123912|123pan|123pan\\.cn|123592)\\.com/s/[\\w-]+(?:\\?(?:pwd=[\\w]+|提取码:[^#\\s]*))?)|https?://(?:(?:www\\.(?:alipan|aliyundrive)\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn)/s/\\w+(?:\\?public=1)?|(?:115|anxia|115cdn)\\.com/s/\\w+\\?password=\\w+#?|caiyun\\.139\\.com/m/i\\?\\w+|caiyun\\.139\\.com/w/i/\\w+|yun\\.139\\.com/shareweb/#/w/i/\\w+|cloud\\.189\\.cn/t/\\w{12}（访问码：\\w+）|pan\\.baidu\\.com/s/[\\w-]+(?:[?&]pwd=\\w{4})?|cloud\\.189\\.cn/t/\\w{12}|pan\\.xunlei\\.com/s/[^?]+\\?.*?pwd=[^&#]+|www\\\\.guangyapan\\\\.com/s/[^/#?]*(?:\\\\?code=[\\\\w]+)?(?:#/share/[\\\\w-]+)?)");
        VodItem iVar = new VodItem();
        iVar.l(list.get(0).split("#")[0]);
        iVar.m(list.get(0).split("#")[1]);
        List listFilterNetPanLinks = NetPan.filterNetPanLinks(listFindMatches, 2);
        NetPan.initOrder(listFilterNetPanLinks);
        iVar.o(super.detailContentVodPlayFrom(listFilterNetPanLinks));
        iVar.p(super.detailContentVodPlayUrl(list.get(0).split("#")[1], listFilterNetPanLinks));
        return VodResult.m(iVar);
    }

    public HashMap<String, String> getHeader() {
        HashMap<String, String> mapC = BuilderUtils.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        mapC.put("Referer", this.l);
        mapC.put("Cookie", this.m);
        return mapC;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsoupElements c1036gL0 = l.e(com.github.catvod.spider.merge.f0.HttpClient.l(this.l)).l0(".menu_bottom li");
        for (int i = 0; i < c1036gL0.size(); i++) {
            if (c1036gL0.get(i).l0("a").a("href").startsWith("/")) {
                arrayList.add(new com.github.catvod.spider.merge.K.VodCategory(c1036gL0.get(i).l0("a").a("href"), c1036gL0.get(i).s0(), "0"));
            }
        }
        return VodResult.p(arrayList, linkedHashMap);
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.l = JsonParser.parseString(str).getAsJsonObject().get("siteUrl").getAsString();
    }

    public String searchContent(String str, boolean z) {
        try {
            HashMap map = new HashMap();
            String strM = com.github.catvod.spider.merge.f0.HttpClient.m(this.l + "/vs/-------------.html?wd=" + URLEncoder.encode(str), getHeader(), map);
            StringBuilder sb = new StringBuilder();
            sb.append("searchContent  respHeader:");
            sb.append(map);
            SpiderDebug.log(sb.toString());
            if (strM.contains("系统安全验证")) {
                if (map.get("set-cookie") != null) {
                    this.m = (String) ((List) map.get("set-cookie")).get(0);
                }
                f();
                strM = com.github.catvod.spider.merge.f0.HttpClient.m(this.l + "/vs/-------------.html?wd=" + URLEncoder.encode(str), getHeader(), map);
            }
            List listI = i(JsoupParser.d(strM).l0("dl"));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = (ArrayList) listI;
                if (i >= arrayList2.size()) {
                    return VodResult.n(arrayList);
                }
                char c = 1;
                if (i <= 1) {
                    for (String str2 : NetPan.filterNetPanLinks(NetPan.findMatches(com.github.catvod.spider.merge.f0.HttpClient.l(this.l + ((i) arrayList2.get(i)).c().split("#")[0]), "(https?://www\\.(?:123684|123865|123912|123pan|123pan\\.cn|123592)\\.com/s/[\\w-]+(?:\\?(?:pwd=[\\w]+|提取码:[^#\\s]*))?)|https?://(?:(?:www\\.(?:alipan|aliyundrive)\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn)/s/\\w+(?:\\?public=1)?|(?:115|anxia|115cdn)\\.com/s/\\w+\\?password=\\w+#?|caiyun\\.139\\.com/m/i\\?\\w+|caiyun\\.139\\.com/w/i/\\w+|yun\\.139\\.com/shareweb/#/w/i/\\w+|cloud\\.189\\.cn/t/\\w{12}（访问码：\\w+）|pan\\.baidu\\.com/s/[\\w-]+(?:[?&]pwd=\\w{4})?|cloud\\.189\\.cn/t/\\w{12}|pan\\.xunlei\\.com/s/[^?]+\\?.*?pwd=[^&#]+|www\\\\.guangyapan\\\\.com/s/[^/#?]*(?:\\\\?code=[\\\\w]+)?(?:#/share/[\\\\w-]+)?)"), 4)) {
                        arrayList.add(new VodItem(str2 + "#" + ((i) arrayList2.get(i)).c().split("#")[c], ((i) arrayList2.get(i)).c().split("#")[c], ((i) arrayList2.get(i)).e(), NetPan.getNetPanType(str2), false));
                        c = 1;
                    }
                }
                i++;
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.A.FilterValue.e(e, BuilderUtils.b("searchContent qiwei error : "));
            return "";
        }
    }
}
