package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʽ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0115<T> implements InterfaceC0119<T> {
    @Override // com.github.catvod.spider.merge.InterfaceC0119
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public T mo396(InterfaceC0375 interfaceC0375) {
        return m400();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0119
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public T mo397(InterfaceC0104 interfaceC0104) {
        return m400();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.catvod.spider.merge.InterfaceC0119
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public T mo398(InterfaceC0118 interfaceC0118) {
        T t = (T) m400();
        int iMo405 = interfaceC0118.mo405();
        for (int i = 0; i < iMo405 && m401(interfaceC0118, t); i++) {
            t = (T) m399(t, interfaceC0118.mo414(i).mo393(this));
        }
        return t;
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    protected T m399(T t, T t2) {
        return t2;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    protected T m400() {
        return null;
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    protected boolean m401(InterfaceC0118 interfaceC0118, T t) {
        return true;
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    public T m402(InterfaceC0122 interfaceC0122) {
        return (T) interfaceC0122.mo393(this);
    }
}
