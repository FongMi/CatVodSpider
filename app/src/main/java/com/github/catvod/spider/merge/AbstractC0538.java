package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0021;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ཪ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0538 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected C0165 f1201;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    C0179 f1202;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    C0229 f1203;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected C0035 f1204;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected ArrayList<C0011> f1205;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected String f1206;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected AbstractC0021 f1207;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected C0435 f1208;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private AbstractC0021.C0029 f1209 = new AbstractC0021.C0029();

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private AbstractC0021.C0028 f1210 = new AbstractC0021.C0028();

    AbstractC0538() {
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected C0011 m1732() {
        int size = this.f1205.size();
        if (size > 0) {
            return this.f1205.get(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԩ */
    abstract C0435 mo1272();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected void m1733(String str) {
        C0180 c0180M581 = this.f1201.m581();
        if (c0180M581.m641()) {
            c0180M581.add(new C0378(this.f1202.m636(), str));
        }
    }

    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: Ԫ */
    protected void mo1273(Reader reader, String str, C0165 c0165) {
        C0034.m285(reader, SOY.d("2926231F1A105A3B3F0601035A3F24050057143D255616125A3C241A18"));
        C0034.m285(str, SOY.d("38332213212533723C0307035A3C3E0254151F723F03181B"));
        C0034.m284(c0165);
        C0035 c0035 = new C0035(str);
        this.f1204 = c0035;
        c0035.m291(c0165);
        this.f1201 = c0165;
        this.f1208 = c0165.m584();
        this.f1202 = new C0179(reader);
        this.f1207 = null;
        this.f1203 = new C0229(this.f1202, c0165.m581());
        this.f1205 = new ArrayList<>(32);
        this.f1206 = str;
    }

    /* JADX INFO: renamed from: ԫ */
    protected abstract boolean mo1274(String str);

    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    C0035 m1734(Reader reader, String str, C0165 c0165) {
        mo1273(reader, str, c0165);
        m1737();
        this.f1202.m606();
        this.f1202 = null;
        this.f1203 = null;
        this.f1205 = null;
        return this.f1204;
    }

    /* JADX INFO: renamed from: ԭ */
    protected abstract boolean mo1275(AbstractC0021 abstractC0021);

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected boolean m1735(String str) {
        AbstractC0021 abstractC0021 = this.f1207;
        AbstractC0021.C0028 c0028 = this.f1210;
        return abstractC0021 == c0028 ? mo1275(new AbstractC0021.C0028().m269(str)) : mo1275(c0028.mo241().m269(str));
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected boolean m1736(String str) {
        AbstractC0021.C0029 c0029 = this.f1209;
        return this.f1207 == c0029 ? mo1275(new AbstractC0021.C0029().m269(str)) : mo1275(c0029.mo241().m269(str));
    }

    /* JADX INFO: renamed from: ֏ */
    public boolean mo1276(String str, C0542 c0542) {
        AbstractC0021.C0029 c0029 = this.f1209;
        if (this.f1207 == c0029) {
            return mo1275(new AbstractC0021.C0029().m255(str, c0542));
        }
        c0029.mo241();
        c0029.m255(str, c0542);
        return mo1275(c0029);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected void m1737() {
        AbstractC0021 abstractC0021M801;
        C0229 c0229 = this.f1203;
        AbstractC0021.EnumC0031 enumC0031 = AbstractC0021.EnumC0031.f198;
        do {
            abstractC0021M801 = c0229.m801();
            mo1275(abstractC0021M801);
            abstractC0021M801.mo241();
        } while (abstractC0021M801.f174 != enumC0031);
    }
}
