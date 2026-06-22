package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class I extends P {
    private String d;

    I() {
        this.a = 5;
    }

    @Override // com.github.catvod.spider.merge.d1.P
    final P h() {
        super.h();
        this.d = null;
        return this;
    }

    final I k(String str) {
        this.d = str;
        return this;
    }

    final String l() {
        return this.d;
    }

    public String toString() {
        return this.d;
    }
}
