package com.github.catvod.spider.merge.nz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    private static CookieManager a = null;
    private static View b = null;
    private static WebView c = null;
    private static EditText d = null;
    private static Activity e = null;
    private static AlertDialog f = null;
    private static Button g = null;
    private static Button h = null;
    public static String i = "";
    private static int j;
    private static long k;
    private static long l;
    private static boolean m;
    private static boolean n;
    private static FrameLayout o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.app.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.content.DialogInterface$OnCancelListener] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.DialogInterface$OnClickListener, com.github.catvod.spider.merge.nz.c] */
    public static void A(String str, String str2, String str3, j jVar) {
        ?? bVar;
        try {
            Activity activity = Init.getActivity();
            e = activity;
            if (activity.getWindowManager().getDefaultDisplay().getWidth() - e.getWindowManager().getDefaultDisplay().getHeight() < 0) {
                n = true;
            }
            ?? builder = new AlertDialog.Builder(e);
            if (i.indexOf("验证码") >= 0) {
                builder.setTitle(str);
                builder.setView((LinearLayout) y(e, str2, str3));
                builder.setNegativeButton("取消", d.a);
                builder.setPositiveButton("确定", new c(str2, jVar));
                bVar = new a(jVar);
            } else {
                builder.setView((FrameLayout) y(e, str2, str3));
                bVar = new b(str2, jVar);
            }
            builder.setOnCancelListener(bVar);
            AlertDialog alertDialogCreate = builder.create();
            f = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(e.a);
            f.show();
            f.setCanceledOnTouchOutside(false);
            f.setCancelable(false);
            if (i.indexOf("验证码") < 0) {
                f.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                z();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void b(String str, j jVar, DialogInterface dialogInterface) {
        a.removeSessionCookie();
        a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            a.flush();
        }
        String userAgentString = c.getSettings().getUserAgentString();
        String cookie = a.getCookie(str);
        String str2 = "";
        if (cookie != null && cookie.length() > 1) {
            String strReplaceAll = (cookie + ";").replaceAll("mac_history_mxpro=[^;]+?;", "");
            if (strReplaceAll.endsWith(";")) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 1);
            }
            str2 = userAgentString + "#" + strReplaceAll + "$$$";
        }
        if (jVar != null) {
            EditText editText = d;
            jVar.vertifyCode(str2 + ((editText == null || editText.length() <= 1) ? "1" : d.getText().toString()));
        }
        x();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void c(j jVar, DialogInterface dialogInterface) {
        if (jVar != null) {
            jVar.vertifyCode("0");
        }
        x();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void d(String str, j jVar, DialogInterface dialogInterface) {
        a.removeSessionCookie();
        a.removeAllCookie();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().sync();
        } else {
            a.flush();
        }
        String userAgentString = c.getSettings().getUserAgentString();
        String cookie = a.getCookie(str);
        String str2 = "";
        if (cookie != null && cookie.length() > 1) {
            String strReplaceAll = (cookie + ";").replaceAll("mac_history_mxpro=[^;]+?;", "");
            if (strReplaceAll.endsWith(";")) {
                strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 1);
            }
            str2 = userAgentString + "#" + strReplaceAll + "$$$";
        }
        if (jVar != null) {
            EditText editText = d;
            jVar.vertifyCode(str2 + ((editText == null || editText.length() <= 1) ? "1" : d.getText().toString()));
        }
        x();
        dialogInterface.dismiss();
    }

    static /* synthetic */ int j() {
        int i2 = j;
        j = i2 + 1;
        return i2;
    }

    private static void x() {
        WebView webView = c;
        if (webView != null) {
            webView.stopLoading();
            c.clearHistory();
            c.clearCache(true);
            c.loadUrl("about:blank");
            c.onPause();
            c.removeAllViews();
            c.destroy();
            c.destroyDrawingCache();
        }
    }

    public static Object y(Context context, String str, String str2) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        o = new FrameLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        if (i.indexOf("验证码") >= 0) {
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setGravity(17);
        } else {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(0);
            o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            o.setBackgroundColor(0);
            o.setVisibility(8);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setDescendantFocusability(262144);
        }
        WebView webView = new WebView(context);
        c = webView;
        webView.setWebChromeClient(new f());
        c.setWebViewClient(new g());
        c.setScrollBarStyle(0);
        c.setFocusable(true);
        c.setFocusableInTouchMode(true);
        c.setEnabled(true);
        WebSettings settings = c.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setTextZoom(66);
        c.loadUrl(str);
        if (XBPQ.K.length() > 1) {
            settings.setUserAgentString(XBPQ.K);
        }
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        a = cookieManager;
        cookieManager.setAcceptCookie(true);
        a.removeAllCookie();
        a.removeSessionCookie();
        if (str2.length() > 0) {
            for (String str3 : str2.split(";")) {
                a.setCookie(str, str3);
            }
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.getInstance().sync();
            } else {
                a.flush();
            }
        }
        EditText editText = new EditText(context);
        d = editText;
        editText.setHint(i);
        d.setHintTextColor(-12303292);
        d.setTextColor(-16777216);
        d.setFocusable(true);
        d.setFocusableInTouchMode(true);
        if (i.indexOf("验证码") >= 0) {
            linearLayout.addView(c);
            linearLayout.addView(d);
            d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            return linearLayout;
        }
        linearLayout.setVisibility(8);
        Display defaultDisplay = e.getWindowManager().getDefaultDisplay();
        WebView webView2 = c;
        double width = defaultDisplay.getWidth();
        Double.isNaN(width);
        double height = defaultDisplay.getHeight();
        Double.isNaN(height);
        webView2.setLayoutParams(new FrameLayout.LayoutParams((int) (width * 0.75d), (int) (height * 0.9d)));
        Button button = new Button(context, null, 0);
        g = button;
        button.setPadding(20, 20, 0, 0);
        g.setEnabled(true);
        g.setFocusable(true);
        g.setFocusableInTouchMode(true);
        g.setText("■");
        g.setTextColor(-3355444);
        g.setShadowLayer(5.0f, 5.0f, 5.0f, -7829368);
        g.setLayoutParams(new FrameLayout.LayoutParams(o.a(30), o.a(30)));
        g.setOnClickListener(new h());
        Button button2 = new Button(context, null, 0);
        h = button2;
        button2.setPadding(30, 20, 0, 0);
        h.setEnabled(true);
        h.setFocusable(true);
        h.setFocusableInTouchMode(true);
        h.setText("☒");
        h.setTextColor(-3355444);
        h.setShadowLayer(4.0f, 4.0f, 4.0f, -7829368);
        h.setLayoutParams(new FrameLayout.LayoutParams(o.a(30), o.a(30)));
        h.setOnClickListener(new i());
        linearLayout2.addView(h);
        linearLayout2.addView(g);
        frameLayout.addView(d);
        frameLayout.addView(o);
        frameLayout.addView(c);
        frameLayout.addView(linearLayout2);
        c.requestFocus();
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(c, 2);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z() {
        Display defaultDisplay = e.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = f.getWindow().getAttributes();
        double width = defaultDisplay.getWidth();
        Double.isNaN(width);
        Double.isNaN(width);
        attributes.width = (int) (width * 0.75d);
        double height = defaultDisplay.getHeight();
        Double.isNaN(height);
        Double.isNaN(height);
        attributes.height = (int) (height * 0.9d);
        f.getWindow().setAttributes(attributes);
    }
}
