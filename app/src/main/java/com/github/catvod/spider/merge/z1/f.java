package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f {
    public static List<C1311c> a(String str, com.github.catvod.spider.merge.D0.e eVar) {
        com.github.catvod.spider.merge.D0.c cVarB = eVar.b("avatars");
        if (!m.k(cVarB)) {
            return (List) cVarB.stream().filter(new d(com.github.catvod.spider.merge.D0.e.class, 0)).map(new b(com.github.catvod.spider.merge.D0.e.class, 0)).filter(new Predicate() { // from class: com.github.catvod.spider.merge.z1.e
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !m.j(((com.github.catvod.spider.merge.D0.e) obj).i("path", null));
                }
            }).map(new c(str, 0)).collect(Collectors.toList());
        }
        com.github.catvod.spider.merge.D0.e eVarG = eVar.g("avatar");
        String strI = eVarG.i("path", null);
        if (m.j(strI)) {
            return Collections.emptyList();
        }
        Object[] objArr = {new C1311c(C1290c.a(str, strI), -1, eVarG.e("width", -1), 4)};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < 1; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<C1311c> b(String str, com.github.catvod.spider.merge.D0.e eVar) {
        ArrayList arrayList = new ArrayList(2);
        String strI = eVar.i("thumbnailPath", null);
        if (!m.j(strI)) {
            arrayList.add(new C1311c(C1290c.a(str, strI), -1, -1, 3));
        }
        String strI2 = eVar.i("previewPath", null);
        if (!m.j(strI2)) {
            arrayList.add(new C1311c(C1290c.a(str, strI2), -1, -1, 2));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
