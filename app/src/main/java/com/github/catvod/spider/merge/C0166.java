package com.github.catvod.spider.merge;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʹ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0166 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final boolean[] f407 = new boolean[0];

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final Boolean[] f408 = new Boolean[0];

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final byte[] f409 = new byte[0];

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static final Byte[] f410 = new Byte[0];

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static final char[] f411 = new char[0];

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static final Character[] f412 = new Character[0];

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static final Class<?>[] f413 = new Class[0];

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static final double[] f414 = new double[0];

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static final Double[] f415 = new Double[0];

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static final Field[] f416 = new Field[0];

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static final float[] f417 = new float[0];

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static final Float[] f418 = new Float[0];

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static final int[] f419 = new int[0];

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static final Integer[] f420 = new Integer[0];

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public static final long[] f421 = new long[0];

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public static final Long[] f422 = new Long[0];

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public static final Method[] f423 = new Method[0];

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public static final Object[] f424 = new Object[0];

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public static final short[] f425 = new short[0];

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public static final Short[] f426 = new Short[0];

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public static final String[] f427 = new String[0];

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public static final Throwable[] f428 = new Throwable[0];

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public static final Type[] f429 = new Type[0];

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static <T> T[] m585(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static int m586(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static boolean m587(char[] cArr) {
        return m586(cArr) == 0;
    }
}
