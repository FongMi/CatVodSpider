package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.G.j;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f extends i {
    private a j;
    private com.github.catvod.spider.merge.H.g k;
    private int l;

    public static class a implements Cloneable {

        @Nullable
        int d;
        private j.a a = j.a.base;
        private Charset b = com.github.catvod.spider.merge.E.b.a;
        private final ThreadLocal<CharsetEncoder> c = new ThreadLocal<>();
        private boolean e = true;
        private int f = 1;
        private int g = 30;
        private int h = 1;

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                a aVar = (a) super.clone();
                String strName = this.b.name();
                aVar.getClass();
                aVar.b = Charset.forName(strName);
                aVar.a = j.a.valueOf(this.a.name());
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        final CharsetEncoder b() {
            CharsetEncoder charsetEncoder = this.c.get();
            return charsetEncoder != null ? charsetEncoder : f();
        }

        public final j.a c() {
            return this.a;
        }

        public final int d() {
            return this.f;
        }

        public final int e() {
            return this.g;
        }

        final CharsetEncoder f() {
            CharsetEncoder charsetEncoderNewEncoder = this.b.newEncoder();
            this.c.set(charsetEncoderNewEncoder);
            String strName = charsetEncoderNewEncoder.charset().name();
            this.d = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
            return charsetEncoderNewEncoder;
        }

        public final boolean g() {
            return this.e;
        }

        public final int h() {
            return this.h;
        }
    }

    public f(String str) {
        super(com.github.catvod.spider.merge.H.h.m("#root", com.github.catvod.spider.merge.H.f.c), str, null);
        this.j = new a();
        this.l = 1;
        this.k = new com.github.catvod.spider.merge.H.g(new com.github.catvod.spider.merge.H.b());
    }

    public final com.github.catvod.spider.merge.H.g A0() {
        return this.k;
    }

    public final f B0() {
        this.l = 2;
        return this;
    }

    public final int C0() {
        return this.l;
    }

    public final f D0() {
        f fVar = new f(f());
        b bVar = this.g;
        if (bVar != null) {
            fVar.g = bVar.clone();
        }
        fVar.j = this.j.clone();
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.G.i
    public final i s0(String str) {
        w0().s0(str);
        return this;
    }

    @Override // com.github.catvod.spider.merge.G.i, com.github.catvod.spider.merge.G.m
    public final String t() {
        return "#document";
    }

    @Override // com.github.catvod.spider.merge.G.m
    public final String u() {
        return b0();
    }

    public final i w0() {
        i iVarO;
        Iterator<i> it = U().iterator();
        while (true) {
            if (!it.hasNext()) {
                iVarO = O("html");
                break;
            }
            iVarO = it.next();
            if (iVarO.h0().equals("html")) {
                break;
            }
        }
        for (i iVar : iVarO.U()) {
            if ("body".equals(iVar.h0()) || "frameset".equals(iVar.h0())) {
                return iVar;
            }
        }
        return iVarO.O("body");
    }

    @Override // com.github.catvod.spider.merge.G.i, com.github.catvod.spider.merge.G.m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = (f) super.clone();
        fVar.j = this.j.clone();
        return fVar;
    }

    public final a y0() {
        return this.j;
    }

    public final f z0(com.github.catvod.spider.merge.H.g gVar) {
        this.k = gVar;
        return this;
    }
}
