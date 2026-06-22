package com.github.catvod.spider.merge.m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.l.InterfaceC1289b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1305g extends FrameLayout implements InterfaceC1289b {
    final CollapsibleActionView b;

    /* JADX WARN: Multi-variable type inference failed */
    C1305g(View view) {
        super(view.getContext());
        this.b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // com.github.catvod.spider.merge.l.InterfaceC1289b
    public final void b() {
        this.b.onActionViewExpanded();
    }

    @Override // com.github.catvod.spider.merge.l.InterfaceC1289b
    public final void c() {
        this.b.onActionViewCollapsed();
    }
}
