package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0561 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final AbstractC0561 f1249 = new C0566();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ$Ϳ, reason: contains not printable characters */
    public static class C0562 extends AbstractC0564 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public final AbstractC0561[] f1250;

        public C0562(AbstractC0561 abstractC0561, AbstractC0561 abstractC05612) {
            HashSet hashSet = new HashSet();
            if (abstractC0561 instanceof C0562) {
                hashSet.addAll(Arrays.asList(((C0562) abstractC0561).f1250));
            } else {
                hashSet.add(abstractC0561);
            }
            if (abstractC05612 instanceof C0562) {
                hashSet.addAll(Arrays.asList(((C0562) abstractC05612).f1250));
            } else {
                hashSet.add(abstractC05612);
            }
            List listM1834 = AbstractC0561.m1834(hashSet);
            if (!listM1834.isEmpty()) {
                hashSet.add((C0565) Collections.min(listM1834));
            }
            this.f1250 = (AbstractC0561[]) hashSet.toArray(new AbstractC0561[hashSet.size()]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0562) {
                return Arrays.equals(this.f1250, ((C0562) obj).f1250);
            }
            return false;
        }

        public int hashCode() {
            return C0120.m407(this.f1250, C0562.class.hashCode());
        }

        public String toString() {
            return C0376.m1446(Arrays.asList(this.f1250).iterator(), SOY.d("5C74"));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: ԩ */
        public boolean mo1836(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            for (AbstractC0561 abstractC0561 : this.f1250) {
                if (!abstractC0561.mo1836(abstractC0394, c0396)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: Ԫ */
        public AbstractC0561 mo1837(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            ArrayList arrayList = new ArrayList();
            AbstractC0561[] abstractC0561Arr = this.f1250;
            int length = abstractC0561Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return AbstractC0561.f1249;
                    }
                    AbstractC0561 abstractC0561M1833 = (AbstractC0561) arrayList.get(0);
                    while (i < arrayList.size()) {
                        abstractC0561M1833 = AbstractC0561.m1833(abstractC0561M1833, (AbstractC0561) arrayList.get(i));
                        i++;
                    }
                    return abstractC0561M1833;
                }
                AbstractC0561 abstractC0561 = abstractC0561Arr[i];
                AbstractC0561 abstractC0561Mo1837 = abstractC0561.mo1837(abstractC0394, c0396);
                i2 |= abstractC0561Mo1837 == abstractC0561 ? 0 : 1;
                if (abstractC0561Mo1837 == null) {
                    return null;
                }
                if (abstractC0561Mo1837 != AbstractC0561.f1249) {
                    arrayList.add(abstractC0561Mo1837);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ$Ԩ, reason: contains not printable characters */
    public static class C0563 extends AbstractC0564 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public final AbstractC0561[] f1251;

        public C0563(AbstractC0561 abstractC0561, AbstractC0561 abstractC05612) {
            HashSet hashSet = new HashSet();
            if (abstractC0561 instanceof C0563) {
                hashSet.addAll(Arrays.asList(((C0563) abstractC0561).f1251));
            } else {
                hashSet.add(abstractC0561);
            }
            if (abstractC05612 instanceof C0563) {
                hashSet.addAll(Arrays.asList(((C0563) abstractC05612).f1251));
            } else {
                hashSet.add(abstractC05612);
            }
            List listM1834 = AbstractC0561.m1834(hashSet);
            if (!listM1834.isEmpty()) {
                hashSet.add((C0565) Collections.max(listM1834));
            }
            this.f1251 = (AbstractC0561[]) hashSet.toArray(new AbstractC0561[hashSet.size()]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0563) {
                return Arrays.equals(this.f1251, ((C0563) obj).f1251);
            }
            return false;
        }

        public int hashCode() {
            return C0120.m407(this.f1251, C0563.class.hashCode());
        }

        public String toString() {
            return C0376.m1446(Arrays.asList(this.f1251).iterator(), SOY.d("062E"));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: ԩ */
        public boolean mo1836(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            for (AbstractC0561 abstractC0561 : this.f1251) {
                if (abstractC0561.mo1836(abstractC0394, c0396)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: Ԫ */
        public AbstractC0561 mo1837(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            ArrayList arrayList = new ArrayList();
            AbstractC0561[] abstractC0561Arr = this.f1251;
            int length = abstractC0561Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    if (i2 == 0) {
                        return this;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    AbstractC0561 abstractC0561M1835 = (AbstractC0561) arrayList.get(0);
                    while (i < arrayList.size()) {
                        abstractC0561M1835 = AbstractC0561.m1835(abstractC0561M1835, (AbstractC0561) arrayList.get(i));
                        i++;
                    }
                    return abstractC0561M1835;
                }
                AbstractC0561 abstractC0561 = abstractC0561Arr[i];
                AbstractC0561 abstractC0561Mo1837 = abstractC0561.mo1837(abstractC0394, c0396);
                i2 |= abstractC0561Mo1837 == abstractC0561 ? 0 : 1;
                AbstractC0561 abstractC05612 = AbstractC0561.f1249;
                if (abstractC0561Mo1837 == abstractC05612) {
                    return abstractC05612;
                }
                if (abstractC0561Mo1837 != null) {
                    arrayList.add(abstractC0561Mo1837);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ$Ԫ, reason: contains not printable characters */
    public static abstract class AbstractC0564 extends AbstractC0561 {
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static AbstractC0561 m1833(AbstractC0561 abstractC0561, AbstractC0561 abstractC05612) {
        AbstractC0561 abstractC05613;
        if (abstractC0561 == null || abstractC0561 == (abstractC05613 = f1249)) {
            return abstractC05612;
        }
        if (abstractC05612 == null || abstractC05612 == abstractC05613) {
            return abstractC0561;
        }
        C0562 c0562 = new C0562(abstractC0561, abstractC05612);
        AbstractC0561[] abstractC0561Arr = c0562.f1250;
        return abstractC0561Arr.length == 1 ? abstractC0561Arr[0] : c0562;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static List<C0565> m1834(Collection<? extends AbstractC0561> collection) {
        Iterator<? extends AbstractC0561> it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC0561 next = it.next();
            if (next instanceof C0565) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C0565) next);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static AbstractC0561 m1835(AbstractC0561 abstractC0561, AbstractC0561 abstractC05612) {
        if (abstractC0561 == null) {
            return abstractC05612;
        }
        if (abstractC05612 == null) {
            return abstractC0561;
        }
        AbstractC0561 abstractC05613 = f1249;
        AbstractC0561 abstractC05614 = abstractC05613;
        abstractC05614 = abstractC05613;
        if (abstractC0561 != abstractC05613 && abstractC05612 != abstractC05613) {
            C0563 c0563 = new C0563(abstractC0561, abstractC05612);
            AbstractC0561[] abstractC0561Arr = c0563.f1251;
            abstractC05614 = c0563;
            if (abstractC0561Arr.length == 1) {
                return abstractC0561Arr[0];
            }
        }
        return abstractC05614;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public abstract boolean mo1836(AbstractC0394<?, ?> abstractC0394, C0396 c0396);

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public AbstractC0561 mo1837(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
        return this;
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ$Ԭ, reason: contains not printable characters */
    public static class C0565 extends AbstractC0561 implements Comparable<C0565> {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public final int f1252;

        protected C0565() {
            this.f1252 = 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0565) {
                return this == obj || this.f1252 == ((C0565) obj).f1252;
            }
            return false;
        }

        public int hashCode() {
            return 31 + this.f1252;
        }

        public String toString() {
            return SOY.d("01") + this.f1252 + SOY.d("446F21041114076D");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: ԩ */
        public boolean mo1836(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            return abstractC0394.mo1488(c0396, this.f1252);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: Ԫ */
        public AbstractC0561 mo1837(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            if (abstractC0394.mo1488(c0396, this.f1252)) {
                return AbstractC0561.f1249;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compareTo(C0565 c0565) {
            return this.f1252 - c0565.f1252;
        }

        public C0565(int i) {
            this.f1252 = i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၶ$Ԯ, reason: contains not printable characters */
    public static class C0566 extends AbstractC0561 {

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public final int f1253;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        public final int f1254;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        public final boolean f1255;

        protected C0566() {
            this.f1253 = -1;
            this.f1254 = -1;
            this.f1255 = false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0566)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0566 c0566 = (C0566) obj;
            return this.f1253 == c0566.f1253 && this.f1254 == c0566.f1254 && this.f1255 == c0566.f1255;
        }

        public int hashCode() {
            return C0120.m406(C0120.m410(C0120.m410(C0120.m410(C0120.m408(), this.f1253), this.f1254), this.f1255 ? 1 : 0), 3);
        }

        public String toString() {
            return SOY.d("01") + this.f1253 + SOY.d("40") + this.f1254 + SOY.d("076D");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0561
        /* JADX INFO: renamed from: ԩ */
        public boolean mo1836(AbstractC0394<?, ?> abstractC0394, C0396 c0396) {
            if (!this.f1255) {
                c0396 = null;
            }
            return abstractC0394.m1533(c0396, this.f1253, this.f1254);
        }

        public C0566(int i, int i2, boolean z) {
            this.f1253 = i;
            this.f1254 = i2;
            this.f1255 = z;
        }
    }
}
