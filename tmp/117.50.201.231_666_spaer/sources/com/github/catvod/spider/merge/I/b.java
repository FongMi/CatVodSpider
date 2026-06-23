package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class b extends d {
    int b = 0;
    final ArrayList<d> a = new ArrayList<>();

    public static final class a extends b {
        a(Collection<d> collection) {
            this.a.addAll(collection);
            b();
        }

        a(d... dVarArr) {
            this(Arrays.asList(dVarArr));
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!this.a.get(i).a(iVar, iVar2)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return com.github.catvod.spider.merge.F.b.f(this.a, "");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.I.b$b, reason: collision with other inner class name */
    public static final class C0013b extends b {
        C0013b() {
        }

        C0013b(d... dVarArr) {
            List listAsList = Arrays.asList(dVarArr);
            if (this.b > 1) {
                this.a.add(new a(listAsList));
            } else {
                this.a.addAll(listAsList);
            }
            b();
        }

        @Override // com.github.catvod.spider.merge.I.d
        public final boolean a(i iVar, i iVar2) {
            for (int i = 0; i < this.b; i++) {
                if (this.a.get(i).a(iVar, iVar2)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return com.github.catvod.spider.merge.F.b.f(this.a, ", ");
        }
    }

    b() {
    }

    final void b() {
        this.b = this.a.size();
    }
}
