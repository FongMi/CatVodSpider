package com.github.catvod.utils;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.utils.merge.QuarkDriveApi;
import com.github.catvod.utils.merge.Yun123Api;
import com.github.catvod.utils.server.Server;

public final /* synthetic */ class ActionRunnable2 implements Runnable {
    public static final /* synthetic */ ActionRunnable2 c = new ActionRunnable2(0);
    public static final /* synthetic */ ActionRunnable2 d = new ActionRunnable2(1);
    public static final /* synthetic */ ActionRunnable2 e = new ActionRunnable2(2);
    public static final /* synthetic */ ActionRunnable2 f = new ActionRunnable2(3);
    public static final /* synthetic */ ActionRunnable2 g = new ActionRunnable2(4);
    public final /* synthetic */ int b;

    public /* synthetic */ ActionRunnable2(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                com.github.catvod.internal.QuarkUserModel eVar = C0754f0.o().m;
                eVar.b();
                eVar.i();
                return;
            case 1:
                String str2 = ConfigCenter.m;
                final Yun123Api j0A = Yun123Api.getInstance();
                j0A.getClass();
                final EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("输入盘123账号密码 格式：18888888888|123456");
                editTextInitEditText.setPadding(PanStringUtils.dpToPx(8), PanStringUtils.dpToPx(8), PanStringUtils.dpToPx(8), PanStringUtils.dpToPx(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, PanStringUtils.dpToPx(8)));
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
