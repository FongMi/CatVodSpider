package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class add extends aaf {
    public static final add d = new add(1, 0, 1);

    @Override // com.github.catvod.spider.merge.A0.aaf
    public final boolean equals(Object obj) {
        if (obj instanceof add) {
            if (!isEmpty() || !((add) obj).isEmpty()) {
                add addVar = (add) obj;
                if (this.a == addVar.a) {
                    if (this.b == addVar.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.aaf
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // com.github.catvod.spider.merge.A0.aaf
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // com.github.catvod.spider.merge.A0.aaf
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
