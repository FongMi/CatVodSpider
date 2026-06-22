package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.C0754f0;
import com.github.catvod.utils.merge.Yun123Api;
import com.github.catvod.utils.server.Server;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC1214j implements Runnable {
    public static final /* synthetic */ RunnableC1214j c = new RunnableC1214j(0);
    public static final /* synthetic */ RunnableC1214j d = new RunnableC1214j(1);
    public static final /* synthetic */ RunnableC1214j e = new RunnableC1214j(2);
    public static final /* synthetic */ RunnableC1214j f = new RunnableC1214j(3);
    public static final /* synthetic */ RunnableC1214j g = new RunnableC1214j(4);
    public final /* synthetic */ int b;

    public /* synthetic */ RunnableC1214j(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                com.github.catvod.spider.merge.S.e eVar = C0754f0.o().m;
                eVar.b();
                eVar.i();
                return;
            case 1:
                String str2 = ConfigCenter.m;
                final Yun123Api j0A = Yun123Api.a();
                j0A.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入盘123账号密码 格式：18888888888|123456");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                final DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.I.F0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = editTextInitEditText;
                        Yun123Api j0 = H0.a;
                        String string = editText.getText().toString();
                        j0.getClass();
                        Init.execute(new U(j0, string, 1));
                    }
                };
                final int i = 0;
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.I.G0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                Yun123Api j0 = (Yun123Api) j0A;
                                EditText editText = editTextInitEditText;
                                DialogInterface.OnClickListener onClickListener2 = onClickListener;
                                j0.getClass();
                                BaseApi baseApi = BaseApi.get();
                                StringBuilder sbB = t0.b("当前为");
                                sbB.append(j0.f.d());
                                sbB.append("|");
                                sbB.append(j0.f.e());
                                baseApi.showThreadInputWithQRCode("设置盘123账号密码", sbB.toString(), "", Server.u(), editText, onClickListener2, null);
                                break;
                            default:
                                BaseApi baseApi2 = (BaseApi) j0A;
                                EditText editText2 = editTextInitEditText;
                                DialogInterface.OnClickListener onClickListener3 = onClickListener;
                                baseApi2.getClass();
                                BaseApi baseApi3 = BaseApi.get();
                                StringBuilder sbB2 = t0.b("当前为 ");
                                sbB2.append(baseApi2.f);
                                baseApi3.showThreadInputWithQRCode("订阅地址 或 hiddify配置 (端口:1072)", sbB2.toString(), "手动选择节点", Server.u(), editText2, onClickListener3, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.d0.c
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.d0.h
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                BaseApi.get().showSingBoxInputWithOption();
                                            }
                                        }).start();
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            case 2:
                String str3 = ConfigCenter.m;
                new Thread(f).start();
                return;
            case 3:
                String str4 = ConfigCenter.m;
                BaseApi.get().showSubscriptionUrlInput();
                return;
            default:
                try {
                    Init.interceptActivityStart();
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}
