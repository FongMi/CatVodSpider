package com.github.catvod.spider.merge.AB.o;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0112p extends ArrayAdapter<String> {
    final C0113q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0112p(C0113q c0113q, Context context, List list) {
        super(context, R.layout.simple_list_item_1, list);
        this.a = c0113q;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf("\n");
        if (iIndexOf >= 0) {
            string = string.substring(0, iIndexOf);
        }
        textView.setText(string);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int iR = this.a.r(12);
        textView.setPadding(iR, this.a.r(4), iR, this.a.r(4));
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        return textView;
    }
}
