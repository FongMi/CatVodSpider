package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class A0 implements Cloneable {
    static final List<A0> l8 = Collections.emptyList();

    @Nullable
    A0 S;
    int T4;

    private static class aA implements Lk {
        private final g9.aA S;
        private final Appendable l8;

        aA(Appendable appendable, g9.aA aAVar) {
            this.l8 = appendable;
            this.S = aAVar;
            aAVar.N();
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void S(A0 a0, int i) {
            try {
                a0.r1(this.l8, i, this.S);
            } catch (IOException e) {
                throw new E(e);
            }
        }

        @Override // com.github.catvod.spider.merge.Lk
        public void l8(A0 a0, int i) {
            if (a0.Q().equals("#text")) {
                return;
            }
            try {
                a0.R(this.l8, i, this.S);
            } catch (IOException e) {
                throw new E(e);
            }
        }
    }

    protected A0() {
    }

    private void A0(int i) {
        List<A0> listHR = hR();
        while (i < listHR.size()) {
            listHR.get(i).y(i);
            i++;
        }
    }

    protected A0 A(@Nullable A0 a0) {
        try {
            A0 a02 = (A0) super.clone();
            a02.S = a0;
            a02.T4 = a0 == null ? 0 : this.T4;
            return a02;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected void Bz(A0 a0, A0 a02) {
        Rc.T4(a0.S == this);
        Rc.HM(a02);
        A0 a03 = a02.S;
        if (a03 != null) {
            a03.d(a02);
        }
        int i = a0.T4;
        hR().set(i, a02);
        a02.S = this;
        a02.y(i);
        a0.S = null;
    }

    public String C() {
        StringBuilder sbS = tv.S();
        OY(sbS);
        return tv.cD(sbS);
    }

    protected abstract boolean E9();

    @Nullable
    public A0 G() {
        return this.S;
    }

    public void H6(A0 a0) {
        Rc.HM(a0);
        Rc.HM(this.S);
        this.S.Bz(this, a0);
    }

    public abstract int HM();

    public boolean Kf(String str) {
        Rc.HM(str);
        if (!E9()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (OL().s(strSubstring) && !l8(strSubstring).isEmpty()) {
                return true;
            }
        }
        return OL().s(str);
    }

    public List<A0> M() {
        A0 a0 = this.S;
        if (a0 == null) {
            return Collections.emptyList();
        }
        List<A0> listHR = a0.hR();
        ArrayList arrayList = new ArrayList(listHR.size() - 1);
        for (A0 a02 : listHR) {
            if (a02 != this) {
                arrayList.add(a02);
            }
        }
        return arrayList;
    }

    public A0 N(int i) {
        return hR().get(i);
    }

    protected void O(A0 a0) {
        a0.mF(this);
    }

    public abstract Rz OL();

    protected void OY(Appendable appendable) {
        uM.S(new aA(appendable, gv.l8(this)), this);
    }

    public A0 PP() {
        A0 a0 = this;
        while (true) {
            A0 a02 = a0.S;
            if (a02 == null) {
                return a0;
            }
            a0 = a02;
        }
    }

    public abstract String Q();

    abstract void R(Appendable appendable, int i, g9.aA aAVar);

    protected void S(int i, A0... a0Arr) {
        boolean z;
        Rc.HM(a0Arr);
        if (a0Arr.length == 0) {
            return;
        }
        List<A0> listHR = hR();
        A0 a0G = a0Arr[0].G();
        if (a0G != null && a0G.HM() == a0Arr.length) {
            List<A0> listHR2 = a0G.hR();
            int length = a0Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (a0Arr[i2] != listHR2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                a0G.s();
                listHR.addAll(i, Arrays.asList(a0Arr));
                int length2 = a0Arr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        A0(i);
                        return;
                    } else {
                        a0Arr[i3].S = this;
                        length2 = i3;
                    }
                }
            }
        }
        Rc.OL(a0Arr);
        for (A0 a0 : a0Arr) {
            O(a0);
        }
        listHR.addAll(i, Arrays.asList(a0Arr));
        A0(i);
    }

    public String T4(String str) {
        Rc.HM(str);
        if (!E9()) {
            return "";
        }
        String strA = OL().A(str);
        return strA.length() > 0 ? strA : str.startsWith("abs:") ? l8(str.substring(4)) : "";
    }

    void W() {
    }

    public int Ws() {
        return this.T4;
    }

    public A0 b(String str, String str2) {
        OL().OY(gv.S(this).b().l8(str), str2);
        return this;
    }

    @Nullable
    public g9 bc() {
        A0 a0PP = PP();
        if (a0PP instanceof g9) {
            return (g9) a0PP;
        }
        return null;
    }

    protected void c(Appendable appendable, int i, g9.aA aAVar) throws IOException {
        appendable.append('\n').append(tv.A(i * aAVar.l()));
    }

    protected abstract void cD(String str);

    protected void d(A0 a0) {
        Rc.T4(a0.S == this);
        int i = a0.T4;
        hR().remove(i);
        A0(i);
        a0.S = null;
    }

    @Nullable
    public A0 eD() {
        A0 a0 = this.S;
        if (a0 == null) {
            return null;
        }
        List<A0> listHR = a0.hR();
        int i = this.T4 + 1;
        if (listHR.size() > i) {
            return listHR.get(i);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    protected abstract List<A0> hR();

    public void hd() {
        Rc.HM(this.S);
        this.S.d(this);
    }

    public abstract String l();

    public String l8(String str) {
        Rc.tT(str);
        return (E9() && OL().s(str)) ? tv.s(l(), OL().A(str)) : "";
    }

    protected void mF(A0 a0) {
        Rc.HM(a0);
        A0 a02 = this.S;
        if (a02 != null) {
            a02.d(this);
        }
        this.S = a0;
    }

    public List<A0> n() {
        if (HM() == 0) {
            return l8;
        }
        List<A0> listHR = hR();
        ArrayList arrayList = new ArrayList(listHR.size());
        arrayList.addAll(listHR);
        return Collections.unmodifiableList(arrayList);
    }

    public void o(String str) {
        Rc.HM(str);
        cD(str);
    }

    @Nullable
    public A0 oH() {
        A0 a0 = this.S;
        if (a0 != null && this.T4 > 0) {
            return a0.hR().get(this.T4 - 1);
        }
        return null;
    }

    abstract void r1(Appendable appendable, int i, g9.aA aAVar);

    @Nullable
    public final A0 rD() {
        return this.S;
    }

    public abstract A0 s();

    public A0 tT(A0 a0) {
        Rc.HM(a0);
        Rc.HM(this.S);
        this.S.S(this.T4, a0);
        return this;
    }

    public String toString() {
        return C();
    }

    public boolean uS() {
        return this.S != null;
    }

    @Override // 
    public A0 v() {
        A0 a0A = A(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(a0A);
        while (!linkedList.isEmpty()) {
            A0 a0 = (A0) linkedList.remove();
            int iHM = a0.HM();
            for (int i = 0; i < iHM; i++) {
                List<A0> listHR = a0.hR();
                A0 a0A2 = listHR.get(i).A(a0);
                listHR.set(i, a0A2);
                linkedList.add(a0A2);
            }
        }
        return a0A;
    }

    protected void y(int i) {
        this.T4 = i;
    }
}
