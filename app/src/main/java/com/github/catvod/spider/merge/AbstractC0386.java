package com.github.catvod.spider.merge;

import java.util.EmptyStackException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡤ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0386 extends AbstractC0394<Integer, C0441> implements InterfaceC0400 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public InterfaceC0317 f943;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected C0123<InterfaceC0400, InterfaceC0317> f944;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public InterfaceC0398 f946;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public int f948;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public int f949;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public boolean f950;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public int f951;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public int f952;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public String f955;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected InterfaceC0399<?> f945 = C0329.f865;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int f947 = -1;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public final C0124 f953 = new C0124();

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public int f954 = 0;

    public AbstractC0386(InterfaceC0317 interfaceC0317) {
        this.f943 = interfaceC0317;
        this.f944 = new C0123<>(this, interfaceC0317);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0400
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public int mo1465() {
        return m1531().m1652();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0400
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public InterfaceC0317 mo1466() {
        return this.f943;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0400
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public int mo1467() {
        return m1531().m1655();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0400
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public InterfaceC0399<? extends InterfaceC0398> mo1468() {
        return this.f945;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0400
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public InterfaceC0398 mo1469() {
        InterfaceC0398 interfaceC0398;
        int iM1658;
        int i;
        InterfaceC0317 interfaceC0317 = this.f943;
        if (interfaceC0317 == null) {
            throw new IllegalStateException(SOY.d("14372902201811373F5606120B27380411045A3371181B19573C241A1857133C2103005709262313151A54"));
        }
        int iMo1209 = interfaceC0317.mo1209();
        while (true) {
            try {
                if (this.f950) {
                    m1472();
                    interfaceC0398 = this.f946;
                    break;
                }
                this.f946 = null;
                this.f951 = 0;
                this.f947 = this.f943.mo1215();
                this.f949 = m1531().m1652();
                this.f948 = m1531().m1655();
                this.f955 = null;
                do {
                    this.f952 = 0;
                    try {
                        iM1658 = m1531().m1658(this.f943, this.f954);
                    } catch (C0387 e) {
                        m1478(e);
                        m1481(e);
                        iM1658 = -3;
                    }
                    if (this.f943.mo1214(1) == -1) {
                        this.f950 = true;
                    }
                    if (this.f952 == 0) {
                        this.f952 = iM1658;
                    }
                    i = this.f952;
                    if (i == -3) {
                        break;
                    }
                } while (i == -2);
                if (this.f946 == null) {
                    m1470();
                }
                interfaceC0398 = this.f946;
            } finally {
                this.f943.mo1218(iMo1209);
            }
        }
        return interfaceC0398;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public InterfaceC0398 m1470() {
        InterfaceC0398 interfaceC0398Mo1262 = this.f945.mo1262(this.f944, this.f952, this.f955, this.f951, this.f947, m1473() - 1, this.f948, this.f949);
        m1471(interfaceC0398Mo1262);
        return interfaceC0398Mo1262;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public void m1471(InterfaceC0398 interfaceC0398) {
        this.f946 = interfaceC0398;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public InterfaceC0398 m1472() {
        InterfaceC0398 interfaceC0398Mo1262 = this.f945.mo1262(this.f944, -1, null, 0, this.f943.mo1215(), this.f943.mo1215() - 1, mo1467(), mo1465());
        m1471(interfaceC0398Mo1262);
        return interfaceC0398Mo1262;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public int m1473() {
        return this.f943.mo1215();
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public String m1474(int i) {
        return i != -1 ? i != 13 ? i != 9 ? i != 10 ? String.valueOf((char) i) : SOY.d("263C") : SOY.d("2626") : SOY.d("2620") : SOY.d("46171E304A");
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public String m1475(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(m1474(c));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public void m1476(int i) {
        this.f954 = i;
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    public void m1477() {
        this.f952 = -2;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    public void m1478(C0387 c0387) {
        InterfaceC0317 interfaceC0317 = this.f943;
        m1529().mo1202(this, null, this.f948, this.f949, SOY.d("0E3D3A131A57083732191319132638191A571F20231906571B266B5653") + m1475(interfaceC0317.mo1227(C0125.m418(this.f947, interfaceC0317.mo1215()))) + SOY.d("5D"), c0387);
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    public int m1479() {
        if (this.f953.m1616()) {
            throw new EmptyStackException();
        }
        m1476(this.f953.m416());
        return this.f954;
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    public void m1480(int i) {
        this.f953.m417(this.f954);
        m1476(i);
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    public void m1481(C0387 c0387) {
        if (this.f943.mo1214(1) != -1) {
            m1531().m1648(this.f943);
        }
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    public void m1482(int i) {
        this.f951 = i;
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    public void m1483(int i) {
        this.f952 = i;
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    public void m1484() {
        this.f952 = -3;
    }
}
