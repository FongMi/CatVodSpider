package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0774p0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0774p0(v0 v0Var, boolean z) {
        this.d = v0Var;
        this.c = z;
    }

    public /* synthetic */ RunnableC0774p0(boolean z, JSONObject jSONObject) {
        this.c = z;
        this.d = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final String string;
        StringBuilder sb;
        String str;
        switch (this.b) {
            case 0:
                final v0 v0Var = (v0) this.d;
                final boolean z = this.c;
                v0Var.getClass();
                try {
                    if (z) {
                        string = com.github.catvod.spider.merge.f0.d.l(C0773p.a.c + "/api/ucqr").split("###")[0];
                        sb = new StringBuilder();
                        sb.append("https://su.uc.cn/9_iCI3h?uc_param_str=&token=");
                        sb.append(string);
                        str = "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix";
                    } else {
                        string = new JSONObject(com.github.catvod.spider.merge.f0.d.l("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?client_id=381&v=1.2")).getJSONObject("data").getJSONObject("members").getString("token");
                        SpiderDebug.log("getQRCode >> token: " + string);
                        sb = new StringBuilder();
                        sb.append("https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=");
                        sb.append(string);
                        str = "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix";
                    }
                    sb.append(str);
                    final String string2 = sb.toString();
                    Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.I.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            v0.k(v0Var, z, string, string2);
                        }
                    });
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                boolean z2 = this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                Pattern pattern = NetPan.a;
                try {
                    Init.get().exeTgProxy(z2, jSONObject, Init.context());
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
