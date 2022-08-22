package com.github.catvod.net;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

public abstract class OKCallBack<T> {

    private T result = null;

    public T getResult() {
        return result;
    }

    protected void setResult(T val) {
        result = val;
    }

    protected void onError(final Call call, final Exception e) {
        onFailure(call, e);
    }

    protected void onSuccess(Call call, Response response) {
        T obj = onParseResponse(call, response);
        setResult(obj);
        onResponse(obj);
    }

    protected abstract T onParseResponse(Call call, Response response);

    protected void onFailure(Call call, Exception e) {
    }

    protected abstract void onResponse(T response);

    public static class OKCallBackDefault extends OKCallBack<Response> {

        @Override
        public Response onParseResponse(Call call, Response response) {
            return response;
        }

        @Override
        protected void onResponse(Response response) {
        }
    }

    public static class OKCallBackString extends OKCallBack<String> {

        @Override
        public void onError(Call call, Exception e) {
            setResult("");
            super.onError(call, e);
        }

        @Override
        public String onParseResponse(Call call, Response response) {
            try {
                return response.body().string();
            } catch (IOException e) {
                return "";
            }
        }

        @Override
        protected void onFailure(Call call, Exception e) {
            setResult("");
            super.onFailure(call, e);
        }

        @Override
        protected void onResponse(String response) {
        }
    }
}
