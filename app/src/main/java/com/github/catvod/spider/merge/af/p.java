package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.nIe;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    static final Class d;
    protected Vector a;
    protected String b;
    protected Hashtable c = new Hashtable();

    static {
        new p();
        d = p.class;
    }

    protected p() {
    }

    public static p a() throws o {
        Class<?> cls;
        Object objNewInstance;
        boolean z;
        try {
            InputStream resourceAsStream = d.getResourceAsStream(nIe.d("6D2B161708620B28156C3A2A30103A202C3C6D09212467372F0A233625236C10626D11222E36262F251F231420263B092305272C3B36"));
            if (resourceAsStream == null) {
                throw new o(nIe.d("3003202C3C3D2103732D263B62003C36272B78467C0E0C1B034B1A0D0F6031032135202C27157C2C3B286C1E3E2F393A2E0A7D3578611A0B3F133C232E3632313A2A302032203D20301F732E2824274620363B2A62123B223D6F320721302C3D620F3E33252A2F033D37202125460B2E251F370A3F63081F0B463A30692E34073A2F282D2E03"));
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = resourceAsStream.read();
                if (i < 0) {
                    break;
                }
                if (i > 32) {
                    stringBuffer.append((char) i);
                }
            }
            resourceAsStream.close();
            String string = stringBuffer.toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(nIe.d("3003202C3C3D2103736C040A16277E0A07096D1536313F262103206C263D25482B2E253F370A3F6D3F7E6C3E3E2F193A2E0A03223B3C271415222A3B2D142A633D2723127320262136073A2D2C2B6241"));
            stringBuffer2.append(string);
            stringBuffer2.append(nIe.d("65"));
            String string2 = stringBuffer2.toString();
            Vector vector = new Vector();
            new Vector();
            p pVar = null;
            int i2 = 0;
            while (i2 < string.length()) {
                int iIndexOf = string.indexOf(44, i2);
                if (iIndexOf == -1) {
                    iIndexOf = string.length();
                }
                String strSubstring = string.substring(i2, iIndexOf);
                try {
                    cls = Class.forName(strSubstring);
                    try {
                        objNewInstance = cls.newInstance();
                    } catch (Exception unused) {
                        objNewInstance = null;
                    }
                } catch (Exception unused2) {
                    cls = null;
                }
                if (cls != null) {
                    boolean z2 = true;
                    if (objNewInstance instanceof XmlPullParser) {
                        vector.addElement(cls);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(objNewInstance instanceof p)) {
                        z2 = z;
                    } else if (pVar == null) {
                        pVar = (p) objNewInstance;
                    }
                    if (!z2) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(nIe.d("2B08302C243F23123A21252A62053F223A3C7846"));
                        stringBuffer3.append(strSubstring);
                        throw new o(stringBuffer3.toString());
                    }
                }
                i2 = iIndexOf + 1;
            }
            if (pVar == null) {
                pVar = new p();
            }
            pVar.a = vector;
            pVar.b = string2;
            return pVar;
        } catch (Exception e) {
            throw new o(e);
        }
    }

    public final XmlPullParser b() throws o {
        Vector vector = this.a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nIe.d("04073037263D3B463A2D203B2B073F2A332E360F3C2D69382315732A272C2D0B232F2C3B27467E63212E31463D2C3D6F36143A262D6F"));
            stringBuffer.append(this.b);
            throw new o(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(nIe.d("0C09733528232B027333283D310321632A23231520263A6F2409262D2D6F2B0873"));
            stringBuffer2.append(this.b);
            throw new o(stringBuffer2.toString());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < this.a.size(); i++) {
            Class cls = (Class) this.a.elementAt(i);
            try {
                XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                Enumeration enumerationKeys = this.c.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    Boolean bool = (Boolean) this.c.get(str);
                    if (bool != null && bool.booleanValue()) {
                        xmlPullParser.setFeature(str, true);
                    }
                }
                return xmlPullParser;
            } catch (Exception e) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(cls.getName());
                stringBuffer4.append(nIe.d("7846"));
                stringBuffer4.append(e.toString());
                stringBuffer4.append(nIe.d("7946"));
                stringBuffer3.append(stringBuffer4.toString());
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(nIe.d("2109262F2D6F2C0927632A3D27072726693F231420263B7562"));
        stringBuffer5.append((Object) stringBuffer3);
        throw new o(stringBuffer5.toString());
    }

    public final void c() {
        this.c.put(nIe.d("2A12273373606D1E3E2F393A2E0A7D2C3B286D10626C2D2021493526283B371436306727360B3F60393D2D0536303A622C073E263A3F23053630"), new Boolean(true));
    }
}
