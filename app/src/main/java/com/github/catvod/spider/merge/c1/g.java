package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0898c;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g implements Cloneable {
    int e;
    private n b = n.base;
    private Charset c = C0898c.b;
    private final ThreadLocal<CharsetEncoder> d = new ThreadLocal<>();
    private boolean f = true;
    private int g = 1;
    private int h = 30;
    private int i = 1;

    public final g a(Charset charset) {
        this.c = charset;
        return this;
    }

    public final Charset b() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.c.name();
            gVar.getClass();
            gVar.c = Charset.forName(strName);
            gVar.b = n.valueOf(this.b.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final CharsetEncoder d() {
        CharsetEncoder charsetEncoder = this.d.get();
        return charsetEncoder != null ? charsetEncoder : h();
    }

    public final n e() {
        return this.b;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    final CharsetEncoder h() {
        CharsetEncoder charsetEncoderNewEncoder = this.c.newEncoder();
        this.d.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.e = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        return charsetEncoderNewEncoder;
    }

    public final boolean i() {
        return this.f;
    }

    public final int j() {
        return this.i;
    }
}
