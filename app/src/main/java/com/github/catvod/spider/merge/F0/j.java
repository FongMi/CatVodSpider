package com.github.catvod.spider.merge.f0;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class j implements HostnameVerifier {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        X509TrustManager x509TrustManager = l.d;
        return true;
    }
}
