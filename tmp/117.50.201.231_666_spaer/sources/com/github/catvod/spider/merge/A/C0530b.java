package com.github.catvod.spider.merge.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
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
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0530b {
    private static final Set<File> a = new HashSet();
    private static final boolean b;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b$a */
    private static final class a {
        private final InterfaceC0027a a;

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b$a$a, reason: collision with other inner class name */
        private interface InterfaceC0027a {
            Object a(File file, DexFile dexFile);
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b$a$b, reason: collision with other inner class name */
        private static class C0028b implements InterfaceC0027a {
            private final Constructor<?> a;

            C0028b(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.merge.a.C0530b.a.InterfaceC0027a
            public final Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b$a$c */
        private static class c implements InterfaceC0027a {
            private final Constructor<?> a;

            c(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.merge.a.C0530b.a.InterfaceC0027a
            public final Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, file, dexFile);
            }
        }

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b$a$d */
        private static class d implements InterfaceC0027a {
            private final Constructor<?> a;

            d(Class<?> cls) throws NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.github.catvod.spider.merge.a.C0530b.a.InterfaceC0027a
            public final Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws ClassNotFoundException {
            InterfaceC0027a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new C0028b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.a = dVar;
        }

        static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException {
            Object obj = C0530b.e(classLoader, "pathList").get(classLoader);
            a aVar = new a();
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = aVar.a.a(file, DexFile.loadDex(file.getPath(), new File(file.getParentFile(), file.getName().substring(0, r9.length() - 4) + ".dex").getPath(), 0));
            }
            try {
                C0530b.b(obj, "dexElements", objArr);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C0530b.b(obj, "pathElements", objArr);
            }
        }
    }

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
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
        sb.append("VM with version ");
        sb.append(property);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
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
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sbA = C0529a.a("Clearing old secondary dex dir (");
            sbA.append(file.getPath());
            sbA.append(").");
            Log.i("MultiDex", sbA.toString());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sbA2 = C0529a.a("Failed to list secondary dex dir content (");
                sbA2.append(file.getPath());
                sbA2.append(").");
                Log.w("MultiDex", sbA2.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sbA3 = C0529a.a("Trying to delete old file ");
                sbA3.append(file2.getPath());
                sbA3.append(" of size ");
                sbA3.append(file2.length());
                Log.i("MultiDex", sbA3.toString());
                if (file2.delete()) {
                    StringBuilder sbA4 = C0529a.a("Deleted old file ");
                    sbA4.append(file2.getPath());
                    Log.i("MultiDex", sbA4.toString());
                } else {
                    StringBuilder sbA5 = C0529a.a("Failed to delete old file ");
                    sbA5.append(file2.getPath());
                    Log.w("MultiDex", sbA5.toString());
                }
            }
            if (file.delete()) {
                StringBuilder sbA6 = C0529a.a("Deleted old secondary dex dir ");
                sbA6.append(file.getPath());
                Log.i("MultiDex", sbA6.toString());
            } else {
                StringBuilder sbA7 = C0529a.a("Failed to delete secondary dex dir ");
                sbA7.append(file.getPath());
                Log.w("MultiDex", sbA7.toString());
            }
        }
    }

    private static void d(Context context, File file, File file2) {
        Set<File> set = a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            if (i > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    c(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File file3 = new File(file2, "code_cache");
                try {
                    h(file3);
                } catch (IOException unused) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    h(file3);
                }
                File file4 = new File(file3, "secondary-dexes");
                h(file4);
                C0533e c0533e = new C0533e(file, file4);
                IOException e = null;
                try {
                    try {
                        g(classLoader, file4, c0533e.e(context, false));
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                        g(classLoader, file4, c0533e.e(context, true));
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
                        c0533e.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (RuntimeException e4) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
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
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void f(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        Log.i("MultiDex", "Installing application");
        if (b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else {
            try {
                try {
                    applicationInfo = context.getApplicationInfo();
                } catch (RuntimeException e) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    d(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    str = "install done";
                }
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                StringBuilder sbA = C0529a.a("MultiDex installation failed (");
                sbA.append(e2.getMessage());
                sbA.append(").");
                throw new RuntimeException(sbA.toString());
            }
        }
        Log.i("MultiDex", str);
    }

    private static void g(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException {
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            a.a(classLoader, list);
            return;
        }
        Object obj = e(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                b(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                    }
                    Field fieldE = e(obj, "dexElementsSuppressedExceptions");
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
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static void h(File file) throws IOException {
        String string;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sbA = C0529a.a("Failed to create dir ");
            sbA.append(file.getPath());
            sbA.append(". Parent file is null.");
            string = sbA.toString();
        } else {
            StringBuilder sbA2 = C0529a.a("Failed to create dir ");
            sbA2.append(file.getPath());
            sbA2.append(". parent file is a dir ");
            sbA2.append(parentFile.isDirectory());
            sbA2.append(", a file ");
            sbA2.append(parentFile.isFile());
            sbA2.append(", exists ");
            sbA2.append(parentFile.exists());
            sbA2.append(", readable ");
            sbA2.append(parentFile.canRead());
            sbA2.append(", writable ");
            sbA2.append(parentFile.canWrite());
            string = sbA2.toString();
        }
        Log.e("MultiDex", string);
        StringBuilder sbA3 = C0529a.a("Failed to create directory ");
        sbA3.append(file.getPath());
        throw new IOException(sbA3.toString());
    }
}
