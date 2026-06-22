package com.github.catvod.spider.merge.f1;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class q2 implements PrivilegedAction<String> {
    final /* synthetic */ String a = "line.separator";

    q2() {
    }

    @Override // java.security.PrivilegedAction
    public final String run() {
        return System.getProperty(this.a);
    }
}
