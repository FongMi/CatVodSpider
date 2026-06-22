package com.github.catvod.spider.merge.XI;

import android.graphics.Bitmap;
import com.github.catvod.crawler.SpiderDebug;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f {
    public static String a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }

    public static void b(String str) {
        try {
            int iWaitFor = Runtime.getRuntime().exec(str).waitFor();
            if (iWaitFor == 0) {
                return;
            }
            throw new RuntimeException(a(new byte[]{46, 67, -13, 69, 62, 8, 44, -52, 16, 70, -9, 71, 54, 8, 41, -62, 20, 71, -13, 77, 114, 95, 38, -41, 21, 11, -13, 81, 59, 92, 111, -64, 18, 79, -13, 9}, new byte[]{125, 43, -106, 41, 82, 40, 79, -93}) + iWaitFor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void c(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            byte b = -90;
            sb.append(a(new byte[]{39, 37, 34, 5, -42, -43}, new byte[]{73, 74, 74, 112, -90, -11, -32, 50}));
            sb.append(str);
            sb.append(a(new byte[]{69, -82, 113, -18, 92, 67, 23}, new byte[]{101, -100, 79, -56, 109, 99, 49, -20}));
            String string = sb.toString();
            SpiderDebug.log(a(new byte[]{-48, -56, -4, 122, -112, 65, 73, 114, -59, -7, -2, 119, -79, 92, 100, 78, -37, -42, -10, 78, -65, 92, 111, 61, -107, -112}, new byte[]{-75, -80, -103, 25, -34, 46, 1, 7}) + string);
            Process processExec = Runtime.getRuntime().exec(string);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.toLowerCase().contains(a(new byte[]{110, -51, 82, b}, new byte[]{7, -93, 52, -55, -79, -9, -27, -110})) && !line.toLowerCase().contains(a(new byte[]{-35, -58, 52, -9}, new byte[]{-86, -89, 70, -103, 123, -112, -117, 77})) && !line.toLowerCase().contains(a(new byte[]{122, 17, -80, 117, 119}, new byte[]{31, 99, -62, 26, 5, 77, -112, -123}))) {
                    SpiderDebug.log(line);
                }
                b = -90;
            }
            int iWaitFor = processExec.waitFor();
            if (iWaitFor != 0) {
                SpiderDebug.log(String.format(a(new byte[]{-114, -44, -39, -22, 52, 2, -1, -68, -80, -47, -35, -24, 60, 2, -6, -78, -76, -48, -39, -30, 120, 85, -11, -89, -75, -100, -39, -2, 49, 86, -68, -80, -78, -40, -39, -90, 127, 7, -17, -12}, new byte[]{-35, -68, -68, -122, 88, 34, -100, -45}), Integer.valueOf(iWaitFor)));
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Bitmap d(String str, int i) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, a(new byte[]{15, -6, -45, 26, 23}, new byte[]{90, -82, -107, 55, 47, 76, 4, 109}));
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

    public static JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }
}
