package com.github.catvod.spider.merge.d0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.en.BaseApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0958d implements View.OnClickListener {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;

    public /* synthetic */ ViewOnClickListenerC0958d(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseApi.b(this.b, this.c);
    }
}
