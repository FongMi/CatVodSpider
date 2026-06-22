package com.github.catvod.spider.merge.nz;

import com.github.catvod.spider.merge.Dw.u;
import com.github.catvod.spider.merge.ej.C1061g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l {
    public static final Object a(Throwable th) {
        return new u(th);
    }

    public static C1061g b(com.github.catvod.spider.merge.Em.l lVar) {
        C1061g c1061g = new C1061g();
        while (true) {
            lVar = lVar.b0();
            if (lVar == null) {
                break;
            }
            c1061g.add(lVar);
        }
        if (c1061g.size() > 0) {
            return c1061g;
        }
        return null;
    }

    public static int c(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Dw.c cVar) {
        Iterator<com.github.catvod.spider.merge.Em.l> it = lVar.f0().R().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.Em.l next = it.next();
            if (lVar.n0().equals(next.n0()) && cVar.a().contains(next)) {
                if (lVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static C1061g d(com.github.catvod.spider.merge.Em.l lVar) {
        C1061g c1061g = new C1061g();
        while (true) {
            lVar = lVar.i0();
            if (lVar == null) {
                break;
            }
            c1061g.add(lVar);
        }
        if (c1061g.size() > 0) {
            return c1061g;
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
        } catch (Exception unused) {
            return "";
        }
    }

    public static void f(com.github.catvod.spider.merge.Em.l lVar, int i) {
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
