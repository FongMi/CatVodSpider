package com.github.catvod.spider.merge.g;

import android.R;
import android.graphics.Bitmap;
import com.github.catvod.spider.merge.M1.h;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.p1.i;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.EnumMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1201a {
    public static final int[] a = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static final int[] b = {R.attr.id, R.attr.drawable};
    public static final int[] c = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    public static Bitmap a(String str, int i, int i2) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(i2));
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, m.f(i), m.f(i), enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i3 = 0; i3 < height; i3++) {
                int i4 = i3 * width;
                for (int i5 = 0; i5 < width; i5++) {
                    iArr[i4 + i5] = bitMatrixEncode.get(i5, i3) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigInteger.compareTo(bigInteger3) == 0) {
            return bigInteger3;
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigInteger6 = bigInteger3;
        BigInteger bigInteger7 = bigInteger4;
        while (bigIntegerMod.compareTo(BigInteger.ONE) > 0) {
            BigInteger bigIntegerDivide = bigInteger5.divide(bigIntegerMod);
            BigInteger bigIntegerSubtract = bigInteger6.subtract(bigInteger7.multiply(bigIntegerDivide));
            BigInteger bigIntegerSubtract2 = bigInteger5.subtract(bigIntegerMod.multiply(bigIntegerDivide));
            bigInteger5 = bigIntegerMod;
            bigIntegerMod = bigIntegerSubtract2;
            bigInteger6 = bigInteger7;
            bigInteger7 = bigIntegerSubtract;
        }
        return bigInteger7.mod(bigInteger2);
    }

    public static com.github.catvod.spider.merge.F0.b c(com.github.catvod.spider.merge.F0.b bVar, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = bVar.b;
        if (bigInteger3 == null || bigInteger3.equals(BigInteger.ZERO)) {
            BigInteger bigInteger4 = BigInteger.ZERO;
            return new com.github.catvod.spider.merge.F0.b(bigInteger4, bigInteger4, bigInteger4);
        }
        BigInteger bigIntegerMod = bVar.b.pow(2).mod(bigInteger2);
        BigInteger bigIntegerMod2 = BigInteger.valueOf(4L).multiply(bVar.a).multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(3L).multiply(bVar.a.pow(2)).add(bigInteger.multiply(bVar.c.pow(4))).mod(bigInteger2);
        BigInteger bigIntegerMod4 = bigIntegerMod3.pow(2).subtract(BigInteger.valueOf(2L).multiply(bigIntegerMod2)).mod(bigInteger2);
        return new com.github.catvod.spider.merge.F0.b(bigIntegerMod4, bigIntegerMod3.multiply(bigIntegerMod2.subtract(bigIntegerMod4)).subtract(BigInteger.valueOf(8L).multiply(bigIntegerMod.pow(2))).mod(bigInteger2), BigInteger.valueOf(2L).multiply(bVar.b).multiply(bVar.c).mod(bigInteger2));
    }

    public static com.github.catvod.spider.merge.F0.b d(com.github.catvod.spider.merge.F0.b bVar, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        BigInteger bigInteger5 = BigInteger.ZERO;
        if (bigInteger5.compareTo(bVar.b) == 0 || bigInteger5.compareTo(bigInteger) == 0) {
            return new com.github.catvod.spider.merge.F0.b(bigInteger5, bigInteger5, BigInteger.ONE);
        }
        BigInteger bigInteger6 = BigInteger.ONE;
        if (bigInteger6.compareTo(bigInteger) == 0) {
            return bVar;
        }
        if (bigInteger.compareTo(bigInteger5) < 0 || bigInteger.compareTo(bigInteger2) >= 0) {
            return d(bVar, bigInteger.mod(bigInteger2), bigInteger2, bigInteger3, bigInteger4);
        }
        if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger5) == 0) {
            return c(d(bVar, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4);
        }
        if (bigInteger.mod(BigInteger.valueOf(2L)).compareTo(bigInteger6) != 0) {
            return null;
        }
        com.github.catvod.spider.merge.F0.b bVarC = c(d(bVar, bigInteger.divide(BigInteger.valueOf(2L)), bigInteger2, bigInteger3, bigInteger4), bigInteger3, bigInteger4);
        BigInteger bigInteger7 = bVarC.b;
        if (bigInteger7 == null || bigInteger7.equals(bigInteger5)) {
            return bVar;
        }
        BigInteger bigInteger8 = bVar.b;
        if (bigInteger8 != null && !bigInteger8.equals(bigInteger5)) {
            BigInteger bigIntegerMod = bVarC.a.multiply(bVar.c.pow(2)).mod(bigInteger4);
            BigInteger bigIntegerMod2 = bVar.a.multiply(bVarC.c.pow(2)).mod(bigInteger4);
            BigInteger bigIntegerMod3 = bVarC.b.multiply(bVar.c.pow(3)).mod(bigInteger4);
            BigInteger bigIntegerMod4 = bVar.b.multiply(bVarC.c.pow(3)).mod(bigInteger4);
            if (bigIntegerMod.compareTo(bigIntegerMod2) == 0) {
                return bigIntegerMod3.compareTo(bigIntegerMod4) != 0 ? new com.github.catvod.spider.merge.F0.b(bigInteger5, bigInteger5, bigInteger6) : c(bVarC, bigInteger3, bigInteger4);
            }
            BigInteger bigIntegerSubtract = bigIntegerMod2.subtract(bigIntegerMod);
            BigInteger bigIntegerSubtract2 = bigIntegerMod4.subtract(bigIntegerMod3);
            BigInteger bigIntegerMod5 = bigIntegerSubtract.multiply(bigIntegerSubtract).mod(bigInteger4);
            BigInteger bigIntegerMod6 = bigIntegerSubtract.multiply(bigIntegerMod5).mod(bigInteger4);
            BigInteger bigIntegerMod7 = bigIntegerMod.multiply(bigIntegerMod5).mod(bigInteger4);
            BigInteger bigIntegerMod8 = bigIntegerSubtract2.pow(2).subtract(bigIntegerMod6).subtract(BigInteger.valueOf(2L).multiply(bigIntegerMod7)).mod(bigInteger4);
            bVarC = new com.github.catvod.spider.merge.F0.b(bigIntegerMod8, bigIntegerSubtract2.multiply(bigIntegerMod7.subtract(bigIntegerMod8)).subtract(bigIntegerMod3.multiply(bigIntegerMod6)).mod(bigInteger4), bigIntegerSubtract.multiply(bVarC.c).multiply(bVar.c).mod(bigInteger4));
        }
        return bVarC;
    }

    public static String e(String str, String str2) throws i {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            throw new i("Start not found");
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        com.github.catvod.spider.merge.M1.i iVar = new com.github.catvod.spider.merge.M1.i(strSubstring);
        boolean z = false;
        while (true) {
            h hVarA = iVar.a();
            int i = hVarA.a;
            if (i == 47) {
                z = true;
            } else {
                if (z && iVar.b()) {
                    return strSubstring.substring(0, hVarA.b);
                }
                if (i == 2) {
                    throw new i("Could not find matching braces");
                }
            }
        }
    }

    public static String f(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static com.github.catvod.spider.merge.F0.b g(com.github.catvod.spider.merge.F0.b bVar, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        com.github.catvod.spider.merge.F0.b bVarD = d(new com.github.catvod.spider.merge.F0.b(bVar.a, bVar.b, BigInteger.ONE), bigInteger, bigInteger2, bigInteger3, bigInteger4);
        BigInteger bigIntegerB = b(bVarD.c, bigInteger4);
        return new com.github.catvod.spider.merge.F0.b(bVarD.a.multiply(bigIntegerB.pow(2)).mod(bigInteger4), bVarD.b.multiply(bigIntegerB.pow(3)).mod(bigInteger4), BigInteger.ZERO);
    }
}
