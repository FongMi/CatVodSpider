package com.github.catvod.spider.merge.L;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class g implements Cloneable {
    public int d;
    public m a = m.base;
    public Charset b = com.github.catvod.spider.merge.J.a.a;
    public final ThreadLocal c = new ThreadLocal();
    public final boolean e = true;
    public final int f = 1;
    public final int g = 30;
    public final int h = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.b.name();
            gVar.getClass();
            gVar.b = Charset.forName(strName);
            gVar.a = m.valueOf(this.a.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoderNewEncoder = this.b.newEncoder();
        this.c.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        this.d = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        return charsetEncoderNewEncoder;
    }
}
