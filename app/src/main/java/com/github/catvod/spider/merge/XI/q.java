package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.ZrJ;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class q extends Exception {
    protected Throwable a;

    public q(String str) {
        super(str);
    }

    public q(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(ZrJ.d("1A223E3E2D215921327768"));
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
            stringBuffer.append(ZrJ.d("426325283B311C276B2830261C333F24272B592A3877"));
            printStream.println(stringBuffer.toString());
            this.a.printStackTrace();
        }
    }
}
