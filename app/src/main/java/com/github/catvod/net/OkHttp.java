package com.github.catvod.net;

import android.net.Uri;

import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Prefers;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp {

    public static final String POST = "POST";
    public static final String GET = "GET";

    private OkHttpClient proxy;
    private OkHttpClient client;

    private static class Loader {
        static volatile OkHttp INSTANCE = new OkHttp();
    }

    public static OkHttp get() {
        return Loader.INSTANCE;
    }

    public static Dns dns() {
        return Spider.safeDns();
    }

    public void resetProxy() {
        Authenticator.setDefault(null);
        proxy = null;
    }

    public static OkHttpClient client() {
        if (get().client != null) return get().client;
        return get().client = getBuilder().build();
    }

    public static OkHttpClient proxy() {
        if (get().proxy != null) return get().proxy;
        return get().proxy = getBuilder(Prefers.getString("proxy")).build();
    }

    public static OkHttpClient client(boolean proxy) {
        return proxy ? proxy() : client();
    }

    public static OkHttpClient noRedirect(boolean proxy) {
        return client(proxy).newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    public static Response newCall(String url, Map<String, String> header) throws IOException {
        return client(false).newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute();
    }

    public static String string(String url) {
        return string(false, url);
    }

    public static String string(boolean proxy, String url) {
        return string(proxy, url, null);
    }

    public static String string(String url, Map<String, String> header) {
        return string(false, url, header);
    }

    public static String string(boolean proxy, String url, Map<String, String> header) {
        return string(proxy, url, null, header);
    }

    public static String string(boolean proxy, String url, Map<String, String> params, Map<String, String> header) {
        return string(client(proxy), url, params, header);
    }

    public static String string(OkHttpClient client, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(GET, url, params, header).execute(client).getBody();
    }

    public static String post(String url, Map<String, String> params) {
        return post(false, url, params);
    }

    public static String post(boolean proxy, String url, Map<String, String> params) {
        return post(proxy, url, params, null).getBody();
    }

    public static String post(String url, String json) {
        return post(false, url, json);
    }

    public static String post(boolean proxy, String url, String json) {
        return post(proxy, url, json, null).getBody();
    }

    public static OkResult post(String url, String json, Map<String, String> header) {
        return post(false, url, json, header);
    }

    public static OkResult post(boolean proxy, String url, String json, Map<String, String> header) {
        return new OkRequest(POST, url, json, header).execute(client(proxy));
    }

    public static OkResult post(String url, Map<String, String> params, Map<String, String> header) {
        return post(false, url, params, header);
    }

    public static OkResult post(boolean proxy, String url, Map<String, String> params, Map<String, String> header) {
        return new OkRequest(POST, url, params, header).execute(client(proxy));
    }

    public static String getLocation(String url, Map<String, String> header) throws IOException {
        return getLocation(noRedirect(false).newCall(new Request.Builder().url(url).headers(Headers.of(header)).build()).execute().headers().toMultimap());
    }

    public static String getLocation(Map<String, List<String>> headers) {
        if (headers == null) return null;
        if (headers.containsKey("location")) return headers.get("location").get(0);
        if (headers.containsKey("Location")) return headers.get("Location").get(0);
        return null;
    }

    public static OkHttpClient.Builder getBuilder() {
        return new OkHttpClient.Builder().dns(dns()).connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).hostnameVerifier(SSLCompat.VERIFIER).sslSocketFactory(new SSLCompat(), SSLCompat.TM);
    }

    private static OkHttpClient.Builder getBuilder(String proxy) {
        Uri uri = Uri.parse(proxy);
        String userInfo = uri.getUserInfo();
        OkHttpClient.Builder builder = client().newBuilder();
        if (userInfo != null && userInfo.contains(":")) setAuthenticator(builder, userInfo);
        if (uri.getScheme() == null || uri.getHost() == null || uri.getPort() <= 0) return builder;
        if (uri.getScheme().startsWith("http")) builder.proxy(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
        if (uri.getScheme().startsWith("socks")) builder.proxy(new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort())));
        return builder;
    }

    private static void setAuthenticator(OkHttpClient.Builder builder, String userInfo) {
        builder.proxyAuthenticator((route, response) -> {
            String credential = Credentials.basic(userInfo.split(":")[0], userInfo.split(":")[1]);
            return response.request().newBuilder().header("Proxy-Authorization", credential).build();
        });
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userInfo.split(":")[0], userInfo.split(":")[1].toCharArray());
            }
        });
    }
}
