package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢬ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0407 implements Set<C0406> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected boolean f1009;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public AbstractC0408 f1010;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final ArrayList<C0406> f1011;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public int f1012;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected BitSet f1013;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public boolean f1014;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public boolean f1015;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public final boolean f1016;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private int f1017;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢬ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractC0408 extends C0583<C0406> {
        public AbstractC0408(AbstractC0581<? super C0406> abstractC0581) {
            this(abstractC0581, 16, 2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.C0583
        /* JADX INFO: renamed from: ؠ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C0406 mo1564(Object obj) {
            if (obj instanceof C0406) {
                return (C0406) obj;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.C0583
        /* JADX INFO: renamed from: ހ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C0406[] mo1565(int i) {
            return new C0406[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.github.catvod.spider.merge.C0583
        /* JADX INFO: renamed from: ށ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C0406[][] mo1566(int i) {
            return new C0406[i][];
        }

        public AbstractC0408(AbstractC0581<? super C0406> abstractC0581, int i, int i2) {
            super(abstractC0581, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢬ$Ԩ, reason: contains not printable characters */
    public static final class C0409 extends AbstractC0581<C0406> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public static final C0409 f1018 = new C0409();

        private C0409() {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0587
        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo412(C0406 c0406, C0406 c04062) {
            if (c0406 == c04062) {
                return true;
            }
            return c0406 != null && c04062 != null && c0406.f1004.f1042 == c04062.f1004.f1042 && c0406.f1005 == c04062.f1005 && c0406.f1008.equals(c04062.f1008);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0587
        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo413(C0406 c0406) {
            return ((((217 + c0406.f1004.f1042) * 31) + c0406.f1005) * 31) + c0406.f1008.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢬ$Ԫ, reason: contains not printable characters */
    public static class C0410 extends AbstractC0408 {
        public C0410() {
            super(C0409.f1018);
        }
    }

    public C0407(boolean z) {
        this.f1009 = false;
        this.f1011 = new ArrayList<>(7);
        this.f1017 = -1;
        this.f1010 = new C0410();
        this.f1016 = z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends C0406> collection) {
        Iterator<? extends C0406> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        if (this.f1009) {
            throw new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
        }
        this.f1011.clear();
        this.f1017 = -1;
        this.f1010.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        AbstractC0408 abstractC0408 = this.f1010;
        if (abstractC0408 != null) {
            return abstractC0408.contains(obj);
        }
        throw new UnsupportedOperationException(SOY.d("2E3A3805541A1F2639191057132171181B035A3B3C06181217373F0211135A343E0454051F3335191A1B03722213000454"));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0407)) {
            return false;
        }
        C0407 c0407 = (C0407) obj;
        ArrayList<C0406> arrayList = this.f1011;
        return arrayList != null && arrayList.equals(c0407.f1011) && this.f1016 == c0407.f1016 && this.f1012 == c0407.f1012 && this.f1013 == c0407.f1013 && this.f1014 == c0407.f1014 && this.f1015 == c0407.f1015;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        if (!m1560()) {
            return this.f1011.hashCode();
        }
        if (this.f1017 == -1) {
            this.f1017 = this.f1011.hashCode();
        }
        return this.f1017;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f1011.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<C0406> iterator() {
        return this.f1011.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f1011.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m1558().toString());
        if (this.f1014) {
            sb.append(SOY.d("563A3005271217333F021D14393D3F02110F0E6F"));
            sb.append(this.f1014);
        }
        if (this.f1012 != 0) {
            sb.append(SOY.d("56273F1F05021F133D0249"));
            sb.append(this.f1012);
        }
        if (this.f1013 != null) {
            sb.append(SOY.d("56313E18121B1331251F1A103B3E250549"));
            sb.append(this.f1013);
        }
        if (this.f1015) {
            sb.append(SOY.d("56363806073E14263E3901031F2012191A031F2A25"));
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean add(C0406 c0406) {
        return m1557(c0406, null);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public boolean m1557(C0406 c0406, C0585<AbstractC0552, AbstractC0552, AbstractC0552> c0585) {
        if (this.f1009) {
            throw new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
        }
        if (c0406.f1008 != AbstractC0561.f1249) {
            this.f1014 = true;
        }
        if (c0406.m1552() > 0) {
            this.f1015 = true;
        }
        C0406 c0406M1852 = this.f1010.m1852(c0406);
        if (c0406M1852 == c0406) {
            this.f1017 = -1;
            this.f1011.add(c0406);
            return true;
        }
        AbstractC0552 abstractC0552M1810 = AbstractC0552.m1810(c0406M1852.f1006, c0406.f1006, !this.f1016, c0585);
        c0406M1852.f1007 = Math.max(c0406M1852.f1007, c0406.f1007);
        if (c0406.m1553()) {
            c0406M1852.m1554(true);
        }
        c0406M1852.f1006 = abstractC0552M1810;
        return true;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public List<C0406> m1558() {
        return this.f1011;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public BitSet m1559() {
        BitSet bitSet = new BitSet();
        Iterator<C0406> it = this.f1011.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().f1005);
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m1560() {
        return this.f1009;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public void m1561(AbstractC0418 abstractC0418) {
        if (this.f1009) {
            throw new IllegalStateException(SOY.d("2E3A380554041F26711F0757083730121B19162B"));
        }
        if (this.f1010.isEmpty()) {
            return;
        }
        for (C0406 c0406 : this.f1011) {
            c0406.f1006 = abstractC0418.m1592(c0406.f1006);
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public void m1562(boolean z) {
        this.f1009 = z;
        this.f1010 = null;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0406[] toArray() {
        return this.f1010.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f1010.toArray(tArr);
    }

    public C0407() {
        this(true);
    }
}
