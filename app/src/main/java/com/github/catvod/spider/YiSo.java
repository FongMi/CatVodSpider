package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.YiSo;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K.VodResult;
import com.github.catvod.spider.merge.K.VodItem;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class YiSo extends NetPan {
    private String l = "";

    /* JADX INFO: renamed from: com.github.catvod.spider.YiSo$1, reason: invalid class name */
    class AnonymousClass1 extends WebViewClient {
        public static final /* synthetic */ int a = 0;

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 19) {
                return;
            }
            webView.evaluateJavascript("document.getElementsByTagName('pre')[0].textContent", new ValueCallback() { // from class: com.github.catvod.spider.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    int i = YiSo.AnonymousClass1.a;
                    if (!((String) obj).equals("null")) {
                        throw null;
                    }
                }
            });
        }
    }

    @Override // com.github.catvod.en.NetPan
    public String detailContent(List<String> list) {
        return super.detailContent("", list.get(0).split("#")[1], Arrays.asList(list.get(0).split("#")[0]));
    }

    @Override // com.github.catvod.en.NetPan
    public void init(Context context, String str) {
        super.init(context, str);
        this.l = JsonParser.parseString(str).getAsJsonObject().get("cookie").getAsString();
    }

    public String searchContent(String str, boolean z) {
        com.github.catvod.spider.merge.X.FilterGroup dVar;
        String str2;
        if (Build.VERSION.SDK_INT < 19) {
            return "";
        }
        ArrayList<VodItem> arrayList = new ArrayList();
        HashMap mapC = BuilderUtils.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        mapC.put("Cookie", this.l);
        try {
            dVar = (com.github.catvod.spider.merge.X.d) new Gson().fromJson(com.github.catvod.spider.merge.k0.StringUtils.d("https://miaosou.fun/api/search?name=4k " + URLEncoder.encode(str), mapC), com.github.catvod.spider.merge.X.FilterGroup.class);
        } catch (Exception e) {
            StringUtils.printStackTrace();
            dVar = new com.github.catvod.spider.merge.X.d();
        }
        arrayList.addAll(dVar.a().a(str));
        for (VodItem iVar : arrayList) {
            StringBuilder sb = new StringBuilder();
            String strC = iVar.c();
            try {
                byte[] bytes = "4OToScUFOaeVTrHE".getBytes(StandardCharsets.UTF_8);
                byte[] bytes2 = "9CLGao1vHKqm17Oz".getBytes(StandardCharsets.UTF_8);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                SpiderDebug.log("yiso>>searchContent decode3" + strC);
                cipher.init(2, secretKeySpec, ivParameterSpec);
                str2 = new String(cipher.doFinal(Base64.getDecoder().decode(strC)), StandardCharsets.UTF_8);
            } catch (Exception e2) {
                StringBuilder sbB = BuilderUtils.b("yiso>>searchContent3");
                sbB.append(e2.toString());
                SpiderDebug.log(sbB.toString());
                SpiderDebug.log("yiso>>searchContent decode end" + strC);
                str2 = null;
            }
            sb.append(str2);
            sb.append("#");
            sb.append(str);
            iVar.l(sb.toString());
            if (NetPan.isQuark(iVar.c())) {
                iVar.n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
            }
        }
        return VodResult.n(arrayList);
    }
}
