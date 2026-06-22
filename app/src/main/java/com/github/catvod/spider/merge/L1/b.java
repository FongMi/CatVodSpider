package com.github.catvod.spider.merge.L1;

import com.github.catvod.spider.merge.G1.C0684c;
import com.github.catvod.spider.merge.G1.C0685d;
import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.d1.F;
import com.github.catvod.spider.merge.e1.C1032c;
import com.github.catvod.spider.merge.e1.C1038i;
import com.github.catvod.spider.merge.l.C1290c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    public static com.github.catvod.spider.merge.D0.c a(com.github.catvod.spider.merge.D0.e eVar, String str) {
        return (com.github.catvod.spider.merge.D0.c) c(eVar, str, com.github.catvod.spider.merge.D0.c.class);
    }

    public static Boolean b(com.github.catvod.spider.merge.D0.e eVar) {
        return (Boolean) c(eVar, "nsfw", Boolean.class);
    }

    private static <T> T c(com.github.catvod.spider.merge.D0.e eVar, String str, Class<T> cls) throws com.github.catvod.spider.merge.p1.i {
        Object objI = i(eVar, str);
        if (cls.isInstance(objI)) {
            return cls.cast(objI);
        }
        throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Wrong data type at path ", str));
    }

    public static com.github.catvod.spider.merge.D0.e d(String str, String str2) {
        com.github.catvod.spider.merge.c1.h hVarD = F.d(str);
        hVarD.getClass();
        C0899d.f(str2);
        return com.github.catvod.spider.merge.D0.g.d().a(C1032c.a(new C1038i(str2.trim(), 0), hVarD).a(str2));
    }

    public static Number e(com.github.catvod.spider.merge.D0.e eVar) {
        return (Number) c(eVar, "resolution.id", Number.class);
    }

    public static com.github.catvod.spider.merge.D0.e f(com.github.catvod.spider.merge.D0.e eVar, String str) {
        return (com.github.catvod.spider.merge.D0.e) c(eVar, str, com.github.catvod.spider.merge.D0.e.class);
    }

    public static String g(com.github.catvod.spider.merge.D0.e eVar, String str) {
        return (String) c(eVar, str, String.class);
    }

    public static List<String> h(com.github.catvod.spider.merge.D0.c cVar) {
        return (List) cVar.stream().filter(new C0685d(String.class, 2)).map(new C0684c(String.class, 2)).collect(Collectors.toList());
    }

    public static Object i(com.github.catvod.spider.merge.D0.e eVar, String str) throws com.github.catvod.spider.merge.p1.i {
        List listAsList = Arrays.asList(str.split("\\."));
        Iterator it = listAsList.subList(0, listAsList.size() - 1).iterator();
        while (it.hasNext() && (eVar = eVar.g((String) it.next())) != null) {
        }
        if (eVar == null) {
            throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Unable to get ", str));
        }
        Object obj = eVar.get(listAsList.get(listAsList.size() - 1));
        if (obj != null) {
            return obj;
        }
        throw new com.github.catvod.spider.merge.p1.i(C1290c.a("Unable to get ", str));
    }

    public static com.github.catvod.spider.merge.D0.e j(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            return com.github.catvod.spider.merge.D0.g.d().a(str);
        } catch (com.github.catvod.spider.merge.D0.h e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not parse JSON", e);
        }
    }
}
