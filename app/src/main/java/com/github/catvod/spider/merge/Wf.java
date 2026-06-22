package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class Wf extends i3 {
    int S;
    final ArrayList<i3> l8;

    static final class aA extends Wf {
        aA(Collection<i3> collection) {
            super(collection);
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            for (int i = this.S - 1; i >= 0; i--) {
                if (!this.l8.get(i).l8(iw, iw2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return tv.n(this.l8, "");
        }

        aA(i3... i3VarArr) {
            this(Arrays.asList(i3VarArr));
        }
    }

    Wf() {
        this.S = 0;
        this.l8 = new ArrayList<>();
    }

    void S(i3 i3Var) {
        this.l8.set(this.S - 1, i3Var);
    }

    @Nullable
    i3 T4() {
        int i = this.S;
        if (i > 0) {
            return this.l8.get(i - 1);
        }
        return null;
    }

    void b() {
        this.S = this.l8.size();
    }

    Wf(Collection<i3> collection) {
        this();
        this.l8.addAll(collection);
        b();
    }

    static final class ut extends Wf {
        ut(Collection<i3> collection) {
            if (this.S > 1) {
                this.l8.add(new aA(collection));
            } else {
                this.l8.addAll(collection);
            }
            b();
        }

        public void OL(i3 i3Var) {
            this.l8.add(i3Var);
            b();
        }

        @Override // com.github.catvod.spider.merge.i3
        public boolean l8(Iw iw, Iw iw2) {
            for (int i = 0; i < this.S; i++) {
                if (this.l8.get(i).l8(iw, iw2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return tv.n(this.l8, ", ");
        }

        ut(i3... i3VarArr) {
            this(Arrays.asList(i3VarArr));
        }

        ut() {
        }
    }
}
