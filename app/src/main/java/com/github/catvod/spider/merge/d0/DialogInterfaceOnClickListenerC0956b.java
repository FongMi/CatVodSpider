package com.github.catvod.spider.merge.d0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0956b implements DialogInterface.OnClickListener {
    public final /* synthetic */ BaseApi a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ String c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0956b(BaseApi baseApi, EditText editText, String str) {
        this.a = baseApi;
        this.b = editText;
        this.c = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseApi baseApi = this.a;
        EditText editText = this.b;
        String str = this.c;
        baseApi.getClass();
        String string = editText.getText().toString();
        if (!com.github.catvod.spider.merge.P0.e.d(str) || string.equals(str) || !str.startsWith(string)) {
            str = string;
        }
        baseApi.onSubscriptionUrlPositive(str);
    }
}
