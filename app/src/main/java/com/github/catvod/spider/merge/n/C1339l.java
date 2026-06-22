package com.github.catvod.spider.merge.n;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1339l {
    private TextView a;
    private TextClassifier b;

    C1339l(TextView textView) {
        this.a = (TextView) Preconditions.checkNotNull(textView);
    }

    public final TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public final void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
