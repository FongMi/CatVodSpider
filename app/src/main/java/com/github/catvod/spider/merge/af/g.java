package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.nIe;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (request.url().host().equals(nIe.d("250F2720262B27483D263D"))) {
            request = request.newBuilder().addHeader(nIe.d("17153631640E25033D37"), nIe.d("0F09292A25232349666D796F6A313A2D2D203515730D1D6F73567D73726F150F3D757D74621E6577606F0316232F2C182704182A3D607755646D7A79624E180B1D020E4A732F2024274614262A242D4F7300213D2D0B366C787E7548636D7961724600222F2E300F7C767A786C5565")).build();
        }
        Response responseProceed = chain.proceed(request);
        String strHeader = responseProceed.header(nIe.d("01093D372C21364B162D2A20260F3D24"));
        if (responseProceed.body() == null || strHeader == null || !strHeader.equals(nIe.d("2603352F283B27"))) {
            return responseProceed;
        }
        return responseProceed.newBuilder().headers(responseProceed.headers()).body(new f(responseProceed, new InflaterInputStream(responseProceed.body().byteStream(), new Inflater(true)))).build();
    }
}
