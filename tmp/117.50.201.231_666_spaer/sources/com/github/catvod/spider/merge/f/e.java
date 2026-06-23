package com.github.catvod.spider.merge.f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0547k;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private C0563b c;

    @SerializedName("result")
    private C0563b d;

    public static class a {

        @SerializedName("bvid")
        private String a;

        @SerializedName("title")
        private String b;

        @SerializedName("pic")
        private String c;

        @SerializedName("duration")
        private String d;

        @SerializedName("length")
        private String e;

        @SerializedName("rcmd_reason")
        private c f;

        @SerializedName("stat")
        private d g;

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.f.e$a$a, reason: collision with other inner class name */
        class C0032a extends TypeToken<List<a>> {
            C0032a() {
            }
        }

        class b extends TypeToken<List<a>> {
            b() {
            }
        }

        public static class c {

            @SerializedName("content")
            private String a;

            public final String a() {
                return TextUtils.isEmpty(this.a) ? "" : this.a;
            }
        }

        public static class d {

            @SerializedName("view")
            private String a;

            @SerializedName("favorite")
            private String b;

            @SerializedName("danmaku")
            private String c;

            public final String a() {
                return TextUtils.isEmpty(this.c) ? "" : this.c;
            }

            public final String b() {
                return TextUtils.isEmpty(this.b) ? "" : this.b;
            }

            public final String c() {
                return TextUtils.isEmpty(this.a) ? "" : this.a;
            }
        }

        public static List<a> a(JsonElement jsonElement) {
            return (List) new Gson().fromJson(jsonElement, new C0032a().getType());
        }

        public static List<a> b(String str) {
            return (List) new Gson().fromJson(str, new b().getType());
        }

        public final String c() {
            return TextUtils.isEmpty(this.c) ? "" : this.c;
        }

        public final d d() {
            d dVar = this.g;
            return dVar == null ? new d() : dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.github.catvod.spider.merge.c.C0554e e() {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f.e.a.e():com.github.catvod.spider.merge.c.e");
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("Result{bvid='");
            C0547k.c(sbA, this.a, '\'', ", title='");
            C0547k.c(sbA, this.b, '\'', ", pic='");
            C0547k.c(sbA, this.c, '\'', ", duration='");
            C0547k.c(sbA, this.d, '\'', ", length='");
            C0547k.c(sbA, this.e, '\'', ", rcmd=");
            sbA.append(this.f);
            sbA.append(", stat=");
            sbA.append(this.g);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public static e b(String str) {
        return (e) new Gson().fromJson(str, e.class);
    }

    public final C0563b a() {
        C0563b c0563b = this.c;
        return c0563b == null ? new C0563b() : c0563b;
    }

    public final C0563b b() {
        C0563b c0563b = this.d;
        return c0563b == null ? new C0563b() : c0563b;
    }
}
