package com.github.catvod.spider.merge.A0;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wa {
    public static final cp c = new cp();
    public static final kg d = new kg();
    public static final jt e = new jt();
    public static final ka f = new ka();
    public static final ae g = new ae();
    public static final fq h = new fq();
    public static final ug i = new ug();
    public static final va j = new va();
    public static final ba k = new ba();
    public static final gi l = new gi();
    public static final cv m = new cv();
    public static final of n = new of();
    public static final je o = new je();
    public static final wy p = new wy();
    public static final kr q = new kr();
    public static final y r = new y();
    public static final we s = new we();
    public static final kt t = new kt();
    public static final vv u = new vv();
    public static final oy v = new oy();
    public static final hg w = new hg();
    public static final vc x = new vc();
    public static final mk y = new mk();
    public static final nv z = new nv();
    public static final gu aa = new gu();
    public static final am ab = new am();
    public static final nz ac = new nz();
    public static final oz ad = new oz();
    public static final jq ae = new jq();
    public static final iv af = new iv();
    public static final uy ag = new uy();
    public static final up ah = new up();
    public static final la ai = new la();
    public static final tx aj = new tx();
    public static final aan ak = new aan();
    public static final ua al = new ua();
    public static final vh am = new vh();
    public static final adn an = new adn();
    public static final cz ao = new cz();
    public static final dh ap = new dh();
    public static final ht aq = new ht();
    public static final adb ar = new adb();
    public static final nt as = new nt();
    public static final yx at = new yx();
    public static final xi au = new xi();
    public static final vb av = new vb();
    public static final oo aw = new oo();
    public static final fi ax = new fi();
    public static final ke ay = new ke();
    public static final uq az = new uq();
    public static final df ba = new df();
    public static final uf bb = new uf();
    public static final abg bc = new abg();
    public static final ty bd = new ty();
    public static final bk be = new bk();
    public static final gq bf = new gq();
    public static final lz bg = new lz();
    public static final ww bh = new ww();
    public static final xf bi = new xf();
    public static final yr bj = new yr();
    public static final vj bk = new vj();
    public static final aa bl = new aa();
    public static final vk bm = new vk();
    public static final f bn = new f();
    public static final mv bo = new mv();
    public static final jc bp = new jc();
    public static final qy bq = new qy();
    public static final char[] br = {'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    public static final char[] bs = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    public static final String bt = String.valueOf((char) 65533);

    public static void bu(hm hmVar, sf sfVar, wa waVar, wa waVar2) {
        char cAa = sfVar.aa();
        if (cAa == 0) {
            hmVar.aj(waVar);
            sfVar.q();
            hmVar.ab((char) 65533);
            return;
        }
        if (cAa == '<') {
            hmVar.w(waVar2);
            return;
        }
        if (cAa == 65535) {
            hmVar.ac(new aaw());
            return;
        }
        int i2 = sfVar.f;
        int i3 = sfVar.g;
        char[] cArr = sfVar.e;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            if (c2 == 0 || c2 == '<') {
                break;
            } else {
                i4++;
            }
        }
        sfVar.f = i4;
        hmVar.ad(i4 > i2 ? sf.p(sfVar.e, sfVar.c, i2, i4 - i2) : "");
    }

    public static void bv(hm hmVar, sf sfVar, wa waVar) {
        if (sfVar.ai()) {
            String strW = sfVar.w();
            hmVar.m.y(strW);
            hmVar.j.append(strW);
            return;
        }
        boolean zAk = hmVar.ak();
        StringBuilder sb = hmVar.j;
        if (zAk && !sfVar.ab()) {
            char cT = sfVar.t();
            if (cT == '\t' || cT == '\n' || cT == '\f' || cT == '\r' || cT == ' ') {
                hmVar.al(aj);
                return;
            }
            if (cT == '/') {
                hmVar.al(ar);
                return;
            } else {
                if (cT == '>') {
                    hmVar.ah();
                    hmVar.al(c);
                    return;
                }
                sb.append(cT);
            }
        }
        hmVar.ad("</");
        hmVar.ae(sb);
        hmVar.al(waVar);
    }

    public static void bw(hm hmVar, sf sfVar, wa waVar, wa waVar2) {
        if (sfVar.ai()) {
            String strW = sfVar.w();
            hmVar.j.append(strW);
            hmVar.ad(strW);
            return;
        }
        char cT = sfVar.t();
        if (cT != '\t' && cT != '\n' && cT != '\f' && cT != '\r' && cT != ' ' && cT != '/' && cT != '>') {
            sfVar.an();
            hmVar.al(waVar2);
        } else {
            if (hmVar.j.toString().equals("script")) {
                hmVar.al(waVar);
            } else {
                hmVar.al(waVar2);
            }
            hmVar.ab(cT);
        }
    }

    public abstract void a(hm hmVar, sf sfVar);
}
