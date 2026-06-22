package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʟ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0100 implements InterfaceC0014 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    boolean f266 = false;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    final Map<String, C0250> f267 = new HashMap();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    final LinkedBlockingQueue<C0443> f268 = new LinkedBlockingQueue<>();

    @Override // com.github.catvod.spider.merge.InterfaceC0014
    /* JADX INFO: renamed from: Ϳ */
    public synchronized InterfaceC0465 mo210(String str) {
        C0250 c0250;
        c0250 = this.f267.get(str);
        if (c0250 == null) {
            c0250 = new C0250(str, this.f268, this.f266);
            this.f267.put(str, c0250);
        }
        return c0250;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public void m359() {
        this.f267.clear();
        this.f268.clear();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public LinkedBlockingQueue<C0443> m360() {
        return this.f268;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public List<C0250> m361() {
        return new ArrayList(this.f267.values());
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public void m362() {
        this.f266 = true;
    }
}
