package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.AB.o.C0113q;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class O implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ O(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ((Q) this.b).R();
            return;
        }
        final int i2 = 1;
        if (i == 1) {
            ((MainActivity) this.b).i();
            return;
        }
        if (i == 2) {
            final Config config = (Config) this.b;
            config.getClass();
            new Thread(new Runnable(config, i2) { // from class: com.github.catvod.spider.merge.AB.n.e
                public final int a;
                public final Config b;

                {
                    this.a = i2;
                    this.b = config;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = this.a;
                    Config config2 = this.b;
                    if (i3 != 0) {
                        Config.d(config2);
                    } else {
                        config2.getClass();
                        new Thread(new Runnable(config2, 1) { // from class: com.github.catvod.spider.merge.AB.l.g
                            public final int a;
                            public final Object b;

                            {
                                this.a = i;
                                this.b = config2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = this.a;
                                Object obj = this.b;
                                if (i4 != 0) {
                                    Config.c((Config) obj);
                                } else {
                                    ((MainActivity) obj).k();
                                }
                            }
                        }).start();
                    }
                }
            }).start();
        } else {
            Object obj = this.b;
            if (i != 3) {
                com.github.catvod.spider.merge.AB.o.E.a((String) obj);
            } else {
                C0113q.h((C0113q) obj);
            }
        }
    }
}
