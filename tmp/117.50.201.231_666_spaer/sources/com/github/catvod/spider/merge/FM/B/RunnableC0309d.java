package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.m.C0378c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0309d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0309d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.b((u) this.b);
                break;
            case 1:
                ((C0301C) this.b).s();
                break;
            case 2:
                J j = (J) this.b;
                int i = J.j;
                j.getClass();
                try {
                    String strOptString = new JSONObject(C0378c.n("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", null)).optJSONObject("data").optJSONObject(C0298a.b(new byte[]{-10, 14, -122, 3, 113, -32, 55}, new byte[]{-101, 107, -21, 97, 20, -110, 68, -103})).optString("token");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strOptString + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                    jSONObject.put("token", strOptString);
                    Init.run(new RunnableC0313h(j, jSONObject, 1));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 3:
                ((Q) this.b).p();
                break;
            default:
                ((MainActivity) this.b).m();
                break;
        }
    }
}
