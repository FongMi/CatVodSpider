package com.github.catvod.spider.merge.FM.D;

import com.github.catvod.spider.merge.FM.L.P;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class c extends i {
    c() {
        H();
        J();
        y("{");
        x("}");
        w();
        v();
        A(",");
        z();
        C();
        G();
        F();
        E();
        D();
    }

    @Override // com.github.catvod.spider.merge.FM.D.i
    public final void a(StringBuffer stringBuffer, Object obj) {
        super.a(stringBuffer, obj);
    }

    @Override // com.github.catvod.spider.merge.FM.D.i
    protected final void c(StringBuffer stringBuffer, char c) {
        String strValueOf = String.valueOf(c);
        stringBuffer.append('\"');
        stringBuffer.append(com.github.catvod.spider.merge.FM.C.g.a(strValueOf));
        stringBuffer.append('\"');
    }

    @Override // com.github.catvod.spider.merge.FM.D.i
    protected final void e(StringBuffer stringBuffer, String str, Object obj) {
        if (obj == null) {
            l(stringBuffer);
            return;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            String string = obj.toString();
            stringBuffer.append('\"');
            stringBuffer.append(com.github.catvod.spider.merge.FM.C.g.a(string));
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

    @Override // com.github.catvod.spider.merge.FM.D.i
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

    @Override // com.github.catvod.spider.merge.FM.D.i
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

    @Override // com.github.catvod.spider.merge.FM.D.i
    protected final void j(StringBuffer stringBuffer, String str) {
        StringBuilder sbB = P.b("\"");
        sbB.append(com.github.catvod.spider.merge.FM.C.g.a(str));
        sbB.append("\"");
        super.j(stringBuffer, sbB.toString());
    }
}
