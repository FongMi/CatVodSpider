package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.c.C0936b;
import com.github.catvod.spider.merge.y.z;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class t {
    private static final Pattern h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger k = Logger.getLogger(t.class.getName());
    private final int b;
    private volatile ServerSocket c;
    private Thread e;
    private C0936b d = new C0936b();
    private final String a = null;
    private s g = new h();
    protected e f = new e();

    public t(int i2) {
        this.b = i2;
    }

    protected static String j(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            k.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static o k(m mVar, String str, InputStream inputStream) {
        return new o(mVar, str, inputStream, -1L);
    }

    public static o l(m mVar, String str, InputStream inputStream, long j2) {
        return new o(mVar, str, inputStream, j2);
    }

    public static o m(m mVar, String str, String str2) {
        byte[] bytes;
        b bVar = new b(str);
        if (str2 == null) {
            return l(mVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(bVar.e()).newEncoder().canEncode(str2)) {
                bVar = bVar.g();
            }
            bytes = str2.getBytes(bVar.e());
        } catch (UnsupportedEncodingException e) {
            k.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return l(mVar, bVar.c(), new ByteArrayInputStream(bytes), bytes.length);
    }

    public static o n(String str) {
        return m(n.OK, "text/html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                k.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public o p(i iVar) {
        HashMap map = new HashMap();
        int iH = iVar.h();
        if (z.a(2, iH) || z.a(3, iH)) {
            try {
                iVar.k(map);
            } catch (p e) {
                return m(e.a(), "text/plain", e.getMessage());
            } catch (IOException e2) {
                n nVar = n.INTERNAL_ERROR;
                StringBuilder sbB = t0.b("SERVER INTERNAL ERROR: IOException: ");
                sbB.append(e2.getMessage());
                return m(nVar, "text/plain", sbB.toString());
            }
        }
        ((HashMap) iVar.i()).put("NanoHttpd.QUERY_STRING", iVar.j());
        return m(n.NOT_FOUND, "text/plain", "Not Found");
    }

    public final void q() throws IOException {
        this.d.getClass();
        this.c = new ServerSocket();
        this.c.setReuseAddress(true);
        q qVar = new q(this);
        Thread thread = new Thread(qVar);
        this.e = thread;
        thread.setDaemon(true);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
        while (!qVar.d && qVar.c == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (qVar.c != null) {
            throw qVar.c;
        }
    }

    public final void r() {
        try {
            o(this.c);
            this.f.a();
            Thread thread = this.e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            k.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    protected final boolean s(o oVar) {
        return oVar.d() != null && (oVar.d().toLowerCase().contains("text/") || oVar.d().toLowerCase().contains("/json"));
    }
}
