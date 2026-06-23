package com.github.catvod.spider.merge.FM.b;

import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.a.C0298a;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class r {
    public static String a(byte[] bArr, byte[] bArr2, C0274g c0274g, StringBuilder sb) {
        sb.append(c0274g.a(C0298a.b(bArr, bArr2)));
        return sb.toString();
    }

    public static String b(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C0298a.b(bArr, bArr2));
        sb.append(str);
        return sb.toString();
    }

    public static Iterator c(byte[] bArr, byte[] bArr2, com.github.catvod.spider.merge.FM.K.h hVar) {
        return hVar.o0(C0298a.b(bArr, bArr2)).iterator();
    }

    public static /* synthetic */ boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
