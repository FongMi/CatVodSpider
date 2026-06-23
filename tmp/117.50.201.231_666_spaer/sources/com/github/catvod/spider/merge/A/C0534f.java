package com.github.catvod.spider.merge.a;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0534f {

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.a.f$a */
    static class a {
        long a;
        long b;

        a() {
        }
    }

    static a a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder sbA = C0529a.a("File too short to be a zip file: ");
            sbA.append(randomAccessFile.length());
            throw new ZipException(sbA.toString());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
