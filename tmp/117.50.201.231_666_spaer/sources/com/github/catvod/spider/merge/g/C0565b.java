package com.github.catvod.spider.merge.g;

import com.github.catvod.spider.merge.a.C0529a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0565b {

    @SerializedName("fileListAO")
    private a a;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.g.b$a */
    public static class a {

        @SerializedName("folderList")
        private List<C0564a> a;

        @SerializedName("fileList")
        private List<C0564a> b;

        public final List<C0564a> a() {
            this.a.addAll(this.b);
            return this.a;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("Data{folderList=");
            sbA.append(this.a);
            sbA.append(", fileList=");
            sbA.append(this.b);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public final a a() {
        return this.a;
    }
}
