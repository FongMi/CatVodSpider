package com.github.catvod.spider.merge.A0;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class oj {
    public static em a(String str) {
        uz uzVar;
        zl zlVar = new zl();
        StringReader stringReader = new StringReader(str);
        xa xaVar = new xa(zlVar);
        em emVar = new em("http://www.w3.org/1999/xhtml", "");
        zlVar.n = emVar;
        emVar.al = xaVar;
        zlVar.k = xaVar;
        zlVar.r = vz.a;
        sf sfVar = new sf(stringReader);
        zlVar.l = sfVar;
        ((kx) xaVar.d).getClass();
        sfVar.l = null;
        zlVar.m = new hm(zlVar);
        zlVar.o = new ArrayList(32);
        zlVar.s = new HashMap();
        w wVar = new w(2, zlVar);
        zlVar.t = wVar;
        zlVar.q = wVar;
        zlVar.p = "";
        zlVar.v = le.c;
        zlVar.w = null;
        zlVar.x = false;
        zlVar.y = null;
        zlVar.z = null;
        zlVar.aa = new ArrayList();
        zlVar.ab = new ArrayList();
        zlVar.ac = new ArrayList();
        zlVar.ad = new um(3, zlVar);
        zlVar.ae = true;
        zlVar.af = false;
        while (true) {
            if (zlVar.q.g == 6) {
                ArrayList arrayList = zlVar.o;
                if (arrayList == null) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    zlVar.o = null;
                } else {
                    zlVar.bm();
                }
            } else {
                hm hmVar = zlVar.m;
                while (!hmVar.g) {
                    hmVar.e.a(hmVar, hmVar.c);
                }
                StringBuilder sb = hmVar.i;
                int length = sb.length();
                im imVar = hmVar.n;
                if (length != 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    imVar.b = string;
                    hmVar.h = null;
                    uzVar = imVar;
                } else {
                    String str2 = hmVar.h;
                    if (str2 != null) {
                        imVar.b = str2;
                        hmVar.h = null;
                        uzVar = imVar;
                    } else {
                        hmVar.g = false;
                        uzVar = hmVar.f;
                    }
                }
                zlVar.q = uzVar;
                zlVar.bp(uzVar);
                uzVar.a();
            }
        }
        sf sfVar2 = zlVar.l;
        if (sfVar2 != null) {
            sfVar2.s();
            zlVar.l = null;
            zlVar.m = null;
            zlVar.o = null;
            zlVar.s = null;
        }
        return zlVar.n;
    }
}
