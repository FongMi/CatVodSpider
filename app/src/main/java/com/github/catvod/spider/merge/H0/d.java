package com.github.catvod.spider.merge.H0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class d implements Iterable<String> {
    private final HashMap<String, String> b = new HashMap<>();
    private final ArrayList<c> c = new ArrayList<>();

    public d(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    this.b.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    public final void a(o oVar) {
        Iterator<c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            oVar.b("Set-Cookie", String.format("%s=%s; expires=%s", null, null, null));
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.keySet().iterator();
    }
}
