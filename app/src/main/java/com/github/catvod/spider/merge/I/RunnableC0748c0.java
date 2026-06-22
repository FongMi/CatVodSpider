package com.github.catvod.spider.merge.I;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.j0.C1275b;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0748c0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0748c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0.a((C0754f0) this.c);
                break;
            case 1:
                com.github.catvod.spider.merge.L.e eVar = (com.github.catvod.spider.merge.L.e) this.c;
                eVar.getClass();
                C0773p.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("aliyundrive_drive"), eVar.toString());
                break;
            case 2:
                com.github.catvod.spider.merge.P.a aVar = (com.github.catvod.spider.merge.P.a) this.c;
                aVar.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("guangya_user"), aVar.toString());
                break;
            case 3:
                BaseApi baseApi = (BaseApi) this.c;
                baseApi.getClass();
                try {
                    baseApi.d = Boolean.valueOf(!baseApi.d.booleanValue());
                    com.github.catvod.spider.merge.g.b.g(baseApi.getNetPanDownCache(), String.valueOf(baseApi.d));
                    StringBuilder sb = new StringBuilder();
                    sb.append("网盘下载 当前为");
                    sb.append(BaseApi.get().d.booleanValue() ? "开" : "关");
                    com.github.catvod.spider.merge.i0.d.b(sb.toString());
                } catch (Exception unused) {
                    return;
                }
                break;
            case 4:
                JSONObject jSONObject = (JSONObject) this.c;
                Pattern pattern = NetPan.a;
                try {
                    if (jSONObject.has("proxy") && com.github.catvod.spider.merge.P0.e.d(jSONObject.getString("proxy"))) {
                        String string = jSONObject.getString("proxy");
                        com.github.catvod.spider.merge.i0.h hVar = new com.github.catvod.spider.merge.i0.h();
                        hVar.f(string);
                        String strD = hVar.d();
                        String strA = hVar.a();
                        int iC = hVar.c();
                        String strE = hVar.e();
                        String strB = hVar.b();
                        String str = "";
                        if (com.github.catvod.spider.merge.P0.e.d(strE) && !strE.equals("null")) {
                            str = strE + ":" + strB;
                        }
                        String strEncode = com.github.catvod.spider.merge.P0.e.d(strE) ? Uri.encode(str, ":/@#?&") : null;
                        if (strEncode != null) {
                            strA = strEncode + "@" + strA;
                        }
                        if (iC != -1) {
                            strA = strA + ":" + iC;
                        }
                        SpiderDebug.log("uri.authority :" + strD + strA);
                        Uri uriBuild = new Uri.Builder().scheme(strD).encodedAuthority(strA).build();
                        com.github.catvod.spider.merge.f0.g gVarB = com.github.catvod.spider.merge.f0.g.b();
                        gVarB.getClass();
                        gVarB.a = com.github.catvod.spider.merge.f0.g.c(uriBuild).build();
                        break;
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                    return;
                }
                break;
            case 5:
                TgYunDouBanPan.k((TgYunDouBanPan) this.c);
                break;
            default:
                C1275b.b((C1275b) this.c);
                break;
        }
    }
}
