package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A0.do, reason: invalid class name */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class Cdo {
    public final String a;
    public String b = null;
    public final xh c;
    public final Request d;
    public final Request.Builder e;

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Cdo(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.HashMap r9, java.util.HashMap r10, com.github.catvod.spider.merge.A0.xh r11) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.Cdo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, com.github.catvod.spider.merge.A0.xh):void");
    }

    public final void f(OkHttpClient okHttpClient) {
        xh xhVar = this.c;
        Call callNewCall = okHttpClient.newCall(this.d);
        try {
            Response responseExecute = callNewCall.execute();
            if (xhVar != null) {
                Object objOnParseResponse = xhVar.onParseResponse(callNewCall, responseExecute);
                xhVar.d = objOnParseResponse;
                xhVar.onResponse(objOnParseResponse);
            }
        } catch (IOException e) {
            if (xhVar != null) {
                xhVar.onError(callNewCall, e);
            }
        }
    }
}
