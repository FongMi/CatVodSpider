package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.B.k;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class e {
    public static final com.github.catvod.spider.merge.B.a a;
    public static final com.github.catvod.spider.merge.B.a b;

    static class a extends com.github.catvod.spider.merge.B.b {
        private static final String b = String.valueOf('\"');
        private static final char[] c = {',', '\"', '\r', '\n'};

        @Override // com.github.catvod.spider.merge.B.b
        public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
            boolean z;
            if (i != 0) {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            String string = charSequence.toString();
            char[] cArr = c;
            int i2 = f.a;
            if (string == null || cArr == null) {
                z = true;
            } else {
                int length = string.length();
                int i3 = length - 1;
                int length2 = cArr.length;
                int i4 = length2 - 1;
                loop0: for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = string.charAt(i5);
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (cArr[i6] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == string.charAt(i5 + 1)))) {
                            z = false;
                            break loop0;
                        }
                    }
                }
                z = true;
            }
            if (z) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String string2 = charSequence.toString();
                String str = b;
                writer.write(f.h(string2, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static class b extends com.github.catvod.spider.merge.B.b {
        private static final String b = String.valueOf('\"');
        private static final char[] c = {',', '\"', '\r', '\n'};

        /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
        @Override // com.github.catvod.spider.merge.B.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(java.lang.CharSequence r13, int r14, java.io.Writer r15) throws java.io.IOException {
            /*
                r12 = this;
                if (r14 != 0) goto L9c
                r14 = 0
                char r0 = r13.charAt(r14)
                r1 = 34
                if (r0 != r1) goto L8c
                int r0 = r13.length()
                r2 = 1
                int r0 = r0 - r2
                char r0 = r13.charAt(r0)
                if (r0 == r1) goto L19
                goto L8c
            L19:
                int r0 = r13.length()
                int r0 = r0 - r2
                java.lang.CharSequence r0 = r13.subSequence(r2, r0)
                java.lang.String r0 = r0.toString()
                char[] r1 = com.github.catvod.spider.merge.y.e.b.c
                boolean r3 = com.github.catvod.spider.merge.y.f.c(r0)
                if (r3 != 0) goto L73
                if (r1 != 0) goto L32
                r3 = 0
                goto L36
            L32:
                int r3 = java.lang.reflect.Array.getLength(r1)
            L36:
                if (r3 != 0) goto L3a
                r3 = 1
                goto L3b
            L3a:
                r3 = 0
            L3b:
                if (r3 == 0) goto L3e
                goto L73
            L3e:
                int r3 = r0.length()
                int r4 = r1.length
                int r5 = r3 + (-1)
                int r6 = r4 + (-1)
                r7 = 0
            L48:
                if (r7 >= r3) goto L73
                char r8 = r0.charAt(r7)
                r9 = 0
            L4f:
                if (r9 >= r4) goto L70
                char r10 = r1[r9]
                if (r10 != r8) goto L6d
                boolean r10 = java.lang.Character.isHighSurrogate(r8)
                if (r10 == 0) goto L74
                if (r9 != r6) goto L5e
                goto L74
            L5e:
                if (r7 >= r5) goto L6d
                int r10 = r9 + 1
                char r10 = r1[r10]
                int r11 = r7 + 1
                char r11 = r0.charAt(r11)
                if (r10 != r11) goto L6d
                goto L74
            L6d:
                int r9 = r9 + 1
                goto L4f
            L70:
                int r7 = r7 + 1
                goto L48
            L73:
                r2 = 0
            L74:
                if (r2 == 0) goto L8c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = com.github.catvod.spider.merge.y.e.b.b
                r1.append(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r0 = com.github.catvod.spider.merge.y.f.h(r0, r1, r2)
                goto L90
            L8c:
                java.lang.String r0 = r13.toString()
            L90:
                r15.write(r0)
                int r15 = r13.length()
                int r13 = java.lang.Character.codePointCount(r13, r14, r15)
                return r13
            L9c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "CsvUnescaper should never reach the [1] index"
                r13.<init>(r14)
                goto La5
            La4:
                throw r13
            La5:
                goto La4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.e.b.a(java.lang.CharSequence, int, java.io.Writer):int");
        }
    }

    static {
        com.github.catvod.spider.merge.B.f fVar = new com.github.catvod.spider.merge.B.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        com.github.catvod.spider.merge.B.b[] bVarArr = {new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.i())};
        com.github.catvod.spider.merge.B.b[] bVarArr2 = new com.github.catvod.spider.merge.B.b[2];
        bVarArr2[0] = fVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 1, 1);
        com.github.catvod.spider.merge.B.a aVar = new com.github.catvod.spider.merge.B.a(bVarArr2);
        com.github.catvod.spider.merge.B.b[] bVarArr3 = {new com.github.catvod.spider.merge.B.e()};
        com.github.catvod.spider.merge.B.b[] bVarArr4 = new com.github.catvod.spider.merge.B.b[2];
        bVarArr4[0] = aVar;
        System.arraycopy(bVarArr3, 0, bVarArr4, 1, 1);
        new com.github.catvod.spider.merge.B.a(bVarArr4);
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.i()), new com.github.catvod.spider.merge.B.e());
        a = new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.i()), new com.github.catvod.spider.merge.B.e());
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.c()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.a()));
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.c()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.a()), new com.github.catvod.spider.merge.B.f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), com.github.catvod.spider.merge.B.g.c(127, 132), com.github.catvod.spider.merge.B.g.c(134, 159), new k());
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.c()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.a()), new com.github.catvod.spider.merge.B.f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), com.github.catvod.spider.merge.B.g.c(1, 8), com.github.catvod.spider.merge.B.g.c(14, 31), com.github.catvod.spider.merge.B.g.c(127, 132), com.github.catvod.spider.merge.B.g.c(134, 159), new k());
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.c()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.g()));
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.c()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.g()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.e()));
        b = new com.github.catvod.spider.merge.B.a(new i(), new j(), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.j()), new com.github.catvod.spider.merge.B.f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.d()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.h()), new com.github.catvod.spider.merge.B.h(new h.a[0]));
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.d()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.h()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.f()), new com.github.catvod.spider.merge.B.h(new h.a[0]));
        new com.github.catvod.spider.merge.B.a(new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.d()), new com.github.catvod.spider.merge.B.f(com.github.catvod.spider.merge.B.d.b()), new com.github.catvod.spider.merge.B.h(new h.a[0]));
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
        com.github.catvod.spider.merge.B.a aVar = a;
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
