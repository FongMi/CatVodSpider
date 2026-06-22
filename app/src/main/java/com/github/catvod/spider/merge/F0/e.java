package com.github.catvod.spider.merge.f0;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class e extends Authenticator {
    final /* synthetic */ String a;

    e(String str) {
        this.a = str;
    }

    @Override // java.net.Authenticator
    protected final PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.a.split(":")[0], this.a.split(":")[1].toCharArray());
    }
}
