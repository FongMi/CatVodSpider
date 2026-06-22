package com.github.catvod.spider.merge;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class j extends k {

    class aA extends OutputStream {
        final /* synthetic */ StringBuilder l8;

        aA(StringBuilder sb) {
            this.l8 = sb;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.l8.append((char) i);
        }
    }

    public j() {
        this(true);
    }

    @Override // com.github.catvod.spider.merge.k
    /* JADX INFO: renamed from: S */
    public rv OL(Class<?> cls) {
        return new ok(cls);
    }

    public j(boolean z) {
        super("Slf4j");
        l8(PV.class);
        if (z) {
            StringBuilder sb = new StringBuilder();
            PrintStream printStream = System.err;
            try {
                System.setErr(new PrintStream((OutputStream) new aA(sb), true, "US-ASCII"));
                try {
                    if (PV.N() instanceof B4) {
                        throw new NoClassDefFoundError(sb.toString());
                    }
                    printStream.print(sb);
                    printStream.flush();
                } finally {
                    System.setErr(printStream);
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
    }
}
