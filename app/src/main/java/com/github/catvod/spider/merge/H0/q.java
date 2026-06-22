package com.github.catvod.spider.merge.H0;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class q implements Runnable {
    private IOException c;
    final /* synthetic */ t e;
    private boolean d = false;
    private final int b = 5000;

    public q(t tVar) {
        this.e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.e.c.bind(this.e.a != null ? new InetSocketAddress(this.e.a, this.e.b) : new InetSocketAddress(this.e.b));
            this.d = true;
            do {
                try {
                    Socket socketAccept = this.e.c.accept();
                    int i = this.b;
                    if (i > 0) {
                        socketAccept.setSoTimeout(i);
                    }
                    InputStream inputStream = socketAccept.getInputStream();
                    t tVar = this.e;
                    e eVar = tVar.f;
                    tVar.getClass();
                    eVar.c(new a(tVar, inputStream, socketAccept));
                } catch (IOException e) {
                    t.k.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.e.c.isClosed());
        } catch (IOException e2) {
            this.c = e2;
        }
    }
}
