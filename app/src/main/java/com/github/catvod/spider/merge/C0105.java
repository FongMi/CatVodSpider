package com.github.catvod.spider.merge;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʴ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0105 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0106 f281 = new C0106();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ʴ$Ϳ, reason: contains not printable characters */
    public static class C0106 implements Serializable {
        C0106() {
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static void m382(StringBuffer stringBuffer, Object obj) {
        C0164.m578(obj, SOY.d("15303B131703"), new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(stringBuffer.length() + name.length() + 1 + hexString.length());
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
