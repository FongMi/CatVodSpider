package com.github.catvod.spider.merge.ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e {
    private static final Set<File> a = new HashSet();
    private static final boolean b;

    static {
        String property = System.getProperty(nIe.d("2807252267392F4825263B3C2B093D"));
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile(nIe.d("6A3A376860136C4E0F2762666A3A7D1F2D646B59")).matcher(property);
            if (matcher.matches()) {
                try {
                    int i = Integer.parseInt(matcher.group(1));
                    int i2 = Integer.parseInt(matcher.group(2));
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nIe.d("142B7334203B2A4625263B3C2B093D63"));
        sb.append(property);
        sb.append(z ? nIe.d("620E32306922370A272A2D2A3A462036393F2D1427") : nIe.d("62023C263A6F2C092763212E3403732E3C23360F3726316F31132333263D36"));
        Log.i(nIe.d("0F133F37200B271E"), sb.toString());
        b = z;
    }

    static void b(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException {
        Field fieldE = e(obj, str);
        Object[] objArr2 = (Object[]) fieldE.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldE.set(obj, objArr3);
    }

    private static void c(Context context) {
        File file = new File(context.getFilesDir(), nIe.d("3103302C272B23142A6E2D2A3A0320"));
        if (file.isDirectory()) {
            StringBuilder sbB = c.b(nIe.d("010A36223B262C01732C252B6215362026212607213A692B271E7327203D624E"));
            sbB.append(file.getPath());
            String strD = nIe.d("6B48");
            sbB.append(strD);
            String string = sbB.toString();
            String strD2 = nIe.d("0F133F37200B271E");
            Log.i(strD2, string);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sbB2 = c.b(nIe.d("04073A2F2C2B62123C632526311273302C2C2D0837223B366202363B692B2B147320262136033D376967"));
                sbB2.append(file.getPath());
                sbB2.append(strD);
                Log.w(strD2, sbB2.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sbB3 = c.b(nIe.d("16142A2A272862123C632D2A2E03272669202E02732520232746"));
                sbB3.append(file2.getPath());
                sbB3.append(nIe.d("620935633A26380373"));
                sbB3.append(file2.length());
                Log.i(strD2, sbB3.toString());
                if (file2.delete()) {
                    StringBuilder sbB4 = c.b(nIe.d("06033F263D2A26463C2F2D6F240F3F2669"));
                    sbB4.append(file2.getPath());
                    Log.i(strD2, sbB4.toString());
                } else {
                    StringBuilder sbB5 = c.b(nIe.d("04073A2F2C2B62123C632D2A2E03272669202E02732520232746"));
                    sbB5.append(file2.getPath());
                    Log.w(strD2, sbB5.toString());
                }
            }
            if (file.delete()) {
                StringBuilder sbB6 = c.b(nIe.d("06033F263D2A26463C2F2D6F3103302C272B23142A632D2A3A46372A3B6F"));
                sbB6.append(file.getPath());
                Log.i(strD2, sbB6.toString());
            } else {
                StringBuilder sbB7 = c.b(nIe.d("04073A2F2C2B62123C632D2A2E032726693C27053C2D2D2E301F73272C3762023A3169"));
                sbB7.append(file.getPath());
                Log.w(strD2, sbB7.toString());
            }
        }
    }

    private static void d(Context context, File file, File file2) {
        String strD = nIe.d("3103302C272B23142A6E2D2A3A0320");
        Set<File> set = a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            if (i > 20) {
                Log.w(nIe.d("0F133F37200B271E"), nIe.d("0F133F37200B271E732A3A6F2C0927632E3A2314322D3D2A27027337266F3509212869262C460007026F3403213020202C46") + i + nIe.d("78460007026F3403213020202C463B2A2E2727147337212E2C46") + 20 + nIe.d("62153B2C3C2326463126692D230538262D6F201F73") + nIe.d("30133D3720222746242A3D276204262A253B6F0F3D63243A2E123A272C3762053233282D2B0A273A692D3712732A3D6831463D2C3D6F360E3663") + nIe.d("2107202669272714367969252310326D3F226C1036313A262D086E61") + System.getProperty(nIe.d("2807252267392F4825263B3C2B093D")) + nIe.d("60"));
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e(nIe.d("0F133F37200B271E"), nIe.d("01093D372C373646302F283C31463F2C282B2714732A3A6F2C133F2F676F0F132037692D2746213627212B0834632021621236303D6F2F093726676F110D3A33693F2312302B20212548"));
                    return;
                }
                try {
                    c(context);
                } catch (Throwable th) {
                    Log.w(nIe.d("0F133F37200B271E"), nIe.d("11093E263D272B0834633E2A2C1273343B202C017334212A2C46273130262C017337266F210A36223B6F2D0A3763043A2E123A072C3762032B373B2E21123A2C276362053C2D3D262C133A2D2E6F350F272B263A3646302F2C2E2C0F3D2467"), th);
                }
                String strD2 = nIe.d("21093726162C23053B26");
                File file3 = new File(file2, strD2);
                try {
                    h(file3);
                } catch (IOException unused) {
                    file3 = new File(context.getFilesDir(), strD2);
                    h(file3);
                }
                File file4 = new File(file3, strD);
                h(file4);
                h hVar = new h(file, file4);
                IOException e = null;
                try {
                    try {
                        g(classLoader, file4, hVar.e(context, false));
                    } catch (IOException e2) {
                        Log.w(nIe.d("0F133F37200B271E"), nIe.d("04073A2F2C2B62123C6320213112322F256F271E2731282C360337633A2A21093D27283D3B463726316F240F3F263A63621436373B362B0834633E26360E7325263D210337632C37361432203D262D08"), e2);
                        g(classLoader, file4, hVar.e(context, true));
                    }
                    try {
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        hVar.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (RuntimeException e4) {
                Log.w(nIe.d("0F133F37200B271E"), nIe.d("04073A2F3C3D2746242B20232746273130262C017337266F2D042722202162253C2D3D2A3A127320252E3115732F262E2603216D6902371527632B2A6214262D27262C01732A276F3603203769222D02366D691C290F2363392E36053B2A27286C"), e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field e(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException(nIe.d("040F362F2D6F") + str + nIe.d("62083C3769292D133D2769262C46") + obj.getClass());
    }

    public static void f(Context context) {
        ApplicationInfo applicationInfo;
        String strD;
        String strD2 = nIe.d("0F133F37200B271E");
        Log.i(strD2, nIe.d("0B08203728232E0F3D24692E32163F2A2A2E360F3C2D"));
        try {
            if (b) {
                strD = nIe.d("142B732B283C620B262F3D2626032B633A3A32163C313D63622B262F3D2606032B633A3A32163C313D6F2E0F3131283D3B463A30692B2B153221252A2648");
            } else {
                try {
                    applicationInfo = context.getApplicationInfo();
                } catch (RuntimeException e) {
                    Log.w(strD2, nIe.d("04073A2F3C3D2746242B20232746273130262C017337266F2D04272220216227233325262107272A26210B08352C692930093E630A202C12363B3D61622B26303D6F200373313C212C0F3D2469262C4627263A3B620B3C272C616235382A396F3207272021262C017D"), e);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i(strD2, nIe.d("0C097302393F2E0F30223D262D081A2D2F2062072522202323043F26656F2B48366D693D37083D2A272862093D63286F36032037690C2D082726313B78461E36253B2B22363B693C3716232C3B3B620A3A213B2E301F732A3A6F260F20222B2327027D"));
                    return;
                } else {
                    d(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    strD = nIe.d("2B08203728232E46372C272A");
                }
            }
            Log.i(strD2, strD);
        } catch (Exception e2) {
            Log.e(strD2, nIe.d("0F133F37200B271E732A273C36073F2F283B2B093D632F2E2B0A26312C"), e2);
            StringBuilder sbB = c.b(nIe.d("0F133F37200B271E732A273C36073F2F283B2B093D632F2E2B0A36276967"));
            sbB.append(e2.getMessage());
            sbB.append(nIe.d("6B48"));
            throw new RuntimeException(sbB.toString());
        }
    }

    private static void g(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            b.a(classLoader, list);
            return;
        }
        Object obj = e(classLoader, nIe.d("3207272B05263112")).get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            String strD = nIe.d("2F0738260D2A3A233F26242A2C1220");
            if (superclass == null) {
                throw new NoSuchMethodException(nIe.d("0F03272B262B62") + strD + nIe.d("62113A37216F32072122242A3603213069") + Arrays.asList(clsArr) + nIe.d("62083C3769292D133D2769262C46") + obj.getClass());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod(strD, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        b(obj, nIe.d("26032B06252A2F033D373A"), (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log.w(nIe.d("0F133F37200B271E"), nIe.d("071E3026393B2B093D632021620B32282C0B271E162F2C22270827"), (IOException) it.next());
            }
            Field fieldE = e(obj, nIe.d("26032B06252A2F033D373A1C371623312C3C31033706312C2716272A262131"));
            IOException[] iOExceptionArr2 = (IOException[]) fieldE.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                arrayList.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldE.set(obj, iOExceptionArr);
            IOException iOException = new IOException(nIe.d("0B491C632C372103233720202C4637363B262C01732E28242722363B0C23270B362D3D"));
            iOException.initCause((Throwable) arrayList.get(0));
            throw iOException;
        }
    }

    private static void h(File file) throws IOException {
        String string;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        String strD = nIe.d("04073A2F2C2B62123C632A3D27072726692B2B1473");
        if (parentFile == null) {
            StringBuilder sbB = c.b(strD);
            sbB.append(file.getPath());
            sbB.append(nIe.d("6C4603223B2A2C127325202327463A306921370A3F6D"));
            string = sbB.toString();
        } else {
            StringBuilder sbB2 = c.b(strD);
            sbB2.append(file.getPath());
            sbB2.append(nIe.d("6C4623223B2A2C127325202327463A30692E62023A3169"));
            sbB2.append(parentFile.isDirectory());
            sbB2.append(nIe.d("6E4632632F262E0373"));
            sbB2.append(parentFile.isFile());
            sbB2.append(nIe.d("6E46363B203C361573"));
            sbB2.append(parentFile.exists());
            sbB2.append(nIe.d("6E462126282B23043F2669"));
            sbB2.append(parentFile.canRead());
            sbB2.append(nIe.d("6E462431203B23043F2669"));
            sbB2.append(parentFile.canWrite());
            string = sbB2.toString();
        }
        Log.e(nIe.d("0F133F37200B271E"), string);
        StringBuilder sbB3 = c.b(nIe.d("04073A2F2C2B62123C632A3D27072726692B2B1436203D20301F73"));
        sbB3.append(file.getPath());
        throw new IOException(sbB3.toString());
    }
}
