package com.github.catvod.spider.merge.j0;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1274a {
    private long a;
    private long b;
    private long c;
    private BlockingQueue<byte[]> e = new LinkedBlockingQueue();
    private long d = 0;

    public C1274a(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = (j2 - j) + 1;
    }

    public final boolean c() {
        return this.d >= this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.BlockingQueue<byte[]>, java.util.concurrent.LinkedBlockingQueue] */
    public final void d(byte[] bArr) throws InterruptedException {
        this.e.put(bArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.BlockingQueue<byte[]>, java.util.concurrent.LinkedBlockingQueue] */
    public final byte[] e() {
        byte[] bArr = (byte[]) this.e.poll(10, TimeUnit.SECONDS);
        this.d += (long) bArr.length;
        return bArr;
    }
}
