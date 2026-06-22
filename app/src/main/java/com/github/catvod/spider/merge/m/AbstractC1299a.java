package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1299a implements l {
    protected Context b;
    protected Context c;
    protected androidx.appcompat.view.menu.i d;
    protected LayoutInflater e;
    private k f;
    private int g = 2131427330;
    protected ActionMenuView h;

    public AbstractC1299a(Context context) {
        this.b = context;
        this.e = LayoutInflater.from(context);
    }

    @Override // com.github.catvod.spider.merge.m.l
    public void a(androidx.appcompat.view.menu.i iVar, boolean z) {
        k kVar = this.f;
        if (kVar != null) {
            kVar.a(iVar, z);
        }
    }

    @Override // com.github.catvod.spider.merge.m.l
    public final boolean b(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    public abstract void c(androidx.appcompat.view.menu.k kVar, m mVar);

    protected abstract boolean e(ViewGroup viewGroup, int i);

    @Override // com.github.catvod.spider.merge.m.l
    public void f(Context context, androidx.appcompat.view.menu.i iVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = iVar;
    }

    @Override // com.github.catvod.spider.merge.m.l
    public final void g(k kVar) {
        this.f = kVar;
    }

    public final k h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i(androidx.appcompat.view.menu.k kVar, View view, ViewGroup viewGroup) {
        m mVar = view instanceof m ? (m) view : (m) this.e.inflate(this.g, viewGroup, false);
        c(kVar, mVar);
        return (View) mVar;
    }

    @Override // com.github.catvod.spider.merge.m.l
    public final boolean j(androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // com.github.catvod.spider.merge.m.l
    public boolean k(r rVar) {
        k kVar = this.f;
        if (kVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar = this.d;
        }
        return kVar.b(rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.catvod.spider.merge.m.l
    public void l(boolean z) {
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            return;
        }
        androidx.appcompat.view.menu.i iVar = this.d;
        int i = 0;
        if (iVar != null) {
            iVar.j();
            ArrayList arrayListP = this.d.p();
            int size = arrayListP.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) arrayListP.get(i3);
                if (m(kVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    androidx.appcompat.view.menu.k kVarC = childAt instanceof m ? ((m) childAt).c() : null;
                    View viewI = i(kVar, childAt, viewGroup);
                    if (kVar != kVarC) {
                        viewI.setPressed(false);
                        viewI.jumpDrawablesToCurrentState();
                    }
                    if (viewI != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewI.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewI);
                        }
                        this.h.addView(viewI, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!e(viewGroup, i)) {
                i++;
            }
        }
    }

    public abstract boolean m(androidx.appcompat.view.menu.k kVar);
}
