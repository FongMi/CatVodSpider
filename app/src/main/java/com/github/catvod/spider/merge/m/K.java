package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class K extends M {
    public K() {
        this.a = 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("</");
        String str = this.b;
        if (str == null) {
            str = "[unset]";
        }
        return com.github.catvod.spider.merge.A.T.h(sb, str, ">");
    }
}
