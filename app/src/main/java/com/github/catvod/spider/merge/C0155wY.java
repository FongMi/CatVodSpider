package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.github.catvod.spider.merge.wY */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0155wY implements InterfaceC0130m {

    /* renamed from: q */
    boolean f753q = false;

    /* renamed from: xC */
    final Map<String, C0066IM> f754xC = new HashMap();

    /* renamed from: QU */
    final LinkedBlockingQueue<C0158xt> f752QU = new LinkedBlockingQueue<>();

    /* renamed from: QU */
    public LinkedBlockingQueue<C0158xt> m740QU() {
        return this.f752QU;
    }

    /* renamed from: UJ */
    public List<C0066IM> m741UJ() {
        return new ArrayList(this.f754xC.values());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0130m
    /* renamed from: q */
    public synchronized InterfaceC0098V1 mo417q(String str) {
        C0066IM c0066im;
        c0066im = this.f754xC.get(str);
        if (c0066im == null) {
            c0066im = new C0066IM(str, this.f752QU, this.f753q);
            this.f754xC.put(str, c0066im);
        }
        return c0066im;
    }

    /* renamed from: u */
    public void m742u() {
        this.f753q = true;
    }

    /* renamed from: xC */
    public void m743xC() {
        this.f754xC.clear();
        this.f752QU.clear();
    }
}
