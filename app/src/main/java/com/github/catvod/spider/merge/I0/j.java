package com.github.catvod.spider.merge.i0;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j implements ValueCallback<String> {
    final /* synthetic */ String a;
    final /* synthetic */ WebView b;
    final /* synthetic */ k c;

    j(k kVar, String str, WebView webView) {
        this.c = kVar;
        this.a = str;
        this.b = webView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        String string;
        String str2 = str;
        com.github.catvod.spider.merge.R0.a aVar = com.github.catvod.spider.merge.P0.d.a;
        aVar.getClass();
        if (str2 == null) {
            string = null;
        } else {
            try {
                StringWriter stringWriter = new StringWriter(str2.length() * 2);
                int length = str2.length();
                int iCharCount = 0;
                while (iCharCount < length) {
                    int iA = aVar.a(str2, iCharCount, stringWriter);
                    if (iA == 0) {
                        char cCharAt = str2.charAt(iCharCount);
                        stringWriter.write(cCharAt);
                        iCharCount++;
                        if (Character.isHighSurrogate(cCharAt) && iCharCount < length) {
                            char cCharAt2 = str2.charAt(iCharCount);
                            if (Character.isLowSurrogate(cCharAt2)) {
                                stringWriter.write(cCharAt2);
                                iCharCount++;
                            }
                        }
                    } else {
                        for (int i = 0; i < iA; i++) {
                            iCharCount += Character.charCount(Character.codePointAt(str2, iCharCount));
                        }
                    }
                }
                string = stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String strO = m.o(this.a);
        this.c.a.put("html", string);
        this.c.a.put("cookies", strO);
        l lVar = this.c.b;
        if (lVar == null || lVar.isDone()) {
            this.c.a.put("_done", "1");
            this.b.destroy();
        }
    }
}
