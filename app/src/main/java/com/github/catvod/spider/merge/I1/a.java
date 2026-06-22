package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.F1.C0628d;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a {
    private String a;
    private String b;
    private boolean c;
    private EnumC1316h e;
    private String f;
    private String h;
    private String i;
    private Locale j;
    private int k;
    private C0628d l;
    private int d = 1;
    private int g = -1;

    public final b m() {
        if (this.a == null) {
            throw new IllegalStateException("The identifier of the audio stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
        }
        if (this.b == null) {
            throw new IllegalStateException("The content of the audio stream has been not set or is null. Please specify a non-null one with setContent.");
        }
        if (this.d != 0) {
            return new b(this);
        }
        throw new IllegalStateException("The delivery method of the audio stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
    }

    public final a n(Locale locale) {
        this.j = locale;
        return this;
    }

    public final a o(String str) {
        this.h = str;
        return this;
    }

    public final a p(String str) {
        this.i = str;
        return this;
    }

    public final a q(int i) {
        this.k = i;
        return this;
    }

    public final a r(int i) {
        this.g = i;
        return this;
    }

    public final a s(String str, boolean z) {
        this.b = str;
        this.c = z;
        return this;
    }

    public final a t(int i) {
        this.d = i;
        return this;
    }

    public final a u(String str) {
        this.a = str;
        return this;
    }

    public final a v(C0628d c0628d) {
        this.l = c0628d;
        return this;
    }

    public final a w(String str) {
        this.f = str;
        return this;
    }

    public final a x(EnumC1316h enumC1316h) {
        this.e = enumC1316h;
        return this;
    }
}
