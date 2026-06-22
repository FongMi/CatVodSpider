package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC1300b {
    final Context a;
    private com.github.catvod.spider.merge.q.n<SupportMenuItem, MenuItem> b;
    private com.github.catvod.spider.merge.q.n<SupportSubMenu, SubMenu> c;

    AbstractC1300b(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.b == null) {
            this.b = new com.github.catvod.spider.merge.q.n<>();
        }
        MenuItem orDefault = this.b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.a, supportMenuItem);
        this.b.put(supportMenuItem, jVar);
        return jVar;
    }

    final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.q.n<>();
        }
        SubMenu orDefault = this.c.getOrDefault(supportSubMenu, null);
        if (orDefault != null) {
            return orDefault;
        }
        q qVar = new q(this.a, supportSubMenu);
        this.c.put(supportSubMenu, qVar);
        return qVar;
    }

    final void c() {
        com.github.catvod.spider.merge.q.n<SupportMenuItem, MenuItem> nVar = this.b;
        if (nVar != null) {
            nVar.clear();
        }
        com.github.catvod.spider.merge.q.n<SupportSubMenu, SubMenu> nVar2 = this.c;
        if (nVar2 != null) {
            nVar2.clear();
        }
    }

    final void d(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.h(i2).getGroupId() == i) {
                this.b.i(i2);
                i2--;
            }
            i2++;
        }
    }

    final void e(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.h(i2).getItemId() == i) {
                this.b.i(i2);
                return;
            }
        }
    }
}
