package com.github.catvod.spider.merge.AB.o;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class cc implements Runnable {
    private C0113q a;
    private int b;
    private String c;
    private Runnable d;

    public cc(C0113q c0113q, int i, String str, Runnable runnable) {
        this.a = c0113q;
        this.b = i;
        this.c = str;
        this.d = runnable;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public void run() {
        List<String> listMaiduidui;
        C0113q c0113q = this.a;
        int i = this.b;
        String str = this.c;
        Runnable runnable = this.d;
        c0113q.getClass();
        int i2 = 0;
        switch (i) {
            case 1:
                listMaiduidui = K.iqiyi(str);
                break;
            case 2:
                listMaiduidui = K.youku(str);
                break;
            case 3:
                listMaiduidui = K.mango(str);
                break;
            case 4:
                listMaiduidui = K.bilibili(str);
                break;
            case 5:
                listMaiduidui = K.renren(str);
                break;
            case 6:
                listMaiduidui = K.hanjutv(str);
                break;
            case 7:
                listMaiduidui = K.xigua(str);
                break;
            case 8:
                listMaiduidui = K.leshi(str);
                break;
            case 9:
                listMaiduidui = K.maiduidui(str);
                break;
            default:
                listMaiduidui = K.tencent(str);
                break;
        }
        c0113q.c.clear();
        if (listMaiduidui != null && !listMaiduidui.isEmpty()) {
            c0113q.c.addAll(listMaiduidui);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : c0113q.c) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split("\\|");
                if (strArrSplit.length >= 2) {
                    str2 = strArrSplit[0] + "|" + strArrSplit[1];
                }
                arrayList.add(str2);
            }
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0108l(c0113q, arrayList, runnable, i2));
    }
}
