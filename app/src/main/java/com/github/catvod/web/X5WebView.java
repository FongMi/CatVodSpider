package com.github.catvod.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class X5WebView extends WebView {

    public X5WebView(Context context) {
        super(context);
        init();
    }

    public X5WebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public X5WebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        WebSettings webSettings = getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);

        setWebViewClient(new WebViewClient());
        setWebChromeClient(new WebChromeClient());

        // JavaScript injection for CCTV playback
        loadUrl("javascript:(function() { " +
                "document.getElementById('video').play();" +
                "document.documentElement.requestFullscreen();" +
                "})()");

        // Page optimization features
        setLayerType(View.LAYER_TYPE_HARDWARE, null);
    }
}