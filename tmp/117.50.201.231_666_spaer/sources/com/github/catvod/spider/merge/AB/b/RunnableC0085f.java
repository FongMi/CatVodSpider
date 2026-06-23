package com.github.catvod.spider.merge.AB.b;

import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.o.C0101e;
import com.github.catvod.spider.merge.AB.o.C0113q;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0085f implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0085f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.b((x) this.b);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ((Q) this.b).s();
                return;
            }
            Object obj = this.b;
            if (i != 3) {
                Toast.makeText(((C0113q) obj).a, "详情加载失败", 0).show();
                return;
            } else {
                C0101e.c((C0101e) obj);
                return;
            }
        }
        J j = (J) this.b;
        int i2 = J.k;
        j.getClass();
        try {
            String strOptString = new JSONObject(com.github.catvod.spider.merge.AB.m.c.l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", null)).optJSONObject("data").optJSONObject("members").optString("token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strOptString + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
            jSONObject.put("token", strOptString);
            Init.run(new G(j, jSONObject, 0));
        } catch (Exception unused) {
        }
    }
}
