package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0609j implements X, com.github.catvod.spider.merge.C.w {
    public static final C0609j a = new C0609j();

    public static boolean j(Class<?> cls) {
        return cls == Point.class || cls == Rectangle.class || cls == Font.class || cls == Color.class;
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        T t;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        if (dVar.p() == 8) {
            dVar.o(16);
            return null;
        }
        if (dVar.p() != 12 && dVar.p() != 16) {
            throw new C1415d("syntax error");
        }
        dVar.nextToken();
        if (type == Point.class) {
            t = (T) h(bVar, obj);
        } else if (type == Rectangle.class) {
            t = (T) i(bVar);
        } else if (type == Color.class) {
            t = (T) f(bVar);
        } else {
            if (type != Font.class) {
                throw new C1415d("not support awt class : " + type);
            }
            t = (T) g(bVar);
        }
        com.github.catvod.spider.merge.B.k kVarF = bVar.f();
        bVar.A(t, obj);
        bVar.B(kVarF);
        return t;
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        int alpha;
        String str;
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.s();
            return;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            h0Var.k(k(h0Var, Point.class), "x", point.x);
            h0Var.k(',', "y", point.y);
        } else {
            if (obj instanceof Font) {
                Font font = (Font) obj;
                h0Var.m(k(h0Var, Font.class), "name", font.getName());
                h0Var.k(',', "style", font.getStyle());
                alpha = font.getSize();
                str = "size";
            } else if (obj instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) obj;
                h0Var.k(k(h0Var, Rectangle.class), "x", rectangle.x);
                h0Var.k(',', "y", rectangle.y);
                h0Var.k(',', "width", rectangle.width);
                alpha = rectangle.height;
                str = "height";
            } else {
                if (!(obj instanceof Color)) {
                    StringBuilder sbB = t0.b("not support awt class : ");
                    sbB.append(obj.getClass().getName());
                    throw new C1415d(sbB.toString());
                }
                Color color = (Color) obj;
                h0Var.k(k(h0Var, Color.class), "r", color.getRed());
                h0Var.k(',', "g", color.getGreen());
                h0Var.k(',', "b", color.getBlue());
                if (color.getAlpha() > 0) {
                    alpha = color.getAlpha();
                    str = "alpha";
                }
            }
            h0Var.k(',', str, alpha);
        }
        h0Var.write(125);
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }

    protected final Color f(com.github.catvod.spider.merge.B.b bVar) {
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (dVar.p() != 13) {
            if (dVar.p() != 4) {
                throw new C1415d("syntax error");
            }
            String strK = dVar.K();
            dVar.a();
            if (dVar.p() != 2) {
                throw new C1415d("syntax error");
            }
            int iC = dVar.c();
            dVar.nextToken();
            if (strK.equalsIgnoreCase("r")) {
                i = iC;
            } else if (strK.equalsIgnoreCase("g")) {
                i2 = iC;
            } else if (strK.equalsIgnoreCase("b")) {
                i3 = iC;
            } else {
                if (!strK.equalsIgnoreCase("alpha")) {
                    throw new C1415d(C1290c.a("syntax error, ", strK));
                }
                i4 = iC;
            }
            if (dVar.p() == 16) {
                dVar.o(4);
            }
        }
        dVar.nextToken();
        return new Color(i, i2, i3, i4);
    }

    protected final Font g(com.github.catvod.spider.merge.B.b bVar) {
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int iC = 0;
        String strK = null;
        int iC2 = 0;
        while (dVar.p() != 13) {
            if (dVar.p() != 4) {
                throw new C1415d("syntax error");
            }
            String strK2 = dVar.K();
            dVar.a();
            if (strK2.equalsIgnoreCase("name")) {
                if (dVar.p() != 4) {
                    throw new C1415d("syntax error");
                }
                strK = dVar.K();
            } else if (strK2.equalsIgnoreCase("style")) {
                if (dVar.p() != 2) {
                    throw new C1415d("syntax error");
                }
                iC = dVar.c();
            } else {
                if (!strK2.equalsIgnoreCase("size")) {
                    throw new C1415d(C1290c.a("syntax error, ", strK2));
                }
                if (dVar.p() != 2) {
                    throw new C1415d("syntax error");
                }
                iC2 = dVar.c();
            }
            dVar.nextToken();
            if (dVar.p() == 16) {
                dVar.o(4);
            }
        }
        dVar.nextToken();
        return new Font(strK, iC, iC2);
    }

    protected final Point h(com.github.catvod.spider.merge.B.b bVar, Object obj) {
        int iK;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int i = 0;
        int i2 = 0;
        while (dVar.p() != 13) {
            if (dVar.p() != 4) {
                throw new C1415d("syntax error");
            }
            String strK = dVar.K();
            if (AbstractC1412a.d.equals(strK)) {
                com.github.catvod.spider.merge.B.d dVar2 = bVar.g;
                dVar2.q();
                if (dVar2.p() != 4) {
                    throw new C1415d("type not match error");
                }
                if (!"java.awt.Point".equals(dVar2.K())) {
                    throw new C1415d("type not match error");
                }
                dVar2.nextToken();
                if (dVar2.p() == 16) {
                    dVar2.nextToken();
                }
            } else {
                if ("$ref".equals(strK)) {
                    com.github.catvod.spider.merge.B.d dVar3 = bVar.g;
                    dVar3.a();
                    String strK2 = dVar3.K();
                    bVar.A(bVar.f(), obj);
                    bVar.b(new com.github.catvod.spider.merge.B.a(bVar.f(), strK2));
                    bVar.x();
                    bVar.l = 1;
                    dVar3.o(13);
                    bVar.a(13);
                    return null;
                }
                dVar.a();
                int iP = dVar.p();
                if (iP == 2) {
                    iK = dVar.c();
                } else {
                    if (iP != 3) {
                        StringBuilder sbB = t0.b("syntax error : ");
                        sbB.append(dVar.y());
                        throw new C1415d(sbB.toString());
                    }
                    iK = (int) dVar.k();
                }
                dVar.nextToken();
                if (strK.equalsIgnoreCase("x")) {
                    i = iK;
                } else {
                    if (!strK.equalsIgnoreCase("y")) {
                        throw new C1415d(C1290c.a("syntax error, ", strK));
                    }
                    i2 = iK;
                }
                if (dVar.p() == 16) {
                    dVar.o(4);
                }
            }
        }
        dVar.nextToken();
        return new Point(i, i2);
    }

    protected final Rectangle i(com.github.catvod.spider.merge.B.b bVar) {
        int iK;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (dVar.p() != 13) {
            if (dVar.p() != 4) {
                throw new C1415d("syntax error");
            }
            String strK = dVar.K();
            dVar.a();
            int iP = dVar.p();
            if (iP == 2) {
                iK = dVar.c();
            } else {
                if (iP != 3) {
                    throw new C1415d("syntax error");
                }
                iK = (int) dVar.k();
            }
            dVar.nextToken();
            if (strK.equalsIgnoreCase("x")) {
                i = iK;
            } else if (strK.equalsIgnoreCase("y")) {
                i2 = iK;
            } else if (strK.equalsIgnoreCase("width")) {
                i3 = iK;
            } else {
                if (!strK.equalsIgnoreCase("height")) {
                    throw new C1415d(C1290c.a("syntax error, ", strK));
                }
                i4 = iK;
            }
            if (dVar.p() == 16) {
                dVar.o(4);
            }
        }
        dVar.nextToken();
        return new Rectangle(i, i2, i3, i4);
    }

    protected final char k(h0 h0Var, Class cls) {
        if (!h0Var.g(i0.WriteClassName)) {
            return '{';
        }
        h0Var.write(123);
        h0Var.j(AbstractC1412a.d);
        h0Var.v(cls.getName());
        return ',';
    }
}
