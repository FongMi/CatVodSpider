package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.NC */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public abstract class AbstractC0077NC implements Cloneable {

    /* renamed from: q */
    static final List<AbstractC0077NC> f459q = Collections.emptyList();

    /* renamed from: QU */
    int f460QU;

    /* renamed from: xC */
    @Nullable
    AbstractC0077NC f461xC;

    /* renamed from: com.github.catvod.spider.merge.NC$p */
    private static class p implements InterfaceC0150u2 {

        /* renamed from: q */
        private final Appendable f462q;

        /* renamed from: xC */
        private final C0082OO.p f463xC;

        p(Appendable appendable, C0082OO.p pVar) {
            this.f462q = appendable;
            this.f463xC = pVar;
            pVar.m321MH();
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: q */
        public void mo287q(AbstractC0077NC abstractC0077NC, int i) {
            if (abstractC0077NC.mo129p().equals("#text")) {
                return;
            }
            try {
                abstractC0077NC.mo128UN(this.f462q, i, this.f463xC);
            } catch (IOException e) {
                throw new C0140qw(e);
            }
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0150u2
        /* renamed from: xC */
        public void mo288xC(AbstractC0077NC abstractC0077NC, int i) {
            try {
                abstractC0077NC.mo132yS(this.f462q, i, this.f463xC);
            } catch (IOException e) {
                throw new C0140qw(e);
            }
        }
    }

    protected AbstractC0077NC() {
    }

    /* renamed from: fH */
    private void m254fH(int i) {
        List<AbstractC0077NC> listMo265RH = mo265RH();
        while (i < listMo265RH.size()) {
            listMo265RH.get(i).m281t(i);
            i++;
        }
    }

    /* renamed from: B */
    protected AbstractC0077NC mo255B(@Nullable AbstractC0077NC abstractC0077NC) {
        try {
            AbstractC0077NC abstractC0077NC2 = (AbstractC0077NC) super.clone();
            abstractC0077NC2.f461xC = abstractC0077NC;
            abstractC0077NC2.f460QU = abstractC0077NC == null ? 0 : this.f460QU;
            return abstractC0077NC2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: BP */
    protected void m256BP(Appendable appendable) {
        C0075Mj.m252xC(new p(appendable, C0063G.m196q(this)), this);
    }

    @Nullable
    /* renamed from: E */
    public AbstractC0077NC m257E() {
        AbstractC0077NC abstractC0077NC = this.f461xC;
        if (abstractC0077NC == null) {
            return null;
        }
        List<AbstractC0077NC> listMo265RH = abstractC0077NC.mo265RH();
        int i = this.f460QU + 1;
        if (listMo265RH.size() > i) {
            return listMo265RH.get(i);
        }
        return null;
    }

    /* renamed from: F */
    public abstract AbstractC0077NC mo123F();

    @Override // 
    /* renamed from: FN */
    public AbstractC0077NC mo314L() {
        AbstractC0077NC abstractC0077NCMo255B = mo255B(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC0077NCMo255B);
        while (!linkedList.isEmpty()) {
            AbstractC0077NC abstractC0077NC = (AbstractC0077NC) linkedList.remove();
            int iMo131se = abstractC0077NC.mo131se();
            for (int i = 0; i < iMo131se; i++) {
                List<AbstractC0077NC> listMo265RH = abstractC0077NC.mo265RH();
                AbstractC0077NC abstractC0077NCMo255B2 = listMo265RH.get(i).mo255B(abstractC0077NC);
                listMo265RH.set(i, abstractC0077NCMo255B2);
                linkedList.add(abstractC0077NCMo255B2);
            }
        }
        return abstractC0077NCMo255B;
    }

    @Nullable
    /* renamed from: Fp */
    public C0082OO m259Fp() {
        AbstractC0077NC abstractC0077NCMo279rF = mo279rF();
        if (abstractC0077NCMo279rF instanceof C0082OO) {
            return (C0082OO) abstractC0077NCMo279rF;
        }
        return null;
    }

    /* renamed from: IS */
    protected void m260IS(Appendable appendable, int i, C0082OO.p pVar) throws IOException {
        appendable.append('\n').append(C0157x3.m765B(i * pVar.m322Mo()));
    }

    /* renamed from: KT */
    public boolean m261KT(String str) {
        C0111bw.m559se(str);
        if (!mo275k()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo282u().m452F(strSubstring) && !mo130q(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo282u().m452F(str);
    }

    /* renamed from: M */
    public void m262M(String str) {
        C0111bw.m559se(str);
        mo283w8(str);
    }

    /* renamed from: MH */
    public AbstractC0077NC m263MH(int i) {
        return mo265RH().get(i);
    }

    /* renamed from: Mo */
    public abstract String mo124Mo();

    @Nullable
    /* renamed from: P */
    public final AbstractC0077NC m264P() {
        return this.f461xC;
    }

    /* renamed from: QU */
    public String mo126QU(String str) {
        C0111bw.m559se(str);
        if (!mo275k()) {
            return "";
        }
        String strM450B = mo282u().m450B(str);
        return strM450B.length() > 0 ? strM450B : str.startsWith("abs:") ? mo130q(str.substring(4)) : "";
    }

    /* renamed from: RH */
    protected abstract List<AbstractC0077NC> mo265RH();

    /* renamed from: T */
    protected void m266T(AbstractC0077NC abstractC0077NC, AbstractC0077NC abstractC0077NC2) {
        C0111bw.m554QU(abstractC0077NC.f461xC == this);
        C0111bw.m559se(abstractC0077NC2);
        AbstractC0077NC abstractC0077NC3 = abstractC0077NC2.f461xC;
        if (abstractC0077NC3 != null) {
            abstractC0077NC3.mo268U(abstractC0077NC2);
        }
        int i = abstractC0077NC.f460QU;
        mo265RH().set(i, abstractC0077NC2);
        abstractC0077NC2.f461xC = this;
        abstractC0077NC2.m281t(i);
        abstractC0077NC.f461xC = null;
    }

    /* renamed from: Tz */
    public boolean m267Tz() {
        return this.f461xC != null;
    }

    /* renamed from: U */
    protected void mo268U(AbstractC0077NC abstractC0077NC) {
        C0111bw.m554QU(abstractC0077NC.f461xC == this);
        int i = abstractC0077NC.f460QU;
        mo265RH().remove(i);
        m254fH(i);
        abstractC0077NC.f461xC = null;
    }

    /* renamed from: UJ */
    public AbstractC0077NC mo127UJ(String str, String str2) {
        mo282u().m451BP(C0063G.m197xC(this).m312UJ().m232q(str), str2);
        return this;
    }

    /* renamed from: UN */
    abstract void mo128UN(Appendable appendable, int i, C0082OO.p pVar);

    /* renamed from: W */
    public List<AbstractC0077NC> m269W() {
        if (mo131se() == 0) {
            return f459q;
        }
        List<AbstractC0077NC> listMo265RH = mo265RH();
        ArrayList arrayList = new ArrayList(listMo265RH.size());
        arrayList.addAll(listMo265RH);
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    /* renamed from: Xl */
    public AbstractC0077NC m270Xl() {
        AbstractC0077NC abstractC0077NC = this.f461xC;
        if (abstractC0077NC != null && this.f460QU > 0) {
            return abstractC0077NC.mo265RH().get(this.f460QU - 1);
        }
        return null;
    }

    /* renamed from: c */
    public List<AbstractC0077NC> m271c() {
        AbstractC0077NC abstractC0077NC = this.f461xC;
        if (abstractC0077NC == null) {
            return Collections.emptyList();
        }
        List<AbstractC0077NC> listMo265RH = abstractC0077NC.mo265RH();
        ArrayList arrayList = new ArrayList(listMo265RH.size() - 1);
        for (AbstractC0077NC abstractC0077NC2 : listMo265RH) {
            if (abstractC0077NC2 != this) {
                arrayList.add(abstractC0077NC2);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public void m272d() {
        C0111bw.m559se(this.f461xC);
        this.f461xC.mo268U(this);
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: go */
    void mo273go() {
    }

    /* renamed from: i */
    public AbstractC0077NC m274i(AbstractC0077NC abstractC0077NC) {
        C0111bw.m559se(abstractC0077NC);
        C0111bw.m559se(this.f461xC);
        this.f461xC.m285xC(this.f460QU, abstractC0077NC);
        return this;
    }

    /* renamed from: k */
    protected abstract boolean mo275k();

    /* renamed from: l */
    public String mo276l() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        m256BP(sbM779xC);
        return C0157x3.m778w8(sbM779xC);
    }

    /* renamed from: m */
    protected void m277m(AbstractC0077NC abstractC0077NC) {
        abstractC0077NC.m284wR(this);
    }

    /* renamed from: p */
    public abstract String mo129p();

    @Nullable
    /* renamed from: pb */
    public AbstractC0077NC mo278pb() {
        return this.f461xC;
    }

    /* renamed from: q */
    public String mo130q(String str) {
        C0111bw.m557i(str);
        return (mo275k() && mo282u().m452F(str)) ? C0157x3.m766F(mo124Mo(), mo282u().m450B(str)) : "";
    }

    /* renamed from: rF */
    public AbstractC0077NC mo279rF() {
        AbstractC0077NC abstractC0077NC = this;
        while (true) {
            AbstractC0077NC abstractC0077NC2 = abstractC0077NC.f461xC;
            if (abstractC0077NC2 == null) {
                return abstractC0077NC;
            }
            abstractC0077NC = abstractC0077NC2;
        }
    }

    /* renamed from: s */
    public void m280s(AbstractC0077NC abstractC0077NC) {
        C0111bw.m559se(abstractC0077NC);
        C0111bw.m559se(this.f461xC);
        this.f461xC.m266T(this, abstractC0077NC);
    }

    /* renamed from: se */
    public abstract int mo131se();

    /* renamed from: t */
    protected void m281t(int i) {
        this.f460QU = i;
    }

    public String toString() {
        return mo276l();
    }

    /* renamed from: u */
    public abstract C0094Tz mo282u();

    /* renamed from: w8 */
    protected abstract void mo283w8(String str);

    /* renamed from: wR */
    protected void m284wR(AbstractC0077NC abstractC0077NC) {
        C0111bw.m559se(abstractC0077NC);
        AbstractC0077NC abstractC0077NC2 = this.f461xC;
        if (abstractC0077NC2 != null) {
            abstractC0077NC2.mo268U(this);
        }
        this.f461xC = abstractC0077NC;
    }

    /* renamed from: xC */
    protected void m285xC(int i, AbstractC0077NC... abstractC0077NCArr) {
        boolean z;
        C0111bw.m559se(abstractC0077NCArr);
        if (abstractC0077NCArr.length == 0) {
            return;
        }
        List<AbstractC0077NC> listMo265RH = mo265RH();
        AbstractC0077NC abstractC0077NCMo278pb = abstractC0077NCArr[0].mo278pb();
        if (abstractC0077NCMo278pb != null && abstractC0077NCMo278pb.mo131se() == abstractC0077NCArr.length) {
            List<AbstractC0077NC> listMo265RH2 = abstractC0077NCMo278pb.mo265RH();
            int length = abstractC0077NCArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (abstractC0077NCArr[i2] != listMo265RH2.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                abstractC0077NCMo278pb.mo123F();
                listMo265RH.addAll(i, Arrays.asList(abstractC0077NCArr));
                int length2 = abstractC0077NCArr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        m254fH(i);
                        return;
                    } else {
                        abstractC0077NCArr[i3].f461xC = this;
                        length2 = i3;
                    }
                }
            }
        }
        C0111bw.m560u(abstractC0077NCArr);
        for (AbstractC0077NC abstractC0077NC : abstractC0077NCArr) {
            m277m(abstractC0077NC);
        }
        listMo265RH.addAll(i, Arrays.asList(abstractC0077NCArr));
        m254fH(i);
    }

    /* renamed from: yS */
    abstract void mo132yS(Appendable appendable, int i, C0082OO.p pVar);

    /* renamed from: z */
    public int m286z() {
        return this.f460QU;
    }
}
