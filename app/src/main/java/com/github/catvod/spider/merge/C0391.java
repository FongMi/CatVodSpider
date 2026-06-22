package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡨ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0391 extends C0396 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public List<InterfaceC0122> f971;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public InterfaceC0398 f972;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public InterfaceC0398 f973;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0393 f974;

    public C0391() {
    }

    @Override // com.github.catvod.spider.merge.C0396, com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: ԫ */
    public InterfaceC0122 mo414(int i) {
        List<InterfaceC0122> list = this.f971;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.f971.get(i);
    }

    @Override // com.github.catvod.spider.merge.C0396, com.github.catvod.spider.merge.InterfaceC0117
    /* JADX INFO: renamed from: Ԭ */
    public int mo405() {
        List<InterfaceC0122> list = this.f971;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public <T extends InterfaceC0122> T m1513(T t) {
        if (this.f971 == null) {
            this.f971 = new ArrayList();
        }
        this.f971.add(t);
        return t;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public C0396 m1514(C0396 c0396) {
        return (C0396) m1513(c0396);
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public InterfaceC0104 m1515(InterfaceC0104 interfaceC0104) {
        interfaceC0104.mo403(this);
        return (InterfaceC0104) m1513(interfaceC0104);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public InterfaceC0375 m1516(InterfaceC0375 interfaceC0375) {
        interfaceC0375.mo403(this);
        return (InterfaceC0375) m1513(interfaceC0375);
    }

    /* JADX INFO: renamed from: ބ */
    public void mo1379(InterfaceC0189 interfaceC0189) {
    }

    /* JADX INFO: renamed from: ޅ */
    public void mo1380(InterfaceC0189 interfaceC0189) {
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public <T extends InterfaceC0122> T m1517(Class<? extends T> cls, int i) {
        List<InterfaceC0122> list = this.f971;
        if (list != null && i >= 0 && i < list.size()) {
            int i2 = -1;
            for (InterfaceC0122 interfaceC0122 : this.f971) {
                if (cls.isInstance(interfaceC0122) && (i2 = i2 + 1) == i) {
                    return cls.cast(interfaceC0122);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public C0391 m1518() {
        return (C0391) super.m1535();
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public <T extends C0391> T m1519(Class<? extends T> cls, int i) {
        return (T) m1517(cls, i);
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public <T extends C0391> List<T> m1520(Class<? extends T> cls) {
        List<InterfaceC0122> list = this.f971;
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        for (InterfaceC0122 interfaceC0122 : list) {
            if (cls.isInstance(interfaceC0122)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(interfaceC0122));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public InterfaceC0104 m1521(int i, int i2) {
        List<InterfaceC0122> list = this.f971;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            int i3 = -1;
            for (InterfaceC0122 interfaceC0122 : this.f971) {
                if (interfaceC0122 instanceof InterfaceC0104) {
                    InterfaceC0104 interfaceC0104 = (InterfaceC0104) interfaceC0122;
                    if (interfaceC0104.mo381().getType() == i && (i3 = i3 + 1) == i2) {
                        return interfaceC0104;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public void m1522() {
        List<InterfaceC0122> list = this.f971;
        if (list != null) {
            list.remove(list.size() - 1);
        }
    }

    public C0391(C0391 c0391, int i) {
        super(c0391, i);
    }
}
