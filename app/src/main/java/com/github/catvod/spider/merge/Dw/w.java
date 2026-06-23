package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Nx.S;
import com.github.catvod.spider.merge.Nx.Y;
import com.github.catvod.spider.merge.gu.A;
import com.github.catvod.spider.merge.gu.B;
import com.github.catvod.spider.merge.gu.C;
import com.github.catvod.spider.merge.gu.G;
import com.github.catvod.spider.merge.gu.I;
import com.github.catvod.spider.merge.gu.InterfaceC1227d;
import com.github.catvod.spider.merge.gu.n;
import com.github.catvod.spider.merge.gu.x;
import com.github.catvod.spider.merge.gu.y;
import com.github.catvod.spider.merge.gu.z;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class w extends com.github.catvod.spider.merge.gu.w {
    protected static final k[] l;
    protected static final Y m = new Y();
    public static final String[] n = {"main", "locationPath", "absoluteLocationPathNoroot", "relativeLocationPath", "step", "axisSpecifier", "nodeTest", "predicate", "abbreviatedStep", "expr", "primaryExpr", "functionCall", "unionExprNoRoot", "pathExprNoRoot", "filterExpr", "orExpr", "andExpr", "equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", "unaryExprNoRoot", "qName", "functionName", "variableReference", "nameTest", "nCName"};
    public static final I o = new I(new String[]{null, "'processing-instruction'", "'or'", "'and'", "'$'", null, null, null, "'/'", "'//'", "'('", "')'", "'['", "']'", "'-'", "'+'", "'.'", "'*'", "'`div`'", "'`mod`'", "'..'", "'@'", "','", "'|'", "'<'", "'>'", "'<='", "'>='", "'='", "'!='", "'^='", "'$='", "'*='", "'~='", "'!~'", "':'", "'::'", "'''", "'\"'"}, new String[]{null, null, null, null, null, "NodeType", "Number", "AxisName", "PATHSEP", "ABRPATH", "LPAR", "RPAR", "LBRAC", "RBRAC", "MINUS", "PLUS", "DOT", "MUL", "DIVISION", "MODULO", "DOTDOT", "AT", "COMMA", "PIPE", "LESS", "MORE_", "LE", "GE", "EQUALITY", "INEQUALITY", "START_WITH", "END_WITH", "CONTAIN_WITH", "REGEXP_WITH", "REGEXP_NOT_WITH", "COLON", "CC", "APOS", "QUOT", "Literal", "Whitespace", "NCName"}, (String[]) null);

    @Deprecated
    public static final String[] p = new String[42];
    public static final com.github.catvod.spider.merge.Nx.a q;

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = p;
            if (i2 >= strArr.length) {
                break;
            }
            I i3 = o;
            strArr[i2] = i3.b(i2);
            if (strArr[i2] == null) {
                strArr[i2] = i3.c(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        com.github.catvod.spider.merge.Nx.a aVarB = new com.github.catvod.spider.merge.Nx.k().b("\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003+å\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003=\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005E\n\u0005\f\u0005\u000e\u0005H\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006M\n\u0006\f\u0006\u000e\u0006P\u000b\u0006\u0003\u0006\u0005\u0006S\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007X\n\u0007\u0005\u0007Z\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bd\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0005\fv\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r}\n\r\f\r\u000e\r\u0080\u000b\r\u0005\r\u0082\n\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0089\n\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u008e\n\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0094\n\u000f\u0005\u000f\u0096\n\u000f\u0003\u0010\u0003\u0010\u0007\u0010\u009a\n\u0010\f\u0010\u000e\u0010\u009d\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011¢\n\u0011\f\u0011\u000e\u0011¥\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012ª\n\u0012\f\u0012\u000e\u0012\u00ad\u000b\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013²\n\u0013\f\u0013\u000e\u0013µ\u000b\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014º\n\u0014\f\u0014\u000e\u0014½\u000b\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015Â\n\u0015\f\u0015\u000e\u0015Å\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016Ê\n\u0016\u0003\u0017\u0005\u0017Í\n\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018Ô\n\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001bá\n\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0002\u0002\u001d\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0002\t\u0003\u0002\n\u000b\u0004\u0002\u0012\u0012\u0016\u0016\u0003\u0002\u001e\u001f\u0005\u0002\u001a\u001b\u001d\u001d $\u0003\u0002\u0010\u0011\u0003\u0002\u0013\u0015\u0004\u0002\t\t++\u0002æ\u00028\u0003\u0002\u0002\u0002\u0004<\u0003\u0002\u0002\u0002\u0006>\u0003\u0002\u0002\u0002\bA\u0003\u0002\u0002\u0002\nR\u0003\u0002\u0002\u0002\fY\u0003\u0002\u0002\u0002\u000ec\u0003\u0002\u0002\u0002\u0010e\u0003\u0002\u0002\u0002\u0012i\u0003\u0002\u0002\u0002\u0014k\u0003\u0002\u0002\u0002\u0016u\u0003\u0002\u0002\u0002\u0018w\u0003\u0002\u0002\u0002\u001a\u008d\u0003\u0002\u0002\u0002\u001c\u0095\u0003\u0002\u0002\u0002\u001e\u0097\u0003\u0002\u0002\u0002 \u009e\u0003\u0002\u0002\u0002\"¦\u0003\u0002\u0002\u0002$®\u0003\u0002\u0002\u0002&¶\u0003\u0002\u0002\u0002(¾\u0003\u0002\u0002\u0002*Æ\u0003\u0002\u0002\u0002,Ì\u0003\u0002\u0002\u0002.Ð\u0003\u0002\u0002\u00020Õ\u0003\u0002\u0002\u00022×\u0003\u0002\u0002\u00024à\u0003\u0002\u0002\u00026â\u0003\u0002\u0002\u000289\u0005\u0014\u000b\u00029\u0003\u0003\u0002\u0002\u0002:=\u0005\b\u0005\u0002;=\u0005\u0006\u0004\u0002<:\u0003\u0002\u0002\u0002<;\u0003\u0002\u0002\u0002=\u0005\u0003\u0002\u0002\u0002>?\t\u0002\u0002\u0002?@\u0005\b\u0005\u0002@\u0007\u0003\u0002\u0002\u0002AF\u0005\n\u0006\u0002BC\t\u0002\u0002\u0002CE\u0005\n\u0006\u0002DB\u0003\u0002\u0002\u0002EH\u0003\u0002\u0002\u0002FD\u0003\u0002\u0002\u0002FG\u0003\u0002\u0002\u0002G\t\u0003\u0002\u0002\u0002HF\u0003\u0002\u0002\u0002IJ\u0005\f\u0007\u0002JN\u0005\u000e\b\u0002KM\u0005\u0010\t\u0002LK\u0003\u0002\u0002\u0002MP\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002NO\u0003\u0002\u0002\u0002OS\u0003\u0002\u0002\u0002PN\u0003\u0002\u0002\u0002QS\u0005\u0012\n\u0002RI\u0003\u0002\u0002\u0002RQ\u0003\u0002\u0002\u0002S\u000b\u0003\u0002\u0002\u0002TU\u0007\t\u0002\u0002UZ\u0007&\u0002\u0002VX\u0007\u0017\u0002\u0002WV\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002XZ\u0003\u0002\u0002\u0002YT\u0003\u0002\u0002\u0002YW\u0003\u0002\u0002\u0002Z\r\u0003\u0002\u0002\u0002[d\u00054\u001b\u0002\\]\u0007\u0007\u0002\u0002]^\u0007\f\u0002\u0002^d\u0007\r\u0002\u0002_`\u0007\u0003\u0002\u0002`a\u0007\f\u0002\u0002ab\u0007)\u0002\u0002bd\u0007\r\u0002\u0002c[\u0003\u0002\u0002\u0002c\\\u0003\u0002\u0002\u0002c_\u0003\u0002\u0002\u0002d\u000f\u0003\u0002\u0002\u0002ef\u0007\u000e\u0002\u0002fg\u0005\u0014\u000b\u0002gh\u0007\u000f\u0002\u0002h\u0011\u0003\u0002\u0002\u0002ij\t\u0003\u0002\u0002j\u0013\u0003\u0002\u0002\u0002kl\u0005 \u0011\u0002l\u0015\u0003\u0002\u0002\u0002mv\u00052\u001a\u0002no\u0007\f\u0002\u0002op\u0005\u0014\u000b\u0002pq\u0007\r\u0002\u0002qv\u0003\u0002\u0002\u0002rv\u0007)\u0002\u0002sv\u0007\b\u0002\u0002tv\u0005\u0018\r\u0002um\u0003\u0002\u0002\u0002un\u0003\u0002\u0002\u0002ur\u0003\u0002\u0002\u0002us\u0003\u0002\u0002\u0002ut\u0003\u0002\u0002\u0002v\u0017\u0003\u0002\u0002\u0002wx\u00050\u0019\u0002x\u0081\u0007\f\u0002\u0002y~\u0005\u0014\u000b\u0002z{\u0007\u0018\u0002\u0002{}\u0005\u0014\u000b\u0002|z\u0003\u0002\u0002\u0002}\u0080\u0003\u0002\u0002\u0002~|\u0003\u0002\u0002\u0002~\u007f\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080~\u0003\u0002\u0002\u0002\u0081y\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0084\u0007\r\u0002\u0002\u0084\u0019\u0003\u0002\u0002\u0002\u0085\u0088\u0005\u001c\u000f\u0002\u0086\u0087\u0007\u0019\u0002\u0002\u0087\u0089\u0005\u001a\u000e\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008e\u0003\u0002\u0002\u0002\u008a\u008b\u0007\n\u0002\u0002\u008b\u008c\u0007\u0019\u0002\u0002\u008c\u008e\u0005\u001a\u000e\u0002\u008d\u0085\u0003\u0002\u0002\u0002\u008d\u008a\u0003\u0002\u0002\u0002\u008e\u001b\u0003\u0002\u0002\u0002\u008f\u0096\u0005\u0004\u0003\u0002\u0090\u0093\u0005\u001e\u0010\u0002\u0091\u0092\t\u0002\u0002\u0002\u0092\u0094\u0005\b\u0005\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u008f\u0003\u0002\u0002\u0002\u0095\u0090\u0003\u0002\u0002\u0002\u0096\u001d\u0003\u0002\u0002\u0002\u0097\u009b\u0005\u0016\f\u0002\u0098\u009a\u0005\u0010\t\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u001f\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009e£\u0005\"\u0012\u0002\u009f \u0007\u0004\u0002\u0002 ¢\u0005\"\u0012\u0002¡\u009f\u0003\u0002\u0002\u0002¢¥\u0003\u0002\u0002\u0002£¡\u0003\u0002\u0002\u0002£¤\u0003\u0002\u0002\u0002¤!\u0003\u0002\u0002\u0002¥£\u0003\u0002\u0002\u0002¦«\u0005$\u0013\u0002§¨\u0007\u0005\u0002\u0002¨ª\u0005$\u0013\u0002©§\u0003\u0002\u0002\u0002ª\u00ad\u0003\u0002\u0002\u0002«©\u0003\u0002\u0002\u0002«¬\u0003\u0002\u0002\u0002¬#\u0003\u0002\u0002\u0002\u00ad«\u0003\u0002\u0002\u0002®³\u0005&\u0014\u0002¯°\t\u0004\u0002\u0002°²\u0005&\u0014\u0002±¯\u0003\u0002\u0002\u0002²µ\u0003\u0002\u0002\u0002³±\u0003\u0002\u0002\u0002³´\u0003\u0002\u0002\u0002´%\u0003\u0002\u0002\u0002µ³\u0003\u0002\u0002\u0002¶»\u0005(\u0015\u0002·¸\t\u0005\u0002\u0002¸º\u0005(\u0015\u0002¹·\u0003\u0002\u0002\u0002º½\u0003\u0002\u0002\u0002»¹\u0003\u0002\u0002\u0002»¼\u0003\u0002\u0002\u0002¼'\u0003\u0002\u0002\u0002½»\u0003\u0002\u0002\u0002¾Ã\u0005*\u0016\u0002¿À\t\u0006\u0002\u0002ÀÂ\u0005*\u0016\u0002Á¿\u0003\u0002\u0002\u0002ÂÅ\u0003\u0002\u0002\u0002ÃÁ\u0003\u0002\u0002\u0002ÃÄ\u0003\u0002\u0002\u0002Ä)\u0003\u0002\u0002\u0002ÅÃ\u0003\u0002\u0002\u0002ÆÉ\u0005,\u0017\u0002ÇÈ\t\u0007\u0002\u0002ÈÊ\u0005*\u0016\u0002ÉÇ\u0003\u0002\u0002\u0002ÉÊ\u0003\u0002\u0002\u0002Ê+\u0003\u0002\u0002\u0002ËÍ\u0007\u0010\u0002\u0002ÌË\u0003\u0002\u0002\u0002ÌÍ\u0003\u0002\u0002\u0002ÍÎ\u0003\u0002\u0002\u0002ÎÏ\u0005\u001a\u000e\u0002Ï-\u0003\u0002\u0002\u0002ÐÓ\u00056\u001c\u0002ÑÒ\u0007%\u0002\u0002ÒÔ\u00056\u001c\u0002ÓÑ\u0003\u0002\u0002\u0002ÓÔ\u0003\u0002\u0002\u0002Ô/\u0003\u0002\u0002\u0002ÕÖ\u0005.\u0018\u0002Ö1\u0003\u0002\u0002\u0002×Ø\u0007\u0006\u0002\u0002ØÙ\u0005.\u0018\u0002Ù3\u0003\u0002\u0002\u0002Úá\u0007\u0013\u0002\u0002ÛÜ\u00056\u001c\u0002ÜÝ\u0007%\u0002\u0002ÝÞ\u0007\u0013\u0002\u0002Þá\u0003\u0002\u0002\u0002ßá\u0005.\u0018\u0002àÚ\u0003\u0002\u0002\u0002àÛ\u0003\u0002\u0002\u0002àß\u0003\u0002\u0002\u0002á5\u0003\u0002\u0002\u0002âã\t\b\u0002\u0002ã7\u0003\u0002\u0002\u0002\u001a<FNRWYcu~\u0081\u0088\u008d\u0093\u0095\u009b£«³»ÃÉÌÓà".toCharArray());
        q = aVarB;
        l = new k[aVarB.d()];
        while (true) {
            com.github.catvod.spider.merge.Nx.a aVar = q;
            if (i >= aVar.d()) {
                return;
            }
            l[i] = new k(aVar.b(i), i);
            i++;
        }
    }

    public w(G g) {
        super(g);
        this.b = new S(this, q, l, m);
    }

    public final com.github.catvod.spider.merge.gu.g A() {
        com.github.catvod.spider.merge.gu.g gVar = new com.github.catvod.spider.merge.gu.g(this.g, i());
        n(gVar, 10);
        try {
            try {
                k(87);
                this.d.l(this);
                int iB = h().b(this.e, 5, this.g);
                if (iB == 1) {
                    m(gVar);
                    k(82);
                    s(7);
                    k(83);
                    s(36);
                } else if (iB == 2) {
                    m(gVar);
                    k(85);
                    this.d.l(this);
                    if (this.e.f(1) == 21) {
                        k(84);
                        s(21);
                    }
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return gVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.h B() {
        com.github.catvod.spider.merge.gu.h hVar = new com.github.catvod.spider.merge.gu.h(this.g, i());
        n(hVar, 34);
        try {
            try {
                m(hVar);
                k(172);
                R();
                k(177);
                this.d.l(this);
                while (true) {
                    int iF = this.e.f(1);
                    if (iF != 28 && iF != 29) {
                        break;
                    }
                    k(173);
                    hVar.g = this.e.e(1);
                    int iF2 = this.e.f(1);
                    if (iF2 == 28 || iF2 == 29) {
                        if (this.e.f(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        l();
                    } else {
                        hVar.g = this.d.g(this);
                    }
                    k(174);
                    R();
                    k(179);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return hVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.i C() {
        com.github.catvod.spider.merge.gu.i iVar = new com.github.catvod.spider.merge.gu.i(this.g, i());
        n(iVar, 18);
        try {
            try {
                m(iVar);
                k(105);
                M();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return iVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.j, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.j D() {
        Object jVar = new com.github.catvod.spider.merge.gu.j(this.g, i());
        n(jVar, 28);
        try {
            try {
                m(jVar);
                k(149);
                P();
                k(153);
                this.d.l(this);
                while (this.e.f(1) == 12) {
                    k(150);
                    O();
                    k(155);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return jVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.k E() {
        com.github.catvod.spider.merge.gu.k kVar = new com.github.catvod.spider.merge.gu.k(this.g, i());
        n(kVar, 22);
        try {
            try {
                m(kVar);
                k(117);
                F();
                k(118);
                s(10);
                k(127);
                this.d.l(this);
                int iF = this.e.f(1);
                if ((iF & (-64)) == 0 && ((1 << iF) & 2748782430194L) != 0) {
                    k(119);
                    C();
                    k(124);
                    this.d.l(this);
                    while (this.e.f(1) == 22) {
                        k(120);
                        s(22);
                        k(121);
                        C();
                        k(126);
                        this.d.l(this);
                    }
                }
                k(129);
                s(11);
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return kVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.l, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.l F() {
        Object lVar = new com.github.catvod.spider.merge.gu.l(this.g, i());
        n(lVar, 46);
        try {
            try {
                m(lVar);
                k(211);
                Q();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return lVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.m, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.m G() {
        Object mVar = new com.github.catvod.spider.merge.gu.m(this.g, i());
        n(mVar, 2);
        try {
            try {
                k(58);
                this.d.l(this);
                int iF = this.e.f(1);
                if (iF == 1 || iF == 5 || iF == 41 || iF == 7) {
                    m(mVar);
                    k(56);
                    S();
                } else if (iF == 8 || iF == 9) {
                    m(mVar);
                    k(57);
                    x();
                } else {
                    if (iF != 16 && iF != 17 && iF != 20 && iF != 21) {
                        throw new com.github.catvod.spider.merge.gu.u(this);
                    }
                    m(mVar);
                    k(56);
                    S();
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return mVar;
        } finally {
            o();
        }
    }

    public final n H() {
        n nVar = new n(this.g, i());
        n(nVar, 0);
        try {
            try {
                m(nVar);
                k(54);
                C();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return nVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.o I() {
        com.github.catvod.spider.merge.gu.o oVar = new com.github.catvod.spider.merge.gu.o(this.g, i());
        n(oVar, 40);
        try {
            try {
                m(oVar);
                k(196);
                U();
                k(199);
                this.d.l(this);
                int iF = this.e.f(1);
                if ((iF & (-64)) == 0 && ((1 << iF) & 917504) != 0) {
                    k(197);
                    oVar.g = this.e.e(1);
                    int iF2 = this.e.f(1);
                    if ((iF2 & (-64)) != 0 || ((1 << iF2) & 917504) == 0) {
                        oVar.g = this.d.g(this);
                    } else {
                        if (this.e.f(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        l();
                    }
                    k(198);
                    I();
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return oVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.p J() {
        com.github.catvod.spider.merge.gu.p pVar = new com.github.catvod.spider.merge.gu.p(this.g, i());
        n(pVar, 52);
        try {
            try {
                m(pVar);
                k(224);
                int iF = this.e.f(1);
                if (iF == 7 || iF == 41) {
                    if (this.e.f(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    l();
                } else {
                    this.d.g(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return pVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.q K() {
        int iB;
        com.github.catvod.spider.merge.gu.q qVar = new com.github.catvod.spider.merge.gu.q(this.g, i());
        n(qVar, 50);
        try {
            try {
                k(222);
                this.d.l(this);
                iB = h().b(this.e, 23, this.g);
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iB == 1) {
                m(qVar);
                k(216);
            } else {
                if (iB != 2) {
                    if (iB == 3) {
                        m(qVar);
                        k(221);
                        Q();
                    }
                    return qVar;
                }
                m(qVar);
                k(217);
                J();
                k(218);
                s(35);
                k(219);
            }
            s(17);
            return qVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.r, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.r L() {
        int iF;
        Object rVar = new com.github.catvod.spider.merge.gu.r(this.g, i());
        n(rVar, 12);
        try {
            try {
                k(97);
                this.d.l(this);
                iF = this.e.f(1);
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            if (iF == 1) {
                m(rVar);
                k(93);
                s(1);
                k(94);
                s(10);
                k(95);
                s(39);
                k(96);
            } else {
                if (iF != 5) {
                    if (iF != 7 && iF != 17 && iF != 41) {
                        throw new com.github.catvod.spider.merge.gu.u(this);
                    }
                    m(rVar);
                    k(89);
                    K();
                    return rVar;
                }
                m(rVar);
                k(90);
                s(5);
                k(91);
                s(10);
                k(92);
            }
            s(11);
            return rVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.s, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.s M() {
        Object sVar = new com.github.catvod.spider.merge.gu.s(this.g, i());
        n(sVar, 30);
        try {
            try {
                m(sVar);
                k(156);
                z();
                k(161);
                this.d.l(this);
                while (this.e.f(1) == 2) {
                    k(157);
                    s(2);
                    k(158);
                    z();
                    k(163);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return sVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.t, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.t N() {
        Object tVar = new com.github.catvod.spider.merge.gu.t(this.g, i());
        n(tVar, 26);
        try {
            try {
                k(147);
                this.d.l(this);
                int iB = ((S) h()).b(this.e, 13, this.g);
                if (iB == 1) {
                    m(tVar);
                    k(141);
                    G();
                } else if (iB == 2) {
                    m(tVar);
                    k(142);
                    D();
                    k(145);
                    this.d.l(this);
                    int iF = this.e.f(1);
                    if (iF == 8 || iF == 9) {
                        k(143);
                        ((com.github.catvod.spider.merge.gu.t) tVar).g = this.e.e(1);
                        int iF2 = this.e.f(1);
                        if (iF2 == 8 || iF2 == 9) {
                            if (this.e.f(1) == -1) {
                                this.k = true;
                            }
                            this.d.i();
                            l();
                        } else {
                            ((com.github.catvod.spider.merge.gu.t) tVar).g = this.d.g(this);
                        }
                        k(144);
                        S();
                    }
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return tVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.u, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.u O() {
        Object uVar = new com.github.catvod.spider.merge.gu.u(this.g, i());
        n(uVar, 14);
        try {
            try {
                m(uVar);
                k(99);
                s(12);
                k(100);
                C();
                k(101);
                s(13);
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return uVar;
        } finally {
            o();
        }
    }

    public final com.github.catvod.spider.merge.gu.v P() {
        com.github.catvod.spider.merge.gu.v vVar = new com.github.catvod.spider.merge.gu.v(this.g, i());
        n(vVar, 20);
        try {
            try {
                k(115);
                this.d.l(this);
                int iF = this.e.f(1);
                if (iF == 4) {
                    m(vVar);
                    k(107);
                    W();
                } else if (iF != 10) {
                    int i = 39;
                    if (iF != 39) {
                        if (iF != 41) {
                            i = 6;
                            if (iF == 6) {
                                m(vVar);
                                k(113);
                            } else if (iF != 7) {
                                throw new com.github.catvod.spider.merge.gu.u(this);
                            }
                        }
                        m(vVar);
                        k(114);
                        E();
                    } else {
                        m(vVar);
                        k(112);
                    }
                    s(i);
                } else {
                    m(vVar);
                    k(108);
                    s(10);
                    k(109);
                    C();
                    k(110);
                    s(11);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return vVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.w, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.w Q() {
        Object wVar = new com.github.catvod.spider.merge.gu.w(this.g, i());
        n(wVar, 44);
        try {
            try {
                m(wVar);
                k(206);
                J();
                k(209);
                this.d.l(this);
                if (this.e.f(1) == 35) {
                    k(207);
                    s(35);
                    k(208);
                    J();
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return wVar;
        } finally {
            o();
        }
    }

    public final x R() {
        x xVar = new x(this.g, i());
        n(xVar, 36);
        try {
            try {
                m(xVar);
                k(180);
                y();
                k(185);
                this.d.l(this);
                while (true) {
                    int iF = this.e.f(1);
                    if ((iF & (-64)) != 0 || ((1 << iF) & 33470545920L) == 0) {
                        break;
                    }
                    k(181);
                    xVar.g = this.e.e(1);
                    int iF2 = this.e.f(1);
                    if ((iF2 & (-64)) != 0 || ((1 << iF2) & 33470545920L) == 0) {
                        xVar.g = this.d.g(this);
                    } else {
                        if (this.e.f(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        l();
                    }
                    k(182);
                    y();
                    k(187);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return xVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.x, com.github.catvod.spider.merge.gu.y] */
    public final y S() {
        Object yVar = new y(this.g, i());
        n(yVar, 6);
        try {
            try {
                m(yVar);
                k(63);
                T();
                k(68);
                this.d.l(this);
                while (true) {
                    int iF = this.e.f(1);
                    if (iF != 8 && iF != 9) {
                        break;
                    }
                    k(64);
                    ((y) yVar).g = this.e.e(1);
                    int iF2 = this.e.f(1);
                    if (iF2 == 8 || iF2 == 9) {
                        if (this.e.f(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        l();
                    } else {
                        ((y) yVar).g = this.d.g(this);
                    }
                    k(65);
                    T();
                    k(70);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return yVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: all -> 0x008a, z -> 0x008c, LOOP:0: B:24:0x006d->B:26:0x0077, LOOP_END, TRY_LEAVE, TryCatch #0 {z -> 0x008c, blocks: (B:3:0x0012, B:20:0x003e, B:21:0x0043, B:22:0x0044, B:23:0x0050, B:24:0x006d, B:26:0x0077), top: B:37:0x0012, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.x, com.github.catvod.spider.merge.gu.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.gu.z T() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.gu.z r0 = new com.github.catvod.spider.merge.gu.z
            com.github.catvod.spider.merge.gu.x r1 = r4.g
            int r2 = r4.i()
            r0.<init>(r1, r2)
            r1 = 8
            r4.n(r0, r1)
            r1 = 80
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            com.github.catvod.spider.merge.gu.o r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            com.github.catvod.spider.merge.gu.G r1 = r4.e     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r2 = 1
            int r1 = r1.f(r2)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            if (r1 == r2) goto L50
            r3 = 5
            if (r1 == r3) goto L50
            r3 = 7
            if (r1 == r3) goto L50
            r3 = 41
            if (r1 == r3) goto L50
            r3 = 16
            if (r1 == r3) goto L44
            r3 = 17
            if (r1 == r3) goto L50
            r3 = 20
            if (r1 == r3) goto L44
            r3 = 21
            if (r1 != r3) goto L3e
            goto L50
        L3e:
            com.github.catvod.spider.merge.gu.u r1 = new com.github.catvod.spider.merge.gu.u     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            throw r1     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
        L44:
            r4.m(r0)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1 = 79
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r4.w()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            goto L97
        L50:
            r4.m(r0)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1 = 71
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r4.A()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1 = 72
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r4.L()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1 = 76
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            com.github.catvod.spider.merge.gu.o r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
        L6d:
            com.github.catvod.spider.merge.gu.G r1 = r4.e     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            int r1 = r1.f(r2)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r3 = 12
            if (r1 != r3) goto L97
            r1 = 73
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r4.O()     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1 = 78
            r4.k(r1)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            com.github.catvod.spider.merge.gu.o r1 = r4.d     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            r1.l(r4)     // Catch: java.lang.Throwable -> L8a com.github.catvod.spider.merge.gu.z -> L8c
            goto L6d
        L8a:
            r0 = move-exception
            goto L9b
        L8c:
            r1 = move-exception
            com.github.catvod.spider.merge.gu.o r2 = r4.d     // Catch: java.lang.Throwable -> L8a
            r2.h(r4, r1)     // Catch: java.lang.Throwable -> L8a
            com.github.catvod.spider.merge.gu.o r2 = r4.d     // Catch: java.lang.Throwable -> L8a
            r2.f(r4, r1)     // Catch: java.lang.Throwable -> L8a
        L97:
            r4.o()
            return r0
        L9b:
            r4.o()
            goto La0
        L9f:
            throw r0
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Dw.w.T():com.github.catvod.spider.merge.gu.z");
    }

    public final A U() {
        A a = new A(this.g, i());
        n(a, 42);
        try {
            try {
                m(a);
                k(202);
                this.d.l(this);
                if (this.e.f(1) == 14) {
                    k(201);
                    a.g = s(14);
                }
                k(204);
                V();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return a;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.B, com.github.catvod.spider.merge.gu.x] */
    public final B V() {
        Object b = new B(this.g, i());
        n(b, 24);
        try {
            try {
                k(139);
                this.d.l(this);
                int iB = ((S) h()).b(this.e, 11, this.g);
                if (iB == 1) {
                    m(b);
                    k(131);
                    N();
                    k(134);
                    this.d.l(this);
                    if (this.e.f(1) == 23) {
                        k(132);
                        ((B) b).g = s(23);
                        k(133);
                        V();
                    }
                } else if (iB == 2) {
                    m(b);
                    k(136);
                    s(8);
                    k(137);
                    s(23);
                    k(138);
                    V();
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return b;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.C, com.github.catvod.spider.merge.gu.x] */
    public final C W() {
        Object c = new C(this.g, i());
        n(c, 48);
        try {
            try {
                m(c);
                k(213);
                s(4);
                k(214);
                Q();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return c;
        } finally {
            o();
        }
    }

    @Override // com.github.catvod.spider.merge.gu.B
    public final com.github.catvod.spider.merge.Nx.a f() {
        return q;
    }

    public final com.github.catvod.spider.merge.gu.c w() {
        com.github.catvod.spider.merge.gu.c cVar = new com.github.catvod.spider.merge.gu.c(this.g, i());
        n(cVar, 16);
        try {
            try {
                m(cVar);
                k(103);
                int iF = this.e.f(1);
                if (iF == 16 || iF == 20) {
                    if (this.e.f(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    l();
                } else {
                    this.d.g(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return cVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.d, com.github.catvod.spider.merge.gu.x] */
    public final InterfaceC1227d x() {
        Object interfaceC1227d = new InterfaceC1227d(this.g, i());
        n(interfaceC1227d, 4);
        try {
            try {
                m(interfaceC1227d);
                k(60);
                ((InterfaceC1227d) interfaceC1227d).g = this.e.e(1);
                int iF = this.e.f(1);
                if (iF == 8 || iF == 9) {
                    if (this.e.f(1) == -1) {
                        this.k = true;
                    }
                    this.d.i();
                    l();
                } else {
                    ((InterfaceC1227d) interfaceC1227d).g = this.d.g(this);
                }
                k(61);
                S();
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return interfaceC1227d;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.e, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.e y() {
        Object eVar = new com.github.catvod.spider.merge.gu.e(this.g, i());
        n(eVar, 38);
        try {
            try {
                m(eVar);
                k(188);
                I();
                k(193);
                this.d.l(this);
                while (true) {
                    int iF = this.e.f(1);
                    if (iF != 14 && iF != 15) {
                        break;
                    }
                    k(189);
                    ((com.github.catvod.spider.merge.gu.e) eVar).g = this.e.e(1);
                    int iF2 = this.e.f(1);
                    if (iF2 == 14 || iF2 == 15) {
                        if (this.e.f(1) == -1) {
                            this.k = true;
                        }
                        this.d.i();
                        l();
                    } else {
                        ((com.github.catvod.spider.merge.gu.e) eVar).g = this.d.g(this);
                    }
                    k(190);
                    I();
                    k(195);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return eVar;
        } finally {
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.merge.gu.f, com.github.catvod.spider.merge.gu.x] */
    public final com.github.catvod.spider.merge.gu.f z() {
        Object fVar = new com.github.catvod.spider.merge.gu.f(this.g, i());
        n(fVar, 32);
        try {
            try {
                m(fVar);
                k(164);
                B();
                k(169);
                this.d.l(this);
                while (this.e.f(1) == 3) {
                    k(165);
                    s(3);
                    k(166);
                    B();
                    k(171);
                    this.d.l(this);
                }
            } catch (z e) {
                this.d.h(this, e);
                this.d.f(this, e);
            }
            return fVar;
        } finally {
            o();
        }
    }
}
