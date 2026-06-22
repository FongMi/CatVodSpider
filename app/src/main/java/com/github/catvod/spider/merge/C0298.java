package com.github.catvod.spider.merge;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ލ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0298 extends SSLSocketFactory {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static String[] f732;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    static String[] f733;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final X509TrustManager f734;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final SSLSocketFactory f735;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ލ$Ϳ, reason: contains not printable characters */
    class C0299 implements X509TrustManager {
        C0299() {
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
                    if (!str.toUpperCase().contains(SOY.d("29011D"))) {
                        linkedList.add(str);
                    }
                }
                f732 = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List listAsList = Arrays.asList(SOY.d("2E1E022926243B0D063F203F251314252B454F640E31373A25011937474F4E"), SOY.d("2E1E022926243B0D063F203F251314252B46486A0E31373A2501193746424C"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B3438110E253C36486767"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B30391F0E253C36486767"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E373124256064402B30391F0E253C36496A65"), SOY.d("2E1E022931343E1A142926243B0D063F203F251314252B46486A0E3536342501193746424C"), SOY.d("2E1E022931343216142926243B0D063F203F251314252B46486A0E31373A2501193746424C"), SOY.d("2E1E022926243B0D063F203F2561153327283F1614293735390D023E35"), SOY.d("2E1E022926243B0D063F203F251314252B46486A0E35363425011937"), SOY.d("2E1E022926243B0D063F203F251314252B454F640E35363425011937"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E453032290D1432312839101229273F3B"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B3438110E253C36"), SOY.d("2E1E022931343E1A142926243B0D063F203F2561153327283F1614293735390D023E35"), SOY.d("2E1E022931343E1A142926243B0D063F203F251314252B46486A0E35363425011937"));
                    List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(listAsList);
                    hashSet.retainAll(listAsList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    f733 = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
            f734 = new C0299();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C0298(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(SOY.d("2E1E02"));
            sSLContext.init(null, x509TrustManager != null ? new X509TrustManager[]{x509TrustManager} : null, null);
            this.f735 = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private void m1093(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2 = f732;
        if (strArr2 != null) {
            sSLSocket.setEnabledProtocols(strArr2);
        }
        if (Build.VERSION.SDK_INT >= 21 || (strArr = f733) == null) {
            return;
        }
        sSLSocket.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f735.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            m1093((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return f733;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return f733;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket socketCreateSocket = this.f735.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m1093((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketCreateSocket = this.f735.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m1093((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketCreateSocket = this.f735.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            m1093((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketCreateSocket = this.f735.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            m1093((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }
}
