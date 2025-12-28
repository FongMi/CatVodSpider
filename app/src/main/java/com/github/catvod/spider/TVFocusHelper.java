package com.github.catvod.spider;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;

public class TVFocusHelper {

    // 确保View在TV上可获得焦点
    public static void setupTVFocus(View view) {
        if (view == null) return;

        view.setFocusable(true);
        view.setFocusableInTouchMode(true);

        // 设置焦点变化监听
        view.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    v.setScaleX(1.1f);
                    v.setScaleY(1.1f);
                    // 使用兼容的方式设置阴影效果
                    setFocusEffect(v, true);
                } else {
                    v.setScaleX(1.0f);
                    v.setScaleY(1.0f);
                    setFocusEffect(v, false);
                }
            }
        });

        // 递归设置子View的焦点
        if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            for (int i = 0; i < group.getChildCount(); i++) {
                setupTVFocus(group.getChildAt(i));
            }
        }
    }

    // 兼容的焦点效果设置
    private static void setFocusEffect(View v, boolean hasFocus) {
        try {
            // 尝试使用 setElevation（API 21+）
            if (hasFocus) {
                // 使用反射调用 setElevation，避免直接引用
                try {
                    java.lang.reflect.Method setElevation = v.getClass().getMethod("setElevation", float.class);
                    setElevation.invoke(v, 8f);
                } catch (Exception e) {
                    // 回退到其他效果
                    v.setBackgroundColor(Color.parseColor("#FF007AFF"));
                }
            } else {
                try {
                    java.lang.reflect.Method setElevation = v.getClass().getMethod("setElevation", float.class);
                    setElevation.invoke(v, 0f);
                } catch (Exception e) {
                    // 回退到其他效果
                    v.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        } catch (Exception e) {
            // 如果出错，使用简单的背景色变化
            if (hasFocus) {
                v.setBackgroundColor(Color.parseColor("#FF007AFF"));
            } else {
                v.setBackgroundColor(Color.TRANSPARENT);
            }
        }
    }
}