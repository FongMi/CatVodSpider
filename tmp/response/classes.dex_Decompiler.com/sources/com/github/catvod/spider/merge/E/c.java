package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class c extends i {
    c() {
        H();
        J();
        y(oZP.d("0E"));
        x(oZP.d("08"));
        w();
        v();
        A(oZP.d("59"));
        z();
        C();
        G();
        F();
        E();
        D();
    }

    @Override // com.github.catvod.spider.merge.E.i
    public final void a(StringBuffer stringBuffer, Object obj) {
        super.a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.merge.E.i
    protected final void c(StringBuffer stringBuffer, char c) {
        String strValueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(com.github.catvod.spider.merge.D.g.a(strValueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.merge.E.i
    protected final void e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            l(stringBuffer);
            return;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            String string = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(com.github.catvod.spider.merge.D.g.a(string));
            stringBuffer.append('\"');
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            stringBuffer.append(obj);
            return;
        }
        String string2 = obj.toString();
        boolean z = false;
        if (!(string2.startsWith(r()) && string2.endsWith(q()))) {
            if (string2.startsWith(p()) && string2.endsWith(o())) {
                z = true;
            }
            if (!z) {
                e(stringBuffer, str, string2);
                return;
            }
        }
        stringBuffer.append(obj);
    }

    @Override // com.github.catvod.spider.merge.E.i
    protected final void f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(p());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            d(stringBuffer, str, i, it.next());
            i++;
        }
        stringBuffer.append(o());
    }

    @Override // com.github.catvod.spider.merge.E.i
    protected final void g(StringBuffer stringBuffer, Map map) {
        if (map == null || map.isEmpty()) {
            stringBuffer.append(map);
            return;
        }
        stringBuffer.append(r());
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String string = key != null ? key.toString() : null;
            if (string != null) {
                if (z) {
                    z = false;
                } else {
                    i(stringBuffer);
                }
                j(stringBuffer, string);
                Object value = entry.getValue();
                if (value == null) {
                    l(stringBuffer);
                } else {
                    k(stringBuffer, string, value, true);
                }
            }
        }
        stringBuffer.append(q());
    }

    @Override // com.github.catvod.spider.merge.E.i
    protected final void j(StringBuffer stringBuffer, String str) {
        String strD = oZP.d("57");
        StringBuilder sbC = C0133t.c(strD);
        sbC.append(com.github.catvod.spider.merge.D.g.a(str));
        sbC.append(strD);
        super.j(stringBuffer, sbC.toString());
    }
}
