package com.github.catvod.net;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

public class CallBack {

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String val) {
        result = val;
    }

    public void onSuccess(Call call, Response response) {
        setResult(onParseResponse(call, response));
    }

    public void onError() {
        setResult("");
    }

    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }
}
