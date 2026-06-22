package com.github.catvod.spider.merge.I;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Live;
import com.github.catvod.spider.TgYunDouBanPan;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class Z implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z(Object obj, int i) {
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
                com.github.catvod.spider.merge.N.i iVar = (com.github.catvod.spider.merge.N.i) this.c;
                iVar.getClass();
                C0780v.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("baidu_user"), iVar.toString());
                break;
            case 2:
                com.github.catvod.spider.merge.T.b bVar = (com.github.catvod.spider.merge.T.b) this.c;
                bVar.getClass();
                u0.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("uc_user"), bVar.toString());
                break;
            case 3:
                MainActivity.e((MainActivity) this.c);
                break;
            case 4:
                BaseApi baseApi = (BaseApi) this.c;
                baseApi.getClass();
                try {
                    baseApi.e = Boolean.valueOf(!baseApi.e.booleanValue());
                    com.github.catvod.spider.merge.g.b.g(baseApi.getNetPanIsoCache(), String.valueOf(baseApi.e));
                    StringBuilder sb = new StringBuilder();
                    sb.append("iso原盘调用外部播放器 当前为");
                    sb.append(BaseApi.get().e.booleanValue() ? "开" : "关");
                    com.github.catvod.spider.merge.i0.d.b(sb.toString());
                } catch (Exception unused) {
                    return;
                }
                break;
            case 5:
                ((Live) this.c).getClass();
                try {
                    Activity activity = Init.getActivity();
                    activity.startActivity(new Intent().setComponent(new ComponentName(activity, "com.fongmi.android.tv.ui.activity.LiveActivity")));
                } catch (Throwable unused2) {
                    return;
                }
                break;
            default:
                ((TgYunDouBanPan) this.c).showTgInput();
                break;
        }
    }
}
