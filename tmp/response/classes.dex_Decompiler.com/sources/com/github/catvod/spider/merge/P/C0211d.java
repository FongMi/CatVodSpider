package com.github.catvod.spider.merge.p;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0134u;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0211d extends ContentProvider {
    private static final String a = C0098a.a(new byte[]{-61, 71, 23, 73, 5, -78, 88, 79, -47, 92, 3, 75, 5, -87, 72, 79, -28, 96, 63, 126, 53, -117, 110, 46, -12, 96, 55, 126, 56, -124, 108, 32, -10, 97, 32}, new byte[]{-94, 41, 115, 59, 106, -37, 60, 97});
    private static final String b = C0098a.a(new byte[]{-5, -9, 35, -84, 70, -105, -26, -72, -20, -2}, new byte[]{-104, -106, 64, -60, 35, -70, -106, -39});
    private static final String c = C0098a.a(new byte[]{-111, -10, 89, -43, -97, -82, -69, -9, -39, -2, 76, -60, -123}, new byte[]{-12, -114, 45, -80, -19, -64, -38, -101});
    private static final String d = C0098a.a(new byte[]{24, -52, 75, 95}, new byte[]{118, -83, 38, 58, 125, 67, -91, -61});
    private static final String e = C0098a.a(new byte[]{120, 58, -61, -42}, new byte[]{8, 91, -73, -66, -115, -121, 1, 104});
    private static final HashMap<String, InterfaceC0209b> f;

    static {
        C0098a.a(new byte[]{45, 15, 106, -99, 69, -80, -89, 6, 40, 11, 124}, new byte[]{73, 102, 25, -19, 41, -47, -34, 72});
        C0098a.a(new byte[]{-121, 58, -82, 5, 44, -53, -58, 23, -121, 48, -90, 27, 57}, new byte[]{-40, 94, -57, 118, 92, -89, -89, 110});
        C0098a.a(new byte[]{-77, 60, -116, -6, -81}, new byte[]{-20, 79, -27, -128, -54, -8, 117, -2});
        f = new HashMap<>();
    }

    public static Uri a(Context context, String str, File file) {
        InterfaceC0209b interfaceC0209bB;
        HashMap<String, InterfaceC0209b> map = f;
        synchronized (map) {
            interfaceC0209bB = map.get(str);
            if (interfaceC0209bB == null) {
                try {
                    interfaceC0209bB = b(context, str);
                    map.put(str, interfaceC0209bB);
                } catch (com.github.catvod.spider.merge.f0.a e2) {
                    throw new IllegalArgumentException(C0098a.a(new byte[]{30, -35, 86, -6, -87, 61, 126, 47, 55, -100, 79, -9, -66, 42, 59, 123, 57, -46, 91, -28, -93, 48, 58, 117, 43, -55, 79, -26, -93, 43, 42, 117, 30, -11, 115, -45, -109, 9, 12, 20, 14, -11, 123, -45, -98, 6, 14, 26, 12, -12, 108, -74, -95, 60, 42, 58, 117, -40, 94, -30, -83}, new byte[]{88, -68, 63, -106, -52, 89, 94, 91}), e2);
                } catch (IOException e3) {
                    throw new IllegalArgumentException(C0098a.a(new byte[]{77, 106, 69, -106, 74, -38, -93, -55, 100, 43, 92, -101, 93, -51, -26, -99, 106, 101, 72, -120, 64, -41, -25, -109, 120, 126, 92, -118, 64, -52, -9, -109, 77, 66, 96, -65, 112, -18, -47, -14, 93, 66, 104, -65, 125, -31, -45, -4, 95, 67, 127, -38, 66, -37, -9, -36, 38, 111, 77, -114, 78}, new byte[]{11, 11, 44, -6, 47, -66, -125, -67}), e3);
                }
            }
        }
        return interfaceC0209bB.a(file);
    }

    private static InterfaceC0209b b(Context context, String str) throws XmlPullParserException, IOException {
        C0210c c0210c = new C0210c(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(C0134u.b(new byte[]{-10, -83, 100, -80, 88, 14, -121, 29, -107, -92, 120, -78, 88, 64, -51, 12, -63, -93, 60, -72, 93, 20, -63, 73, -45, -83, 99, -4, 76, 18, -49, 31, -36, -90, 116, -82, 28, 23, -55, 29, -35, -30, 112, -87, 72, 8, -49, 27, -36, -74, 104, -4}, new byte[]{-75, -62, 17, -36, 60, 96, -96, 105}, new StringBuilder(), str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), a);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException(C0098a.a(new byte[]{-21, 59, 15, 75, 113, -102, -48, -31, -57, 60, 24, 74, 119, -99, -45, -17, -43, 39, 12, 72, 119, -122, -61, -17, -32, 27, 48, 125, 71, -92, -27, -114, -16, 27, 56, 125, 74, -85, -25, -128, -14, 26, 47, 24, 117, -111, -61, -96, -117, 54, 29, 76, 121}, new byte[]{-90, 82, 124, 56, 24, -12, -73, -63}));
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0210c;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, d);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, e);
                if (b.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (c.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                }
                if (externalStorageDirectory != null) {
                    String[] strArr = {attributeValue2};
                    for (int i = 0; i < 1; i++) {
                        String str2 = strArr[i];
                        if (str2 != null) {
                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                        }
                    }
                    c0210c.b(attributeValue, externalStorageDirectory);
                }
            }
        }
    }
}
