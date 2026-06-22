package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʾ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0116 implements InterfaceC0104 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public InterfaceC0398 f306;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public InterfaceC0122 f307;

    public C0116(InterfaceC0398 interfaceC0398) {
        this.f306 = interfaceC0398;
    }

    public String toString() {
        return this.f306.getType() == -1 ? SOY.d("46171E304A") : this.f306.mo1252();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void mo403(C0396 c0396) {
        this.f307 = c0396;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String mo404() {
        return this.f306.mo1252();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0104
    /* JADX INFO: renamed from: ԩ */
    public InterfaceC0398 mo381() {
        return this.f306;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0122
    /* JADX INFO: renamed from: Ԫ */
    public <T> T mo393(InterfaceC0119<? extends T> interfaceC0119) {
        return interfaceC0119.mo397(this);
    }
}
