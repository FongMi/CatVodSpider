package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˢ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0153 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static volatile AbstractC0154 f364 = AbstractC0154.f368;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final StringBuffer f365;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final Object f366;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final AbstractC0154 f367;

    public C0153(Object obj) {
        this(obj, null, null);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static AbstractC0154 m483() {
        return f364;
    }

    public String toString() {
        if (m486() == null) {
            m487().append(m488().m543());
        } else {
            this.f367.m520(m487(), m486());
        }
        return m487().toString();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0153 m484(String str, Object obj) {
        this.f367.mo493(this.f365, str, obj, null);
        return this;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0153 m485(String str, boolean z) {
        this.f367.m494(this.f365, str, z);
        return this;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public Object m486() {
        return this.f366;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public StringBuffer m487() {
        return this.f365;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public AbstractC0154 m488() {
        return this.f367;
    }

    public C0153(Object obj, AbstractC0154 abstractC0154, StringBuffer stringBuffer) {
        abstractC0154 = abstractC0154 == null ? m483() : abstractC0154;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f365 = stringBuffer;
        this.f367 = abstractC0154;
        this.f366 = obj;
        abstractC0154.m527(stringBuffer, obj);
    }
}
