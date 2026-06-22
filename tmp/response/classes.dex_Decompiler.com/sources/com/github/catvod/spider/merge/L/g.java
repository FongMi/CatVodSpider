package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class g implements Cloneable {

    @Nullable
    int d;
    private n a = n.f;
    private Charset b = com.github.catvod.spider.merge.J.b.a;
    private final ThreadLocal<CharsetEncoder> c = new ThreadLocal<>();
    private boolean e = true;
    private int f = 1;
    private int g = 30;
    private int h = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.b.name();
            gVar.getClass();
            gVar.b = Charset.forName(strName);
            gVar.a = n.valueOf(this.a.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.c.get();
        return charsetEncoder != null ? charsetEncoder : g();
    }

    public final g c(n nVar) {
        this.a = nVar;
        return this;
    }

    public final n d() {
        return this.a;
    }

    public final int e() {
        return this.f;
    }

    public final int f() {
        return this.g;
    }

    final CharsetEncoder g() {
        CharsetEncoder charsetEncoderNewEncoder = this.b.newEncoder();
        this.c.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.d = strName.equals(oZP.d("203C5A003F163C26")) ? 1 : strName.startsWith(oZP.d("203B316C")) ? 2 : 3;
        return charsetEncoderNewEncoder;
    }

    public final g h() {
        this.e = false;
        return this;
    }

    public final boolean i() {
        return this.e;
    }

    public final g j() {
        this.h = 2;
        return this;
    }

    public final int k() {
        return this.h;
    }
}
