package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class s implements Cloneable {
    static final List<s> c = Collections.emptyList();

    @Nullable
    s a;
    int b;

    protected s() {
    }

    private void A(int i) {
        int iG = g();
        if (iG == 0) {
            return;
        }
        List<s> listM = m();
        while (i < iG) {
            listM.get(i).b = i;
            i++;
        }
    }

    public final void B() {
        com.github.catvod.spider.merge.J.c.g(this.a);
        this.a.C(this);
    }

    protected void C(s sVar) {
        com.github.catvod.spider.merge.J.c.c(sVar.a == this);
        int i = sVar.b;
        m().remove(i);
        A(i);
        sVar.a = null;
    }

    public final void D(s sVar) {
        com.github.catvod.spider.merge.J.c.g(this.a);
        s sVar2 = this.a;
        sVar2.getClass();
        com.github.catvod.spider.merge.J.c.c(this.a == sVar2);
        s sVar3 = sVar.a;
        if (sVar3 != null) {
            sVar3.C(sVar);
        }
        int i = this.b;
        sVar2.m().set(i, sVar);
        sVar.a = sVar2;
        sVar.b = i;
        this.a = null;
    }

    public s E() {
        s sVar = this;
        while (true) {
            s sVar2 = sVar.a;
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
        return this.b;
    }

    public String a(String str) {
        com.github.catvod.spider.merge.J.c.e(str);
        return (o() && d().o(str)) ? com.github.catvod.spider.merge.K.b.i(e(), d().m(str)) : "";
    }

    protected final void b(int i, s... sVarArr) {
        boolean z;
        com.github.catvod.spider.merge.J.c.g(sVarArr);
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
                    sVarArr[i3].a = this;
                    length2 = i3;
                }
                if (z2 && sVarArr[0].b == 0) {
                    return;
                }
                A(i);
                return;
            }
        }
        for (s sVar : sVarArr) {
            if (sVar == null) {
                throw new com.github.catvod.spider.merge.J.d(oZP.d("341D05201575181A04354C3B1A1B5722033B010E1E2F4C341B16572F1939194F18230630161B04"));
            }
        }
        for (s sVar2 : sVarArr) {
            sVar2.getClass();
            s sVar3 = sVar2.a;
            if (sVar3 != null) {
                sVar3.C(sVar2);
            }
            sVar2.a = this;
        }
        listM.addAll(i, Arrays.asList(sVarArr));
        A(i);
    }

    public String c(String str) {
        com.github.catvod.spider.merge.J.c.g(str);
        if (!o()) {
            return "";
        }
        String strM = d().m(str);
        return strM.length() > 0 ? strM : str.startsWith(oZP.d("140D047B")) ? a(str.substring(4)) : "";
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    public final s f(int i) {
        return m().get(i);
    }

    public abstract int g();

    public final List<s> h() {
        if (g() == 0) {
            return c;
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

    protected s j(@Nullable s sVar) {
        h hVarX;
        try {
            s sVar2 = (s) super.clone();
            sVar2.a = sVar;
            sVar2.b = sVar == null ? 0 : this.b;
            if (sVar == null && !(this instanceof h) && (hVarX = x()) != null) {
                h hVarF0 = hVarX.F0();
                sVar2.a = hVarF0;
                hVarF0.m().add(sVar2);
            }
            return sVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void k(String str);

    public abstract s l();

    protected abstract List<s> m();

    public final boolean n(String str) {
        com.github.catvod.spider.merge.J.c.g(str);
        if (!o()) {
            return false;
        }
        if (str.startsWith(oZP.d("140D047B"))) {
            String strSubstring = str.substring(4);
            if (d().o(strSubstring) && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return d().o(str);
    }

    protected abstract boolean o();

    public final boolean p() {
        return this.a != null;
    }

    protected final void q(Appendable appendable, int i, g gVar) {
        appendable.append('\n').append(com.github.catvod.spider.merge.K.b.g(gVar.e() * i, gVar.f()));
    }

    @Nullable
    public final s r() {
        s sVar = this.a;
        if (sVar == null) {
            return null;
        }
        List<s> listM = sVar.m();
        int i = this.b + 1;
        if (listM.size() > i) {
            return listM.get(i);
        }
        return null;
    }

    public abstract String s();

    public String t() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        u(sbB);
        return com.github.catvod.spider.merge.K.b.h(sbB);
    }

    public String toString() {
        return t();
    }

    protected final void u(Appendable appendable) {
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        com.github.catvod.spider.merge.F.a.b(new r(appendable, hVarX.A0()), this);
    }

    abstract void v(Appendable appendable, int i, g gVar);

    abstract void w(Appendable appendable, int i, g gVar);

    @Nullable
    public final h x() {
        s sVarE = E();
        if (sVarE instanceof h) {
            return (h) sVarE;
        }
        return null;
    }

    @Nullable
    public s y() {
        return this.a;
    }

    @Nullable
    public final s z() {
        return this.a;
    }
}
