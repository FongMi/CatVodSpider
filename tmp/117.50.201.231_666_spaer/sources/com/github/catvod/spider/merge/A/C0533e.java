package com.github.catvod.spider.merge.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.catvod.spider.merge.a.C0534f;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0533e implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.e$a */
    private static class a extends File {
        public long a;

        public a(File file, String str) {
            super(file, str);
            this.a = -1L;
        }
    }

    C0533e(File file, File file2) {
        StringBuilder sbA = C0529a.a("MultiDexExtractor(");
        sbA.append(file.getPath());
        sbA.append(", ");
        sbA.append(file2.getPath());
        sbA.append(")");
        Log.i("MultiDex", sbA.toString());
        this.a = file;
        this.c = file2;
        this.b = d(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                a(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                a(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                a(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            a(this.d);
            throw e4;
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(C0531c.a("tmp-", str), ".zip", file.getParentFile());
        StringBuilder sbA = C0529a.a("Extracting ");
        sbA.append(fileCreateTempFile.getPath());
        Log.i("MultiDex", sbA.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            a(inputStream);
            fileCreateTempFile.delete();
        }
    }

    private static long c(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C0534f.a aVarA = C0534f.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = aVarA.b;
            randomAccessFile.seek(aVarA.a);
            int iMin = (int) Math.min(16384L, j);
            byte[] bArr = new byte[16384];
            while (true) {
                int i = randomAccessFile.read(bArr, 0, iMin);
                if (i == -1) {
                    break;
                }
                crc32.update(bArr, 0, i);
                j -= (long) i;
                if (j == 0) {
                    break;
                }
                iMin = (int) Math.min(16384L, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private List f(Context context) throws IOException {
        C0533e c0533e = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = c0533e.a.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            a aVar = new a(c0533e.c, str + i2 + ".zip");
            if (!aVar.isFile()) {
                StringBuilder sbA = C0529a.a("Missing extracted secondary dex file '");
                sbA.append(aVar.getPath());
                sbA.append("'");
                throw new IOException(sbA.toString());
            }
            aVar.a = d(aVar);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = aVar.lastModified();
            if (j2 == jLastModified) {
                String str2 = str;
                if (j == aVar.a) {
                    arrayList.add(aVar);
                    i2++;
                    c0533e = this;
                    str = str2;
                }
            }
            throw new IOException("Invalid extracted dex: " + aVar + " (key \"\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + aVar.a);
        }
        return arrayList;
    }

    private List<a> g() {
        String str = this.a.getName() + ".classes";
        File[] fileArrListFiles = this.c.listFiles(new C0532d());
        if (fileArrListFiles == null) {
            StringBuilder sbA = C0529a.a("Failed to list secondary dex dir content (");
            sbA.append(this.c.getPath());
            sbA.append(").");
            Log.w("MultiDex", sbA.toString());
        } else {
            for (File file : fileArrListFiles) {
                StringBuilder sbA2 = C0529a.a("Trying to delete old file ");
                sbA2.append(file.getPath());
                sbA2.append(" of size ");
                sbA2.append(file.length());
                Log.i("MultiDex", sbA2.toString());
                if (file.delete()) {
                    StringBuilder sbA3 = C0529a.a("Deleted old file ");
                    sbA3.append(file.getPath());
                    Log.i("MultiDex", sbA3.toString());
                } else {
                    StringBuilder sbA4 = C0529a.a("Failed to delete old file ");
                    sbA4.append(file.getPath());
                    Log.w("MultiDex", sbA4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.a);
        int i = 2;
        String str2 = "classes2.dex";
        while (true) {
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    return arrayList;
                }
                a aVar = new a(this.c, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    b(zipFile, entry, aVar, str);
                    try {
                        aVar.a = d(aVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(aVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(aVar.length());
                    sb.append(" - crc: ");
                    sb.append(aVar.a);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                str2 = "classes" + i + ".dex";
            } finally {
                try {
                    zipFile.close();
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to close resource", e2);
                }
            }
        }
    }

    private static void h(Context context, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            editorEdit.putLong("dex.crc." + i, aVar.a);
            editorEdit.putLong("dex.time." + i, aVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List e(android.content.Context r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = com.github.catvod.spider.merge.a.C0529a.a(r0)
            java.io.File r1 = r11.a
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r13)
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r11.f
            boolean r0 = r0.isValid()
            if (r0 == 0) goto La4
            if (r13 != 0) goto L6e
            java.io.File r0 = r11.a
            long r2 = r11.b
            r4 = 4
            java.lang.String r5 = "multidex.version"
            android.content.SharedPreferences r4 = r12.getSharedPreferences(r5, r4)
            r5 = -1
            java.lang.String r7 = "timestamp"
            long r7 = r4.getLong(r7, r5)
            long r9 = c(r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L5f
            java.lang.String r0 = "crc"
            long r4 = r4.getLong(r0, r5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5f
        L5d:
            r0 = 0
            goto L60
        L5f:
            r0 = 1
        L60:
            if (r0 != 0) goto L6e
            java.util.List r12 = r11.f(r12)     // Catch: java.io.IOException -> L67
            goto L8a
        L67:
            r13 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r13)
            goto L78
        L6e:
            if (r13 == 0) goto L73
            java.lang.String r13 = "Forced extraction must be performed."
            goto L75
        L73:
            java.lang.String r13 = "Detected that extraction must be performed."
        L75:
            android.util.Log.i(r1, r13)
        L78:
            java.util.List r13 = r11.g()
            java.io.File r0 = r11.a
            long r3 = c(r0)
            long r5 = r11.b
            r2 = r12
            r7 = r13
            h(r2, r3, r5, r7)
            r12 = r13
        L8a:
            java.lang.String r13 = "load found "
            java.lang.StringBuilder r13 = com.github.catvod.spider.merge.a.C0529a.a(r13)
            int r0 = r12.size()
            r13.append(r0)
            java.lang.String r0 = " secondary dex files"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.i(r1, r13)
            return r12
        La4:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "MultiDexExtractor was closed"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.a.C0533e.e(android.content.Context, boolean):java.util.List");
    }
}
