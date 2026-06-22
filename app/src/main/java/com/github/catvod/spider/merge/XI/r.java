package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.ZrJ;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r {
    static final Class d;
    protected Vector a;
    protected String b;
    protected Hashtable c = new Hashtable();

    static {
        new r();
        d = r.class;
    }

    protected r() {
    }

    public static r a() throws q {
        Class<?> cls;
        Object objNewInstance;
        boolean z;
        try {
            InputStream resourceAsStream = d.getResourceAsStream(ZrJ.d("560E0E190968300D0D623B200B35222E2D36562C392A663D142F3B38242957357A63102815133E212415183138283A0318203F223A3C"));
            if (resourceAsStream == null) {
                throw new q(ZrJ.d("0B2638223D371A266B232731592524382621436364000D11386E02030E6A0A26393B21261C3064223A22573B26213830152F653B796B212E271D3D2915132A3F3B200B052A2E3C2A0B3A6B20292E1C6338383A205937232C3C650922393E2D37592A263D242014262539212B1E63132024150C2F276D09153063223E68240F22222129271526"));
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
            stringBuffer2.append(ZrJ.d("0B2638223D371A266B6205002D026604060356302E3F3E2C1A26386227371E6D332024350C2F27633E74571B26211830152F1B2C3A361C310D2C2B311631326D3C2D18376B2E272B0D2222232D215964"));
            stringBuffer2.append(string);
            stringBuffer2.append(ZrJ.d("5E"));
            String string2 = stringBuffer2.toString();
            Vector vector = new Vector();
            new Vector();
            r rVar = null;
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
                    if (!(objNewInstance instanceof r)) {
                        z2 = z;
                    } else if (rVar == null) {
                        rVar = (r) objNewInstance;
                    }
                    if (!z2) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(ZrJ.d("102D282225351837222F24205920272C3B364363"));
                        stringBuffer3.append(strSubstring);
                        throw new q(stringBuffer3.toString());
                    }
                }
                i2 = iIndexOf + 1;
            }
            if (rVar == null) {
                rVar = new r();
            }
            rVar.a = vector;
            rVar.b = string2;
            return rVar;
        } catch (Exception e) {
            throw new q(e);
        }
    }

    public final XmlPullParser b() throws q {
        Vector vector = this.a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(ZrJ.d("3F22283927370063222321311022272432240D2A2423683218306B242626162E3B212D311C63666D20240A6325223C650D3122282C65"));
            stringBuffer.append(this.b);
            throw new q(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(ZrJ.d("372C6B3B292910276B3D29370A26396D2B29183038283B651F2C3E232C65102D6B"));
            stringBuffer2.append(this.b);
            throw new q(stringBuffer2.toString());
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
                stringBuffer4.append(ZrJ.d("4363"));
                stringBuffer4.append(e.toString());
                stringBuffer4.append(ZrJ.d("4263"));
                stringBuffer3.append(stringBuffer4.toString());
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(ZrJ.d("1A2C3E212C65172C3F6D2B371C223F286835183138283A7F59"));
        stringBuffer5.append((Object) stringBuffer3);
        throw new q(stringBuffer5.toString());
    }

    public final void c() {
        this.c.put(ZrJ.d("11373F3D726A563B26213830152F65223A2256357A622C2A1A6C2D2829310C312E3E662D0D2E276E383716202E3E3B68172226283B3518202E3E"), new Boolean(true));
    }
}
