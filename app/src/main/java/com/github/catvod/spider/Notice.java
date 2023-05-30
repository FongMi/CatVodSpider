package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.github.catvod.crawler.Spider;
import com.github.catvod.ui.ScrollTextView;
import com.github.catvod.utils.Utils;

import java.util.Random;

public class Notice extends Spider {

    private static final String SPACE = "                                        ";
    private ScrollTextView view;
    private String text;
    private int time;

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        String[] splits = extend.split(";");
        this.text = splits[0];
        this.time = splits.length > 1 ? Integer.parseInt(splits[1]) : 30;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        Init.run(this::createView);
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
        for (int i = 0; i < 2; i++) sb.append(SPACE).append(text);
        view = new ScrollTextView(Init.context());
        view.setTextSize(20);
        view.setDuration(time);
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
        Init.run(() -> Utils.removeView(view), time * 1000);
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
