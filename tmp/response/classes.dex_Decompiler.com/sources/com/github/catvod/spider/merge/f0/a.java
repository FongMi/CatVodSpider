package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.oZP;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a extends Exception {
    protected Throwable a;

    public a(String str) {
        super(str);
    }

    public a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(oZP.d("160E02320931550D0E7B4C"));
        stringBuffer2.append(th);
        stringBuffer.append(stringBuffer2.toString());
        super(stringBuffer.toString());
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.a == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append(oZP.d("4E4F19241F21100B57241436101F0328033B5506047B"));
            printStream.println(stringBuffer.toString());
            this.a.printStackTrace();
        }
    }
}
