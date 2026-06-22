package com.github.catvod.spider.merge;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޣ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0328 implements InterfaceC0404, Serializable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected static final C0123<InterfaceC0400, InterfaceC0317> f855 = new C0123<>(null, null);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected int f856;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int f857;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected int f858;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected int f859;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected C0123<InterfaceC0400, InterfaceC0317> f860;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected String f861;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected int f862 = -1;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected int f863;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected int f864;

    public C0328(C0123<InterfaceC0400, InterfaceC0317> c0123, int i, int i2, int i3, int i4) {
        this.f858 = -1;
        this.f859 = 0;
        this.f860 = c0123;
        this.f856 = i;
        this.f859 = i2;
        this.f863 = i3;
        this.f864 = i4;
        InterfaceC0400 interfaceC0400 = c0123.f309;
        if (interfaceC0400 != null) {
            this.f857 = interfaceC0400.mo1467();
            this.f858 = c0123.f309.mo1465();
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    public int getChannel() {
        return this.f859;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    public int getType() {
        return this.f856;
    }

    public String toString() {
        return m1261(null);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public int mo1251() {
        return this.f858;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String mo1252() {
        int i;
        String str = this.f861;
        if (str != null) {
            return str;
        }
        InterfaceC0317 interfaceC0317M1257 = m1257();
        if (interfaceC0317M1257 == null) {
            return null;
        }
        int size = interfaceC0317M1257.size();
        int i2 = this.f863;
        return (i2 >= size || (i = this.f864) >= size) ? SOY.d("46171E304A") : interfaceC0317M1257.mo1227(C0125.m418(i2, i));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public int mo1253() {
        return this.f857;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public InterfaceC0400 mo1254() {
        return this.f860.f309;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0398
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public int mo1255() {
        return this.f862;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0404
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public void mo1256(int i) {
        this.f862 = i;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public InterfaceC0317 m1257() {
        return this.f860.f310;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public void m1258(int i) {
        this.f858 = i;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public void m1259(int i) {
        this.f857 = i;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public void m1260(String str) {
        this.f861 = str;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public String m1261(AbstractC0394 abstractC0394) {
        String str;
        if (this.f859 > 0) {
            str = SOY.d("563139171A191F3E6C") + this.f859;
        } else {
            str = "";
        }
        String strMo1252 = mo1252();
        String strReplace = strMo1252 != null ? strMo1252.replace(SOY.d("70"), SOY.d("263C")).replace(SOY.d("77"), SOY.d("2620")).replace(SOY.d("73"), SOY.d("2626")) : SOY.d("463C3E56001202266F");
        String strValueOf = String.valueOf(this.f856);
        if (abstractC0394 != null) {
            strValueOf = abstractC0394.mo1350().mo1543(this.f856);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("2112"));
        sb.append(mo1255());
        String strD = SOY.d("56");
        sb.append(strD);
        sb.append(this.f863);
        String strD2 = SOY.d("40");
        sb.append(strD2);
        sb.append(this.f864);
        sb.append(SOY.d("4775"));
        sb.append(strReplace);
        sb.append(SOY.d("5D7E6D"));
        sb.append(strValueOf);
        sb.append(SOY.d("44"));
        sb.append(str);
        sb.append(strD);
        sb.append(this.f857);
        sb.append(strD2);
        sb.append(mo1251());
        sb.append(SOY.d("27"));
        return sb.toString();
    }
}
