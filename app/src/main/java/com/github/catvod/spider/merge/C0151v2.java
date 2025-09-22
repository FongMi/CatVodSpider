package com.github.catvod.spider.merge;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.github.catvod.spider.merge.v2 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0151v2 extends SSLSocketFactory {

    /* renamed from: QU */
    public static final X509TrustManager f744QU;

    /* renamed from: q */
    static String[] f745q;

    /* renamed from: xC */
    static String[] f746xC;

    /* renamed from: UJ */
    private final SSLSocketFactory f747UJ;

    /* renamed from: com.github.catvod.spider.merge.v2$p */
    static class p implements X509TrustManager {
        p() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains("SSL")) {
                        linkedList.add(str);
                    }
                }
                f745q = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List listAsList = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
                    List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(listAsList);
                    hashSet.retainAll(listAsList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    f746xC = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
            f744QU = new p();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C0151v2(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, x509TrustManager != null ? new X509TrustManager[]{x509TrustManager} : null, null);
            this.f747UJ = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: q */
    private void m719q(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2 = f745q;
        if (strArr2 != null) {
            sSLSocket.setEnabledProtocols(strArr2);
        }
        if (Build.VERSION.SDK_INT >= 21 || (strArr = f746xC) == null) {
            return;
        }
        sSLSocket.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f747UJ.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            m719q((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return f746xC;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return f746xC;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket socketCreateSocket = this.f747UJ.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m719q((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketCreateSocket = this.f747UJ.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m719q((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketCreateSocket = this.f747UJ.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m719q((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketCreateSocket = this.f747UJ.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m719q((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }
}
