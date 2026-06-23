package com.github.catvod.spider.merge.FM.C;

import com.github.catvod.spider.merge.FM.F.k;
import com.github.catvod.spider.merge.FM.F.l;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class g {
    public static final com.github.catvod.spider.merge.FM.F.a a;
    public static final com.github.catvod.spider.merge.FM.F.a b;

    static {
        com.github.catvod.spider.merge.FM.F.f fVar = new com.github.catvod.spider.merge.FM.F.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        com.github.catvod.spider.merge.FM.F.b[] bVarArr = {new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.i())};
        com.github.catvod.spider.merge.FM.F.b[] bVarArr2 = new com.github.catvod.spider.merge.FM.F.b[2];
        bVarArr2[0] = fVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 1, 1);
        com.github.catvod.spider.merge.FM.F.a aVar = new com.github.catvod.spider.merge.FM.F.a(bVarArr2);
        com.github.catvod.spider.merge.FM.F.b[] bVarArr3 = {new com.github.catvod.spider.merge.FM.F.e()};
        com.github.catvod.spider.merge.FM.F.b[] bVarArr4 = new com.github.catvod.spider.merge.FM.F.b[2];
        bVarArr4[0] = aVar;
        System.arraycopy(bVarArr3, 0, bVarArr4, 1, 1);
        new com.github.catvod.spider.merge.FM.F.a(bVarArr4);
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.i()), new com.github.catvod.spider.merge.FM.F.e());
        a = new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.i()), new com.github.catvod.spider.merge.FM.F.e());
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.c()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.a()));
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.c()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.a()), new com.github.catvod.spider.merge.FM.F.f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), com.github.catvod.spider.merge.FM.F.g.c(127, 132), com.github.catvod.spider.merge.FM.F.g.c(134, 159), new l());
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.c()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.a()), new com.github.catvod.spider.merge.FM.F.f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), com.github.catvod.spider.merge.FM.F.g.c(1, 8), com.github.catvod.spider.merge.FM.F.g.c(14, 31), com.github.catvod.spider.merge.FM.F.g.c(127, 132), com.github.catvod.spider.merge.FM.F.g.c(134, 159), new l());
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.c()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.g()));
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.c()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.g()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.e()));
        b = new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.j(), new k(), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.j()), new com.github.catvod.spider.merge.FM.F.f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.d()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.h()), new com.github.catvod.spider.merge.FM.F.i(new com.github.catvod.spider.merge.FM.F.h[0]));
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.d()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.h()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.f()), new com.github.catvod.spider.merge.FM.F.i(new com.github.catvod.spider.merge.FM.F.h[0]));
        new com.github.catvod.spider.merge.FM.F.a(new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.d()), new com.github.catvod.spider.merge.FM.F.f(com.github.catvod.spider.merge.FM.F.d.b()), new com.github.catvod.spider.merge.FM.F.i(new com.github.catvod.spider.merge.FM.F.h[0]));
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
    public static final String a(String str) {
        com.github.catvod.spider.merge.FM.F.a aVar = a;
        aVar.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iA = aVar.a(str, iCharCount, stringWriter);
                if (iA == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    iCharCount++;
                    if (Character.isHighSurrogate(cCharAt) && iCharCount < length) {
                        char cCharAt2 = str.charAt(iCharCount);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount++;
                        }
                    }
                } else {
                    for (int i = 0; i < iA; i++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
