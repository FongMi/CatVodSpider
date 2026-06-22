package com.github.catvod.spider.merge.M1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class d {
    private final e[] a = new e[3];

    d() {
    }

    final e a() {
        return this.a[0];
    }

    final boolean b() {
        e[] eVarArr = this.a;
        return eVarArr[0] != null && eVarArr[0].a == 72;
    }

    final void c(e eVar) {
        int i = 0;
        while (i < 3) {
            e[] eVarArr = this.a;
            e eVar2 = eVarArr[i];
            eVarArr[i] = eVar;
            i++;
            eVar = eVar2;
        }
    }

    final e d() {
        return this.a[2];
    }

    final e e() {
        return this.a[1];
    }

    final boolean f() {
        e[] eVarArr = this.a;
        return eVarArr[1] != null && eVarArr[1].a == 72;
    }
}
