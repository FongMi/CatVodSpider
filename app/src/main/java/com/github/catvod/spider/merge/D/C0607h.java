package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1413b;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0607h implements X, com.github.catvod.spider.merge.C.w {
    public static final C0607h a = new C0607h();

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.concurrent.atomic.AtomicLongArray] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.concurrent.atomic.AtomicIntegerArray] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        if (bVar.g.p() == 8) {
            bVar.g.o(16);
            return null;
        }
        C1413b c1413b = new C1413b();
        bVar.q(c1413b, null);
        int i = 0;
        if (type == AtomicIntegerArray.class) {
            ?? r4 = (T) new AtomicIntegerArray(c1413b.size());
            while (i < c1413b.size()) {
                r4.set(i, com.github.catvod.spider.merge.H.A.o(c1413b.get(i)).intValue());
                i++;
            }
            return r4;
        }
        ?? r42 = (T) new AtomicLongArray(c1413b.size());
        while (i < c1413b.size()) {
            r42.set(i, com.github.catvod.spider.merge.H.A.q(c1413b.get(i)).longValue());
            i++;
        }
        return r42;
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj instanceof AtomicInteger) {
            h0Var.q(((AtomicInteger) obj).get());
            return;
        }
        if (obj instanceof AtomicLong) {
            h0Var.r(((AtomicLong) obj).get());
            return;
        }
        if (obj instanceof AtomicBoolean) {
            h0Var.b(((AtomicBoolean) obj).get() ? "true" : "false");
            return;
        }
        if (obj == null) {
            h0Var.u(i0.WriteNullListAsEmpty);
            return;
        }
        int i2 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            int length = atomicIntegerArray.length();
            h0Var.write(91);
            while (i2 < length) {
                int i3 = atomicIntegerArray.get(i2);
                if (i2 != 0) {
                    h0Var.write(44);
                }
                h0Var.q(i3);
                i2++;
            }
            h0Var.write(93);
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        int length2 = atomicLongArray.length();
        h0Var.write(91);
        while (i2 < length2) {
            long j = atomicLongArray.get(i2);
            if (i2 != 0) {
                h0Var.write(44);
            }
            h0Var.r(j);
            i2++;
        }
        h0Var.write(93);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 14;
    }
}
