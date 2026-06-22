package com.github.catvod.spider.merge.H0;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o implements Closeable {
    private m b;
    private String c;
    private InputStream d;
    private long e;
    private final Map<String, String> f = new k(this);
    private final Map<String, String> g = new HashMap();
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;

    protected o(m mVar, String str, InputStream inputStream, long j) {
        this.b = mVar;
        this.c = str;
        if (inputStream == null) {
            this.d = new ByteArrayInputStream(new byte[0]);
            this.e = 0L;
        } else {
            this.d = inputStream;
            this.e = j;
        }
        this.i = this.e < 0;
        this.k = true;
    }

    private void h(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.d.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z) {
                j -= (long) i;
            }
        }
    }

    private void i(OutputStream outputStream, long j) throws IOException {
        if (!this.j) {
            h(outputStream, j);
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        h(gZIPOutputStream, -1L);
        gZIPOutputStream.finish();
    }

    public final void b(String str, String str2) {
        ((k) this.f).put(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String c(String str) {
        return (String) this.g.get(str.toLowerCase());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return "close".equals(c("connection"));
    }

    protected final void f(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    protected final void g(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.b == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new b(this.c).e())), false);
            printWriter.append("HTTP/1.1 ").append(((n) this.b).a()).append(" \r\n");
            String str = this.c;
            if (str != null) {
                f(printWriter, "Content-Type", str);
            }
            if (c("date") == null) {
                f(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : ((HashMap) this.f).entrySet()) {
                f(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (c("connection") == null) {
                f(printWriter, "Connection", this.k ? "keep-alive" : "close");
            }
            if (c("content-length") != null) {
                this.j = false;
            }
            if (this.j) {
                f(printWriter, "Content-Encoding", "gzip");
                this.i = true;
            }
            long j = this.d != null ? this.e : 0L;
            if (this.h != 5 && this.i) {
                f(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.j) {
                j = j(printWriter, j);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.h == 5 || !this.i) {
                i(outputStream, j);
            } else {
                l lVar = new l(outputStream);
                i(lVar, -1L);
                lVar.a();
            }
            outputStream.flush();
            t.o(this.d);
        } catch (IOException e) {
            t.k.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    protected final long j(PrintWriter printWriter, long j) {
        String strC = c("content-length");
        if (strC != null) {
            try {
                j = Long.parseLong(strC);
            } catch (NumberFormatException unused) {
                t.k.severe("content-length was no number " + strC);
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    public final void k(boolean z) {
        this.j = z;
    }

    public final void l(boolean z) {
        this.k = z;
    }

    public final void m(int i) {
        this.h = i;
    }
}
