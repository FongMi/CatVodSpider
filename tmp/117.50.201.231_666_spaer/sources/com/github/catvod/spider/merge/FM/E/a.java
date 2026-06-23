package com.github.catvod.spider.merge.FM.E;

import android.graphics.Bitmap;
import com.github.catvod.spider.merge.FM.C.b;
import com.github.catvod.spider.merge.FM.C.h;
import com.github.catvod.spider.merge.FM.I.c;
import com.github.catvod.spider.merge.FM.K.s;
import com.github.catvod.spider.merge.FM.M.O;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    public static String a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
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
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    iArr[i3 + i4] = bitMatrixEncode.get(i4, i2) ? -16777216 : -1;
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

    public static String c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = b.e;
        String strA = b.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(": ");
        int i2 = h.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void d(O o, s sVar) {
        c.g(sVar);
        s sVarF = sVar;
        int i = 0;
        while (sVarF != null) {
            s sVarZ = sVarF.z();
            int iG = sVarZ != null ? sVarZ.g() : 0;
            s sVarR = sVarF.r();
            o.b(sVarF, i);
            if (sVarZ != null && !sVarF.p()) {
                if (iG == sVarZ.g()) {
                    sVarF = sVarZ.f(sVarF.G());
                } else if (sVarR == null) {
                    i--;
                    sVarF = sVarZ;
                } else {
                    sVarF = sVarR;
                }
            }
            if (sVarF.g() > 0) {
                sVarF = sVarF.f(0);
                i++;
            } else {
                while (sVarF.r() == null && i > 0) {
                    o.a(sVarF, i);
                    sVarF = sVarF.z();
                    i--;
                }
                o.a(sVarF, i);
                if (sVarF == sVar) {
                    return;
                } else {
                    sVarF = sVarF.r();
                }
            }
        }
    }
}
