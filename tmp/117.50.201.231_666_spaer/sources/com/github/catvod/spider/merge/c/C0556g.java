package com.github.catvod.spider.merge.c;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0556g {
    private String key;
    private String name;
    private List<C0555f> value;

    public void a(String str) {
        this.key = str;
    }

    public void a(List<C0555f> list) {
        this.value = list;
    }

    public void b(String str) {
        this.name = str;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<C0555f> getValue() {
        return this.value;
    }
}
