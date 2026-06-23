package com.github.catvod.spider.merge.C0.j;

import com.github.catvod.spider.merge.C0.e0.C0180g;
import com.github.catvod.spider.merge.C0.h0.d;
import com.github.catvod.spider.merge.C0.x.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l {
    public static final Object a(Throwable th) {
        return new f(th);
    }

    public static C0180g b(com.github.catvod.spider.merge.C0.c0.l lVar) {
        C0180g c0180g = new C0180g();
        while (true) {
            lVar = lVar.b0();
            if (lVar == null) {
                break;
            }
            c0180g.add(lVar);
        }
        if (c0180g.size() > 0) {
            return c0180g;
        }
        return null;
    }

    public static int c(com.github.catvod.spider.merge.C0.c0.l lVar, d dVar) {
        Iterator<com.github.catvod.spider.merge.C0.c0.l> it = lVar.f0().R().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.C0.c0.l next = it.next();
            if (lVar.n0().equals(next.n0()) && dVar.a().contains(next)) {
                if (lVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static C0180g d(com.github.catvod.spider.merge.C0.c0.l lVar) {
        C0180g c0180g = new C0180g();
        while (true) {
            lVar = lVar.i0();
            if (lVar == null) {
                break;
            }
            c0180g.add(lVar);
        }
        if (c0180g.size() > 0) {
            return c0180g;
        }
        return null;
    }

    public static String e(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            String string = sb.toString();
            int i = o.a;
            return (string == null || string.length() <= 1) ? string : string.substring(0, string.length() - 1);
        } catch (Exception e) {
            return "";
        }
    }

    public static void f(com.github.catvod.spider.merge.C0.c0.l lVar, int i) {
        lVar.b("EL_SAME_TAG_INDEX_KEY", String.valueOf(i));
    }

    public static void g(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime.getRuntime().exec("chmod 777 " + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
