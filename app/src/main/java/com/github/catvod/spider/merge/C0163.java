package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˬ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0163 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private Object f403;

    public C0163(Object obj) {
        this.f403 = obj;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0163 m570(Object obj) {
        return new C0163(obj);
    }

    public String toString() {
        return m572();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0011 m571() {
        return (C0011) this.f403;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String m572() {
        if (m574()) {
            return (String) this.f403;
        }
        if (!m573()) {
            return String.valueOf(this.f403);
        }
        C0011 c0011 = (C0011) this.f403;
        return C0459.m1697(c0011.m203(), SOY.d("300A0E22312F2E")) ? c0011.m194() : c0011.toString();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m573() {
        return this.f403 instanceof C0011;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m574() {
        return this.f403 instanceof String;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public List<C0163> m575(String str) {
        if (m573()) {
            return new C0177(new C0455(m571())).m599(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0163 m576(String str) {
        List<C0163> listM575 = m575(str);
        if (listM575 == null || listM575.size() <= 0) {
            return null;
        }
        return listM575.get(0);
    }
}
