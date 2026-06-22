package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1085A implements InterfaceC1094J {
    static final C1085A c = new C1085A();
    private boolean a;
    private InterfaceC1094J b;

    private C1085A() {
    }

    static InterfaceC1094J f() {
        C1085A c1085a = c;
        C1085A c1085a2 = new C1085A();
        c1085a2.a = true;
        c1085a2.b = c1085a;
        return c1085a2;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1094J
    public final void a(String str, String str2, int i, String str3, int i2) {
        InterfaceC1094J interfaceC1094J = this.b;
        if (interfaceC1094J != null) {
            interfaceC1094J.a(str, str2, i, str3, i2);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1094J
    public final C1096L c(String str, String str2, int i, String str3, int i2) {
        InterfaceC1094J interfaceC1094J = this.b;
        return interfaceC1094J != null ? interfaceC1094J.c(str, str2, i, str3, i2) : new C1096L(str, str2, i, str3, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1094J
    public final void e(String str, String str2, int i, String str3, int i2) {
        String str4;
        if (!this.a) {
            InterfaceC1094J interfaceC1094J = this.b;
            if (interfaceC1094J == null) {
                throw c(str, str2, i, str3, i2);
            }
            interfaceC1094J.e(str, str2, i, str3, i2);
            return;
        }
        if (str.startsWith("TypeError: ")) {
            str = str.substring(11);
            str4 = "TypeError";
        } else {
            str4 = "SyntaxError";
        }
        String str5 = str;
        Class<?> cls = C1157l2.a;
        throw new C1089E(str4, str5, str2, i, str3, i2);
    }
}
