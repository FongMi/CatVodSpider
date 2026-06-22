package com.github.catvod.spider.merge.p;

import android.graphics.Bitmap;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0213f {
    public static void a(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor == 0) {
                return;
            }
            throw new RuntimeException(C0098a.a(new byte[]{-114, 40, 96, 66, -1, 58, 21, -126, -80, 45, 100, 64, -9, 58, 16, -116, -76, 44, 96, 74, -77, 109, 31, -103, -75, 96, 96, 86, -6, 110, 86, -114, -78, 36, 96, 14}, new byte[]{-35, 64, 5, 46, -109, 26, 118, -19}) + iWaitFor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str) {
        try {
            String str2 = C0098a.a(new byte[]{-59, -50, 104, -20, -91, 106}, new byte[]{-85, -95, 0, -103, -43, 74, 83, 117}) + str + C0098a.a(new byte[]{-47, 41, -113, 62, -113, -34, -60}, new byte[]{-15, 27, -79, 24, -66, -2, -30, -44});
            SpiderDebug.log(C0098a.a(new byte[]{-106, -101, 103, 25, 112, -12, 17, -51, -125, -86, 101, 20, 81, -23, 60, -15, -99, -123, 109, 45, 95, -23, 55, -126, -45, -61}, new byte[]{-13, -29, 2, 122, 62, -101, 89, -72}) + str2);
            Process processExec = Runtime.getRuntime().exec(str2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.toLowerCase().contains(C0098a.a(new byte[]{-67, 93, 102, -97}, new byte[]{-44, 51, 0, -16, 13, 29, 16, -20})) && !line.toLowerCase().contains(C0098a.a(new byte[]{69, 40, -128, 91}, new byte[]{50, 73, -14, 53, -59, 39, -57, -57})) && !line.toLowerCase().contains(C0098a.a(new byte[]{77, 91, -48, -1, -16}, new byte[]{40, 41, -94, -112, -126, 17, -107, 62}))) {
                    SpiderDebug.log(line);
                }
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                SpiderDebug.log(String.format(C0098a.a(new byte[]{-63, -19, -43, -15, -101, 62, 64, 48, -1, -24, -47, -13, -109, 62, 69, 62, -5, -23, -43, -7, -41, 105, 74, 43, -6, -91, -43, -27, -98, 106, 3, 60, -3, -31, -43, -67, -48, 59, 80, 120}, new byte[]{-110, -123, -80, -99, -9, 30, 35, 95}), Integer.valueOf(iWaitFor)));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Bitmap c(String str, int i) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, C0098a.a(new byte[]{-91, -98, 50, -42, -10}, new byte[]{-16, -54, 116, -5, -50, -96, 52, -90}));
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
}
