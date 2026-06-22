package com.github.catvod.spider.merge.f1;

import java.util.Iterator;
import java.util.concurrent.locks.StampedLock;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class z2 extends u2 {
    private final StampedLock c;

    z2() {
        super(10);
        this.c = new StampedLock();
    }

    z2(int i) {
        super(0);
        this.c = new StampedLock();
    }

    @Override // com.github.catvod.spider.merge.f1.u2
    protected final void a() {
        super.a();
    }

    @Override // com.github.catvod.spider.merge.f1.u2
    public final int b() {
        return this.b.size();
    }

    @Override // com.github.catvod.spider.merge.f1.u2
    public final long c() {
        return this.c.readLock();
    }

    @Override // com.github.catvod.spider.merge.f1.u2
    public final void d(long j) {
        this.c.unlockRead(j);
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final void f(Object obj, int i) {
        long jWriteLock = this.c.writeLock();
        try {
            this.b.f(obj, i);
        } finally {
            this.c.unlockWrite(jWriteLock);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final s2 i(Object obj, int i, int i2) {
        long jWriteLock = this.c.writeLock();
        try {
            super.a();
            return this.b.i(obj, i, i2);
        } finally {
            this.c.unlockWrite(jWriteLock);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final boolean isEmpty() {
        long jTryOptimisticRead = this.c.tryOptimisticRead();
        boolean zIsEmpty = this.b.isEmpty();
        if (this.c.validate(jTryOptimisticRead)) {
            return zIsEmpty;
        }
        long lock = this.c.readLock();
        try {
            return this.b.isEmpty();
        } finally {
            this.c.unlockRead(lock);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.u2, java.lang.Iterable
    public final Iterator<s2> iterator() {
        return this.b.iterator();
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final s2 r(Object obj, int i) {
        long jTryOptimisticRead = this.c.tryOptimisticRead();
        s2 s2VarR = this.b.r(obj, i);
        if (this.c.validate(jTryOptimisticRead)) {
            return s2VarR;
        }
        long lock = this.c.readLock();
        try {
            return this.b.r(obj, i);
        } finally {
            this.c.unlockRead(lock);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final int size() {
        long jTryOptimisticRead = this.c.tryOptimisticRead();
        int size = this.b.size();
        if (this.c.validate(jTryOptimisticRead)) {
            return size;
        }
        long lock = this.c.readLock();
        try {
            return this.b.size();
        } finally {
            this.c.unlockRead(lock);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.u2, com.github.catvod.spider.merge.f1.t2
    public final void y(s2 s2Var, s2 s2Var2) {
        long jWriteLock = this.c.writeLock();
        try {
            this.b.y(s2Var, s2Var2);
        } finally {
            this.c.unlockWrite(jWriteLock);
        }
    }
}
