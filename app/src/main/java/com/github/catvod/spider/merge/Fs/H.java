package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class H extends O {
    private String b;

    H() {
        this.a = 5;
    }

    @Override // com.github.catvod.spider.merge.Fs.O
    final O g() {
        this.b = null;
        return this;
    }

    final H i(String str) {
        this.b = str;
        return this;
    }

    final String j() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}
