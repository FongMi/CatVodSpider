package com.github.catvod.spider.merge.a;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.A.T;
import com.github.catvod.spider.merge.c.C0101e;
import com.github.catvod.spider.merge.c.n;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0087f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0091j b;

    public /* synthetic */ RunnableC0087f(C0091j c0091j, int i) {
        this.a = i;
        this.b = c0091j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0091j c0091j = this.b;
                c0091j.getClass();
                ArrayList arrayList = c0091j.d;
                for (String str : new ArrayList(arrayList)) {
                    SpiderDebug.log("Delete..." + str);
                    String strA = c0091j.f.a().a();
                    StringBuilder sb = new StringBuilder("{\"requests\":[{\"body\":{\"drive_id\":\"");
                    sb.append(strA);
                    sb.append("\",\"file_id\":\"");
                    sb.append(str);
                    sb.append("\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"");
                    if (((n) T.c(c0091j.b("adrive/v2/batch", T.h(sb, str, "\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}"), true), n.class)).b().c() == 404) {
                        arrayList.remove(str);
                    }
                }
                break;
            case 1:
                final C0091j c0091j2 = this.b;
                c0091j2.getClass();
                try {
                    int iB = com.github.catvod.spider.merge.o.c.b(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(Init.context());
                    layoutParams.setMargins(iB, iB, iB, iB);
                    final EditText editText = new EditText(Init.context());
                    frameLayout.addView(editText, layoutParams);
                    c0091j2.i = new AlertDialog.Builder(Init.getActivity()).setTitle("請輸入Token").setView(frameLayout).setNeutralButton("QRCode", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.a.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C0091j c0091j3 = c0091j2;
                            c0091j3.d();
                            Init.execute(new RunnableC0087f(c0091j3, 3));
                        }
                    }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.a.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C0091j c0091j3 = c0091j2;
                            c0091j3.getClass();
                            String string = editText.getText().toString();
                            c0091j3.d();
                            Init.execute(new RunnableC0083b(c0091j3, string, 0));
                        }
                    }).show();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                this.b.d();
                break;
            default:
                final C0091j c0091j3 = this.b;
                c0091j3.getClass();
                final String strK = C0019u.k("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
                final C0101e c0101eD = C0101e.g(strK).c().d();
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.a.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC0083b runnableC0083b;
                        String str2 = strK;
                        C0101e c0101e = c0101eD;
                        C0091j c0091j4 = c0091j3;
                        c0091j4.getClass();
                        try {
                            try {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setClassName("com.alicloud.databox", "com.taobao.login4android.scan.QrScanActivity");
                                intent.putExtra("key_scanParam", str2);
                                Init.getActivity().startActivity(intent);
                                runnableC0083b = new RunnableC0083b(c0091j4, c0101e, 1);
                            } catch (Exception unused2) {
                                c0091j4.t(c0101e);
                                runnableC0083b = new RunnableC0083b(c0091j4, c0101e, 1);
                            }
                            Init.execute(runnableC0083b);
                        } catch (Throwable th) {
                            Init.execute(new RunnableC0083b(c0091j4, c0101e, 1));
                            throw th;
                        }
                    }
                });
                break;
        }
    }
}
