package com.github.catvod.spider.merge.nU;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g extends SSLSocketFactory {

    @SuppressLint({"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager d = new f();
    private SSLSocketFactory a;
    private String[] b;
    private String[] c;

    public g() {
        try {
            LinkedList linkedList = new LinkedList();
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.toUpperCase().contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, 24, -106}, new byte[]{4, 75, -38, 32, -52, -89, -87, -107}))) {
                    linkedList.add(str);
                }
            }
            this.c = (String[]) linkedList.toArray(new String[0]);
            List listAsList = Arrays.asList(com.github.catvod.spider.merge.XI.f.a(new byte[]{-87, 101, -34, 62, -6, 16, -8, -65, -86, 96, -39, 41, -9, 2, -4, -77, -94, 27, -72, 87, -9, 4, -6, -83, -94, 122, -59, 32, -101, 123, -115}, new byte[]{-3, 41, -115, 97, -88, 67, -71, -32}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-98, -90, -47, 21, 58, 26, 57, -36, -99, -93, -42, 2, 55, 8, 61, -48, -107, -37, -80, 114, 55, 14, 59, -50, -107, -71, -54, 11, 90, 124, 78}, new byte[]{-54, -22, -126, 74, 104, 73, 120, -125}), com.github.catvod.spider.merge.XI.f.a(new byte[]{76, 104, -91, 10, -87, -123, 50, 27, 93, 123, -77, 22, -88, -107, 55, 12, 79, 109, -94, 29, -77, -121, 51, 0, 71, 21, -60, 109, -77, -123, 52, 16, 71, 119, -66, 20, -34, -13, 64}, new byte[]{24, 36, -10, 85, -20, -58, 118, 83}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-107, 12, 79, 75, -112, -19, -127, -79, -124, 31, 89, 87, -111, -3, -124, -90, -106, 9, 72, 92, -118, -17, -128, -86, -98, 113, 46, 44, -118, -23, -122, -76, -98, 19, 84, 85, -25, -101, -13}, new byte[]{-63, 64, 28, 20, -43, -82, -59, -7}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-23, -116, 13, 75, -111, -72, -13, 81, -8, -97, 27, 87, -112, -88, -10, 70, -22, -119, 10, 92, -117, -70, -14, 74, -30, -14, 107, 34, -117, -68, -12, 84, -30, -109, 22, 85, -25, -61, -125}, new byte[]{-67, -64, 94, 20, -44, -5, -73, 25}), com.github.catvod.spider.merge.XI.f.a(new byte[]{108, 107, 53, -5, -25, 33, -11, 2, 125, 120, 52, -9, -29, 61, -26, 3, 108, 111, 57, -27, -25, 49, -18, 123, 10, 31, 57, -25, -32, 33, -18, 25, 112, 102, 84, -111, -108}, new byte[]{56, 39, 102, -92, -94, 98, -79, 74}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-56, 114, -99, 82, -73, 29, -46, 42, -39, 97, -100, 94, -77, 1, -51, 39, -56, 118, -111, 76, -73, 13, -59, 95, -82, 6, -111, 74, -79, 19, -59, 61, -44, 127, -4, 56, -60}, new byte[]{-100, 62, -50, 13, -14, 94, -102, 110}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, -88, 34, -109, 64, -126, 121, 112, -68, -83, 37, -124, 77, -30, 124, 106, -72, -69, 52, -120, 87, -114, 123, 109, -88, -69, 34, -124, 83}, new byte[]{-21, -28, 113, -52, 18, -47, 56, 47}), com.github.catvod.spider.merge.XI.f.a(new byte[]{101, -27, 5, -45, 107, 74, 97, -54, 102, -32, 2, -60, 102, 88, 101, -58, 110, -104, 100, -76, 102, 90, 98, -42, 110, -6, 30, -51}, new byte[]{49, -87, 86, -116, 57, 25, 32, -107}), com.github.catvod.spider.merge.XI.f.a(new byte[]{1, -20, -41, 1, 50, -100, -41, 85, 2, -23, -48, 22, 63, -114, -45, 89, 10, -110, -79, 104, 63, -116, -44, 73, 10, -13, -52, 31}, new byte[]{85, -96, -124, 94, 96, -49, -106, 10}), com.github.catvod.spider.merge.XI.f.a(new byte[]{42, -69, -126, 124, 26, -29, -16, -120, 59, -88, -108, 96, 27, -13, -11, -97, 41, -66, -123, 107, 0, -109, -16, -123, 45, -88, -108, 103, 26, -1, -9, -126, 61, -88, -126, 107, 30}, new byte[]{126, -9, -47, 35, 95, -96, -76, -64}), com.github.catvod.spider.merge.XI.f.a(new byte[]{9, 92, 69, -15, 62, -95, -5, 99, 24, 79, 83, -19, 63, -79, -2, 116, 10, 89, 66, -26, 36, -93, -6, 120, 2, 33, 36, -106, 36, -95, -3, 104, 2, 67, 94, -17}, new byte[]{93, 16, 22, -82, 123, -30, -65, 43}), com.github.catvod.spider.merge.XI.f.a(new byte[]{77, 120, -84, -67, 113, 73, 10, 84, 92, 107, -83, -79, 117, 85, 25, 85, 77, 124, -96, -47, 112, 79, 29, 67, 92, 112, -70, -67, 119, 72, 13, 67, 74, 124, -66}, new byte[]{25, 52, -1, -30, 52, 10, 78, 28}), com.github.catvod.spider.merge.XI.f.a(new byte[]{61, -112, -97, -46, -56, 36, -78, 61, 44, -125, -98, -34, -52, 56, -95, 60, 61, -108, -109, -52, -56, 52, -87, 68, 91, -28, -109, -50, -49, 36, -87, 38, 33, -99}, new byte[]{105, -36, -52, -115, -115, 103, -10, 117}));
            List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(listAsList);
            hashSet.retainAll(listAsList2);
            hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
            this.b = (String[]) hashSet.toArray(new String[0]);
            SSLContext sSLContext = SSLContext.getInstance(com.github.catvod.spider.merge.XI.f.a(new byte[]{-91, 51, 38}, new byte[]{-15, 127, 117, 69, -52, -55, 77, 16}));
            sSLContext.init(null, new X509TrustManager[]{d}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            this.a = socketFactory;
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArr = this.c;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.b;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            a((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.b;
    }
}
