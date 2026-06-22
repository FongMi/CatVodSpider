package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class X implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0754f0 c;

    public /* synthetic */ X(C0754f0 c0754f0, int i) {
        this.b = i;
        this.c = c0754f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0754f0.a(this.c);
                return;
            default:
                C0754f0 c0754f0 = this.c;
                c0754f0.getClass();
                try {
                    String string = new JSONObject(com.github.catvod.spider.merge.f0.d.l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2")).getJSONObject("data").getJSONObject("members").getString("token");
                    SpiderDebug.log("getQRCode >> token: " + string);
                    Init.run(new RunnableC0750d0(c0754f0, string, "https://su.quark.cn/4_eMHBJ?token=" + string + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400", 0));
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
