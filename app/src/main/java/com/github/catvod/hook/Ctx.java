package com.github.catvod.hook;

import android.content.Context;
import android.content.ContextWrapper;

public class Ctx extends ContextWrapper {

    public Ctx(Context base) {
        super(base);
    }

    @Override
    public String getPackageName() {
        return "com.android.chrome";
    }
}
