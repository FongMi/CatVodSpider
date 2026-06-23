package com.github.catvod.utils.merge;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.EnumMap;

/**
 * 二维码生成 + 椭圆曲线加密 + MD5 工具
 */
public final class QrCodeUtils {

    // ==================== 二维码 ====================

    /**
     * 生成二维码 Bitmap
     *
     * @param content  二维码内容
     * @param sizeDp   尺寸（dp）
     * @param margin   边距（像素）
     * @return 二维码 Bitmap，失败返回 null
     */
    public static Bitmap generateQrCode(String content, int sizeDp, int margin) {
        try {
            int sizePx = dpToPx(sizeDp);
            EnumMap<EncodeHintType, Object> hints = new EnumMap<>(EncodeHintType.class);
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            hints.put(EncodeHintType.MARGIN, margin);
            BitMatrix matrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, sizePx, sizePx, hints);
            int width = matrix.getWidth();
            int height = matrix.getHeight();
            int[] pixels = new int[width * height];
            for (int y = 0; y < height; y++) {
                int offset = y * width;
                for (int x = 0; x < width; x++) {
                    pixels[offset + x] = matrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF;
                }
            }
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ==================== 椭圆曲线运算 ====================

    /**
     * 模逆元（扩展欧几里得算法）
     * <p>
     * 求 a 在模 n 下的乘法逆元，即 a * result ≡ 1 (mod n)
     *
     * @param a 输入值
     * @param n 模数
     * @return a 的模逆元
     */
    public static BigInteger modInverse(BigInteger a, BigInteger n) {
        BigInteger oldR = a, r = n;
        BigInteger oldS = BigInteger.ONE, s = BigInteger.ZERO;
        while (r.compareTo(BigInteger.ZERO) != 0) {
            BigInteger quotient = oldR.divide(r);
            BigInteger tempR = oldR.subtract(quotient.multiply(r));
            oldR = r;
            r = tempR;
            BigInteger tempS = oldS.subtract(quotient.multiply(s));
            oldS = s;
            s = tempS;
        }
        return oldS.mod(n);
    }

    /**
     * 椭圆曲线点倍乘（point doubling）
     * <p>
     * 计算 2P，其中 P = (point.a, point.b, point.c) 在曲线 y² = x³ + b·x + a 上
     *
     * @param point     椭圆曲线上的点 (X, Y, Z) 射影坐标
     * @param curveB    曲线参数 b
     * @param modulus   模数 p
     * @return 2P 点
     */
    public static EcPoint ecPointDouble(EcPoint point, BigInteger curveB, BigInteger modulus) {
        BigInteger y = point.y;
        if (y == null || y.equals(BigInteger.ZERO)) {
            return new EcPoint(BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO);
        }
        BigInteger ySquared = point.y.pow(2).mod(modulus);
        BigInteger fourXY = BigInteger.valueOf(4).multiply(point.x).multiply(ySquared).mod(modulus);
        BigInteger threeXSqPlusBZ4 = BigInteger.valueOf(3).multiply(point.x.pow(2))
                .add(curveB.multiply(point.z.pow(4))).mod(modulus);
        BigInteger newX = threeXSqPlusBZ4.pow(2)
                .subtract(BigInteger.valueOf(2).multiply(fourXY)).mod(modulus);
        return new EcPoint(
                newX,
                threeXSqPlusBZ4.multiply(fourXY.subtract(newX))
                        .subtract(BigInteger.valueOf(8).multiply(ySquared.pow(2))).mod(modulus),
                BigInteger.valueOf(2).multiply(point.y).multiply(point.z).mod(modulus)
        );
    }

    /**
     * 椭圆曲线标量乘法 k·P（double-and-add 算法）
     *
     * @param point     基点 P
     * @param k         标量
     * @param order     点的阶
     * @param curveB    曲线参数 b
     * @param modulus   模数 p
     * @return k·P 点
     */
    public static EcPoint ecScalarMultiply(EcPoint point, BigInteger k, BigInteger order,
                                           BigInteger curveB, BigInteger modulus) {
        if (BigInteger.ZERO.equals(point.y) || BigInteger.ZERO.equals(k)) {
            return new EcPoint(BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE);
        }
        if (BigInteger.ONE.equals(k)) {
            return point;
        }
        if (k.compareTo(BigInteger.ZERO) < 0 || k.compareTo(order) >= 0) {
            return ecScalarMultiply(point, k.mod(order), order, curveB, modulus);
        }
        // Double-and-add
        if (k.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            return ecPointDouble(ecScalarMultiply(point, k.divide(BigInteger.valueOf(2)),
                    order, curveB, modulus), curveB, modulus);
        }
        // k is odd: result = double(k/2 · P) + P
        EcPoint halfResult = ecPointDouble(ecScalarMultiply(point, k.divide(BigInteger.valueOf(2)),
                order, curveB, modulus), curveB, modulus);
        BigInteger halfY = halfResult.y;
        if (halfY == null || halfY.equals(BigInteger.ZERO)) {
            return point;
        }
        BigInteger pointY = point.y;
        if (pointY != null && !pointY.equals(BigInteger.ZERO)) {
            // Point addition
            BigInteger u1 = halfResult.x.multiply(point.z.pow(2)).mod(modulus);
            BigInteger u2 = point.x.multiply(halfResult.z.pow(2)).mod(modulus);
            BigInteger s1 = halfResult.y.multiply(point.z.pow(3)).mod(modulus);
            BigInteger s2 = point.y.multiply(halfResult.z.pow(3)).mod(modulus);
            if (u1.equals(u2)) {
                return s1.equals(s2) ? ecPointDouble(halfResult, curveB, modulus)
                        : new EcPoint(BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE);
            }
            BigInteger h = u2.subtract(u1);
            BigInteger r = s2.subtract(s1);
            BigInteger hSq = h.multiply(h).mod(modulus);
            BigInteger hCu = h.multiply(hSq).mod(modulus);
            BigInteger newX = r.pow(2).subtract(hCu).subtract(BigInteger.valueOf(2).multiply(u1.multiply(hSq))).mod(modulus);
            halfResult = new EcPoint(
                    newX,
                    r.multiply(u1.multiply(hSq).subtract(newX)).subtract(s1.multiply(hCu)).mod(modulus),
                    h.multiply(halfResult.z).multiply(point.z).mod(modulus)
            );
        }
        return halfResult;
    }

    /**
     * 将射影坐标点转换为仿射坐标（归一化）
     *
     * @param point   射影坐标点 (X, Y, Z)
     * @param modulus 模数 p
     * @return 仿射坐标点 (x, y, 0)
     */
    public static EcPoint ecNormalize(EcPoint point, BigInteger modulus) {
        EcPoint result = ecScalarMultiply(new EcPoint(point.x, point.y, BigInteger.ONE),
                point.z, modulus, modulus, modulus);
        BigInteger zInverse = modInverse(result.z, modulus);
        return new EcPoint(
                result.x.multiply(zInverse.pow(2)).mod(modulus),
                result.y.multiply(zInverse.pow(3)).mod(modulus),
                BigInteger.ZERO
        );
    }

    // ==================== 字符串工具 ====================

    /**
     * 在字符串中查找起始标记，提取到匹配的闭合符号
     *
     * @param text      源文本
     * @param startMark 起始标记
     * @return 起始标记之后到闭合符号之间的子串
     */
    public static String extractBetween(String text, String startMark) {
        int startIdx = text.indexOf(startMark);
        if (startIdx < 0) {
            throw new IllegalArgumentException("Start mark not found: " + startMark);
        }
        String remaining = text.substring(startMark.length() + startIdx);
        // 简化实现：查找第一个分隔符
        int endIdx = remaining.indexOf(';');
        if (endIdx < 0) endIdx = remaining.indexOf(',');
        if (endIdx < 0) endIdx = remaining.length();
        return remaining.substring(0, endIdx);
    }

    /**
     * 计算字符串的 MD5 哈希值
     *
     * @param input 输入字符串
     * @return 32 位小写十六进制 MD5，失败返回空串
     */
    public static String md5(String input) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(input.getBytes("UTF-8"));
            StringBuilder hex = new StringBuilder(new BigInteger(1, digest).toString(16));
            while (hex.length() < 32) {
                hex.insert(0, "0");
            }
            return hex.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    // ==================== 内部工具 ====================

    private static int dpToPx(int dp) {
        return (int) (dp * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * 椭圆曲线点（射影坐标）
     */
    public static class EcPoint {
        public final BigInteger x;
        public final BigInteger y;
        public final BigInteger z;

        public EcPoint(BigInteger x, BigInteger y, BigInteger z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
