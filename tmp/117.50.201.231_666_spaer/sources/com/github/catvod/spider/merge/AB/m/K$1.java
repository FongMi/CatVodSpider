package com.github.catvod.spider.merge.AB.m;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class K$1 implements Comparable<K$1> {
    public String a;
    public String b;
    public String c;
    public String d;

    public K$1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // java.lang.Comparable
    public int compareTo(K$1 k$1) {
        if (this.a.equals(this.d)) {
            return -1;
        }
        return k$1.a.equals(this.d) ? 1 : 0;
    }
}
