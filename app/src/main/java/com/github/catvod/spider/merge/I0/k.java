package com.github.catvod.spider.merge.i0;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class k extends WebViewClient {
    final /* synthetic */ HashMap a;
    final /* synthetic */ l b = null;

    k(HashMap map) {
        this.a = map;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.evaluateJavascript("document.documentElement.outerHTML", new j(this, str, webView));
    }
}
