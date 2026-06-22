package com.github.catvod.spider.merge.H0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Runnable {
    private final InputStream b;
    private final Socket c;
    final /* synthetic */ t d;

    public a(t tVar, InputStream inputStream, Socket socket) {
        this.d = tVar;
        this.b = inputStream;
        this.c = socket;
    }

    public final void a() {
        t.o(this.b);
        t.o(this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = this.c.getOutputStream();
                ((h) this.d.g).getClass();
                i iVar = new i(this.d, new g(), this.b, outputStream, this.c.getInetAddress());
                while (!this.c.isClosed()) {
                    iVar.d();
                }
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    t.k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
            }
        } finally {
            t.o(outputStream);
            t.o(this.b);
            t.o(this.c);
            this.d.f.b(this);
        }
    }
}
