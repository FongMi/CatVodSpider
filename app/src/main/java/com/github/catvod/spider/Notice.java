package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.github.catvod.crawler.Spider;
import com.github.catvod.ui.MarqueeView;
import com.github.catvod.utils.Utils;

import java.util.Random;

public class Notice extends Spider {

    private MarqueeView view;

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        Init.run(() -> createView(extend));
    }

    private void createView(String extend) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) sb.append(extend).append("                    ");
        view = new MarqueeView(Init.context());
        view.setText(sb.toString());
        view.setBackgroundColor(Color.parseColor("#CCFFFFFF"));
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, Utils.dp2px(56));
        params.gravity = Gravity.TOP;
        Utils.addView(view, params);
        updateColor();
        hide();
    }

    private void hide() {
        Init.run(() -> Utils.removeView(view), 30 * 1000);
    }

    private void updateColor() {
        Init.run(runnable, 250);
    }

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Random random = new Random();
            view.setTextColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            updateColor();
        }
    };
}
