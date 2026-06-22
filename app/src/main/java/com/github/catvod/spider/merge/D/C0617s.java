package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0617s implements com.github.catvod.spider.merge.C.w {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        String strL;
        boolean z;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 4) {
            strL = dVar.K();
            dVar.o(16);
        } else if (dVar.p() == 2) {
            Number numberI = dVar.i();
            dVar.o(16);
            strL = numberI.toString();
        } else {
            Object objO = bVar.o(null);
            if (objO instanceof String) {
                strL = (String) objO;
            } else {
                if (objO instanceof Collection) {
                    Collection collection = (Collection) objO;
                    Iterator it = collection.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if ((next instanceof String) && ((String) next).length() != 1) {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        throw new C1415d("can not cast to char[]");
                    }
                    char[] cArr = new char[collection.size()];
                    Iterator it2 = collection.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        cArr[i] = ((String) it2.next()).charAt(0);
                        i++;
                    }
                    return cArr;
                }
                if (objO == null) {
                    return null;
                }
                strL = AbstractC1412a.l(objO);
            }
        }
        return (T) strL.toCharArray();
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }
}
