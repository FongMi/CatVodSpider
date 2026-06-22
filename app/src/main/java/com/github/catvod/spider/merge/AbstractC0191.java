package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0035;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ւ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0191 implements Cloneable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static final List<AbstractC0191> f476 = Collections.emptyList();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    @Nullable
    AbstractC0191 f477;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    int f478;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ւ$Ϳ, reason: contains not printable characters */
    private static class C0192 implements InterfaceC0539 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private final Appendable f479;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private final C0035.C0036 f480;

        C0192(Appendable appendable, C0035.C0036 c0036) {
            this.f479 = appendable;
            this.f480 = c0036;
            c0036.m302();
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ϳ */
        public void mo207(AbstractC0191 abstractC0191, int i) {
            if (abstractC0191.mo122().equals(SOY.d("5926340E00"))) {
                return;
            }
            try {
                abstractC0191.mo124(this.f479, i, this.f480);
            } catch (IOException e) {
                throw new C0244(e);
            }
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ԩ */
        public void mo208(AbstractC0191 abstractC0191, int i) {
            try {
                abstractC0191.mo123(this.f479, i, this.f480);
            } catch (IOException e) {
                throw new C0244(e);
            }
        }
    }

    protected AbstractC0191() {
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    private void m680(int i) {
        List<AbstractC0191> listMo167 = mo167();
        while (i < listMo167.size()) {
            listMo167.get(i).m700(i);
            i++;
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String toString() {
        return mo287();
    }

    /* JADX INFO: renamed from: Ϳ */
    public String mo116(String str) {
        C0034.m282(str);
        return (mo168() && mo164().m1756(str)) ? C0008.m148(mo118(), mo164().m1754(str)) : "";
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected void m681(int i, AbstractC0191... abstractC0191Arr) {
        boolean z;
        C0034.m284(abstractC0191Arr);
        if (abstractC0191Arr.length == 0) {
            return;
        }
        List<AbstractC0191> listMo167 = mo167();
        AbstractC0191 abstractC0191Mo170 = abstractC0191Arr[0].mo170();
        if (abstractC0191Mo170 != null && abstractC0191Mo170.mo119() == abstractC0191Arr.length) {
            List<AbstractC0191> listMo1672 = abstractC0191Mo170.mo167();
            int length = abstractC0191Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    z = true;
                    break;
                } else {
                    if (abstractC0191Arr[i2] != listMo1672.get(i2)) {
                        z = false;
                        break;
                    }
                    length = i2;
                }
            }
            if (z) {
                abstractC0191Mo170.mo121();
                listMo167.addAll(i, Arrays.asList(abstractC0191Arr));
                int length2 = abstractC0191Arr.length;
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        m680(i);
                        return;
                    } else {
                        abstractC0191Arr[i3].f477 = this;
                        length2 = i3;
                    }
                }
            }
        }
        C0034.m280(abstractC0191Arr);
        for (AbstractC0191 abstractC0191 : abstractC0191Arr) {
            m695(abstractC0191);
        }
        listMo167.addAll(i, Arrays.asList(abstractC0191Arr));
        m680(i);
    }

    /* JADX INFO: renamed from: ԩ */
    public String mo117(String str) {
        C0034.m284(str);
        if (!mo168()) {
            return "";
        }
        String strM1754 = mo164().m1754(str);
        return strM1754.length() > 0 ? strM1754 : str.startsWith(SOY.d("1B30224C")) ? mo116(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: Ԫ */
    public AbstractC0191 mo430(String str, String str2) {
        mo164().m1763(C0176.m597(this).m584().m1620(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ԫ */
    public abstract C0542 mo164();

    /* JADX INFO: renamed from: Ԭ */
    public abstract String mo118();

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public AbstractC0191 m682(AbstractC0191 abstractC0191) {
        C0034.m284(abstractC0191);
        C0034.m284(this.f477);
        this.f477.m681(this.f478, abstractC0191);
        return this;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public AbstractC0191 m683(int i) {
        return mo167().get(i);
    }

    /* JADX INFO: renamed from: ԯ */
    public abstract int mo119();

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public List<AbstractC0191> m684() {
        if (mo119() == 0) {
            return f476;
        }
        List<AbstractC0191> listMo167 = mo167();
        ArrayList arrayList = new ArrayList(listMo167.size());
        arrayList.addAll(listMo167);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: ؠ, reason: merged with bridge method [inline-methods] */
    public AbstractC0191 mo120() {
        AbstractC0191 abstractC0191Mo165 = mo165(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC0191Mo165);
        while (!linkedList.isEmpty()) {
            AbstractC0191 abstractC0191 = (AbstractC0191) linkedList.remove();
            int iMo119 = abstractC0191.mo119();
            for (int i = 0; i < iMo119; i++) {
                List<AbstractC0191> listMo167 = abstractC0191.mo167();
                AbstractC0191 abstractC0191Mo1652 = listMo167.get(i).mo165(abstractC0191);
                listMo167.set(i, abstractC0191Mo1652);
                linkedList.add(abstractC0191Mo1652);
            }
        }
        return abstractC0191Mo165;
    }

    /* JADX INFO: renamed from: ހ */
    protected AbstractC0191 mo165(@Nullable AbstractC0191 abstractC0191) {
        try {
            AbstractC0191 abstractC01912 = (AbstractC0191) super.clone();
            abstractC01912.f477 = abstractC0191;
            abstractC01912.f478 = abstractC0191 == null ? 0 : this.f478;
            return abstractC01912;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ށ */
    protected abstract void mo166(String str);

    /* JADX INFO: renamed from: ނ */
    public abstract AbstractC0191 mo121();

    /* JADX INFO: renamed from: ރ */
    protected abstract List<AbstractC0191> mo167();

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public boolean m685(String str) {
        C0034.m284(str);
        if (!mo168()) {
            return false;
        }
        if (str.startsWith(SOY.d("1B30224C"))) {
            String strSubstring = str.substring(4);
            if (mo164().m1756(strSubstring) && !mo116(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo164().m1756(str);
    }

    /* JADX INFO: renamed from: ޅ */
    protected abstract boolean mo168();

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public boolean m686() {
        return this.f477 != null;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected void m687(Appendable appendable, int i, C0035.C0036 c0036) throws IOException {
        appendable.append('\n').append(C0008.m146(i * c0036.m300()));
    }

    @Nullable
    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public AbstractC0191 m688() {
        AbstractC0191 abstractC0191 = this.f477;
        if (abstractC0191 == null) {
            return null;
        }
        List<AbstractC0191> listMo167 = abstractC0191.mo167();
        int i = this.f478 + 1;
        if (listMo167.size() > i) {
            return listMo167.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: މ */
    public abstract String mo122();

    /* JADX INFO: renamed from: ފ */
    void mo169() {
    }

    /* JADX INFO: renamed from: ދ */
    public String mo287() {
        StringBuilder sbM136 = C0008.m136();
        m689(sbM136);
        return C0008.m147(sbM136);
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    protected void m689(Appendable appendable) {
        C0088.m352(new C0192(appendable, C0176.m596(this)), this);
    }

    /* JADX INFO: renamed from: ލ */
    abstract void mo123(Appendable appendable, int i, C0035.C0036 c0036);

    /* JADX INFO: renamed from: ގ */
    abstract void mo124(Appendable appendable, int i, C0035.C0036 c0036);

    @Nullable
    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    public C0035 m690() {
        AbstractC0191 abstractC0191Mo171 = mo171();
        if (abstractC0191Mo171 instanceof C0035) {
            return (C0035) abstractC0191Mo171;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: ސ */
    public AbstractC0191 mo170() {
        return this.f477;
    }

    @Nullable
    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    public final AbstractC0191 m691() {
        return this.f477;
    }

    @Nullable
    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    public AbstractC0191 m692() {
        AbstractC0191 abstractC0191 = this.f477;
        if (abstractC0191 != null && this.f478 > 0) {
            return abstractC0191.mo167().get(this.f478 - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    public void m693() {
        C0034.m284(this.f477);
        this.f477.mo694(this);
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    protected void mo694(AbstractC0191 abstractC0191) {
        C0034.m278(abstractC0191.f477 == this);
        int i = abstractC0191.f478;
        mo167().remove(i);
        m680(i);
        abstractC0191.f477 = null;
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    protected void m695(AbstractC0191 abstractC0191) {
        abstractC0191.m699(this);
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    protected void m696(AbstractC0191 abstractC0191, AbstractC0191 abstractC01912) {
        C0034.m278(abstractC0191.f477 == this);
        C0034.m284(abstractC01912);
        AbstractC0191 abstractC01913 = abstractC01912.f477;
        if (abstractC01913 != null) {
            abstractC01913.mo694(abstractC01912);
        }
        int i = abstractC0191.f478;
        mo167().set(i, abstractC01912);
        abstractC01912.f477 = this;
        abstractC01912.m700(i);
        abstractC0191.f477 = null;
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    public void m697(AbstractC0191 abstractC0191) {
        C0034.m284(abstractC0191);
        C0034.m284(this.f477);
        this.f477.m696(this, abstractC0191);
    }

    /* JADX INFO: renamed from: ޙ */
    public AbstractC0191 mo171() {
        AbstractC0191 abstractC0191 = this;
        while (true) {
            AbstractC0191 abstractC01912 = abstractC0191.f477;
            if (abstractC01912 == null) {
                return abstractC0191;
            }
            abstractC0191 = abstractC01912;
        }
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    public void m698(String str) {
        C0034.m284(str);
        mo166(str);
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    protected void m699(AbstractC0191 abstractC0191) {
        C0034.m284(abstractC0191);
        AbstractC0191 abstractC01912 = this.f477;
        if (abstractC01912 != null) {
            abstractC01912.mo694(this);
        }
        this.f477 = abstractC0191;
    }

    /* JADX INFO: renamed from: ޜ, reason: contains not printable characters */
    protected void m700(int i) {
        this.f478 = i;
    }

    /* JADX INFO: renamed from: ޝ, reason: contains not printable characters */
    public int m701() {
        return this.f478;
    }

    /* JADX INFO: renamed from: ޞ, reason: contains not printable characters */
    public List<AbstractC0191> m702() {
        AbstractC0191 abstractC0191 = this.f477;
        if (abstractC0191 == null) {
            return Collections.emptyList();
        }
        List<AbstractC0191> listMo167 = abstractC0191.mo167();
        ArrayList arrayList = new ArrayList(listMo167.size() - 1);
        for (AbstractC0191 abstractC01912 : listMo167) {
            if (abstractC01912 != this) {
                arrayList.add(abstractC01912);
            }
        }
        return arrayList;
    }
}
