package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ٴ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0245 implements InterfaceC0590 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0245 f624;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final C0245 f625;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected List<C0125> f626;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected boolean f627;

    static {
        C0245 c0245M886 = m886(0, 1114111);
        f624 = c0245M886;
        c0245M886.m900(true);
        C0245 c0245 = new C0245(new int[0]);
        f625 = c0245;
        c0245.m900(true);
    }

    public C0245(C0245 c0245) {
        this(new int[0]);
        m893(c0245);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static C0245 m885(int i) {
        C0245 c0245 = new C0245(new int[0]);
        c0245.m890(i);
        return c0245;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static C0245 m886(int i, int i2) {
        C0245 c0245 = new C0245(new int[0]);
        c0245.m891(i, i2);
        return c0245;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public static C0245 m887(C0245 c0245, C0245 c02452) {
        int i = 0;
        if (c0245 == null || c0245.mo889()) {
            return new C0245(new int[0]);
        }
        C0245 c02453 = new C0245(c0245);
        if (c02452 != null && !c02452.mo889()) {
            int i2 = 0;
            while (i < c02453.f626.size() && i2 < c02452.f626.size()) {
                C0125 c0125 = c02453.f626.get(i);
                C0125 c01252 = c02452.f626.get(i2);
                int i3 = c01252.f318;
                int i4 = c0125.f317;
                if (i3 >= i4) {
                    int i5 = c01252.f317;
                    if (i5 <= c0125.f318) {
                        C0125 c01253 = i5 > i4 ? new C0125(c0125.f317, c01252.f317 - 1) : null;
                        C0125 c01254 = c01252.f318 < c0125.f318 ? new C0125(c01252.f318 + 1, c0125.f318) : null;
                        if (c01253 != null) {
                            if (c01254 != null) {
                                c02453.f626.set(i, c01253);
                                i++;
                                c02453.f626.add(i, c01254);
                            } else {
                                c02453.f626.set(i, c01253);
                            }
                        } else if (c01254 != null) {
                            c02453.f626.set(i, c01254);
                        } else {
                            c02453.f626.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c02453;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0245)) {
            return false;
        }
        return this.f626.equals(((C0245) obj).f626);
    }

    public int hashCode() {
        int iM408 = C0120.m408();
        for (C0125 c0125 : this.f626) {
            iM408 = C0120.m410(C0120.m410(iM408, c0125.f317), c0125.f318);
        }
        return C0120.m406(iM408, this.f626.size() * 2);
    }

    public String toString() {
        return m904(false);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0590
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public List<Integer> mo888() {
        ArrayList arrayList = new ArrayList();
        int size = this.f626.size();
        for (int i = 0; i < size; i++) {
            C0125 c0125 = this.f626.get(i);
            int i2 = c0125.f318;
            for (int i3 = c0125.f317; i3 <= i2; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        return arrayList;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0590
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public boolean mo889() {
        List<C0125> list = this.f626;
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public void m890(int i) {
        if (this.f627) {
            throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        }
        m891(i, i);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public void m891(int i, int i2) {
        m892(C0125.m418(i, i2));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected void m892(C0125 c0125) {
        if (this.f627) {
            throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        }
        if (c0125.f318 < c0125.f317) {
            return;
        }
        ListIterator<C0125> listIterator = this.f626.listIterator();
        while (listIterator.hasNext()) {
            C0125 next = listIterator.next();
            if (c0125.equals(next)) {
                return;
            }
            if (c0125.m419(next) || !c0125.m420(next)) {
                C0125 c0125M423 = c0125.m423(next);
                listIterator.set(c0125M423);
                while (listIterator.hasNext()) {
                    C0125 next2 = listIterator.next();
                    if (!c0125M423.m419(next2) && c0125M423.m420(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c0125M423.m423(next2));
                    listIterator.next();
                }
                return;
            }
            if (c0125.m422(next)) {
                listIterator.previous();
                listIterator.add(c0125);
                return;
            }
        }
        this.f626.add(c0125);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public C0245 m893(InterfaceC0590 interfaceC0590) {
        if (interfaceC0590 == null) {
            return this;
        }
        if (interfaceC0590 instanceof C0245) {
            C0245 c0245 = (C0245) interfaceC0590;
            int size = c0245.f626.size();
            for (int i = 0; i < size; i++) {
                C0125 c0125 = c0245.f626.get(i);
                m891(c0125.f317, c0125.f318);
            }
        } else {
            Iterator<Integer> it = interfaceC0590.mo888().iterator();
            while (it.hasNext()) {
                m890(it.next().intValue());
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0245 m894(InterfaceC0590 interfaceC0590) {
        C0245 c0245;
        if (interfaceC0590 == null || interfaceC0590.mo889()) {
            return null;
        }
        if (interfaceC0590 instanceof C0245) {
            c0245 = (C0245) interfaceC0590;
        } else {
            C0245 c02452 = new C0245(new int[0]);
            c02452.m893(interfaceC0590);
            c0245 = c02452;
        }
        return c0245.m902(this);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public boolean m895(int i) {
        int size = this.f626.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C0125 c0125 = this.f626.get(i3);
            int i4 = c0125.f317;
            if (c0125.f318 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected String m896(InterfaceC0402 interfaceC0402, int i) {
        return i == -1 ? SOY.d("46171E304A") : i == -2 ? SOY.d("461701253D3B351C6F") : interfaceC0402.mo1543(i);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public int m897() {
        if (mo889()) {
            throw new RuntimeException(SOY.d("093725561D045A373C06000E"));
        }
        return this.f626.get(0).f317;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public C0245 m898(InterfaceC0590 interfaceC0590) {
        C0245 c0245 = new C0245(new int[0]);
        c0245.m893(this);
        c0245.m893(interfaceC0590);
        return c0245;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public void m899(int i) {
        if (this.f627) {
            throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        }
        int size = this.f626.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0125 c0125 = this.f626.get(i2);
            int i3 = c0125.f317;
            int i4 = c0125.f318;
            if (i < i3) {
                return;
            }
            if (i == i3 && i == i4) {
                this.f626.remove(i2);
                return;
            }
            if (i == i3) {
                c0125.f317 = i3 + 1;
                return;
            }
            if (i == i4) {
                c0125.f318 = i4 - 1;
                return;
            }
            if (i > i3 && i < i4) {
                c0125.f318 = i - 1;
                m891(i + 1, i4);
            }
        }
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public void m900(boolean z) {
        if (this.f627 && !z) {
            throw new IllegalStateException(SOY.d("19333F5100571B3E25130657083730121B19162B713F1A031F20271718241F26"));
        }
        this.f627 = z;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public int m901() {
        int size = this.f626.size();
        if (size == 1) {
            C0125 c0125 = this.f626.get(0);
            return (c0125.f318 - c0125.f317) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0125 c01252 = this.f626.get(i2);
            i += (c01252.f318 - c01252.f317) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public C0245 m902(InterfaceC0590 interfaceC0590) {
        if (interfaceC0590 == null || interfaceC0590.mo889()) {
            return new C0245(this);
        }
        if (interfaceC0590 instanceof C0245) {
            return m887(this, (C0245) interfaceC0590);
        }
        C0245 c0245 = new C0245(new int[0]);
        c0245.m893(interfaceC0590);
        return m887(this, c0245);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public String m903(InterfaceC0402 interfaceC0402) {
        StringBuilder sb = new StringBuilder();
        List<C0125> list = this.f626;
        if (list == null || list.isEmpty()) {
            return SOY.d("012F");
        }
        if (m901() > 1) {
            sb.append(SOY.d("01"));
        }
        Iterator<C0125> it = this.f626.iterator();
        while (it.hasNext()) {
            C0125 next = it.next();
            int i = next.f317;
            int i2 = next.f318;
            String strD = SOY.d("5672");
            if (i == i2) {
                sb.append(m896(interfaceC0402, i));
            } else {
                for (int i3 = i; i3 <= i2; i3++) {
                    if (i3 > i) {
                        sb.append(strD);
                    }
                    sb.append(m896(interfaceC0402, i3));
                }
            }
            if (it.hasNext()) {
                sb.append(strD);
            }
        }
        if (m901() > 1) {
            sb.append(SOY.d("07"));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public String m904(boolean z) {
        StringBuilder sb = new StringBuilder();
        List<C0125> list = this.f626;
        if (list == null || list.isEmpty()) {
            return SOY.d("012F");
        }
        if (m901() > 1) {
            sb.append(SOY.d("01"));
        }
        Iterator<C0125> it = this.f626.iterator();
        while (it.hasNext()) {
            C0125 next = it.next();
            int i = next.f317;
            int i2 = next.f318;
            String strD = SOY.d("5D");
            if (i == i2) {
                if (i == -1) {
                    sb.append(SOY.d("46171E304A"));
                } else if (z) {
                    sb.append(strD);
                    sb.appendCodePoint(i).append(strD);
                } else {
                    sb.append(i);
                }
            } else if (z) {
                sb.append(strD);
                StringBuilder sbAppendCodePoint = sb.appendCodePoint(i);
                sbAppendCodePoint.append(SOY.d("5D7C7F51"));
                sbAppendCodePoint.appendCodePoint(i2).append(strD);
            } else {
                sb.append(i);
                sb.append(SOY.d("547C"));
                sb.append(i2);
            }
            if (it.hasNext()) {
                sb.append(SOY.d("5672"));
            }
        }
        if (m901() > 1) {
            sb.append(SOY.d("07"));
        }
        return sb.toString();
    }

    public C0245(int... iArr) {
        if (iArr == null) {
            this.f626 = new ArrayList(2);
            return;
        }
        this.f626 = new ArrayList(iArr.length);
        for (int i : iArr) {
            m890(i);
        }
    }
}
