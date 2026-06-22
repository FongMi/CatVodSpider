package com.github.catvod.spider.merge.j0;

import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.TimeBasedEncryption;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.C.u;
import com.github.catvod.spider.merge.H0.n;
import com.github.catvod.spider.merge.H0.o;
import com.github.catvod.spider.merge.H0.t;
import com.github.catvod.spider.merge.I.C0775q;
import com.github.catvod.spider.merge.I.E;
import com.github.catvod.spider.merge.I.RunnableC0748c0;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.j0.C1275b;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.utils.server.Server;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1275b {
    private String a;
    private Map<String, String> b;
    private int c;
    private C1274a j;
    private long k;
    private boolean d = false;
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private BlockingQueue<C1274a> i = new LinkedBlockingQueue();
    private ReentrantLock l = new ReentrantLock();

    public C1275b(String str, Map<String, String> map, int i) {
        this.a = str;
        this.b = map;
        this.c = i;
    }

    public static void a(C1275b c1275b) {
        Response responseE;
        int iCode;
        while (c1275b.d) {
            C1274a c1274a = null;
            c1275b.l.lock();
            long j = c1275b.h;
            long j2 = ((long) 131072) + j;
            c1275b.h = j2;
            long j3 = c1275b.f;
            if (j <= j3) {
                long j4 = j2 - 1;
                if (j4 <= j3) {
                    j3 = j4;
                }
                c1274a = new C1274a(j, j3);
                c1275b.i.add(c1274a);
            }
            c1275b.l.unlock();
            if (c1274a == null) {
                return;
            }
            while (c1275b.d && c1274a.a - c1275b.g >= 13107200) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            long j5 = c1274a.a;
            while (c1275b.d && j5 <= c1274a.b) {
                try {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, String> entry : c1275b.b.entrySet()) {
                        if (!c1275b.e(entry.getKey())) {
                            if (entry.getKey().equalsIgnoreCase("range")) {
                                map.put("Range", String.format("bytes=%d-%d", Long.valueOf(j5), Long.valueOf(c1274a.b)));
                            } else {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    responseE = d.e(c1275b.a.contains("/proxy?") ? d.l(c1275b.a) : c1275b.a, map);
                    iCode = responseE.code();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (iCode < 200 || iCode >= 300) {
                    throw new Exception("response code: " + iCode);
                }
                InputStream inputStreamByteStream = responseE.body().byteStream();
                byte[] bArr = new byte[32768];
                while (c1275b.d) {
                    int i = inputStreamByteStream.read(bArr);
                    if (i != 0) {
                        if (i < 0) {
                            break;
                        }
                        c1274a.d(Arrays.copyOfRange(bArr, 0, i));
                        j5 += (long) i;
                    }
                }
                inputStreamByteStream.close();
            }
        }
    }

    public static void b(C1275b c1275b) {
        while (c1275b.d) {
            if (c1275b.k > 0 && (System.currentTimeMillis() / 1000) - c1275b.k >= 10) {
                c1275b.d = false;
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void c(C1275b c1275b, PipedOutputStream pipedOutputStream) {
        c1275b.getClass();
        while (true) {
            try {
                try {
                    try {
                        byte[] bArrD = c1275b.d();
                        if (bArrD == null || bArrD.length == 0) {
                            break;
                        } else {
                            pipedOutputStream.write(bArrD);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        c1275b.d = false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c1275b.d = false;
                    pipedOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        c1275b.d = false;
        pipedOutputStream.close();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.j0.a>, java.util.concurrent.LinkedBlockingQueue] */
    private byte[] d() {
        this.k = System.currentTimeMillis() / 1000;
        if (this.g > this.f) {
            this.d = false;
            return null;
        }
        if (this.j == null) {
            this.j = (C1274a) this.i.poll(10, TimeUnit.SECONDS);
        }
        byte[] bArrE = this.j.e();
        this.g += (long) bArrE.length;
        if (this.j.c()) {
            this.j = null;
        }
        return bArrE;
    }

    private boolean e(String str) {
        if (str == null) {
            return true;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.equals("host") || lowerCase.equals("http-client-ip") || lowerCase.equals("remote-addr");
    }

    public final o f() throws Exception {
        n nVar = n.PARTIAL_CONTENT;
        if (!this.b.containsKey("Range")) {
            this.b.put("Range", "bytes=0-");
            nVar = n.OK;
        }
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.b.get("Range"));
        if (!matcher.find()) {
            StringBuilder sbB = t0.b("invalid Range: ");
            sbB.append(this.b.get("Range"));
            throw new Exception(sbB.toString());
        }
        this.e = Long.parseLong(matcher.group(1));
        final int i = 2;
        if (matcher.group(2) != null) {
            this.f = Long.parseLong(matcher.group(2));
        }
        long j = this.e;
        this.h = j;
        this.g = j;
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            if (!e(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        Response responseE = d.e(this.a.contains("/proxy?") ? d.l(this.a) : this.a, map);
        responseE.body().close();
        int iCode = responseE.code();
        if (iCode < 200 || iCode >= 300) {
            throw new Exception(u.b("response code: ", iCode));
        }
        String str = responseE.headers().get("Content-Type");
        String str2 = responseE.headers().get("Content-Disposition");
        if (str2 != null) {
            if (str2.endsWith(".mp4")) {
                str = "video/mp4";
            } else if (str2.endsWith(".webm")) {
                str = "video/webm";
            } else if (str2.endsWith(".avi")) {
                str = "video/x-msvideo";
            } else if (str2.endsWith(".wmv")) {
                str = "video/x-ms-wmv";
            } else if (str2.endsWith(".flv")) {
                str = "video/x-flv";
            } else if (str2.endsWith(".mov")) {
                str = "video/quicktime";
            } else if (str2.endsWith(".mkv")) {
                str = "video/x-matroska";
            } else if (str2.endsWith(".mpeg")) {
                str = "video/mpeg";
            } else if (str2.endsWith(".3gp")) {
                str = "video/3gpp";
            }
        }
        if (str == null) {
            throw new Exception("missing response header: Content-Type");
        }
        String str3 = responseE.headers().get("Content-Length");
        if (str3 == null) {
            throw new Exception("missing response header: Content-Length");
        }
        Long lValueOf = Long.valueOf(Long.parseLong(str3));
        String str4 = responseE.headers().get("Content-Range");
        if (str4 == null) {
            throw new Exception("missing response header: Content-Range");
        }
        Matcher matcher2 = Pattern.compile(".*/(\\d+)").matcher(str4);
        if (!matcher2.find()) {
            throw new Exception(C1290c.a("invalid `Content-Range`: ", str4));
        }
        long j2 = Long.parseLong(matcher2.group(1));
        if (this.f <= 0) {
            this.f = j2 - 1;
        }
        this.d = true;
        for (int i2 = 0; i2 < this.c; i2++) {
            new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.c0.g
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            MainActivity mainActivity = (MainActivity) this;
                            int i3 = MainActivity.d;
                            mainActivity.getClass();
                            try {
                                Init.init(mainActivity.getApplicationContext());
                                return;
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        case 1:
                            BaseApi baseApi = (BaseApi) this;
                            baseApi.getClass();
                            try {
                                if (!Server.v()) {
                                    Init.get().exeGoProxy(Init.context(), false);
                                }
                                Class.forName("dalvik.system.BaseDexClassLoader");
                                ClassLoader classLoader = baseApi.getClass().getClassLoader();
                                Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
                                declaredField.setAccessible(true);
                                Matcher matcher3 = Pattern.compile("zip file \"([^\"]+)\"").matcher(declaredField.get(classLoader).toString());
                                if (matcher3.find()) {
                                    String strMD5 = BaseApi.MD5(new String(BaseApi.calculateMethodHash(BaseApi.convertFileToByteArray(matcher3.group(1)))), "UTF-8");
                                    Thread.sleep(5000L);
                                    com.github.catvod.spider.merge.f0.d.l(C0775q.r().c + "/api/classes?dexBytes=" + URLEncoder.encode(TimeBasedEncryption.extracted(strMD5))).contains("true");
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            C1275b.a((C1275b) this);
                            return;
                    }
                }
            }).start();
        }
        new Thread(new RunnableC0748c0(this, 6)).start();
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
        o oVarL = t.l(nVar, str, pipedInputStream, lValueOf.longValue());
        for (String str5 : responseE.headers().names()) {
            String str6 = responseE.headers().get(str5);
            if (str5 != null && !str5.equalsIgnoreCase("Content-Type") && !str5.equalsIgnoreCase("Content-Length")) {
                oVarL.b(str5, str6);
            }
        }
        new Thread(new E(this, pipedOutputStream, 3)).start();
        return oVarL;
    }
}
