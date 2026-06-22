package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Y implements X {
    public static Y a = new Y();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullListAsEmpty);
            return;
        }
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            h0Var.write(91);
            while (i2 < iArr.length) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                h0Var.q(iArr[i2]);
                i2++;
            }
            h0Var.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            h0Var.write(91);
            while (i2 < sArr.length) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                h0Var.q(sArr[i2]);
                i2++;
            }
            h0Var.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            h0Var.write(91);
            while (i2 < jArr.length) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                h0Var.r(jArr[i2]);
                i2++;
            }
            h0Var.write(93);
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            h0Var.write(91);
            while (i2 < zArr.length) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                h0Var.write(zArr[i2] ? "true" : "false");
                i2++;
            }
            h0Var.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            h0Var.write(91);
            while (i2 < fArr.length) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                float f = fArr[i2];
                if (Float.isNaN(f)) {
                    h0Var.s();
                } else {
                    h0Var.b(Float.toString(f));
                }
                i2++;
            }
            h0Var.write(93);
            return;
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof byte[]) {
                h0Var.h((byte[]) obj);
                return;
            } else {
                h0Var.w((char[]) obj);
                return;
            }
        }
        double[] dArr = (double[]) obj;
        h0Var.write(91);
        while (i2 < dArr.length) {
            if (i2 != 0) {
                h0Var.write(44);
            }
            double d = dArr[i2];
            if (Double.isNaN(d)) {
                h0Var.s();
            } else {
                h0Var.b(Double.toString(d));
            }
            i2++;
        }
        h0Var.write(93);
    }
}
