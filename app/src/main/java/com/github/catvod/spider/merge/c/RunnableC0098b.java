package com.github.catvod.spider.merge.c;

import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.C0019u;
import com.github.catvod.spider.merge.a.AbstractC0090i;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0098b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0098b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0099c c0099c = (C0099c) this.b;
                c0099c.getClass();
                AbstractC0090i.a.getClass();
                File fileG = com.github.catvod.spider.merge.o.c.g("aliyun");
                byte[] bytes = c0099c.toString().getBytes();
                try {
                    com.github.catvod.spider.merge.o.c.a(fileG);
                    FileOutputStream fileOutputStream = new FileOutputStream(fileG);
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                String str = (String) this.b;
                C0019u c0019u = com.github.catvod.spider.merge.o.c.a;
                if (!TextUtils.isEmpty(str)) {
                    Toast toast = (Toast) c0019u.a;
                    if (toast != null) {
                        toast.cancel();
                    }
                    Toast toastMakeText = Toast.makeText(Init.context(), str, 1);
                    c0019u.a = toastMakeText;
                    toastMakeText.show();
                    break;
                }
                break;
        }
    }
}
