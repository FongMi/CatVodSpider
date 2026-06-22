package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.ActionProvider;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class ActionProviderVisibilityListenerC1304f extends C1303e implements ActionProvider.VisibilityListener {
    private ActionProvider.VisibilityListener c;

    ActionProviderVisibilityListenerC1304f(j jVar, Context context, android.view.ActionProvider actionProvider) {
        super(jVar, context, actionProvider);
    }

    public final boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ActionProvider.VisibilityListener visibilityListener = this.c;
        if (visibilityListener != null) {
            visibilityListener.onActionProviderVisibilityChanged(z);
        }
    }

    public final View onCreateActionView(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    public final boolean overridesItemVisibility() {
        return this.a.overridesItemVisibility();
    }

    public final void refreshVisibility() {
        this.a.refreshVisibility();
    }

    public final void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
        this.c = visibilityListener;
        this.a.setVisibilityListener(visibilityListener != null ? this : null);
    }
}
