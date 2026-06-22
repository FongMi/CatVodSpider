package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.nIe;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class d {
    static i a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder sbB = c.b(nIe.d("040F3F26693B2D097330212030127337266F2003732269352B1673252023275C73"));
            sbB.append(randomAccessFile.length());
            throw new ZipException(sbB.toString());
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
                i iVar = new i();
                iVar.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                iVar.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return iVar;
            }
            length--;
        } while (length >= j2);
        throw new ZipException(nIe.d("0708376306296225362D3D3D230A7307203D2705272C3B3662153A24272E3613212669212D127325263A2C02"));
    }
}
