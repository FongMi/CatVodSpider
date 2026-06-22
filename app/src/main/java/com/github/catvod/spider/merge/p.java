package com.github.catvod.spider.merge;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class p extends t<Response> {
    @Override // com.github.catvod.spider.merge.t
    public Response onParseResponse(Call call, Response response) {
        return response;
    }
}
