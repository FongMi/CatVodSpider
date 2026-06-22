package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.oZP;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class d {
    public static void a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new i(oZP.d("1A0D1D240F21"), new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
