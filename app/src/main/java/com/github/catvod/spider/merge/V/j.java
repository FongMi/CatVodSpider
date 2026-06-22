package com.github.catvod.spider.merge.v;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.o.C1354a;
import com.github.catvod.spider.merge.p.C1362a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class j extends e {
    private final WeakReference<h> c;
    private C1362a<g, i> a = new C1362a<>();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d> g = new ArrayList<>();
    private d b = d.INITIALIZED;
    private final boolean h = true;

    public j(h hVar) {
        this.c = new WeakReference<>(hVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void b(String str) {
        if (this.h && !C1354a.o().p()) {
            throw new IllegalStateException(t0.a("Method ", str, " must be called on the main thread"));
        }
    }

    static d e(d dVar, d dVar2) {
        return (dVar2 == null || dVar2.compareTo(dVar) >= 0) ? dVar : dVar2;
    }

    private void f(d dVar) {
        if (this.b == dVar) {
            return;
        }
        this.b = dVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        i();
        this.e = false;
    }

    private void g() {
        this.g.remove(r0.size() - 1);
    }

    private void h(d dVar) {
        this.g.add(dVar);
    }

    private void i() {
        h hVar = this.c.get();
        if (hVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean z = true;
            if (this.a.size() != 0) {
                d dVar = this.a.a().getValue().a;
                d dVar2 = this.a.d().getValue().a;
                if (dVar != dVar2 || this.b != dVar2) {
                    z = false;
                }
            }
            this.f = false;
            if (z) {
                return;
            }
            if (this.b.compareTo(this.a.a().getValue().a) < 0) {
                Iterator<Map.Entry<g, i>> itDescendingIterator = this.a.descendingIterator();
                while (itDescendingIterator.hasNext() && !this.f) {
                    Map.Entry<g, i> next = itDescendingIterator.next();
                    i value = next.getValue();
                    while (value.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                        int iOrdinal = value.a.ordinal();
                        EnumC1397c enumC1397c = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC1397c.ON_PAUSE : EnumC1397c.ON_STOP : EnumC1397c.ON_DESTROY;
                        if (enumC1397c == null) {
                            StringBuilder sbB = t0.b("no event down from ");
                            sbB.append(value.a);
                            throw new IllegalStateException(sbB.toString());
                        }
                        h(enumC1397c.a());
                        value.a(hVar, enumC1397c);
                        g();
                    }
                }
            }
            Map.Entry<g, i> entryD = this.a.d();
            if (!this.f && entryD != null && this.b.compareTo(entryD.getValue().a) > 0) {
                com.github.catvod.spider.merge.p.e eVarC = this.a.c();
                while (eVarC.hasNext() && !this.f) {
                    Map.Entry<Object, Object> next2 = eVarC.next();
                    i iVar = (i) next2.getValue();
                    while (iVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains((g) next2.getKey())) {
                        h(iVar.a);
                        EnumC1397c enumC1397cB = EnumC1397c.b(iVar.a);
                        if (enumC1397cB == null) {
                            StringBuilder sbB2 = t0.b("no event up from ");
                            sbB2.append(iVar.a);
                            throw new IllegalStateException(sbB2.toString());
                        }
                        iVar.a(hVar, enumC1397cB);
                        g();
                    }
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.v.e
    public final void a(g gVar) {
        b("removeObserver");
        this.a.e(gVar);
    }

    public final void c(EnumC1397c enumC1397c) {
        b("handleLifecycleEvent");
        f(enumC1397c.a());
    }

    @Deprecated
    public final void d() {
        d dVar = d.CREATED;
        b("markState");
        b("setCurrentState");
        f(dVar);
    }
}
