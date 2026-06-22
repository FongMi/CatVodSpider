package com.github.catvod.spider.merge.c0;

import android.app.Activity;
import android.view.View;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0938b implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ ViewOnClickListenerC0938b(Activity activity, int i) {
        this.b = i;
        this.c = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                MainActivity.d(this.c);
                break;
            default:
                BaseApi.d(this.c);
                break;
        }
    }
}
