package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class or {
    public static il a(rd rdVar) {
        int i = rdVar.o;
        if (i == 2) {
            rdVar.o = 1;
        }
        try {
            try {
                return rk.b(rdVar);
            } catch (OutOfMemoryError e) {
                throw new tv("Failed parsing JSON source: " + rdVar + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new tv("Failed parsing JSON source: " + rdVar + " to Json", e2);
            }
        } finally {
            rdVar.an(i);
        }
    }

    public static il b(String str) {
        try {
            rd rdVar = new rd(new StringReader(str));
            il ilVarA = a(rdVar);
            ilVarA.getClass();
            if (!(ilVarA instanceof aas) && rdVar.ak() != 10) {
                throw new yc("Did not consume the entire document.");
            }
            return ilVarA;
        } catch (uc e) {
            throw new yc(e);
        } catch (IOException e2) {
            throw new yc(e2);
        } catch (NumberFormatException e3) {
            throw new yc(e3);
        }
    }
}
