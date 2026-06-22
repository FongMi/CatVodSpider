package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0418;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0394<Symbol, ATNInterpreter extends AbstractC0418> {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected ATNInterpreter f982;

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private List<InterfaceC0313> f981 = new C0395();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private int f983 = -1;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢠ$Ϳ, reason: contains not printable characters */
    class C0395 extends CopyOnWriteArrayList<InterfaceC0313> {
        C0395() {
            add(C0331.f868);
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public void m1528(C0396 c0396, int i, int i2) {
    }

    /* JADX INFO: renamed from: ԭ */
    public abstract C0405 mo1348();

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public InterfaceC0313 m1529() {
        return new C0392(m1530());
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public List<? extends InterfaceC0313> m1530() {
        return this.f981;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public ATNInterpreter m1531() {
        return this.f982;
    }

    /* JADX INFO: renamed from: ؠ */
    public abstract String[] mo1349();

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public final int m1532() {
        return this.f983;
    }

    /* JADX INFO: renamed from: ށ */
    public abstract InterfaceC0402 mo1350();

    /* JADX INFO: renamed from: ނ */
    public boolean mo1488(C0396 c0396, int i) {
        return true;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public boolean m1533(C0396 c0396, int i, int i2) {
        return true;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public final void m1534(int i) {
        this.f983 = i;
    }
}
