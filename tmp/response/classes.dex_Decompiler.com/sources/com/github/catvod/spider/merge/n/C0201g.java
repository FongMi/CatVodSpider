package com.github.catvod.spider.merge.n;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.a.C0098a;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0201g extends SSLSocketFactory {

    @SuppressLint({"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager d = new C0200f();
    private SSLSocketFactory a;
    private String[] b;
    private String[] c;

    public C0201g() {
        try {
            LinkedList linkedList = new LinkedList();
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.toUpperCase().contains(C0098a.a(new byte[]{114, 99, -126}, new byte[]{33, 48, -50, 64, 17, 22, 5, 41}))) {
                    linkedList.add(str);
                }
            }
            this.c = (String[]) linkedList.toArray(new String[0]);
            List listAsList = Arrays.asList(C0098a.a(new byte[]{89, -128, -89, 93, 98, 48, 87, 73, 90, -123, -96, 74, 111, 34, 83, 69, 82, -2, -63, 52, 111, 36, 85, 91, 82, -97, -68, 67, 3, 91, 34}, new byte[]{13, -52, -12, 2, 48, 99, 22, 22}), C0098a.a(new byte[]{77, -95, 119, -102, 44, -41, 77, -56, 78, -92, 112, -115, 33, -59, 73, -60, 70, -36, 22, -3, 33, -61, 79, -38, 70, -66, 108, -124, 76, -79, 58}, new byte[]{25, -19, 36, -59, 126, -124, 12, -105}), C0098a.a(new byte[]{47, -128, -127, -33, -72, 110, 109, -25, 62, -109, -105, -61, -71, 126, 104, -16, 44, -123, -122, -56, -94, 108, 108, -4, 36, -3, -32, -72, -94, 110, 107, -20, 36, -97, -102, -63, -49, 24, 31}, new byte[]{123, -52, -46, -128, -3, 45, 41, -81}), C0098a.a(new byte[]{50, 12, 19, -69, 10, 112, -7, -53, 35, 31, 5, -89, 11, 96, -4, -36, 49, 9, 20, -84, 16, 114, -8, -48, 57, 113, 114, -36, 16, 116, -2, -50, 57, 19, 8, -91, 125, 6, -117}, new byte[]{102, 64, 64, -28, 79, 51, -67, -125}), C0098a.a(new byte[]{115, 85, 113, -89, 103, -114, 29, 75, 98, 70, 103, -69, 102, -98, 24, 92, 112, 80, 118, -80, 125, -116, 28, 80, 120, 43, 23, -50, 125, -118, 26, 78, 120, 74, 106, -71, 17, -11, 109}, new byte[]{39, 25, 34, -8, 34, -51, 89, 3}), C0098a.a(new byte[]{-90, 126, 121, 15, 66, -74, 54, 115, -73, 109, 120, 3, 70, -86, 37, 114, -90, 122, 117, 17, 66, -90, 45, 10, -64, 10, 117, 19, 69, -74, 45, 104, -70, 115, 24, 101, 49}, new byte[]{-14, 50, 42, 80, 7, -11, 114, 59}), C0098a.a(new byte[]{-27, 83, -97, -58, 50, 19, 22, -50, -12, 64, -98, -54, 54, 15, 9, -61, -27, 87, -109, -40, 50, 3, 1, -69, -125, 39, -109, -34, 52, 29, 1, -39, -7, 94, -2, -84, 65}, new byte[]{-79, 31, -52, -103, 119, 80, 94, -118}), C0098a.a(new byte[]{-15, 13, 65, 88, -41, 66, -63, -10, -14, 8, 70, 79, -38, 34, -60, -20, -10, 30, 87, 67, -64, 78, -61, -21, -26, 30, 65, 79, -60}, new byte[]{-91, 65, 18, 7, -123, 17, -128, -87}), C0098a.a(new byte[]{36, -44, -67, -14, -26, 43, 52, -107, 39, -47, -70, -27, -21, 57, 48, -103, 47, -87, -36, -107, -21, 59, 55, -119, 47, -53, -90, -20}, new byte[]{112, -104, -18, -83, -76, 120, 117, -54}), C0098a.a(new byte[]{8, 36, -46, -11, 127, -111, -64, 120, 11, 33, -43, -30, 114, -125, -60, 116, 3, 90, -76, -100, 114, -127, -61, 100, 3, 59, -55, -21}, new byte[]{92, 104, -127, -86, 45, -62, -127, 39}), C0098a.a(new byte[]{-52, -70, 121, 81, 122, -82, 85, 57, -35, -87, 111, 77, 123, -66, 80, 46, -49, -65, 126, 70, 96, -34, 85, 52, -53, -87, 111, 74, 122, -78, 82, 51, -37, -87, 121, 70, 126}, new byte[]{-104, -10, 42, 14, 63, -19, 17, 113}), C0098a.a(new byte[]{-18, -56, 22, 99, 100, 67, 86, -12, -1, -37, 0, 127, 101, 83, 83, -29, -19, -51, 17, 116, 126, 65, 87, -17, -27, -75, 119, 4, 126, 67, 80, -1, -27, -41, 13, 125}, new byte[]{-70, -124, 69, 60, 33, 0, 18, -68}), C0098a.a(new byte[]{-109, -55, -10, 27, 25, -123, 114, 111, -126, -38, -9, 23, 29, -103, 97, 110, -109, -51, -6, 119, 24, -125, 101, 120, -126, -63, -32, 27, 31, -124, 117, 120, -108, -51, -28}, new byte[]{-57, -123, -91, 68, 92, -58, 54, 39}), C0098a.a(new byte[]{82, -79, -84, 61, -36, -62, 41, 79, 67, -94, -83, 49, -40, -34, 58, 78, 82, -75, -96, 35, -36, -46, 50, 54, 52, -59, -96, 33, -37, -62, 50, 84, 78, -68}, new byte[]{6, -3, -1, 98, -103, -127, 109, 7}));
            List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(listAsList);
            hashSet.retainAll(listAsList2);
            hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
            this.b = (String[]) hashSet.toArray(new String[0]);
            SSLContext sSLContext = SSLContext.getInstance(C0098a.a(new byte[]{-112, 91, -53}, new byte[]{-60, 23, -104, -22, -20, 122, 85, 32}));
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
