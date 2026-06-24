package com.github.catvod.utils;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

public abstract class OkHttpCallback<T> {
    private T l8 = null;

    public static abstract class aA extends OkHttpCallback<Response> {
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    public static abstract class ut extends OkHttpCallback<String> {
        public void onError(Call call, Exception exc) {
            S("");
            super.onError(call, exc);
        }

        public String onParseResponse(Call call, Response response) {
            try {
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    protected void S(T t) {
        this.l8 = t;
    }

    public T getResult() {
        return this.l8;
    }

    protected void l8(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        S(tOnParseResponse);
        onResponse(tOnParseResponse);
    }

    protected void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected String onResponse(T t) {
        return t != null ? t.toString() : "";
    }
}
