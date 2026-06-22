package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.nIe;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o extends Exception {
    protected Throwable a;

    public o(String str) {
        super(str);
    }

    public o(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(nIe.d("210726302C2B62042A7969"));
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
            stringBuffer.append(nIe.d("79463D263A3B27027326312C2716272A2621620F2079"));
            printStream.println(stringBuffer.toString());
            this.a.printStackTrace();
        }
    }
}
