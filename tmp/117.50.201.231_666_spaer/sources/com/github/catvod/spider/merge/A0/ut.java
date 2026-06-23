package com.github.catvod.spider.merge.A0;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ut implements Cloneable {
    public ff a;
    public Charset b;
    public boolean c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ut clone() {
        try {
            ut utVar = (ut) super.clone();
            String strName = this.b.name();
            utVar.getClass();
            utVar.b = Charset.forName(strName);
            utVar.a = (ff) Enum.valueOf(ff.class, this.a.name());
            return utVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
