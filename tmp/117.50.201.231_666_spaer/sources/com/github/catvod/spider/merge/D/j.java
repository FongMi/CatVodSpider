package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j {

    @SerializedName("responses")
    private List<j> a;

    @SerializedName("body")
    private a b;

    @SerializedName("id")
    private String c;

    @SerializedName("status")
    private int d;

    public static class a {

        @SerializedName("domain_id")
        private String a;

        @SerializedName("drive_id")
        private String b;

        @SerializedName("file_id")
        private String c;

        @SerializedName("code")
        private String d;

        @SerializedName("message")
        private String e;

        public final String a() {
            return TextUtils.isEmpty(this.c) ? "" : this.c;
        }

        public final String b() {
            return TextUtils.isEmpty(this.e) ? "" : this.e;
        }
    }

    public final a a() {
        a aVar = this.b;
        return aVar == null ? new a() : aVar;
    }

    public final j b() {
        List<j> listEmptyList = this.a;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            return new j();
        }
        List<j> listEmptyList2 = this.a;
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        return listEmptyList2.get(0);
    }
}
