package com.github.catvod.spider.merge;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0154 implements Serializable {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final AbstractC0154 f368 = new C0155();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final AbstractC0154 f369 = new C0157();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final AbstractC0154 f370 = new C0159();

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static final AbstractC0154 f371 = new C0160();

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static final AbstractC0154 f372 = new C0161();

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static final AbstractC0154 f373 = new C0158();

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static final AbstractC0154 f374 = new C0156();

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static final ThreadLocal<WeakHashMap<Object, Object>> f375 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private boolean f378;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private boolean f383;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private boolean f384;

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private String f385;

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private String f386;

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private String f387;

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    private boolean f388;

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    private String f389;

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    private boolean f390;

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    private String f391;

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    private String f392;

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    private String f393;

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    private String f394;

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    private String f395;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private boolean f376 = true;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private boolean f377 = true;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private boolean f379 = true;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private String f380 = SOY.d("21");

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private String f381 = SOY.d("27");

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private String f382 = SOY.d("47");

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$Ϳ, reason: contains not printable characters */
    private static final class C0155 extends AbstractC0154 {
        C0155() {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$Ԩ, reason: contains not printable characters */
    private static final class C0156 extends AbstractC0154 {
        C0156() {
            m560(false);
            m562(false);
            m551(SOY.d("01"));
            m550(SOY.d("07"));
            m549(SOY.d("21"));
            m548(SOY.d("27"));
            m553(SOY.d("56"));
            m552(SOY.d("40"));
            m555(SOY.d("14273D1A"));
            m559(SOY.d("586E"));
            String strD = SOY.d("4470");
            m558(strD);
            m557(SOY.d("586E221F0E1247"));
            m556(strD);
        }

        /* JADX INFO: renamed from: ࢮ, reason: contains not printable characters */
        private void m564(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(C0368.m1440(str));
            stringBuffer.append('\"');
        }

        /* JADX INFO: renamed from: ࢯ, reason: contains not printable characters */
        private boolean m565(String str) {
            return str.startsWith(m540()) && str.endsWith(m539());
        }

        /* JADX INFO: renamed from: ࢰ, reason: contains not printable characters */
        private boolean m566(String str) {
            return str.startsWith(m542()) && str.endsWith(m541());
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: Ϳ */
        public void mo493(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException(SOY.d("3C3B341A105714333C1307571B2034561916143630021B050372261E11195A27221F1A105A1822191A23150125041D191D01250F1812"));
            }
            if (!m545(bool)) {
                throw new UnsupportedOperationException(SOY.d("3C273D1A30120E33381A541A0F21255616125A26230311570D3A34185402093B3F11543D093D3F221B240E20381813240E2B3D13"));
            }
            super.mo493(stringBuffer, str, obj, bool);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: Ԯ */
        protected void mo500(StringBuffer stringBuffer, String str, char c) {
            m564(stringBuffer, String.valueOf(c));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: ނ */
        protected void mo506(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                m526(stringBuffer, str);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Character)) {
                m564(stringBuffer, obj.toString());
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
                return;
            }
            String string = obj.toString();
            if (m566(string) || m565(string)) {
                stringBuffer.append(obj);
            } else {
                mo506(stringBuffer, str, string);
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: ރ */
        protected void mo507(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection == null || collection.isEmpty()) {
                stringBuffer.append(collection);
                return;
            }
            stringBuffer.append(m540());
            int i = 0;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                m504(stringBuffer, str, i, it.next());
                i++;
            }
            stringBuffer.append(m539());
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: ބ */
        protected void mo508(StringBuffer stringBuffer, String str, Map<?, ?> map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(m542());
            boolean z = true;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String strM1441 = C0371.m1441(entry.getKey(), null);
                if (strM1441 != null) {
                    if (z) {
                        z = false;
                    } else {
                        m521(stringBuffer, strM1441);
                    }
                    mo523(stringBuffer, strM1441);
                    Object value = entry.getValue();
                    if (value == null) {
                        m526(stringBuffer, strM1441);
                    } else {
                        m525(stringBuffer, strM1441, value, true);
                    }
                }
            }
            stringBuffer.append(m541());
        }

        @Override // com.github.catvod.spider.merge.AbstractC0154
        /* JADX INFO: renamed from: ޓ */
        protected void mo523(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException(SOY.d("3C3B341A105714333C1307571B2034561916143630021B050372261E11195A27221F1A105A1822191A23150125041D191D01250F1812"));
            }
            StringBuilder sb = new StringBuilder();
            String strD = SOY.d("58");
            sb.append(strD);
            sb.append(C0368.m1440(str));
            sb.append(strD);
            super.mo523(stringBuffer, sb.toString());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$Ԫ, reason: contains not printable characters */
    private static final class C0157 extends AbstractC0154 {
        C0157() {
            m551(SOY.d("21"));
            m553(System.lineSeparator() + SOY.d("5A72"));
            m554(true);
            m550(System.lineSeparator() + SOY.d("27"));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$Ԭ, reason: contains not printable characters */
    private static final class C0158 extends AbstractC0154 {
        C0158() {
            m560(false);
            m562(false);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$Ԯ, reason: contains not printable characters */
    private static final class C0159 extends AbstractC0154 {
        C0159() {
            m561(false);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$֏, reason: contains not printable characters */
    private static final class C0160 extends AbstractC0154 {
        C0160() {
            m563(true);
            m562(false);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ˣ$ؠ, reason: contains not printable characters */
    private static final class C0161 extends AbstractC0154 {
        C0161() {
            m560(false);
            m562(false);
            m561(false);
            m551("");
            m550("");
        }
    }

    protected AbstractC0154() {
        String strD = SOY.d("56");
        this.f385 = strD;
        this.f386 = SOY.d("01");
        this.f387 = strD;
        this.f388 = true;
        this.f389 = SOY.d("07");
        this.f390 = true;
        this.f391 = SOY.d("463C241A1849");
        this.f392 = SOY.d("4621380C114A");
        String strD2 = SOY.d("44");
        this.f393 = strD2;
        this.f394 = SOY.d("46");
        this.f395 = strD2;
    }

    /* JADX INFO: renamed from: ࡡ, reason: contains not printable characters */
    static Map<Object, Object> m489() {
        return f375.get();
    }

    /* JADX INFO: renamed from: ࡤ, reason: contains not printable characters */
    static boolean m490(Object obj) {
        Map<Object, Object> mapM489 = m489();
        return mapM489 != null && mapM489.containsKey(obj);
    }

    /* JADX INFO: renamed from: ࡦ, reason: contains not printable characters */
    static void m491(Object obj) {
        if (obj != null) {
            if (m489() == null) {
                f375.set(new WeakHashMap<>());
            }
            m489().put(obj, null);
        }
    }

    /* JADX INFO: renamed from: ࢭ, reason: contains not printable characters */
    static void m492(Object obj) {
        Map<Object, Object> mapM489;
        if (obj == null || (mapM489 = m489()) == null) {
            return;
        }
        mapM489.remove(obj);
        if (mapM489.isEmpty()) {
            f375.remove();
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void mo493(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        mo523(stringBuffer, str);
        if (obj == null) {
            m526(stringBuffer, str);
        } else {
            m525(stringBuffer, str, obj, m545(bool));
        }
        m521(stringBuffer, str);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public void m494(StringBuffer stringBuffer, String str, boolean z) {
        mo523(stringBuffer, str);
        m510(stringBuffer, str, z);
        m521(stringBuffer, str);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected void m495(StringBuffer stringBuffer, Object obj) {
        if (!this.f377 || obj == null) {
            return;
        }
        m491(obj);
        if (this.f378) {
            stringBuffer.append(m544(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected void m496(StringBuffer stringBuffer) {
        stringBuffer.append(this.f381);
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected void m497(StringBuffer stringBuffer) {
        stringBuffer.append(this.f380);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected void m498(StringBuffer stringBuffer, String str, Object obj) {
        C0105.m382(stringBuffer, obj);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected void m499(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append((int) b);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected void mo500(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected void m501(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected void m502(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected void m503(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected void m504(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(this.f387);
        }
        if (obj == null) {
            m526(stringBuffer, str);
        } else {
            m525(stringBuffer, str, obj, this.f388);
        }
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected void m505(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected void mo506(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected void mo507(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected void mo508(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected void m509(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    protected void m510(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected void m511(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m499(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected void m512(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            mo500(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    protected void m513(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m501(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    protected void m514(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m502(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    protected void m515(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m503(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    protected void m516(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m505(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    protected void m517(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < objArr.length; i++) {
            m504(stringBuffer, str, i, objArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    protected void m518(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m509(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    protected void m519(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f386);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.f387);
            }
            m510(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.f389);
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    public void m520(StringBuffer stringBuffer, Object obj) {
        if (!this.f384) {
            m547(stringBuffer);
        }
        m496(stringBuffer);
        m492(obj);
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    protected void m521(StringBuffer stringBuffer, String str) {
        m522(stringBuffer);
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    protected void m522(StringBuffer stringBuffer) {
        stringBuffer.append(this.f385);
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    protected void mo523(StringBuffer stringBuffer, String str) {
        if (!this.f376 || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f382);
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    protected void m524(StringBuffer stringBuffer, Object obj) {
        if (!m546() || obj == null) {
            return;
        }
        m491(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    protected void m525(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (m490(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            m498(stringBuffer, str, obj);
            return;
        }
        m491(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    mo507(stringBuffer, str, (Collection) obj);
                } else {
                    m538(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    mo508(stringBuffer, str, (Map) obj);
                } else {
                    m538(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    m516(stringBuffer, str, (long[]) obj);
                } else {
                    m534(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    m515(stringBuffer, str, (int[]) obj);
                } else {
                    m533(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    m518(stringBuffer, str, (short[]) obj);
                } else {
                    m536(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    m511(stringBuffer, str, (byte[]) obj);
                } else {
                    m529(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    m512(stringBuffer, str, (char[]) obj);
                } else {
                    m530(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    m513(stringBuffer, str, (double[]) obj);
                } else {
                    m531(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    m514(stringBuffer, str, (float[]) obj);
                } else {
                    m532(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    m519(stringBuffer, str, (boolean[]) obj);
                } else {
                    m537(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    m517(stringBuffer, str, (Object[]) obj);
                } else {
                    m535(stringBuffer, str, (Object[]) obj);
                }
            } else if (z) {
                mo506(stringBuffer, str, obj);
            } else {
                m528(stringBuffer, str, obj);
            }
        } finally {
            m492(obj);
        }
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    protected void m526(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f391);
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    public void m527(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            m495(stringBuffer, obj);
            m524(stringBuffer, obj);
            m497(stringBuffer);
            if (this.f383) {
                m522(stringBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    protected void m528(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f394);
        stringBuffer.append(m544(obj.getClass()));
        stringBuffer.append(this.f395);
    }

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    protected void m529(StringBuffer stringBuffer, String str, byte[] bArr) {
        m538(stringBuffer, str, bArr.length);
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    protected void m530(StringBuffer stringBuffer, String str, char[] cArr) {
        m538(stringBuffer, str, cArr.length);
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    protected void m531(StringBuffer stringBuffer, String str, double[] dArr) {
        m538(stringBuffer, str, dArr.length);
    }

    /* JADX INFO: renamed from: ޜ, reason: contains not printable characters */
    protected void m532(StringBuffer stringBuffer, String str, float[] fArr) {
        m538(stringBuffer, str, fArr.length);
    }

    /* JADX INFO: renamed from: ޝ, reason: contains not printable characters */
    protected void m533(StringBuffer stringBuffer, String str, int[] iArr) {
        m538(stringBuffer, str, iArr.length);
    }

    /* JADX INFO: renamed from: ޞ, reason: contains not printable characters */
    protected void m534(StringBuffer stringBuffer, String str, long[] jArr) {
        m538(stringBuffer, str, jArr.length);
    }

    /* JADX INFO: renamed from: ޟ, reason: contains not printable characters */
    protected void m535(StringBuffer stringBuffer, String str, Object[] objArr) {
        m538(stringBuffer, str, objArr.length);
    }

    /* JADX INFO: renamed from: ޠ, reason: contains not printable characters */
    protected void m536(StringBuffer stringBuffer, String str, short[] sArr) {
        m538(stringBuffer, str, sArr.length);
    }

    /* JADX INFO: renamed from: ޡ, reason: contains not printable characters */
    protected void m537(StringBuffer stringBuffer, String str, boolean[] zArr) {
        m538(stringBuffer, str, zArr.length);
    }

    /* JADX INFO: renamed from: ޢ, reason: contains not printable characters */
    protected void m538(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.f392);
        stringBuffer.append(i);
        stringBuffer.append(this.f393);
    }

    /* JADX INFO: renamed from: ޣ, reason: contains not printable characters */
    protected String m539() {
        return this.f389;
    }

    /* JADX INFO: renamed from: ޤ, reason: contains not printable characters */
    protected String m540() {
        return this.f386;
    }

    /* JADX INFO: renamed from: ޥ, reason: contains not printable characters */
    protected String m541() {
        return this.f381;
    }

    /* JADX INFO: renamed from: ޱ, reason: contains not printable characters */
    protected String m542() {
        return this.f380;
    }

    /* JADX INFO: renamed from: ࡠ, reason: contains not printable characters */
    protected String m543() {
        return this.f391;
    }

    /* JADX INFO: renamed from: ࡢ, reason: contains not printable characters */
    protected String m544(Class<?> cls) {
        return C0162.m567(cls);
    }

    /* JADX INFO: renamed from: ࡣ, reason: contains not printable characters */
    protected boolean m545(Boolean bool) {
        return bool == null ? this.f390 : bool.booleanValue();
    }

    /* JADX INFO: renamed from: ࡥ, reason: contains not printable characters */
    protected boolean m546() {
        return this.f379;
    }

    /* JADX INFO: renamed from: ࡧ, reason: contains not printable characters */
    protected void m547(StringBuffer stringBuffer) {
        if (C0131.m437(stringBuffer, this.f385)) {
            stringBuffer.setLength(stringBuffer.length() - this.f385.length());
        }
    }

    /* JADX INFO: renamed from: ࡨ, reason: contains not printable characters */
    protected void m548(String str) {
        if (str == null) {
            str = "";
        }
        this.f389 = str;
    }

    /* JADX INFO: renamed from: ࡩ, reason: contains not printable characters */
    protected void m549(String str) {
        if (str == null) {
            str = "";
        }
        this.f386 = str;
    }

    /* JADX INFO: renamed from: ࡪ, reason: contains not printable characters */
    protected void m550(String str) {
        if (str == null) {
            str = "";
        }
        this.f381 = str;
    }

    /* JADX INFO: renamed from: ࢠ, reason: contains not printable characters */
    protected void m551(String str) {
        if (str == null) {
            str = "";
        }
        this.f380 = str;
    }

    /* JADX INFO: renamed from: ࢡ, reason: contains not printable characters */
    protected void m552(String str) {
        if (str == null) {
            str = "";
        }
        this.f382 = str;
    }

    /* JADX INFO: renamed from: ࢢ, reason: contains not printable characters */
    protected void m553(String str) {
        if (str == null) {
            str = "";
        }
        this.f385 = str;
    }

    /* JADX INFO: renamed from: ࢣ, reason: contains not printable characters */
    protected void m554(boolean z) {
        this.f383 = z;
    }

    /* JADX INFO: renamed from: ࢤ, reason: contains not printable characters */
    protected void m555(String str) {
        if (str == null) {
            str = "";
        }
        this.f391 = str;
    }

    /* JADX INFO: renamed from: ࢥ, reason: contains not printable characters */
    protected void m556(String str) {
        if (str == null) {
            str = "";
        }
        this.f393 = str;
    }

    /* JADX INFO: renamed from: ࢦ, reason: contains not printable characters */
    protected void m557(String str) {
        if (str == null) {
            str = "";
        }
        this.f392 = str;
    }

    /* JADX INFO: renamed from: ࢧ, reason: contains not printable characters */
    protected void m558(String str) {
        if (str == null) {
            str = "";
        }
        this.f395 = str;
    }

    /* JADX INFO: renamed from: ࢨ, reason: contains not printable characters */
    protected void m559(String str) {
        if (str == null) {
            str = "";
        }
        this.f394 = str;
    }

    /* JADX INFO: renamed from: ࢩ, reason: contains not printable characters */
    protected void m560(boolean z) {
        this.f377 = z;
    }

    /* JADX INFO: renamed from: ࢪ, reason: contains not printable characters */
    protected void m561(boolean z) {
        this.f376 = z;
    }

    /* JADX INFO: renamed from: ࢫ, reason: contains not printable characters */
    protected void m562(boolean z) {
        this.f379 = z;
    }

    /* JADX INFO: renamed from: ࢬ, reason: contains not printable characters */
    protected void m563(boolean z) {
        this.f378 = z;
    }
}
