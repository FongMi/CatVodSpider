package com.github.catvod.spider.merge.af;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.nIe;
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
public final class i extends SSLSocketFactory {

    @SuppressLint({"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager d = new h();
    private SSLSocketFactory a;
    private String[] b;
    private String[] c;

    public i() {
        try {
            LinkedList linkedList = new LinkedList();
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.toUpperCase().contains(nIe.d("11351F"))) {
                    linkedList.add(str);
                }
            }
            this.c = (String[]) linkedList.toArray(new String[0]);
            List listAsList = Arrays.asList(nIe.d("162A001C1B1C0339040A1D071D271610167D77500C040A021D351B027A7776"), nIe.d("162A001C1B1C0339040A1D071D271610167E705E0C040A021D351B027B7A74"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B160C00250C10010E705365"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B1608012B0C10010E705365"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D5466751608012B0C10010E715E67"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D271610167E705E0C000B0C1D351B027B7A74"), nIe.d("162A001C0C0C0A22161C1B1C0339040A1D071D271610167E705E0C040A021D351B027B7A74"), nIe.d("162A001C1B1C0339040A1D071D5517061A100722161C0A0D0139000B08"), nIe.d("162A001C1B1C0339040A1D071D271610167E705E0C000B0C1D351B02"), nIe.d("162A001C1B1C0339040A1D071D271610167D77500C000B0C1D351B02"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C700D0A113916070C100124101C1A0703"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B160C00250C10010E"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D5517061A100722161C0A0D0139000B08"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D271610167E705E0C000B0C1D351B02"));
            List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(listAsList);
            hashSet.retainAll(listAsList2);
            hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
            this.b = (String[]) hashSet.toArray(new String[0]);
            SSLContext sSLContext = SSLContext.getInstance(nIe.d("162A00"));
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
