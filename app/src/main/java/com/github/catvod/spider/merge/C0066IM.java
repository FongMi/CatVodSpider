package com.github.catvod.spider.merge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* renamed from: com.github.catvod.spider.merge.IM */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0066IM implements InterfaceC0098V1 {

    /* renamed from: Mo */
    private final boolean f423Mo;

    /* renamed from: QU */
    private Boolean f424QU;

    /* renamed from: UJ */
    private Method f425UJ;

    /* renamed from: q */
    private final String f426q;

    /* renamed from: u */
    private Queue<C0158xt> f427u;

    /* renamed from: xC */
    private volatile InterfaceC0098V1 f428xC;

    public C0066IM(String str, Queue<C0158xt> queue, boolean z) {
        this.f426q = str;
        this.f427u = queue;
        this.f423Mo = z;
    }

    /* renamed from: QU */
    public boolean m225QU() {
        return this.f428xC == null;
    }

    /* renamed from: UJ */
    public void m226UJ(InterfaceC0142rZ interfaceC0142rZ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (m227q()) {
            try {
                this.f425UJ.invoke(this.f428xC, interfaceC0142rZ);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0066IM.class == obj.getClass() && this.f426q.equals(((C0066IM) obj).f426q);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0098V1
    public String getName() {
        return this.f426q;
    }

    public int hashCode() {
        return this.f426q.hashCode();
    }

    /* renamed from: q */
    public boolean m227q() {
        Boolean bool = this.f424QU;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f425UJ = this.f428xC.getClass().getMethod("log", InterfaceC0142rZ.class);
            this.f424QU = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f424QU = Boolean.FALSE;
        }
        return this.f424QU.booleanValue();
    }

    /* renamed from: u */
    public void m228u(InterfaceC0098V1 interfaceC0098V1) {
        this.f428xC = interfaceC0098V1;
    }

    /* renamed from: xC */
    public boolean m229xC() {
        return this.f428xC instanceof C0102Xv;
    }
}
