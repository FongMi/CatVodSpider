package com.github.catvod.utils.server;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class ServerStart {
    private Server a;
    private int b = 8877;

    class Loader {
        static volatile ServerStart a = new ServerStart();
    }

    public static ServerStart a() {
        return Loader.a;
    }

    public final int b() {
        return this.b;
    }

    public final void c() {
        if (this.a != null) {
            return;
        }
        do {
            try {
                Server server = new Server(this.b);
                this.a = server;
                server.q();
                return;
            } catch (Exception unused) {
                this.b++;
                this.a.r();
                this.a = null;
            }
        } while (this.b < 9999);
    }
}
