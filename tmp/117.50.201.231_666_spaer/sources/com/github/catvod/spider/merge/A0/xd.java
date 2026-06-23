package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class xd {

    @ni("class")
    private List<sm> i;

    @ni("list")
    private List<wo> j;

    @ni("filters")
    private LinkedHashMap<String, List<ax>> k;

    @ni("header")
    private String l;

    @ni("format")
    private String m;

    @ni("danmaku")
    private List<Object> n;

    @ni("click")
    private String o;

    @ni("msg")
    private String p;

    @ni("url")
    private Object q;

    @ni("subs")
    private List<dg> r;

    @ni("parse")
    private int s;

    @ni("jx")
    private int t;

    @ni("page")
    private Integer u;

    @ni("pagecount")
    private Integer v;

    @ni("limit")
    private Integer w;

    @ni("total")
    private Integer x;

    public static String a(wo woVar) {
        xd xdVar = new xd();
        xdVar.j = Arrays.asList(woVar);
        return xdVar.toString();
    }

    public static String b(ArrayList arrayList) {
        xd xdVar = new xd();
        xdVar.j = arrayList;
        return xdVar.toString();
    }

    public static String c(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        xd xdVar = new xd();
        xdVar.i = arrayList;
        xdVar.k = linkedHashMap;
        return xdVar.toString();
    }

    public final void d(HashMap map) {
        if (map.isEmpty()) {
            return;
        }
        this.l = new oa().ad(map);
    }

    public final void e() {
        this.u = 1;
        this.w = Integer.MAX_VALUE;
        this.x = 1;
        this.v = 1;
    }

    public final void f(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final void g(String str) {
        this.q = str;
    }

    public final void h(ArrayList arrayList) {
        this.j = arrayList;
    }

    public final String toString() {
        mf mfVar = new mf(new oa());
        mfVar.i = false;
        return mfVar.o().ad(this);
    }
}
