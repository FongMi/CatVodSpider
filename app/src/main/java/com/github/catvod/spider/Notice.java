package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.ui.ScrollTextView;
import com.github.catvod.utils.ResUtil;
import com.github.catvod.utils.Util;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Notice extends Spider {

    private static final String SPACE = "                                        ";
    private ScrollTextView view;
    private String extend;
    private int duration;
    private String msg;

    public static void show(String extend) {
        try {
            Notice notice = new Notice();
            notice.init(null, extend);
            notice.homeContent(false);
        } catch (Exception ignored) {
        }
    }

    @Override
    public void init(Context context, String extend) {
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
        String json = extend.startsWith("http") ? OkHttp.string(extend) : new String(Base64.decode(extend, Base64.DEFAULT));
        JSONObject object = new JSONObject(json);
        msg = object.optString("msg");
        duration = object.optInt("duration", 30);
        String date = object.optString("date");
        boolean show = msg.length() > 0 && (date.isEmpty() || new Date().after(sdf.parse(date)));
        if (show) Init.run(this::createView, 500);
        return "";
    }

    private void createView() {
        createText();
        createRoot();
        setColor();
        hide();
    }

    private void createText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) sb.append(SPACE).append(msg);
        view = new ScrollTextView(Init.context());
        view.setTextSize(20);
        view.setDuration(duration);
        view.setText(sb.toString());
        view.setTypeface(null, Typeface.BOLD);
        view.setPadding(0, ResUtil.dp2px(16), 0, ResUtil.dp2px(16));
        view.setBackgroundColor(Color.argb(200, 255, 255, 255));
        view.startScroll();
    }

    private void createRoot() {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.TOP;
        Util.addView(view, params);
    }

    private void hide() {
        Init.run(() -> Util.removeView(view), duration * 1000);
    }

    private void setColor() {
        Init.run(runnable, 500);
    }

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Random random = new Random();
            view.setTextColor(Color.argb(255, random.nextInt(128), random.nextInt(128), random.nextInt(128)));
            setColor();
        }
    };
}
