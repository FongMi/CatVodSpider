package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class U implements X, com.github.catvod.spider.merge.C.w {
    private static Method c;
    private static boolean d;
    public static final U b = new U();
    private static boolean a = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.deserializer.fileRelativePathSupport"));

    /* JADX WARN: Type inference failed for: r10v41, types: [T, java.text.DateFormat, java.text.SimpleDateFormat] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Object objO;
        String str;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int i = 0;
        if (type != InetSocketAddress.class) {
            if (bVar.l == 2) {
                bVar.l = 0;
                bVar.a(16);
                if (dVar.p() != 4) {
                    throw new C1415d("syntax error");
                }
                if (!"val".equals(dVar.K())) {
                    throw new C1415d("syntax error");
                }
                dVar.nextToken();
                bVar.a(17);
                objO = bVar.o(null);
                bVar.a(13);
            } else {
                objO = bVar.o(null);
            }
            if (objO == null) {
                str = null;
            } else {
                if (!(objO instanceof String)) {
                    if (!(objO instanceof C1416e)) {
                        throw new C1415d("expect string");
                    }
                    C1416e c1416e = (C1416e) objO;
                    if (type == Currency.class) {
                        String strX = c1416e.x("currency");
                        if (strX != null) {
                            return (T) Currency.getInstance(strX);
                        }
                        String strX2 = c1416e.x("currencyCode");
                        if (strX2 != null) {
                            return (T) Currency.getInstance(strX2);
                        }
                    }
                    return type == Map.Entry.class ? (T) c1416e.entrySet().iterator().next() : (T) com.github.catvod.spider.merge.H.A.f(c1416e, type, com.github.catvod.spider.merge.B.o.v);
                }
                str = (String) objO;
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            if (type == UUID.class) {
                return (T) UUID.fromString(str);
            }
            if (type == URI.class) {
                return (T) URI.create(str);
            }
            if (type == URL.class) {
                try {
                    return (T) new URL(str);
                } catch (MalformedURLException e) {
                    throw new C1415d("create url error", e);
                }
            }
            if (type == Pattern.class) {
                return (T) Pattern.compile(str);
            }
            if (type == Locale.class) {
                return (T) com.github.catvod.spider.merge.H.A.u0(str);
            }
            if (type == SimpleDateFormat.class) {
                Object r10 = (T) new SimpleDateFormat(str, dVar.G());
                r10.setTimeZone(dVar.M());
                return r10;
            }
            if (type == InetAddress.class || type == Inet4Address.class || type == Inet6Address.class) {
                try {
                    return (T) InetAddress.getByName(str);
                } catch (UnknownHostException e2) {
                    throw new C1415d("deserialize inet adress error", e2);
                }
            }
            if (type == File.class) {
                if (str.indexOf("..") < 0 || a) {
                    return (T) new File(str);
                }
                throw new C1415d("file relative path not support.");
            }
            if (type == TimeZone.class) {
                return (T) TimeZone.getTimeZone(str);
            }
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            }
            if (type == Class.class) {
                bVar.e().getClass();
                return (T) com.github.catvod.spider.merge.H.A.m0(str, false);
            }
            if (type == Charset.class) {
                return (T) Charset.forName(str);
            }
            if (type == Currency.class) {
                return (T) Currency.getInstance(str);
            }
            if (type == com.github.catvod.spider.merge.y.N.class) {
                return (T) new com.github.catvod.spider.merge.y.N(str, e0.i, com.github.catvod.spider.merge.B.o.v);
            }
            if (!(type instanceof Class)) {
                StringBuilder sbB = t0.b("MiscCodec not support ");
                sbB.append(type.toString());
                throw new C1415d(sbB.toString());
            }
            String name = ((Class) type).getName();
            if (name.equals("java.nio.file.Path")) {
                try {
                    if (c == null && !d) {
                        c = com.github.catvod.spider.merge.H.A.m0("java.nio.file.Paths", false).getMethod("get", String.class, String[].class);
                    }
                    Method method = c;
                    if (method != null) {
                        return (T) method.invoke(null, str, new String[0]);
                    }
                    throw new C1415d("Path deserialize erorr");
                } catch (IllegalAccessException e3) {
                    throw new C1415d("Path deserialize erorr", e3);
                } catch (NoSuchMethodException unused) {
                    d = true;
                } catch (InvocationTargetException e4) {
                    throw new C1415d("Path deserialize erorr", e4);
                }
            }
            throw new C1415d(C1290c.a("MiscCodec not support ", name));
        }
        if (dVar.p() == 8) {
            dVar.nextToken();
            return null;
        }
        bVar.a(12);
        InetAddress inetAddress = null;
        while (true) {
            String strK = dVar.K();
            dVar.o(17);
            if (strK.equals("address")) {
                bVar.a(17);
                inetAddress = (InetAddress) bVar.t(InetAddress.class, null);
            } else {
                boolean zEquals = strK.equals("port");
                bVar.a(17);
                if (!zEquals) {
                    bVar.m();
                } else {
                    if (dVar.p() != 2) {
                        throw new C1415d("port is not int");
                    }
                    int iC = dVar.c();
                    dVar.nextToken();
                    i = iC;
                }
            }
            if (dVar.p() != 16) {
                bVar.a(13);
                return (T) new InetSocketAddress(inetAddress, i);
            }
            dVar.nextToken();
        }
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        String string;
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.s();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == SimpleDateFormat.class) {
            string = ((SimpleDateFormat) obj).toPattern();
            if (h0Var.g(i0.WriteClassName) && obj.getClass() != type) {
                h0Var.write(123);
                h0Var.j(AbstractC1412a.d);
                l.v(obj.getClass().getName());
                h0Var.m(',', "val", string);
                h0Var.write(125);
                return;
            }
        } else if (cls == Class.class) {
            string = ((Class) obj).getName();
        } else {
            if (cls == InetSocketAddress.class) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                InetAddress address = inetSocketAddress.getAddress();
                h0Var.write(123);
                if (address != null) {
                    h0Var.j("address");
                    l.u(address);
                    h0Var.write(44);
                }
                h0Var.j("port");
                h0Var.q(inetSocketAddress.getPort());
                h0Var.write(125);
                return;
            }
            if (obj instanceof File) {
                string = ((File) obj).getPath();
            } else if (obj instanceof InetAddress) {
                string = ((InetAddress) obj).getHostAddress();
            } else if (obj instanceof TimeZone) {
                string = ((TimeZone) obj).getID();
            } else if (obj instanceof Currency) {
                string = ((Currency) obj).getCurrencyCode();
            } else {
                if (obj instanceof com.github.catvod.spider.merge.y.Q) {
                    ((com.github.catvod.spider.merge.y.Q) obj).b(h0Var);
                    return;
                }
                if (obj instanceof Iterator) {
                    f(l, h0Var, (Iterator) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    f(l, h0Var, ((Iterable) obj).iterator());
                    return;
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        String str = (String) key;
                        if (value instanceof String) {
                            h0Var.n('{', str, (String) value);
                            h0Var.write(125);
                            return;
                        } else {
                            h0Var.write(123);
                            h0Var.j(str);
                        }
                    } else {
                        h0Var.write(123);
                        l.u(key);
                        h0Var.write(58);
                    }
                    l.u(value);
                    h0Var.write(125);
                    return;
                }
                if (obj.getClass().getName().equals("net.sf.json.JSONNull")) {
                    h0Var.s();
                    return;
                }
                if (!(obj instanceof Node)) {
                    throw new C1415d("not support class : " + cls);
                }
                Node node = (Node) obj;
                try {
                    Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                    DOMSource dOMSource = new DOMSource(node);
                    StringWriter stringWriter = new StringWriter();
                    transformerNewTransformer.transform(dOMSource, new StreamResult(stringWriter));
                    string = stringWriter.toString();
                } catch (TransformerException e) {
                    throw new C1415d("xml node to string error", e);
                }
            }
        }
        h0Var.v(string);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 4;
    }

    protected final void f(L l, h0 h0Var, Iterator<?> it) {
        h0Var.write(91);
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                h0Var.write(44);
            }
            l.u(it.next());
            i++;
        }
        h0Var.write(93);
    }
}
