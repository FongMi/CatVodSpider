package com.github.catvod.spider.merge.y;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class S extends T {
    private final String f;

    public S(String str) {
        this.f = str;
        e();
        f();
    }

    @Override // com.github.catvod.spider.merge.y.T
    protected final void b() {
        char cCharAt;
        int i = this.c;
        do {
            i++;
            if (i >= this.f.length() || (cCharAt = this.f.charAt(i)) == '\\') {
                while (true) {
                    e();
                    char c = this.d;
                    if (c == '\\') {
                        e();
                        if (this.d == 'u') {
                            e();
                            e();
                            e();
                            e();
                        }
                    } else if (c == '\"') {
                        e();
                        return;
                    } else if (this.b) {
                        return;
                    }
                }
            }
        } while (cCharAt != '\"');
        int i2 = i + 1;
        this.d = this.f.charAt(i2);
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.y.T
    final void e() {
        int i = this.c + 1;
        this.c = i;
        if (i < this.f.length()) {
            this.d = this.f.charAt(this.c);
        } else {
            this.d = (char) 0;
            this.b = true;
        }
    }
}
