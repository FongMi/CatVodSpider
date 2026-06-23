package com.github.catvod.spider.merge.i;

import com.github.catvod.spider.merge.a.C0529a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0569b {

    @SerializedName("data")
    private a a;

    @SerializedName("metadata")
    private C0036b b;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.i.b$a */
    public static class a {

        @SerializedName("list")
        private List<C0568a> a;

        public final List<C0568a> a() {
            List<C0568a> list = this.a;
            return list == null ? Collections.emptyList() : list;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("Data{items=");
            sbA.append(this.a);
            sbA.append('}');
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.i.b$b, reason: collision with other inner class name */
    public static class C0036b {

        @SerializedName("_total")
        private int a;

        @SerializedName("_size")
        private int b;

        @SerializedName("_page")
        private int c;

        public final boolean a() {
            return Math.ceil((double) (this.a / this.b)) > ((double) this.c);
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("Meta{total=");
            sbA.append(this.a);
            sbA.append(", size=");
            sbA.append(this.b);
            sbA.append(", currentPage=");
            sbA.append(this.c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public static C0569b c(String str) {
        return (C0569b) new Gson().fromJson(str, C0569b.class);
    }

    public final a a() {
        return this.a;
    }

    public final C0036b b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Resp{data=");
        sbA.append(this.a);
        sbA.append('}');
        return sbA.toString();
    }
}
