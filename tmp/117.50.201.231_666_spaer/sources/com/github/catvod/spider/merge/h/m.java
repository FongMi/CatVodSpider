package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.i;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class m {
    protected g a;
    a b;
    k c;
    protected com.github.catvod.spider.merge.G.f d;
    protected ArrayList<com.github.catvod.spider.merge.G.i> e;
    protected String f;
    protected i g;
    protected f h;
    protected Map<String, h> i;
    private i.g j = new i.g();
    private i.f k = new i.f();

    m() {
    }

    protected final com.github.catvod.spider.merge.G.i a() {
        int size = this.e.size();
        return size > 0 ? this.e.get(size - 1) : this.d;
    }

    protected final boolean b(String str) {
        com.github.catvod.spider.merge.G.i iVarA;
        return (this.e.size() == 0 || (iVarA = a()) == null || !iVarA.h0().equals(str)) ? false : true;
    }

    @ParametersAreNonnullByDefault
    protected void c(Reader reader, g gVar) {
        com.github.catvod.spider.merge.G.f fVar = new com.github.catvod.spider.merge.G.f("");
        this.d = fVar;
        fVar.z0(gVar);
        this.a = gVar;
        this.h = f.c;
        a aVar = new a(reader, 32768);
        this.b = aVar;
        aVar.O(gVar.c());
        this.g = null;
        this.c = new k(this.b, gVar.a());
        this.e = new ArrayList<>(32);
        this.i = new HashMap();
        this.f = "";
    }

    protected abstract boolean d(String str);

    protected abstract boolean e(i iVar);

    protected final boolean f(String str) {
        i iVar = this.g;
        i.f fVar = this.k;
        if (iVar == fVar) {
            i.f fVar2 = new i.f();
            fVar2.v(str);
            return e(fVar2);
        }
        fVar.h();
        fVar.v(str);
        return e(fVar);
    }

    public boolean g(com.github.catvod.spider.merge.G.b bVar) {
        String str;
        i.g gVar = this.j;
        if (this.g == gVar) {
            gVar = new i.g();
            gVar.d = "input";
            gVar.n = bVar;
            str = "input";
        } else {
            gVar.h();
            gVar.d = "input";
            gVar.n = bVar;
            str = "input";
        }
        gVar.e = str;
        return e(gVar);
    }

    protected final boolean h(String str) {
        i.g gVar = this.j;
        if (this.g == gVar) {
            gVar = new i.g();
        } else {
            gVar.h();
        }
        gVar.v(str);
        return e(gVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    protected final h i(String str, f fVar) {
        h hVar = (h) this.i.get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVarM = h.m(str, fVar);
        this.i.put(str, hVarM);
        return hVarM;
    }
}
