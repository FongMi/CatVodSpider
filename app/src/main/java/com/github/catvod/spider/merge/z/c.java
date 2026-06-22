package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.A.T;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c {
    public static final Class d;
    public Vector a;
    public String b;
    public final Hashtable c = new Hashtable();

    static {
        new c();
        d = c.class;
    }

    public final void a() throws b {
        Vector vector = this.a;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.b);
            throw new b(stringBuffer.toString());
        }
        if (vector.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer("No valid parser classes found in ");
            stringBuffer2.append(this.b);
            throw new b(stringBuffer2.toString());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i = 0; i < this.a.size(); i++) {
            Class cls = (Class) this.a.elementAt(i);
            try {
                T.j(cls.newInstance());
                Hashtable hashtable = this.c;
                Enumeration enumerationKeys = hashtable.keys();
                while (enumerationKeys.hasMoreElements()) {
                    Boolean bool = (Boolean) hashtable.get((String) enumerationKeys.nextElement());
                    if (bool != null && bool.booleanValue()) {
                        throw null;
                    }
                }
                return;
            } catch (Exception e) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(cls.getName());
                stringBuffer4.append(": ");
                stringBuffer4.append(e.toString());
                stringBuffer4.append("; ");
                stringBuffer3.append(stringBuffer4.toString());
            }
        }
        StringBuffer stringBuffer5 = new StringBuffer("could not create parser: ");
        stringBuffer5.append((Object) stringBuffer3);
        throw new b(stringBuffer5.toString());
    }
}
