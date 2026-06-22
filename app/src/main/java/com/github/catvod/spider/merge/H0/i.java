package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.z;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i {
    private final g a;
    private final OutputStream b;
    private final BufferedInputStream c;
    private int d;
    private int e;
    private String f;
    private int g;
    private Map<String, List<String>> h;
    private Map<String, String> i;
    private d j;
    private String k;
    private String l;
    private String m;
    final /* synthetic */ t n;

    public i(t tVar, g gVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.n = tVar;
        this.a = gVar;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        this.l = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.i = new HashMap();
    }

    private void a(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws p {
        String strJ;
        n nVar = n.BAD_REQUEST;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new p(nVar, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new p(nVar, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(63);
            if (iIndexOf >= 0) {
                c(strNextToken.substring(iIndexOf + 1), map2);
                strJ = t.j(strNextToken.substring(0, iIndexOf));
            } else {
                strJ = t.j(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.m = stringTokenizer.nextToken();
            } else {
                this.m = "HTTP/1.1";
                t.k.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null || line2.trim().isEmpty()) {
                    break;
                }
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                }
            }
            map.put("uri", strJ);
        } catch (IOException e) {
            StringBuilder sbB = t0.b("SERVER INTERNAL ERROR: IOException: ");
            sbB.append(e.getMessage());
            throw new p(sbB.toString(), e);
        }
    }

    private void b(b bVar, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) throws Throwable {
        byte b;
        n nVar;
        Matcher matcher;
        n nVar2 = n.BAD_REQUEST;
        n nVar3 = n.INTERNAL_ERROR;
        try {
            int[] iArrF = f(byteBuffer, bVar.a().getBytes());
            if (iArrF.length < 2) {
                throw new p(nVar2, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            }
            int i = 1024;
            byte[] bArr = new byte[1024];
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < iArrF.length - 1) {
                byteBuffer.position(iArrF[i3]);
                int iRemaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                byteBuffer.get(bArr, i2, iRemaining);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, iRemaining), Charset.forName(bVar.e())), iRemaining);
                String line = bufferedReader.readLine();
                if (line == null || !line.contains(bVar.a())) {
                    throw new p(nVar2, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                }
                String line2 = bufferedReader.readLine();
                String string = null;
                String strTrim = null;
                int i5 = i4;
                int i6 = 2;
                String strGroup = null;
                while (line2 != null && line2.trim().length() > 0) {
                    Matcher matcher2 = t.h.matcher(line2);
                    if (matcher2.matches()) {
                        nVar = nVar2;
                        Matcher matcher3 = t.j.matcher(matcher2.group(2));
                        while (matcher3.find()) {
                            String str = strGroup;
                            String strGroup2 = matcher3.group(1);
                            if ("name".equalsIgnoreCase(strGroup2)) {
                                string = matcher3.group(2);
                            } else {
                                if ("filename".equalsIgnoreCase(strGroup2)) {
                                    strGroup = matcher3.group(2);
                                    if (strGroup.isEmpty()) {
                                        matcher = matcher3;
                                    } else if (i5 > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(string);
                                        matcher = matcher3;
                                        sb.append(String.valueOf(i5));
                                        i5++;
                                        string = sb.toString();
                                    } else {
                                        matcher = matcher3;
                                        i5++;
                                    }
                                }
                                matcher3 = matcher;
                            }
                            matcher = matcher3;
                            strGroup = str;
                            matcher3 = matcher;
                        }
                    } else {
                        nVar = nVar2;
                    }
                    Matcher matcher4 = t.i.matcher(line2);
                    if (matcher4.matches()) {
                        strTrim = matcher4.group(2).trim();
                    }
                    i6++;
                    line2 = bufferedReader.readLine();
                    nVar2 = nVar;
                }
                n nVar4 = nVar2;
                int i7 = 0;
                while (true) {
                    int i8 = i6 - 1;
                    if (i6 <= 0) {
                        break;
                    }
                    do {
                        b = bArr[i7];
                        i7++;
                    } while (b != 10);
                    i6 = i8;
                }
                if (i7 >= iRemaining - 4) {
                    throw new p(nVar3, "Multipart header size exceeds MAX_HEADER_SIZE.");
                }
                int i9 = iArrF[i3] + i7;
                i3++;
                int i10 = iArrF[i3] - 4;
                byteBuffer.position(i9);
                List<String> arrayList = map.get(string);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(string, arrayList);
                }
                int i11 = i10 - i9;
                if (strTrim == null) {
                    byte[] bArr2 = new byte[i11];
                    byteBuffer.get(bArr2);
                    arrayList.add(new String(bArr2, bVar.e()));
                } else {
                    String strL = l(byteBuffer, i9, i11, strGroup);
                    if (map2.containsKey(string)) {
                        int i12 = 2;
                        while (true) {
                            if (!map2.containsKey(string + i12)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        map2.put(string + i12, strL);
                    } else {
                        map2.put(string, strL);
                    }
                    arrayList.add(strGroup);
                }
                i4 = i5;
                nVar2 = nVar4;
                i = 1024;
                i2 = 0;
            }
        } catch (p e) {
            throw e;
        } catch (Exception e2) {
            throw new p(nVar3, e2.toString());
        }
    }

    private void c(String str, Map<String, List<String>> map) {
        String strTrim;
        String strJ;
        if (str == null) {
            this.k = "";
            return;
        }
        this.k = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                strTrim = t.j(strNextToken.substring(0, iIndexOf)).trim();
                strJ = t.j(strNextToken.substring(iIndexOf + 1));
            } else {
                strTrim = t.j(strNextToken).trim();
                strJ = "";
            }
            List<String> arrayList = map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strJ);
        }
    }

    private int e(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            if (bArr[i3] == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (bArr[i3] == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    private int[] f(ByteBuffer byteBuffer, byte[] bArr) {
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + 4096;
        byte[] bArr2 = new byte[length];
        int iRemaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
        byteBuffer.get(bArr2, 0, iRemaining);
        int length2 = iRemaining - bArr.length;
        int i = 0;
        do {
            for (int i2 = 0; i2 < length2; i2++) {
                for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                    if (i3 == bArr.length - 1) {
                        int[] iArr2 = new int[iArr.length + 1];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i + i2;
                        iArr = iArr2;
                    }
                }
            }
            i += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    private String l(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        ByteBuffer byteBufferDuplicate;
        f fVar;
        if (i2 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                r rVarB = this.a.b();
                byteBufferDuplicate = byteBuffer.duplicate();
                fVar = (f) rVarB;
                fileOutputStream = new FileOutputStream(fVar.b());
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            FileChannel channel = fileOutputStream.getChannel();
            byteBufferDuplicate.position(i).limit(i + i2);
            channel.write(byteBufferDuplicate.slice());
            String strB = fVar.b();
            t.o(fileOutputStream);
            return strB;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            throw new Error(e);
        } catch (Throwable th2) {
            th = th2;
            t.o(fileOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final void d() {
        byte[] bArr;
        boolean z;
        n nVar = n.INTERNAL_ERROR;
        o oVarP = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                z = false;
                                this.d = 0;
                                this.e = 0;
                                this.c.mark(8192);
                            } catch (IOException e) {
                                t.m(nVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage()).g(this.b);
                                t.o(this.b);
                            }
                        } catch (p e2) {
                            t.m(e2.a(), "text/plain", e2.getMessage()).g(this.b);
                            t.o(this.b);
                        }
                    } catch (SocketException e3) {
                        throw e3;
                    }
                } catch (SocketTimeoutException e4) {
                    throw e4;
                }
            } catch (SSLException e5) {
                t.m(nVar, "text/plain", "SSL PROTOCOL FAILURE: " + e5.getMessage()).g(this.b);
                t.o(this.b);
            }
            try {
                int i = this.c.read(bArr, 0, 8192);
                if (i == -1) {
                    t.o(this.c);
                    t.o(this.b);
                    throw new SocketException("NanoHttpd Shutdown");
                }
                while (i > 0) {
                    int i2 = this.e + i;
                    this.e = i2;
                    int iE = e(bArr, i2);
                    this.d = iE;
                    if (iE > 0) {
                        break;
                    }
                    BufferedInputStream bufferedInputStream = this.c;
                    int i3 = this.e;
                    i = bufferedInputStream.read(bArr, i3, 8192 - i3);
                }
                if (this.d < this.e) {
                    this.c.reset();
                    this.c.skip(this.d);
                }
                this.h = new HashMap();
                ?? r4 = this.i;
                if (r4 == 0) {
                    this.i = new HashMap();
                } else {
                    r4.clear();
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                HashMap map = new HashMap();
                a(bufferedReader, map, this.h, this.i);
                String str = this.l;
                if (str != null) {
                    this.i.put("remote-addr", str);
                    this.i.put("http-client-ip", this.l);
                }
                int iA = j.a((String) map.get("method"));
                this.g = iA;
                if (iA == 0) {
                    throw new p(n.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map.get("method")) + " unhandled.");
                }
                this.f = (String) map.get("uri");
                this.j = new d(this.i);
                String str2 = (String) this.i.get("connection");
                boolean z2 = "HTTP/1.1".equals(this.m) && (str2 == null || !str2.matches("(?i).*close.*"));
                oVarP = this.n.p(this);
                if (oVarP == null) {
                    throw new p(nVar, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                }
                String str3 = (String) this.i.get("accept-encoding");
                this.j.a(oVarP);
                oVarP.m(this.g);
                if (this.n.s(oVarP) && str3 != null && str3.contains("gzip")) {
                    z = true;
                }
                oVarP.k(z);
                oVarP.l(z2);
                oVarP.g(this.b);
                if (!z2 || oVarP.e()) {
                    throw new SocketException("NanoHttpd Shutdown");
                }
            } catch (SSLException e6) {
                throw e6;
            } catch (IOException unused) {
                t.o(this.c);
                t.o(this.b);
                throw new SocketException("NanoHttpd Shutdown");
            }
        } finally {
            t.o(null);
            this.a.a();
        }
    }

    public final Map<String, String> g() {
        return this.i;
    }

    public final int h() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.lang.String>>] */
    @Deprecated
    public final Map<String, String> i() {
        HashMap map = new HashMap();
        for (String str : this.h.keySet()) {
            map.put(str, ((List) this.h.get(str)).get(0));
        }
        return map;
    }

    public final String j() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final void k(Map<String, String> map) {
        long j;
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            if (this.i.containsKey("content-length")) {
                j = Long.parseLong((String) this.i.get("content-length"));
            } else {
                j = this.d < this.e ? r4 - r3 : 0L;
            }
            if (j < 1024) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = null;
            } else {
                try {
                    randomAccessFile = new RandomAccessFile(((f) this.a.b()).b(), "rw");
                    byteArrayOutputStream = null;
                    dataOutputStream = randomAccessFile;
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
            try {
                byte[] bArr = new byte[512];
                while (this.e >= 0 && j > 0) {
                    int i = this.c.read(bArr, 0, (int) Math.min(j, 512L));
                    this.e = i;
                    j -= (long) i;
                    if (i > 0) {
                        dataOutputStream.write(bArr, 0, i);
                    }
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (z.a(3, this.g)) {
                    b bVar = new b((String) this.i.get("content-type"));
                    if (!bVar.f()) {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2, bVar.e()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(bVar.b())) {
                            c(strTrim, this.h);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    } else {
                        if (bVar.a() == null) {
                            throw new p(n.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        b(bVar, map2, this.h, map);
                    }
                } else if (z.a(2, this.g)) {
                    map.put("content", l(map2, 0, map2.limit(), null));
                }
                t.o(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                t.o(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            t.o(randomAccessFile2);
            throw th;
        }
    }
}
