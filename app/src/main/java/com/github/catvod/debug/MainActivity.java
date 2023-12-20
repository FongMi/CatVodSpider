package com.github.catvod.debug;

import android.app.Activity;
import android.os.*;

import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.R;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.*;
import org.apache.commons.lang3.StringEscapeUtils;

import static com.github.catvod.utils.Util.addView;
import static com.github.catvod.utils.Util.removeView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Logger.addLogAdapter(new AndroidLogAdapter());
        Init.init(getApplicationContext());
        // It is usually init in the application.
        new Thread(() -> {
            try {

                bypassCf("https://www.czzy88.com/xssearch?q=斗罗");
                while (cookie[0] == null) SystemClock.sleep(1000);
                System.out.println(html);



            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }


    static final String[] cookie = new String[1];
    static String html = "";
    public static void bypassCf(String url) {
        String content = OkHttp.string(url);
        if (content.contains("Just a moment...")) {
            Init.run(() -> {
                WebView webView = new WebView(Init.context());
                webView.getSettings().setDatabaseEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptEnabled(true);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(0, 0);
                addView(webView, layoutParams);
                webView.setWebViewClient(new WebViewClient() {
                    @Override
                    public void onPageFinished(WebView view, String url1) {
                        cookie[0] = CookieManager.getInstance().getCookie(url1);
                        if (cookie[0] != null && cookie[0].contains("cf_clearance")) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                                view.evaluateJavascript("(function() { return document.documentElement.outerHTML; })();",
                                        html -> {
                                            if (html != null && !html.isEmpty()) {
                                                String htmlString = html.replaceAll("^\"+|\"+$", "");
                                                MainActivity.html = StringEscapeUtils.unescapeJava(htmlString);

                                            }
                                        });
                            }
                            if (view != null) {
                                new Handler(Looper.getMainLooper()).post(() -> {
                                    removeView(webView);
                                    webView.destroy();
                                });
                            }
                        }
                    }
                });
                webView.loadUrl(url);
            });
        } else {
            html = content;
        }
    }

}