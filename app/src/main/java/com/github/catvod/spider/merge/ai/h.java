package com.github.catvod.spider.merge.ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.catvod.spider.merge.nIe;
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

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class h implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    h(File file, File file2) {
        StringBuilder sbB = c.b(nIe.d("0F133F37200B271E163B3D3D2305272C3B67"));
        sbB.append(file.getPath());
        sbB.append(nIe.d("6E46"));
        sbB.append(file2.getPath());
        sbB.append(nIe.d("6B"));
        String string = sbB.toString();
        String strD = nIe.d("0F133F37200B271E");
        Log.i(strD, string);
        this.a = file;
        this.c = file2;
        this.b = d(file);
        File file3 = new File(file2, nIe.d("0F133F37200B271E7D2F262C29"));
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, nIe.d("3011"));
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i(strD, nIe.d("000A3C2022262C01732C276F2E09302869") + file3.getPath());
                this.f = channel.lock();
                Log.i(strD, file3.getPath() + nIe.d("620A3C20222A26"));
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
            Log.w(nIe.d("0F133F37200B271E"), nIe.d("04073A2F2C2B62123C632A232D1536633B2A310926312A2A"), e);
        }
    }

    private static void b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(c.a(nIe.d("360B236E"), str), nIe.d("6C1C3A33"), file.getParentFile());
        StringBuilder sbB = c.b(nIe.d("071E2731282C360F3D2469"));
        sbB.append(fileCreateTempFile.getPath());
        String string = sbB.toString();
        String strD = nIe.d("0F133F37200B271E");
        Log.i(strD, string);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry(nIe.d("210A32303A2A3148372631"));
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
                    throw new IOException(nIe.d("04073A2F2C2B62123C63242E300D73312C2E26093D2F306F60") + fileCreateTempFile.getAbsolutePath() + nIe.d("60467B37243F620935636B") + file.getAbsolutePath() + nIe.d("604F"));
                }
                Log.i(strD, nIe.d("10033D2224262C017337266F") + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException(nIe.d("04073A2F2C2B62123C633B2A2C073E26696D") + fileCreateTempFile.getAbsolutePath() + nIe.d("6046272C696D") + file.getAbsolutePath() + nIe.d("60"));
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
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, nIe.d("30"));
        try {
            i iVarA = d.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = iVarA.b;
            randomAccessFile.seek(iVarA.a);
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
        h hVar = this;
        Log.i(nIe.d("0F133F37200B271E"), nIe.d("2E09322720212546363B203C360F3D24693C27053C2D2D2E301F73272C3762003A2F2C3C"));
        String str = hVar.a.getName() + nIe.d("6C053F223A3C2715");
        SharedPreferences sharedPreferences = context.getSharedPreferences(nIe.d("2F133F37202B271E7D352C3D310F3C2D"), 4);
        int i = sharedPreferences.getInt(nIe.d("26032B6D273A2F043631"), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            g gVar = new g(hVar.c, str + i2 + nIe.d("6C1C3A33"));
            if (!gVar.isFile()) {
                StringBuilder sbB = c.b(nIe.d("0F0F203020212546363B3D3D230527262D6F3103302C272B23142A632D2A3A46352A252A6241"));
                sbB.append(gVar.getPath());
                sbB.append(nIe.d("65"));
                throw new IOException(sbB.toString());
            }
            gVar.a = d(gVar);
            long j = sharedPreferences.getLong("" + nIe.d("26032B6D2A3D2148") + i2, -1L);
            long j2 = sharedPreferences.getLong("" + nIe.d("26032B6D3D262F037D") + i2, -1L);
            long jLastModified = gVar.lastModified();
            if (j2 == jLastModified) {
                String str2 = str;
                if (j == gVar.a) {
                    arrayList.add(gVar);
                    i2++;
                    hVar = this;
                    str = str2;
                }
            }
            throw new IOException(nIe.d("0B08252225262646363B3D3D230527262D6F26032B7969") + gVar + nIe.d("624E3826306F60") + "" + nIe.d("604F7F632C37320330372C2B620B3C2720292B05323720202C46272A242A7846") + j2 + nIe.d("6E463E2C2D26240F30223D262D0873372022275C73") + jLastModified + nIe.d("6E46363B392A21123627692C30056963") + j + nIe.d("6E46352A252A62052120736F") + gVar.a);
        }
        return arrayList;
    }

    private List<g> g() {
        String strD = nIe.d("04073A2F2C2B62123C632A232D1536633B2A310926312A2A");
        String str = this.a.getName() + nIe.d("6C053F223A3C2715");
        File[] fileArrListFiles = this.c.listFiles(new f());
        String strD2 = nIe.d("0F133F37200B271E");
        if (fileArrListFiles == null) {
            StringBuilder sbB = c.b(nIe.d("04073A2F2C2B62123C632526311273302C2C2D0837223B366202363B692B2B147320262136033D376967"));
            sbB.append(this.c.getPath());
            sbB.append(nIe.d("6B48"));
            Log.w(strD2, sbB.toString());
        } else {
            for (File file : fileArrListFiles) {
                StringBuilder sbB2 = c.b(nIe.d("16142A2A272862123C632D2A2E03272669202E02732520232746"));
                sbB2.append(file.getPath());
                sbB2.append(nIe.d("620935633A26380373"));
                sbB2.append(file.length());
                Log.i(strD2, sbB2.toString());
                if (file.delete()) {
                    StringBuilder sbB3 = c.b(nIe.d("06033F263D2A26463C2F2D6F240F3F2669"));
                    sbB3.append(file.getPath());
                    Log.i(strD2, sbB3.toString());
                } else {
                    StringBuilder sbB4 = c.b(nIe.d("04073A2F2C2B62123C632D2A2E03272669202E02732520232746"));
                    sbB4.append(file.getPath());
                    Log.w(strD2, sbB4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.a);
        int i = 2;
        try {
            String strD3 = nIe.d("210A32303A2A31547D272C37");
            while (true) {
                ZipEntry entry = zipFile.getEntry(strD3);
                if (entry == null) {
                    return arrayList;
                }
                g gVar = new g(this.c, str + i + nIe.d("6C1C3A33"));
                arrayList.add(gVar);
                Log.i(strD2, nIe.d("071E2731282C360F3C2D692631463D262C2B27027325263D62003A2F2C6F") + gVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    b(zipFile, entry, gVar, str);
                    try {
                        gVar.a = d(gVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w(strD2, nIe.d("04073A2F2C2B62123C633B2A230273203B2C6200212C246F") + gVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(nIe.d("071E2731282C360F3C2D69"));
                    sb.append(z ? nIe.d("311330202C2A260337") : nIe.d("24073A2F2C2B"));
                    sb.append(nIe.d("6241"));
                    sb.append(gVar.getAbsolutePath());
                    sb.append(nIe.d("655C732F2C2125123B63"));
                    sb.append(gVar.length());
                    sb.append(nIe.d("624B73203B2C7846"));
                    sb.append(gVar.a);
                    Log.i(strD2, sb.toString());
                    if (!z) {
                        gVar.delete();
                        if (gVar.exists()) {
                            Log.w(strD2, nIe.d("04073A2F2C2B62123C632D2A2E032726692C2D142136393B270273302C2C2D0837223B366202363B6968") + gVar.getPath() + nIe.d("65"));
                        }
                    }
                }
                if (!z) {
                    throw new IOException(nIe.d("0109262F2D6F2C0927632A3D2707272669352B16732520232746") + gVar.getAbsolutePath() + nIe.d("62003C31693C27053C2D2D2E301F73272C37624E") + i + nIe.d("6B"));
                }
                i++;
                strD3 = nIe.d("210A32303A2A31") + i + nIe.d("6C02363B");
            }
        } finally {
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w(strD2, strD, e2);
            }
        }
    }

    private static void h(Context context, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(nIe.d("2F133F37202B271E7D352C3D310F3C2D"), 4).edit();
        editorEdit.putLong(nIe.d("360F3E263A3B230B23"), j);
        editorEdit.putLong(nIe.d("211430"), j2);
        editorEdit.putInt(nIe.d("26032B6D273A2F043631"), list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            g gVar = (g) it.next();
            editorEdit.putLong("" + nIe.d("26032B6D2A3D2148") + i, gVar.a);
            editorEdit.putLong("" + nIe.d("26032B6D3D262F037D") + i, gVar.lastModified());
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List e(android.content.Context r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.ai.h.e(android.content.Context, boolean):java.util.List");
    }
}
