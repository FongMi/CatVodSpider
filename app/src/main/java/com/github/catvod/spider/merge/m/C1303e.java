package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.ActionProvider;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1303e extends ActionProvider {
    final android.view.ActionProvider a;
    final /* synthetic */ j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1303e(j jVar, Context context, android.view.ActionProvider actionProvider) {
        super(context);
        this.b = jVar;
        this.a = actionProvider;
    }

    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    public final View onCreateActionView() {
        return this.a.onCreateActionView();
    }

    public final boolean onPerformDefaultAction() {
        return this.a.onPerformDefaultAction();
    }

    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }
}
