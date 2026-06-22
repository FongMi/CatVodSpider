package com.github.catvod.spider.merge.q;

import android.os.Build;
import com.github.catvod.spider.merge.a.C0098a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class h extends SSLSocketFactory {
    static String[] b;
    static String[] c;
    public static final X509TrustManager d;
    private final SSLSocketFactory a;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains(C0098a.a(new byte[]{124, 35, -30}, new byte[]{47, 112, -82, -75, -5, -57, 123, 38}))) {
                        linkedList.add(str);
                    }
                }
                b = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List listAsList = Arrays.asList(C0098a.a(new byte[]{105, 78, -90, -115, -111, -87, 102, -115, 106, 75, -95, -102, -100, -69, 98, -127, 98, 48, -64, -28, -100, -67, 100, -97, 98, 81, -67, -109, -16, -62, 19}, new byte[]{61, 2, -11, -46, -61, -6, 39, -46}), C0098a.a(new byte[]{-127, 30, 4, -116, 96, 26, 118, 23, -126, 27, 3, -101, 109, 8, 114, 27, -118, 99, 101, -21, 109, 14, 116, 5, -118, 1, 31, -110, 0, 124, 1}, new byte[]{-43, 82, 87, -45, 50, 73, 55, 72}), C0098a.a(new byte[]{34, -80, 23, 7, 110, -71, 105, -124, 51, -93, 1, 27, 111, -87, 108, -109, 33, -75, 16, 16, 116, -69, 104, -97, 41, -51, 118, 96, 116, -71, 111, -113, 41, -81, 12, 25, 25, -49, 27}, new byte[]{118, -4, 68, 88, 43, -6, 45, -52}), C0098a.a(new byte[]{-58, 70, -56, -116, 14, -82, -1, 109, -41, 85, -34, -112, 15, -66, -6, 122, -59, 67, -49, -101, 20, -84, -2, 118, -51, 59, -87, -21, 20, -86, -8, 104, -51, 89, -45, -110, 121, -40, -115}, new byte[]{-110, 10, -101, -45, 75, -19, -69, 37}), C0098a.a(new byte[]{-3, 48, -119, -20, -28, -86, 120, -48, -20, 35, -97, -16, -27, -70, 125, -57, -2, 53, -114, -5, -2, -88, 121, -53, -10, 78, -17, -123, -2, -82, 127, -43, -10, 47, -110, -14, -110, -47, 8}, new byte[]{-87, 124, -38, -77, -95, -23, 60, -104}), C0098a.a(new byte[]{117, -113, 60, -35, 42, -120, 102, 48, 100, -100, 61, -47, 46, -108, 117, 49, 117, -117, 48, -61, 42, -104, 125, 73, 19, -5, 48, -63, 45, -120, 125, 43, 105, -126, 93, -73, 89}, new byte[]{33, -61, 111, -126, 111, -53, 34, 120}), C0098a.a(new byte[]{83, 42, -122, 73, -43, -52, -36, -92, 66, 57, -121, 69, -47, -48, -61, -87, 83, 46, -118, 87, -43, -36, -53, -47, 53, 94, -118, 81, -45, -62, -53, -77, 79, 39, -25, 35, -90}, new byte[]{7, 102, -43, 22, -112, -113, -108, -32}), C0098a.a(new byte[]{24, 83, -62, -96, -1, -48, -67, -95, 27, 86, -59, -73, -14, -80, -72, -69, 31, 64, -44, -69, -24, -36, -65, -68, 15, 64, -62, -73, -20}, new byte[]{76, 31, -111, -1, -83, -125, -4, -2}), C0098a.a(new byte[]{17, 62, 67, -2, -121, -73, 40, -121, 18, 59, 68, -23, -118, -91, 44, -117, 26, 67, 34, -103, -118, -89, 43, -101, 26, 33, 88, -32}, new byte[]{69, 114, 16, -95, -43, -28, 105, -40}), C0098a.a(new byte[]{-60, 96, 98, 119, 50, -125, -87, 97, -57, 101, 101, 96, 63, -111, -83, 109, -49, 30, 4, 30, 63, -109, -86, 125, -49, 127, 121, 105}, new byte[]{-112, 44, 49, 40, 96, -48, -24, 62}), C0098a.a(new byte[]{-84, 42, -29, 2, 12, 104, -11, 112, -67, 57, -11, 30, 13, 120, -16, 103, -81, 47, -28, 21, 22, 24, -11, 125, -85, 57, -11, 25, 12, 116, -14, 122, -69, 57, -29, 21, 8}, new byte[]{-8, 102, -80, 93, 73, 43, -79, 56}), C0098a.a(new byte[]{38, 36, -107, -126, 12, 67, 87, 61, 55, 55, -125, -98, 13, 83, 82, 42, 37, 33, -110, -107, 22, 65, 86, 38, 45, 89, -12, -27, 22, 67, 81, 54, 45, 59, -114, -100}, new byte[]{114, 104, -58, -35, 73, 0, 19, 117}), C0098a.a(new byte[]{47, 99, 60, 55, 15, -61, -111, -43, 62, 112, 61, 59, 11, -33, -126, -44, 47, 103, 48, 91, 14, -59, -122, -62, 62, 107, 42, 55, 9, -62, -106, -62, 40, 103, 46}, new byte[]{123, 47, 111, 104, 74, -128, -43, -99}), C0098a.a(new byte[]{9, -88, 18, -24, 95, -87, 57, 124, 24, -69, 19, -28, 91, -75, 42, 125, 9, -84, 30, -10, 95, -71, 34, 5, 111, -36, 30, -12, 88, -87, 34, 103, 21, -91}, new byte[]{93, -28, 65, -73, 26, -22, 125, 52}));
                    List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(listAsList);
                    hashSet.retainAll(listAsList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    c = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
            d = new g();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public h(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(C0098a.a(new byte[]{-2, 44, 127}, new byte[]{-86, 96, 44, 74, -25, 13, -49, 76}));
            sSLContext.init(null, x509TrustManager != null ? new X509TrustManager[]{x509TrustManager} : null, null);
            this.a = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2 = b;
        if (strArr2 != null) {
            sSLSocket.setEnabledProtocols(strArr2);
        }
        if (Build.VERSION.SDK_INT >= 21 || (strArr = c) == null) {
            return;
        }
        sSLSocket.setEnabledCipherSuites(strArr);
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
        return c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return c;
    }
}
