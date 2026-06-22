package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.utils.server.Server;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0759i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0759i(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0775q c0775q = (C0775q) this.e;
                EditText editText = (EditText) this.c;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.d;
                c0775q.getClass();
                BaseApi.get().showThreadInputWithQRCode("设置Token", "", "阿里云盘扫码", Server.u(), editText, onClickListener, new DialogInterfaceOnClickListenerC0763k(c0775q, 0));
                return;
            case 1:
                v0 v0Var = (v0) this.e;
                EditText editText2 = (EditText) this.c;
                DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) this.d;
                v0Var.getClass();
                BaseApi baseApi = BaseApi.get();
                StringBuilder sbB = t0.b("当前为");
                sbB.append(v0Var.m.h());
                baseApi.showThreadInputWithQRCode("设置uc ut", sbB.toString(), "", Server.u(), editText2, onClickListener2, null);
                return;
            case 2:
                final BaseApi baseApi2 = (BaseApi) this.e;
                String str = (String) this.c;
                List<String> list = (List) this.d;
                baseApi2.getClass();
                BaseApi.get().showInputWithOption("clashApiUi", new DialogInterfaceOnClickListenerC0763k(baseApi2, 3), new BaseApi.Task() { // from class: com.github.catvod.spider.merge.d0.f
                    @Override // com.github.catvod.en.BaseApi.Task
                    public final void execute(String str2) {
                        BaseApi.c(baseApi2, str2);
                    }
                }, C1290c.a("设置节点 \n 当前 ", str), "请输入节点或点击上方选项", list);
                return;
            default:
                String str2 = (String) this.e;
                Map map = (Map) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                int i = Jpys.n;
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Response responseD = com.github.catvod.spider.merge.f0.d.d(str2);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (responseD != null) {
                            responseD.close();
                        }
                        synchronized (map) {
                            map.put(str2, Long.valueOf(jCurrentTimeMillis2));
                            break;
                        }
                    } catch (Exception unused) {
                        synchronized (map) {
                            map.put(str2, Long.MAX_VALUE);
                            break;
                        }
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
