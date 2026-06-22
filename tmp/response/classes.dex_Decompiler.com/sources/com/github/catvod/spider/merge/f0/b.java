package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.oZP;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class b {
    static final Class d;
    protected Vector a;
    protected String b;
    protected Hashtable c = new Hashtable();

    static {
        new b();
        d = b.class;
    }

    protected b() {
    }

    public static b a() throws a {
        Class<?> cls;
        Object objNewInstance;
        boolean z;
        try {
            InputStream resourceAsStream = d.getResourceAsStream(oZP.d("5A2232152D783C21316E1F3007191E2209265A000526422D1803073400395B19466F3438193F022D0005141D04241E13140C032E1E2C"));
            if (resourceAsStream == null) {
                throw new a(oZP.d("070A042E1927160A572F03215509183402314F4F580C290134423E0F2A7A060A05370536101C582E1E325B171A2D1C20190359375D7B2D021B111939193F16331F3007291622183A0716572C0D3E104F04341E30551B1F201875050E0532092755061A310030180A1935053B124F2F2C000500031B612D053C4F1E324C34030E1E2D0D37190A"));
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
            stringBuffer2.append(oZP.d("070A042E1927160A576E2110212E5A0822135A1C12331A3C160A046E032712410F2C002500031B6F1A645B371A2D3C20190327201E26101D31200F211A1D0E61183D141B5722033B010E1E2F09315548"));
            stringBuffer2.append(string);
            stringBuffer2.append(oZP.d("52"));
            String string2 = stringBuffer2.toString();
            Vector vector = new Vector();
            new Vector();
            b bVar = null;
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
                    if (!(objNewInstance instanceof b)) {
                        z2 = z;
                    } else if (bVar == null) {
                        bVar = (b) objNewInstance;
                    }
                    if (!z2) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(oZP.d("1C01142E0125141B1E230030550C1B201F264F4F"));
                        stringBuffer3.append(strSubstring);
                        throw new a(stringBuffer3.toString());
                    }
                }
                i2 = iIndexOf + 1;
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.a = vector;
            bVar.b = string2;
            return bVar;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public final XmlPullParser b() throws a {
        Vector vector = this.a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(oZP.d("330E143503270C4F1E2F05211C0E1B2816340106182F4C22141C572802361A02072D0921104F5A610434064F192E1875011D1E240875"));
            stringBuffer.append(this.b);
            throw new a(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(oZP.d("3B0057370D391C0B57310D27060A05610F39141C04241F751300022F08751C0157"));
            stringBuffer2.append(this.b);
            throw new a(stringBuffer2.toString());
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
                stringBuffer4.append(oZP.d("4F4F"));
                stringBuffer4.append(e.toString());
                stringBuffer4.append(oZP.d("4E4F"));
                stringBuffer3.append(stringBuffer4.toString());
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(oZP.d("1600022D08751B0003610F27100E03244C25141D04241E6F55"));
        stringBuffer5.append((Object) stringBuffer3);
        throw new a(stringBuffer5.toString());
    }

    public final void c() {
        this.c.put(oZP.d("1D1B0331567A5A171A2D1C201903592E1E325A19466E083A164011240D21001D1232423D01021B621C271A0C12321F781B0E1A241F25140C1232"), new Boolean(true));
    }
}
