package com.github.catvod.utils;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.Init;
import com.github.catvod.ui.ScrollTextView;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Notice {

    private static final String SPACE = "                                        ";
    private ScrollTextView view;
    private int duration;
    private String msg;

    public static void show(String url) {
        new Notice().init(url);
    }

    public void init(String url) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
            String json = OkHttp.string(url);
            JSONObject object = new JSONObject(json);
            msg = object.optString("msg");
            duration = object.optInt("duration", 30);
            String date = object.optString("date");
            boolean show = msg.length() > 0 && (date.isEmpty() || new Date().after(sdf.parse(date)));
            if (show) Init.run(this::createView);
        } catch (Exception ignored) {
        }
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
        view.setPadding(0, Utils.dp2px(16), 0, Utils.dp2px(16));
        view.setBackgroundColor(Color.argb(200, 255, 255, 255));
        view.startScroll();
    }

    private void createRoot() {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.TOP;
        Utils.addView(view, params);
    }

    private void hide() {
        Init.run(() -> Utils.removeView(view), duration * 1000);
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
