package com.github.catvod.net;

import android.text.TextUtils;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

class OkRequest {

    private final String mMethodType;
    private final Map<String, String> mParamsMap;
    private final String mJsonStr;
    private final Map<String, String> mHeaderMap;
    private final CallBack mCallBack;
    private String mUrl;
    private Object mTag = null;
    private Request mOkHttpRequest;
    private Request.Builder mRequestBuilder;

    OkRequest(String methodType, String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBack callBack) {
        this(methodType, url, null, paramsMap, headerMap, callBack);
    }

    OkRequest(String methodType, String url, String jsonStr, Map<String, String> headerMap, CallBack callBack) {
        this(methodType, url, jsonStr, null, headerMap, callBack);
    }

    private OkRequest(String methodType, String url, String jsonStr, Map<String, String> paramsMap, Map<String, String> headerMap, CallBack callBack) {
        mMethodType = methodType;
        mUrl = url;
        mJsonStr = jsonStr;
        mParamsMap = paramsMap;
        mHeaderMap = headerMap;
        mCallBack = callBack;
        getInstance();
    }

    public void setTag(Object tag) {
        mTag = tag;
    }

    private void getInstance() {
        mRequestBuilder = new Request.Builder();
        switch (mMethodType) {
            case OkHttp.METHOD_GET:
                setGetParams();
                break;
            case OkHttp.METHOD_POST:
                mRequestBuilder.post(getRequestBody());
                break;
        }
        mRequestBuilder.url(mUrl);
        if (mTag != null)
            mRequestBuilder.tag(mTag);
        if (mHeaderMap != null) {
            setHeader();
        }
        mOkHttpRequest = mRequestBuilder.build();
    }

    private RequestBody getRequestBody() {
        if (!TextUtils.isEmpty(mJsonStr)) {
            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            return RequestBody.create(JSON, mJsonStr);
        }
        FormBody.Builder formBody = new FormBody.Builder();
        if (mParamsMap != null) {
            for (String key : mParamsMap.keySet()) {
                formBody.add(key, mParamsMap.get(key));
            }
        }
        return formBody.build();
    }

    private void setGetParams() {
        if (mParamsMap != null) {
            mUrl = mUrl + "?";
            for (String key : mParamsMap.keySet()) {
                mUrl = mUrl + key + "=" + mParamsMap.get(key) + "&";
            }
            mUrl = mUrl.substring(0, mUrl.length() - 1);
        }
    }

    private void setHeader() {
        if (mHeaderMap != null) {
            for (String key : mHeaderMap.keySet()) {
                mRequestBuilder.addHeader(key, mHeaderMap.get(key));
            }
        }
    }

    void execute(OkHttpClient client) {
        Call call = client.newCall(mOkHttpRequest);
        try {
            Response response = call.execute();
            if (mCallBack != null) {
                mCallBack.onSuccess(call, response);
            }
        } catch (IOException e) {
            if (mCallBack != null) {
                mCallBack.onError();
            }
        }
    }
}
