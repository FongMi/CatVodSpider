package com.github.catvod.spider.merge.A0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class sw extends tc {
    public static final void a(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, qw qwVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            l.b(sb, obj, qwVar);
        }
        sb.append(charSequence3);
    }

    public static String b(Collection collection, String str, String str2, lv lvVar, int i) {
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            lvVar = null;
        }
        StringBuilder sb = new StringBuilder();
        a(collection, sb, ", ", str3, str4, "...", lvVar);
        String string = sb.toString();
        ko.e("toString(...)", string);
        return string;
    }

    public static Object c(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList d(Collection collection, Iterable iterable) {
        ko.f("<this>", collection);
        ko.f("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            tc.o(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List e(Iterable iterable, Comparator comparator) {
        ko.f("<this>", iterable);
        ko.f("comparator", comparator);
        if (!(iterable instanceof Collection)) {
            List listI = i(iterable);
            if (((ArrayList) listI).size() > 1) {
                Collections.sort(listI, comparator);
            }
            return listI;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return h(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ko.f("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return qb.c(array);
    }

    public static List f(Iterable iterable, int i) {
        Object next;
        ko.f("<this>", iterable);
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        eh ehVar = eh.a;
        if (i == 0) {
            return ehVar;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return h(iterable);
            }
            if (i == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    next = list.get(0);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return sx.l(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : sx.l(arrayList.get(0)) : ehVar;
    }

    public static final void g(Iterable iterable, AbstractCollection abstractCollection) {
        ko.f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List h(Iterable iterable) {
        ko.f("<this>", iterable);
        boolean z = iterable instanceof Collection;
        eh ehVar = eh.a;
        if (!z) {
            List listI = i(iterable);
            ArrayList arrayList = (ArrayList) listI;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listI : sx.l(arrayList.get(0)) : ehVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return ehVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return sx.l(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List i(Iterable iterable) {
        ko.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        g(iterable, arrayList);
        return arrayList;
    }
}
