package com.github.catvod.spider.merge.VE;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d {
    public static void a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new i(ZrJ.d("162121282B31"), new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
