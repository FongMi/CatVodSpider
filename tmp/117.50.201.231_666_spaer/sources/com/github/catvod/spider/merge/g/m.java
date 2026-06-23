package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class m implements Cloneable {
    static final List<m> c = Collections.emptyList();

    @Nullable
    m a;
    int b;

    private static class a implements com.github.catvod.spider.merge.I.e {
        private final Appendable a;
        private final f.a b;

        a(Appendable appendable, f.a aVar) {
            this.a = appendable;
            this.b = aVar;
            aVar.f();
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void a(m mVar, int i) {
            if (mVar.t().equals("#text")) {
                return;
            }
            try {
                mVar.x(this.a, i, this.b);
            } catch (IOException e) {
                throw new com.github.catvod.spider.merge.D.b(e);
            }
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void b(m mVar, int i) {
            try {
                mVar.w(this.a, i, this.b);
            } catch (IOException e) {
                throw new com.github.catvod.spider.merge.D.b(e);
            }
        }
    }

    protected m() {
    }

    private void B(int i) {
        int iH = h();
        if (iH == 0) {
            return;
        }
        List<m> listN = n();
        while (i < iH) {
            listN.get(i).b = i;
            i++;
        }
    }

    @Nullable
    public final m A() {
        return this.a;
    }

    public final void C() {
        com.github.catvod.spider.merge.E.c.g(this.a);
        this.a.D(this);
    }

    protected void D(m mVar) {
        com.github.catvod.spider.merge.E.c.c(mVar.a == this);
        int i = mVar.b;
        n().remove(i);
        B(i);
        mVar.a = null;
    }

    public final void E(m mVar) {
        com.github.catvod.spider.merge.E.c.g(this.a);
        m mVar2 = this.a;
        mVar2.getClass();
        com.github.catvod.spider.merge.E.c.c(this.a == mVar2);
        m mVar3 = mVar.a;
        if (mVar3 != null) {
            mVar3.D(mVar);
        }
        int i = this.b;
        mVar2.n().set(i, mVar);
        mVar.a = mVar2;
        mVar.b = i;
        this.a = null;
    }

    public m F() {
        m mVar = this;
        while (true) {
            m mVar2 = mVar.a;
            if (mVar2 == null) {
                return mVar;
            }
            mVar = mVar2;
        }
    }

    public final void G(String str) {
        l(str);
    }

    public final int H() {
        return this.b;
    }

    public String a(String str) {
        com.github.catvod.spider.merge.E.c.e(str);
        return (p() && e().o(str)) ? com.github.catvod.spider.merge.F.b.i(f(), e().m(str)) : "";
    }

    protected final void b(int i, m... mVarArr) {
        boolean z;
        com.github.catvod.spider.merge.E.c.g(mVarArr);
        if (mVarArr.length == 0) {
            return;
        }
        List<m> listN = n();
        m mVarZ = mVarArr[0].z();
        if (mVarZ != null && mVarZ.h() == mVarArr.length) {
            List<m> listN2 = mVarZ.n();
            int length = mVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (mVarArr[i2] != listN2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                boolean z2 = h() == 0;
                mVarZ.m();
                listN.addAll(i, Arrays.asList(mVarArr));
                int length2 = mVarArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    mVarArr[i3].a = this;
                    length2 = i3;
                }
                if (z2 && mVarArr[0].b == 0) {
                    return;
                }
                B(i);
                return;
            }
        }
        for (m mVar : mVarArr) {
            if (mVar == null) {
                throw new com.github.catvod.spider.merge.E.d("Array must not contain any null objects");
            }
        }
        for (m mVar2 : mVarArr) {
            mVar2.getClass();
            m mVar3 = mVar2.a;
            if (mVar3 != null) {
                mVar3.D(mVar2);
            }
            mVar2.a = this;
        }
        listN.addAll(i, Arrays.asList(mVarArr));
        B(i);
    }

    public m c(String str, String str2) {
        n.a(this).getClass();
        e().x(com.github.catvod.spider.merge.H.f.c.b(str), str2);
        return this;
    }

    public String d(String str) {
        com.github.catvod.spider.merge.E.c.g(str);
        if (!p()) {
            return "";
        }
        String strM = e().m(str);
        return strM.length() > 0 ? strM : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract b e();

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    public abstract String f();

    public final m g(int i) {
        return n().get(i);
    }

    public abstract int h();

    public final int hashCode() {
        return super.hashCode();
    }

    public final List<m> i() {
        if (h() == 0) {
            return c;
        }
        List<m> listN = n();
        ArrayList arrayList = new ArrayList(listN.size());
        arrayList.addAll(listN);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public m clone() {
        m mVarK = k(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mVarK);
        while (!linkedList.isEmpty()) {
            m mVar = (m) linkedList.remove();
            int iH = mVar.h();
            for (int i = 0; i < iH; i++) {
                List<m> listN = mVar.n();
                m mVarK2 = listN.get(i).k(mVar);
                listN.set(i, mVarK2);
                linkedList.add(mVarK2);
            }
        }
        return mVarK;
    }

    protected m k(@Nullable m mVar) {
        f fVarY;
        try {
            m mVar2 = (m) super.clone();
            mVar2.a = mVar;
            mVar2.b = mVar == null ? 0 : this.b;
            if (mVar == null && !(this instanceof f) && (fVarY = y()) != null) {
                f fVarD0 = fVarY.D0();
                mVar2.a = fVarD0;
                fVarD0.n().add(mVar2);
            }
            return mVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void l(String str);

    public abstract m m();

    protected abstract List<m> n();

    public final boolean o(String str) {
        com.github.catvod.spider.merge.E.c.g(str);
        if (!p()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (e().o(strSubstring) && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return e().o(str);
    }

    protected abstract boolean p();

    public final boolean q() {
        return this.a != null;
    }

    protected final void r(Appendable appendable, int i, f.a aVar) throws IOException {
        appendable.append('\n').append(com.github.catvod.spider.merge.F.b.g(aVar.d() * i, aVar.e()));
    }

    @Nullable
    public final m s() {
        m mVar = this.a;
        if (mVar == null) {
            return null;
        }
        List<m> listN = mVar.n();
        int i = this.b + 1;
        if (listN.size() > i) {
            return listN.get(i);
        }
        return null;
    }

    public abstract String t();

    public String toString() {
        return u();
    }

    public String u() {
        StringBuilder sbB = com.github.catvod.spider.merge.F.b.b();
        v(sbB);
        return com.github.catvod.spider.merge.F.b.h(sbB);
    }

    protected final void v(Appendable appendable) {
        f fVarY = y();
        if (fVarY == null) {
            fVarY = new f("");
        }
        com.github.catvod.spider.merge.F.a.g(new a(appendable, fVarY.y0()), this);
    }

    abstract void w(Appendable appendable, int i, f.a aVar);

    abstract void x(Appendable appendable, int i, f.a aVar);

    @Nullable
    public final f y() {
        m mVarF = F();
        if (mVarF instanceof f) {
            return (f) mVarF;
        }
        return null;
    }

    @Nullable
    public m z() {
        return this.a;
    }
}
