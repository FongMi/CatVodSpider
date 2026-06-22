package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0396 implements InterfaceC0118 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0391 f985 = new C0391();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0396 f986;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public int f987;

    public C0396() {
        this.f987 = -1;
    }

    public String toString() {
        return m1538(null, null);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: Ԩ */
    public String mo404() {
        if (mo405() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo405(); i++) {
            sb.append(mo414(i).mo404());
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: Ԫ */
    public <T> T mo393(InterfaceC0119<? extends T> interfaceC0119) {
        return interfaceC0119.mo398(this);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: ԫ */
    public InterfaceC0122 mo414(int i) {
        return null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0117
    /* JADX INFO: renamed from: Ԭ */
    public int mo405() {
        return 0;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public C0396 m1535() {
        return this.f986;
    }

    /* JADX INFO: renamed from: Ԯ */
    public int mo1378() {
        return -1;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public boolean m1536() {
        return this.f987 == -1;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public void m1537(int i) {
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public String m1538(List<String> list, C0396 c0396) {
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("21"));
        for (C0396 c03962 = this; c03962 != null && c03962 != c0396; c03962 = c03962.f986) {
            if (list != null) {
                int iMo1378 = c03962.mo1378();
                sb.append((iMo1378 < 0 || iMo1378 >= list.size()) ? Integer.toString(iMo1378) : list.get(iMo1378));
            } else if (!c03962.m1536()) {
                sb.append(c03962.f987);
            }
            C0396 c03963 = c03962.f986;
            if (c03963 != null && (list != null || !c03963.m1536())) {
                sb.append(SOY.d("5A"));
            }
        }
        sb.append(SOY.d("27"));
        return sb.toString();
    }

    public C0396(C0396 c0396, int i) {
        this.f987 = -1;
        this.f986 = c0396;
        this.f987 = i;
    }
}
