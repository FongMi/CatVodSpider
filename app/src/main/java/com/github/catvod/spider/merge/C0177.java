package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.т, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0177 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private C0455 f433;

    public C0177(C0455 c0455) {
        this.f433 = c0455;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0177 m598(String str) {
        return new C0177(C0243.m884(str).m179());
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public List<C0163> m599(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C0338 c0338 = new C0338(new C0330(new C0457(C0318.m1228(str))));
            c0338.m1507(new C0194());
            C0367 c0367M402 = new C0258(this.f433).m402(c0338.m1362());
            if (c0367M402.m1434()) {
                Iterator<C0011> it = c0367M402.m1424().iterator();
                while (it.hasNext()) {
                    linkedList.add(C0163.m570(it.next()));
                }
                return linkedList;
            }
            if (c0367M402.m1436()) {
                Iterator<String> it2 = c0367M402.m1425().iterator();
                while (it2.hasNext()) {
                    linkedList.add(C0163.m570(it2.next()));
                }
                return linkedList;
            }
            if (c0367M402.m1438()) {
                linkedList.add(C0163.m570(c0367M402.m1427()));
                return linkedList;
            }
            if (c0367M402.m1437()) {
                linkedList.add(C0163.m570(c0367M402.m1423()));
                return linkedList;
            }
            if (c0367M402.m1432()) {
                linkedList.add(C0163.m570(c0367M402.m1421()));
                return linkedList;
            }
            if (c0367M402.m1433()) {
                linkedList.add(C0163.m570(c0367M402.m1422()));
                return linkedList;
            }
            linkedList.add(C0163.m570(c0367M402.m1427()));
            return linkedList;
        } catch (Exception e) {
            throw new C0253(SOY.d("2A3E341707125A313913171C5A2639135404033C25170C571534710F1B020872290615031272340E04055A3D23561718173F380254165A") + C0103.m377(e), e);
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0163 m600(String str) {
        List<C0163> listM599 = m599(str);
        if (listM599 == null || listM599.size() <= 0) {
            return null;
        }
        return listM599.get(0);
    }
}
