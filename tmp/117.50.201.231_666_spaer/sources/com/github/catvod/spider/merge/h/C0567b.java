package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.a.C0529a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0567b {

    @SerializedName("data")
    private a a;

    @SerializedName("message")
    private String b;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.h.b$a */
    public static class a {

        @SerializedName("InfoList")
        private List<C0566a> a;

        @SerializedName("Next")
        private String b;

        public final List<C0566a> a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("Data{InfoList=");
            sbA.append(this.a);
            sbA.append(", Next='");
            sbA.append(this.b);
            sbA.append('\'');
            sbA.append('}');
            return sbA.toString();
        }
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Resp{data=");
        sbA.append(this.a);
        sbA.append(", message='");
        sbA.append(this.b);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
