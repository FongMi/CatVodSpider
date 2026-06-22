package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class J2 {
    static final J2 a;

    static {
        J2 j2;
        String[] strArr = {"org.mozilla.javascript.VMBridge_custom", "org.mozilla.javascript.jdk18.VMBridge_jdk18"};
        for (int i = 0; i != 2; i++) {
            Class clsB = C1162n0.b(strArr[i]);
            if (clsB != null && (j2 = (J2) C1162n0.h(clsB)) != null) {
                a = j2;
                return;
            }
        }
        throw new IllegalStateException("Failed to create VMBridge instance");
    }

    protected abstract C1185v a();

    protected abstract Object b();

    protected abstract Object c();

    protected abstract Object d();

    protected abstract void e();

    protected abstract boolean f();
}
