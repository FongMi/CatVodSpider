package com.github.catvod.spider.merge.R;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static String a(Exception exc) {
        ?? arrayList = new ArrayList();
        for (?? cause = exc; cause != 0 && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th != null) {
            exc = th;
        }
        HashMap map = com.github.catvod.spider.merge.E.a.a;
        String strA = com.github.catvod.spider.merge.E.a.a(exc.getClass());
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(": ");
        int i = com.github.catvod.spider.merge.E.c.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }
}
