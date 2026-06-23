package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class il {
    public double a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final jb c() {
        if (this instanceof jb) {
            return (jb) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public long d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            aag aagVar = new aag(stringWriter);
            aagVar.k = 1;
            ado.z.getClass();
            vd.d(aagVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
