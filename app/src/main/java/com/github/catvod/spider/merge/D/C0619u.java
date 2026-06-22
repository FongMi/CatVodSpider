package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1415d;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0619u implements X {
    public static final C0619u a = new C0619u();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) throws IOException {
        try {
            if (obj == null) {
                l.w();
                return;
            }
            Reader characterStream = ((Clob) obj).getCharacterStream();
            StringBuilder sb = new StringBuilder();
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i2 = characterStream.read(cArr, 0, 2048);
                    if (i2 < 0) {
                        String string = sb.toString();
                        characterStream.close();
                        l.v(string);
                        return;
                    }
                    sb.append(cArr, 0, i2);
                }
            } catch (Exception e) {
                throw new C1415d("read string from reader error", e);
            }
        } catch (SQLException e2) {
            throw new IOException("write clob error", e2);
        }
    }
}
