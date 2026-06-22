package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
class I extends Q {
    private String d;

    I() {
        this.a = 5;
    }

    @Override // com.github.catvod.spider.merge.M.Q
    final Q h() {
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
