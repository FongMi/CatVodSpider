package com.github.catvod.spider.merge.A0;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class rk {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static il b(rd rdVar) {
        boolean z;
        try {
            try {
                rdVar.ak();
                z = false;
                try {
                    return (il) ado.z.b(rdVar);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return aas.f;
                    }
                    throw new yc(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (uc e3) {
            throw new yc(e3);
        } catch (IOException e4) {
            throw new yc(e4);
        } catch (NumberFormatException e5) {
            throw new yc(e5);
        }
    }
}
