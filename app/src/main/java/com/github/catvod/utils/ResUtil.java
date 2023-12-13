package com.github.catvod.utils;

import android.util.DisplayMetrics;
import android.util.TypedValue;

import com.github.catvod.spider.Init;

public class ResUtil {

    private static DisplayMetrics getDisplayMetrics() {
        return Init.context().getResources().getDisplayMetrics();
    }

    public static int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getDisplayMetrics());
    }
}
