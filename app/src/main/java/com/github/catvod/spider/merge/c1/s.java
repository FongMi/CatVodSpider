package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.a1.C0900e;
import com.github.catvod.spider.merge.b1.C0906c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class s implements Cloneable {
    static final List<s> d = Collections.emptyList();
    s b;
    int c;

    protected s() {
    }

    private void A(int i) {
        int iG = g();
        if (iG == 0) {
            return;
        }
        List<s> listM = m();
        while (i < iG) {
            listM.get(i).c = i;
            i++;
        }
    }

    public final void B() {
        C0899d.h(this.b);
        this.b.C(this);
    }

    protected void C(s sVar) {
        C0899d.d(sVar.b == this);
        int i = sVar.c;
        m().remove(i);
        A(i);
        sVar.b = null;
    }

    public final void D(s sVar) {
        C0899d.h(this.b);
        s sVar2 = this.b;
        sVar2.getClass();
        C0899d.d(this.b == sVar2);
        s sVar3 = sVar.b;
        if (sVar3 != null) {
            sVar3.C(sVar);
        }
        int i = this.c;
        sVar2.m().set(i, sVar);
        sVar.b = sVar2;
        sVar.c = i;
        this.b = null;
    }

    public s E() {
        s sVar = this;
        while (true) {
            s sVar2 = sVar.b;
            if (sVar2 == null) {
                return sVar;
            }
            sVar = sVar2;
        }
    }

    public final void F(String str) {
        k(str);
    }

    public final int G() {
        return this.c;
    }

    public String a(String str) {
        C0899d.f(str);
        return (o() && d().q(str)) ? C0906c.i(e(), d().o(str)) : "";
    }

    protected final void b(int i, s... sVarArr) {
        boolean z;
        C0899d.h(sVarArr);
        if (sVarArr.length == 0) {
            return;
        }
        List<s> listM = m();
        s sVarY = sVarArr[0].y();
        if (sVarY != null && sVarY.g() == sVarArr.length) {
            List<s> listM2 = sVarY.m();
            int length = sVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (sVarArr[i2] != listM2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                boolean z2 = g() == 0;
                sVarY.l();
                listM.addAll(i, Arrays.asList(sVarArr));
                int length2 = sVarArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    sVarArr[i3].b = this;
                    length2 = i3;
                }
                if (z2 && sVarArr[0].c == 0) {
                    return;
                }
                A(i);
                return;
            }
        }
        for (s sVar : sVarArr) {
            if (sVar == null) {
                throw new C0900e("Array must not contain any null objects");
            }
        }
        for (s sVar2 : sVarArr) {
            sVar2.getClass();
            s sVar3 = sVar2.b;
            if (sVar3 != null) {
                sVar3.C(sVar2);
            }
            sVar2.b = this;
        }
        listM.addAll(i, Arrays.asList(sVarArr));
        A(i);
    }

    public String c(String str) {
        C0899d.h(str);
        if (!o()) {
            return "";
        }
        String strO = d().o(str);
        return strO.length() > 0 ? strO : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract C0947c d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final s f(int i) {
        return m().get(i);
    }

    public abstract int g();

    public final List<s> h() {
        if (g() == 0) {
            return d;
        }
        List<s> listM = m();
        ArrayList arrayList = new ArrayList(listM.size());
        arrayList.addAll(listM);
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // 
    public s i() {
        s sVarJ = j(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(sVarJ);
        while (!linkedList.isEmpty()) {
            s sVar = (s) linkedList.remove();
            int iG = sVar.g();
            for (int i = 0; i < iG; i++) {
                List<s> listM = sVar.m();
                s sVarJ2 = listM.get(i).j(sVar);
                listM.set(i, sVarJ2);
                linkedList.add(sVarJ2);
            }
        }
        return sVarJ;
    }

    protected s j(s sVar) {
        h hVarX;
        try {
            s sVar2 = (s) super.clone();
            sVar2.b = sVar;
            sVar2.c = sVar == null ? 0 : this.c;
            if (sVar == null && !(this instanceof h) && (hVarX = x()) != null) {
                h hVarH0 = hVarX.H0();
                sVar2.b = hVarH0;
                hVarH0.m().add(sVar2);
            }
            return sVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void k(String str);

    public abstract s l();

    protected abstract List<s> m();

    public boolean n(String str) {
        C0899d.h(str);
        if (!o()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (d().q(strSubstring) && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return d().q(str);
    }

    protected abstract boolean o();

    public final boolean p() {
        return this.b != null;
    }

    protected final void q(Appendable appendable, int i, g gVar) {
        appendable.append('\n').append(C0906c.g(gVar.f() * i, gVar.g()));
    }

    public final s r() {
        s sVar = this.b;
        if (sVar == null) {
            return null;
        }
        List<s> listM = sVar.m();
        int i = this.c + 1;
        if (listM.size() > i) {
            return listM.get(i);
        }
        return null;
    }

    public abstract String s();

    public String t() {
        StringBuilder sbB = C0906c.b();
        u(sbB);
        return C0906c.h(sbB);
    }

    public String toString() {
        return t();
    }

    protected final void u(Appendable appendable) {
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        com.github.catvod.spider.merge.L1.l.i(new r(appendable, hVarX.C0()), this);
    }

    abstract void v(Appendable appendable, int i, g gVar);

    abstract void w(Appendable appendable, int i, g gVar);

    public final h x() {
        s sVarE = E();
        if (sVarE instanceof h) {
            return (h) sVarE;
        }
        return null;
    }

    public s y() {
        return this.b;
    }

    public final s z() {
        return this.b;
    }
}
