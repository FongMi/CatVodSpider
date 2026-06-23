package com.github.catvod.spider.merge.AB.o;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class I {
    static volatile Z a = new Z();

    public static com.github.catvod.spider.merge.AB.M.g a(com.github.catvod.spider.merge.AB.K.m mVar) {
        com.github.catvod.spider.merge.AB.M.g gVar = new com.github.catvod.spider.merge.AB.M.g();
        while (true) {
            mVar = mVar.g0();
            if (mVar == null) {
                break;
            }
            gVar.add(mVar);
        }
        if (gVar.size() > 0) {
            return gVar;
        }
        return null;
    }

    public static Bitmap b(String str, int i) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, i, i, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                for (int i3 = 0; i3 < width; i3++) {
                    iArr[(i2 * width) + i3] = bitMatrixEncode.get(i3, i2) ? -16777216 : -1;
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

    public static int c(com.github.catvod.spider.merge.AB.K.m mVar, com.github.catvod.spider.merge.AB.V.e eVar) {
        int i = 1;
        for (com.github.catvod.spider.merge.AB.K.m mVar2 : mVar.k0().V()) {
            if (mVar.t0().equals(mVar2.t0()) && eVar.a().contains(mVar2)) {
                if (mVar == mVar2) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static String d(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static com.github.catvod.spider.merge.AB.M.g e(com.github.catvod.spider.merge.AB.K.m mVar) {
        com.github.catvod.spider.merge.AB.M.g gVar = new com.github.catvod.spider.merge.AB.M.g();
        while (true) {
            mVar = mVar.n0();
            if (mVar == null) {
                break;
            }
            gVar.add(mVar);
        }
        if (gVar.size() > 0) {
            return gVar;
        }
        return null;
    }

    public static void f(com.github.catvod.spider.merge.AB.K.m mVar, int i) {
        mVar.R("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    public static void g(com.github.catvod.spider.merge.AB.K.m mVar, int i) {
        mVar.R("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
