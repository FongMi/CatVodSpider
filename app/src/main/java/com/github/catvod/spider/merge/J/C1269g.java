package com.github.catvod.spider.merge.j;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.TintAwareDrawable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class C1269g extends o implements TintAwareDrawable {
    private C1264b q;
    private AbstractC1268f r;
    private int s;
    private int t;
    private boolean u;

    public C1269g() {
        this(null, null);
    }

    C1269g(C1264b c1264b, Resources resources) {
        this.s = -1;
        this.t = -1;
        f(new C1264b(c1264b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0222, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.j.C1269g i(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) throws org.xmlpull.v1.XmlPullParserException, com.github.catvod.spider.merge.Q1.a, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.j.C1269g.i(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.github.catvod.spider.merge.j.g");
    }

    @Override // com.github.catvod.spider.merge.j.o, com.github.catvod.spider.merge.j.l
    final AbstractC1273k b() {
        return new C1264b(this.q, this, null);
    }

    @Override // com.github.catvod.spider.merge.j.o, com.github.catvod.spider.merge.j.l
    final void f(AbstractC1273k abstractC1273k) {
        super.f(abstractC1273k);
        if (abstractC1273k instanceof C1264b) {
            this.q = (C1264b) abstractC1273k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.j.o
    /* JADX INFO: renamed from: h */
    public final n b() {
        return new C1264b(this.q, this, null);
    }

    @Override // com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC1268f abstractC1268f = this.r;
        if (abstractC1268f != null) {
            abstractC1268f.d();
            this.r = null;
            e(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    @Override // com.github.catvod.spider.merge.j.o, com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.u) {
            super.mutate();
            this.q.i();
            this.u = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    @Override // com.github.catvod.spider.merge.j.o, com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean onStateChange(int[] r11) {
        /*
            r10 = this;
            com.github.catvod.spider.merge.j.b r0 = r10.q
            int r1 = r0.l(r11)
            if (r1 < 0) goto L9
            goto Lf
        L9:
            int[] r1 = android.util.StateSet.WILD_CARD
            int r1 = r0.l(r1)
        Lf:
            int r0 = r10.c()
            r2 = 1
            r3 = 0
            if (r1 == r0) goto La4
            com.github.catvod.spider.merge.j.f r0 = r10.r
            if (r0 == 0) goto L3c
            int r4 = r10.s
            if (r1 != r4) goto L22
        L1f:
            r0 = 1
            goto L9b
        L22:
            int r4 = r10.t
            if (r1 != r4) goto L36
            boolean r4 = r0.a()
            if (r4 == 0) goto L36
            r0.b()
            int r0 = r10.t
            r10.s = r0
            r10.t = r1
            goto L1f
        L36:
            int r4 = r10.s
            r0.d()
            goto L40
        L3c:
            int r4 = r10.c()
        L40:
            r0 = 0
            r10.r = r0
            r0 = -1
            r10.t = r0
            r10.s = r0
            com.github.catvod.spider.merge.j.b r0 = r10.q
            int r5 = r0.o(r4)
            int r6 = r0.o(r1)
            if (r6 == 0) goto L9a
            if (r5 != 0) goto L57
            goto L9a
        L57:
            int r7 = r0.p(r5, r6)
            if (r7 >= 0) goto L5e
            goto L9a
        L5e:
            boolean r8 = r0.r(r5, r6)
            r10.e(r7)
            android.graphics.drawable.Drawable r7 = super.getCurrent()
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L79
            boolean r0 = r0.q(r5, r6)
            com.github.catvod.spider.merge.j.d r5 = new com.github.catvod.spider.merge.j.d
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r0, r8)
            goto L90
        L79:
            boolean r0 = r7 instanceof androidx.vectordrawable.graphics.drawable.e
            if (r0 == 0) goto L85
            com.github.catvod.spider.merge.j.c r5 = new com.github.catvod.spider.merge.j.c
            androidx.vectordrawable.graphics.drawable.e r7 = (androidx.vectordrawable.graphics.drawable.e) r7
            r5.<init>(r7)
            goto L90
        L85:
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L9a
            com.github.catvod.spider.merge.j.a r5 = new com.github.catvod.spider.merge.j.a
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L90:
            r5.c()
            r10.r = r5
            r10.t = r4
            r10.s = r1
            goto L1f
        L9a:
            r0 = 0
        L9b:
            if (r0 != 0) goto La5
            boolean r0 = r10.e(r1)
            if (r0 == 0) goto La4
            goto La5
        La4:
            r2 = 0
        La5:
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            if (r0 == 0) goto Lb0
            boolean r11 = r0.setState(r11)
            r2 = r2 | r11
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.j.C1269g.onStateChange(int[]):boolean");
    }

    @Override // com.github.catvod.spider.merge.j.l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC1268f abstractC1268f = this.r;
        if (abstractC1268f != null && (visible || z2)) {
            if (z) {
                abstractC1268f.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
