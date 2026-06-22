package com.github.catvod.spider.merge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ڎ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0250 implements InterfaceC0465 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final String f635;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private volatile InterfaceC0465 f636;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private Boolean f637;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private Method f638;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private C0251 f639;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private Queue<C0443> f640;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final boolean f641;

    public C0250(String str, Queue<C0443> queue, boolean z) {
        this.f635 = str;
        this.f640 = queue;
        this.f641 = z;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private InterfaceC0465 m905() {
        if (this.f639 == null) {
            this.f639 = new C0251(this, this.f640);
        }
        return this.f639;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0250.class == obj.getClass() && this.f635.equals(((C0250) obj).f635);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0465
    public String getName() {
        return this.f635;
    }

    public int hashCode() {
        return this.f635.hashCode();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0465
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void mo906(String str, Throwable th) {
        m907().mo906(str, th);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    InterfaceC0465 m907() {
        return this.f636 != null ? this.f636 : this.f641 ? C0381.f937 : m905();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m908() {
        Boolean bool = this.f637;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f638 = this.f636.getClass().getMethod(SOY.d("163D36"), InterfaceC0433.class);
            this.f637 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f637 = Boolean.FALSE;
        }
        return this.f637.booleanValue();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m909() {
        return this.f636 instanceof C0381;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public boolean m910() {
        return this.f636 == null;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public void m911(InterfaceC0433 interfaceC0433) {
        if (m908()) {
            try {
                this.f638.invoke(this.f636, interfaceC0433);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public void m912(InterfaceC0465 interfaceC0465) {
        this.f636 = interfaceC0465;
    }
}
