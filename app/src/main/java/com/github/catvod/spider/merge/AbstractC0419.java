package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢰ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0419 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final List<String> f1040 = Collections.unmodifiableList(Arrays.asList(SOY.d("331C0737383E3E"), SOY.d("3813023F37"), SOY.d("28071D332B242E130322"), SOY.d("381E1E353F282906102420"), SOY.d("2A1E04252B35361D123D2B242E130322"), SOY.d("290610242B35361D123D2B242E130322"), SOY.d("2E1D1A333A282906102420"), SOY.d("28071D332B242E1D01"), SOY.d("381E1E353F283F1C15"), SOY.d("290610242B3B351D012936363919"), SOY.d("290610242B3B351D012931392E0008"), SOY.d("2A1E04252B3B351D012936363919"), SOY.d("361D1E262B323416")));

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public int f1043;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0245 f1046;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0405 f1041 = null;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public int f1042 = -1;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean f1044 = false;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected final List<AbstractC0573> f1045 = new ArrayList(4);

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC0419) && this.f1042 == ((AbstractC0419) obj).f1042;
    }

    public int hashCode() {
        return this.f1042;
    }

    public String toString() {
        return String.valueOf(this.f1042);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void m1594(int i, AbstractC0573 abstractC0573) {
        boolean z = true;
        if (this.f1045.isEmpty()) {
            this.f1044 = abstractC0573.mo1604();
        } else if (this.f1044 != abstractC0573.mo1604()) {
            System.err.format(Locale.getDefault(), SOY.d("3B061F5607031B26345651135A3A30055415152639561107093B3D191A571B3C35561A18147F3406071E163D3F5600051B3C221F001E153C22587E"), Integer.valueOf(this.f1042));
            this.f1044 = false;
        }
        Iterator<AbstractC0573> it = this.f1045.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AbstractC0573 next = it.next();
            if (next.f1263.f1042 == abstractC0573.f1263.f1042 && ((next.mo1610() != null && abstractC0573.mo1610() != null && next.mo1610().equals(abstractC0573.mo1610())) || (next.mo1604() && abstractC0573.mo1604()))) {
                break;
            }
        }
        if (z) {
            return;
        }
        this.f1045.add(i, abstractC0573);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public void m1595(AbstractC0573 abstractC0573) {
        m1594(this.f1045.size(), abstractC0573);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public int m1596() {
        return this.f1045.size();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public abstract int mo1597();

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final boolean m1598() {
        return this.f1044;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public AbstractC0573 m1599(int i) {
        return this.f1045.remove(i);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public void m1600(int i, AbstractC0573 abstractC0573) {
        this.f1045.set(i, abstractC0573);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public AbstractC0573 m1601(int i) {
        return this.f1045.get(i);
    }
}
