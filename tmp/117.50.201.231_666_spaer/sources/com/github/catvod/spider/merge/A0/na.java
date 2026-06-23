package com.github.catvod.spider.merge.A0;

import java.io.File;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rxhttp.wrapper.entity.FileRequestBody;
import rxhttp.wrapper.entity.UpFile;
import rxhttp.wrapper.param.IPart;
import rxhttp.wrapper.param.Param;
import rxhttp.wrapper.utils.BuildUtil;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract /* synthetic */ class na {
    public static Param a(IPart iPart, UpFile upFile) {
        File file = upFile.getFile();
        if (!file.exists()) {
            throw new IllegalArgumentException("File '" + file.getAbsolutePath() + "' does not exist");
        }
        if (file.isFile()) {
            return iPart.addPart(MultipartBody.Part.createFormData(upFile.getKey(), upFile.getFilename(), new FileRequestBody(upFile.getFile(), upFile.getSkipSize(), BuildUtil.getMediaType(upFile.getFilename()))));
        }
        throw new IllegalArgumentException("File '" + file.getAbsolutePath() + "' is not a file");
    }

    public static Param b(IPart iPart, String str, String str2, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.createFormData(str, str2, requestBody));
    }

    public static Param c(IPart iPart, Headers headers, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.create(headers, requestBody));
    }

    public static Param d(IPart iPart, MediaType mediaType, byte[] bArr) {
        return iPart.addPart(RequestBody.create(mediaType, bArr));
    }

    public static Param e(IPart iPart, MediaType mediaType, byte[] bArr, int i, int i2) {
        return iPart.addPart(RequestBody.create(mediaType, bArr, i, i2));
    }

    public static Param f(IPart iPart, RequestBody requestBody) {
        return iPart.addPart(MultipartBody.Part.create(requestBody));
    }
}
