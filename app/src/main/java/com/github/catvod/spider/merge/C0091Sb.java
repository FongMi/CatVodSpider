package com.github.catvod.spider.merge;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.github.catvod.spider.merge.Sb */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0091Sb extends AbstractC0148tY {

    /* renamed from: com.github.catvod.spider.merge.Sb$p */
    class p extends OutputStream {

        /* renamed from: q */
        final /* synthetic */ StringBuilder f543q;

        p(StringBuilder sb) {
            this.f543q = sb;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.f543q.append((char) i);
        }
    }

    public C0091Sb() {
        this(true);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0148tY
    /* renamed from: xC */
    public InterfaceC0074MS m716u(Class<?> cls) {
        return new C0061F(cls);
    }

    public C0091Sb(boolean z) {
        super("Slf4j");
        mo467q(C0156x.class);
        if (z) {
            StringBuilder sb = new StringBuilder();
            PrintStream printStream = System.err;
            try {
                System.setErr(new PrintStream((OutputStream) new p(sb), true, "US-ASCII"));
                try {
                    if (C0156x.m750MH() instanceof C0089Rn) {
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
