package com.github.catvod.spider.merge.A0;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import rxhttp.RxHttpPlugins;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return RxHttpPlugins.Ϳ(str, sSLSession);
    }
}
