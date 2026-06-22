package com.github.catvod.spider.merge.Em;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g implements Cloneable {
    int f;
    private m c = m.base;
    private Charset d = com.github.catvod.spider.merge.Dw.b.a;
    private final ThreadLocal<CharsetEncoder> e = new ThreadLocal<>();
    private boolean g = true;
    private int h = 1;
    private int i = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.d.name();
            gVar.getClass();
            gVar.d = Charset.forName(strName);
            gVar.c = m.valueOf(this.c.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.e.get();
        return charsetEncoder != null ? charsetEncoder : e();
    }

    public final m c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    final CharsetEncoder e() {
        CharsetEncoder charsetEncoderNewEncoder = this.d.newEncoder();
        this.e.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.f = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        return charsetEncoderNewEncoder;
    }

    public final boolean f() {
        return this.g;
    }

    public final int g() {
        return this.i;
    }
}
