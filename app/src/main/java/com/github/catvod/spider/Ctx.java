package com.github.catvod.spider;

import android.content.Context;
import android.content.ContextWrapper;

public class Ctx extends ContextWrapper {

    public Ctx(Context base) {
        super(base);
    }

    @Override
    public String getPackageName() {
        return "com.alicloud.databox";
    }
}
