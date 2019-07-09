package com.aspose.words;

import asposewobfuscated.zz5A;
import asposewobfuscated.zz68;
import asposewobfuscated.zz8W;
import asposewobfuscated.zzAE;
import asposewobfuscated.zzAF;
import asposewobfuscated.zzAS;
import asposewobfuscated.zzBV;
import asposewobfuscated.zzL8;
import asposewobfuscated.zzME;
import asposewobfuscated.zzVE;
import asposewobfuscated.zzWQ;
import java.util.Iterator;

class zzYUI {
    private static long[] zznz;
    private static int zzY7f = zzWQ.zzB(2.0D);

    static void zzF(CompositeNode var0) {
        if (zzE(var0)) {
            var0.appendChild(new Paragraph(var0.getDocument()));
        }

    }

    static boolean zzE(CompositeNode var0) {
        Node var1 = var0.getLastChild();
        if (var1 == null) {
            return true;
        } else {
            switch(var1.getNodeType()) {
                case 8:
                    return false;
                case 28:
                    return zzE((CompositeNode)var1);
                default:
                    return true;
            }
        }
    }

    static boolean zzYW(Paragraph var0) {
        CompositeNode var1 = (CompositeNode)zz5A.zzZ(var0.getPreviousSibling(), CompositeNode.class);
        if (var1 == null || var1.getNodeType() != 8 && zzE(var1)) {
            Object var2;
            for(var2 = var0; var2 != null && ((Node)var2).getNodeType() != 3 && ((Node)var2).getNodeType() != 7 && ((Node)var2).getNodeType() != 19 && ((Node)var2).getNodeType() != 20; var2 = ((Node)var2).zzZtt() ? ((Node)var2).getParentNode() : null) {
            }

            return var2 == null;
        } else {
            return true;
        }
    }

    static int zzHB(int var0) {
        if (var0 >= 0 && var0 <= 127) {
            return 3;
        } else if (var0 >= 11904 && var0 <= 55215) {
            return 1;
        } else if (var0 >= 63744 && var0 <= 64255) {
            return 1;
        } else if (var0 >= 65072 && var0 <= 65103) {
            return 1;
        } else if (var0 >= 65280 && var0 <= 65519) {
            return 1;
        } else if (var0 >= 1424 && var0 <= 3583) {
            return 2;
        } else if (var0 >= 64285 && var0 <= 64335) {
            return 2;
        } else if (var0 >= 64336 && var0 <= 65023 || var0 >= 65136 && var0 <= 65279) {
            return 2;
        } else {
            return var0 >= 131072 && var0 <= 173782 ? 1 : 0;
        }
    }

    static String zzZ(int var0, String var1, String var2, String var3, String var4) {
        switch(var0) {
            case 0:
            default:
                return var4;
            case 1:
                return var3;
            case 2:
                return var2;
            case 3:
                return var1;
        }
    }

    static String zzGt(String var0) {
        return zz5(var0, true);
    }

    static String zz5(String var0, boolean var1) {
        if (var1) {
            return zz68.zzU(var0, '"');
        } else {
            if (var0.startsWith("\"")) {
                var0 = var0.substring(1);
            }

            if (var0.endsWith("\"")) {
                var0 = var0.substring(0, 0 + (var0.length() - 1));
            }

            return var0;
        }
    }

    static boolean zzGs(String var0) {
        if (!zz68.zzWm(var0) && var0.length() >= 2) {
            char[] var1 = new char[]{'"', '«', '“', '„'};
            char[] var2 = new char[]{'"', '»', '”', '‟'};
            return zz68.zzZ(var0, var1, 0, 1) == 0 && zz68.zzZ(var0, var2, var0.length() - 1, 1) == var0.length() - 1;
        } else {
            return false;
        }
    }

    static String zzGr(String var0) {
        char[] var1 = new char[]{'"', '«', '“', '„'};
        char[] var2 = new char[]{'"', '»', '”', '‟'};
        var0 = zz68.zzX(var0, var1);
        var0 = zz68.zzW(var0, var2);
        return var0;
    }

    static String zzGq(String var0) {
        return zz68.format("\"{0}\"", new Object[]{var0});
    }

    static String zzGp(String var0) {
        var0 = var0.replace("\\", "\\\\");
        var0 = zzGq(var0);
        return var0;
    }

    static String zzGo(String var0) {
        StringBuilder var1 = new StringBuilder(var0);
        zz8W.zzZ(var1, ControlChar.CR_LF, ControlChar.CR);
        zz8W.zzZ(var1, ControlChar.LF, ControlChar.CR);
        return var1.toString();
    }

    static String zzGn(String var0) {
        StringBuilder var1 = new StringBuilder(var0);
        zz8W.zzZ(var1, ControlChar.CR_LF, ControlChar.LF);
        zz8W.zzZ(var1, ControlChar.CR, ControlChar.LF);
        return var1.toString();
    }

    static String zzGm(String var0) {
        if (var0 == null) {
            throw new IllegalArgumentException("s");
        } else {
            StringBuilder var1 = new StringBuilder(var0);

            for(int var2 = 0; var2 < var1.length(); ++var2) {
                char var3 = var1.charAt(var2);
                if (!zzYC(var3)) {
                    var1.setCharAt(var2, Character.toUpperCase(var3));
                    break;
                }
            }

            return var1.toString();
        }
    }

    static String zzGl(String var0) {
        if (var0 == null) {
            throw new IllegalArgumentException("s");
        } else {
            boolean var1 = false;
            StringBuilder var2 = new StringBuilder(var0);

            for(int var3 = 0; var3 < var2.length(); ++var3) {
                char var4 = var2.charAt(var3);
                if (zzYC(var4)) {
                    var1 = false;
                } else if (!var1) {
                    var2.setCharAt(var3, Character.toUpperCase(var4));
                    var1 = true;
                } else {
                    var2.setCharAt(var3, Character.toLowerCase(var4));
                }
            }

            return var2.toString();
        }
    }

    private static boolean zzYC(char var0) {
        return !Character.isLetterOrDigit(var0);
    }

    static String zzZB(String var0, int var1) {
        switch(var1) {
            case 0:
                return var0;
            case 1:
                return var0.toUpperCase();
            case 2:
                return var0.toLowerCase();
            case 3:
                return zzGl(var0);
            case 4:
                return zzGm(var0);
            case 5:
                return zzGk(var0);
            default:
                throw new IllegalStateException("Unknown char case specified.");
        }
    }

    private static String zzGk(String var0) {
        if (!zzME.zzZT(var0)) {
            return "";
        } else {
            StringBuilder var1 = new StringBuilder();

            for(int var2 = 0; var2 < var0.length(); ++var2) {
                char var3 = var0.charAt(var2);
                if (var3 > ' ' && var3 < 127) {
                    var1.append((char)('\uff00' | var3 - 32));
                } else if (var3 == ' ') {
                    var1.append('　');
                } else {
                    var1.append(var3);
                }
            }

            return var1.toString();
        }
    }

    static String zzY(zzAS var0, String var1) {
        byte var2 = 0;
        return zzZ(var0, var1, var2);
    }

    static String zzZ(zzAS var0, String var1, int var2) {
        return zzOO.zzZ(var1, var0, var2);
    }

    static int zzuz(int var0) {
        switch(var0) {
            case 0:
                return 6;
            case 1:
                return 7;
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 11;
            default:
                throw new IllegalStateException("Unknown header or footer type.");
        }
    }

    static int zzuy(int var0) {
        switch(var0) {
            case 6:
                return 0;
            case 7:
                return 1;
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            case 11:
                return 5;
            default:
                throw new IllegalStateException("This story is not a header or footer story.");
        }
    }

    static long zzux(int var0) {
        return zznz[var0];
    }

    static int zzE(int var0, int var1, boolean var2) {
        for(int var3 = 0; var3 < zznz.length; ++var3) {
            if (var3 != 16) {
                long var4 = zznz[var3];
                if (zzME.zzZ(zzAE.zzK((float)zzAF.zzZg(var4), (float)zzAF.zzZf(var4)), zzAE.zzK((float)var0, (float)var1), var2, (double)zzY7f)) {
                    return var3;
                }
            }
        }

        return 16;
    }

    static void zzk(Document var0) throws Exception {
        if (zzZOF.zzZBH() != zzZOE.zzZ7J) {
            String var1 = zz68.format("Evaluation Only. Created with Aspose.Words. Copyright 2003-{0} Aspose Pty Ltd.", new Object[]{"2015.08.31".substring(0, 4)});
            String var2 = "This document was truncated here because it was created using Aspose.Words in Evaluation Mode.";
            zzZ(var0, var1, var2);
        }
    }

    static void zzZ(Document var0, String var1, String var2) throws Exception {
        var0.ensureMinimum();
        if (var0.getFirstChild() != var0.getLastChild() || !var0.getFirstSection().getBody().zzZ4F()) {
            Run var3 = var0.getFirstSection().getBody().getFirstParagraph().zzZjS();
            if (var3 == null || !zz68.equals(var3.getText(), var1)) {
                Run var4 = new Run(var0, var1, new zzZ4B());
                var4.zzZQf().zzX(160, zzVE.zzP0);
                var4.zzZQf().zzX(60, zz7.zz7J);
                var4.zzZQf().zzX(190, 24);
                Paragraph var5 = new Paragraph(var0, new zzZB5(), new zzZ4B());
                var5.appendChild(var4);
                Paragraph var6 = var0.getFirstSection().getBody().getFirstParagraph();
                if (var6 != null && var6.getParagraphFormat().getPageBreakBefore()) {
                    var6.getParagraphFormat().setPageBreakBefore(false);
                }

                var0.getFirstSection().getBody().prependChild(var5);
                zzV(var0, var2);
            }
        }
    }

    private static void zzV(Document var0, String var1) throws Exception {
        NodeCollection var2 = var0.getChildNodes(8, true);
        int var3 = 0;
        int var4 = 0;
        Paragraph var5 = null;
        Iterator var6 = var2.iterator();

        while(var6.hasNext()) {
            Paragraph var7 = (Paragraph)var6.next();
            if (var7.getParentNode().getNodeType() == 3 || var7.getParentNode().getNodeType() == 7) {
                var5 = var7;
                Iterator var8 = var7.iterator();

                while(var8.hasNext()) {
                    Node var9 = (Node)var8.next();
                    switch(var9.getNodeType()) {
                        case 22:
                            ++var4;
                            break;
                        case 24:
                            --var4;
                    }
                }
            }

            ++var3;
            short var11 = 198;
            if (var3 > var11 && var5 != null && var4 == 0 && var5.zzDH(0).getNodeType() != 4) {
                zzZIT.zzu(var5.getParentSection().getNextSibling(), (Node)null);
                zzZIT.zzZ(var5, false, var0.getLastChild(), false);
                Run var12 = new Run(var0, var1, new zzZ4B());
                var12.zzZQf().zzX(160, zzVE.zzP0);
                var12.zzZQf().zzX(60, zz7.zz7J);
                var12.zzZQf().zzX(190, 24);
                Paragraph var10 = new Paragraph(var0, new zzZB5(), new zzZ4B());
                var10.appendChild(var12);
                var0.getLastSection().getBody().appendChild(var10);
                break;
            }
        }

    }

    static double zzuw(int var0) {
        switch(var0) {
            case 0:
            case 65535:
                return 0.0D;
            case 1:
                return 1.0D;
            case 2:
                return 0.05D;
            case 3:
                return 0.10000000149011612D;
            case 4:
                return 0.2D;
            case 5:
            case 20:
            case 21:
            case 22:
            case 23:
                return 0.25D;
            case 6:
            case 25:
                return 0.3D;
            case 7:
                return 0.4D;
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return 0.5D;
            case 9:
                return 0.6D;
            case 10:
            case 19:
                return 0.7D;
            case 11:
                return 0.75D;
            case 12:
                return 0.8D;
            case 13:
                return 0.9D;
            case 24:
            case 43:
                return 0.35D;
            case 35:
                return 0.025D;
            case 36:
                return 0.075D;
            case 37:
                return 0.125D;
            case 38:
                return 0.15D;
            case 39:
                return 0.175D;
            case 40:
                return 0.225D;
            case 41:
                return 0.275D;
            case 42:
                return 0.325D;
            case 44:
                return 0.375D;
            case 45:
                return 0.425D;
            case 46:
                return 0.45D;
            case 47:
                return 0.475D;
            case 48:
                return 0.525D;
            case 49:
                return 0.55D;
            case 50:
                return 0.575D;
            case 51:
                return 0.625D;
            case 52:
                return 0.65D;
            case 53:
                return 0.675D;
            case 54:
                return 0.725D;
            case 55:
                return 0.775D;
            case 56:
                return 0.825D;
            case 57:
                return 0.85D;
            case 58:
                return 0.875D;
            case 59:
                return 0.925D;
            case 60:
                return 0.95D;
            case 61:
                return 0.975D;
            default:
                throw new IllegalStateException("Unknown texture.");
        }
    }

    static int zzuv(int var0) {
        switch(var0) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 65535:
                return var0;
            default:
                return 0;
        }
    }

    static boolean zzuu(int var0) {
        switch(var0) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                return false;
        }
    }

    static int zzX3(double var0) {
        switch((int)(40.0D * var0)) {
            case 0:
                return 0;
            case 1:
                return 35;
            case 2:
                return 2;
            case 3:
                return 36;
            case 4:
                return 3;
            case 5:
                return 37;
            case 6:
                return 38;
            case 7:
                return 39;
            case 8:
                return 4;
            case 9:
                return 40;
            case 10:
                return 5;
            case 11:
                return 41;
            case 12:
                return 6;
            case 13:
                return 42;
            case 14:
                return 43;
            case 15:
                return 44;
            case 16:
                return 7;
            case 17:
                return 45;
            case 18:
                return 46;
            case 19:
                return 47;
            case 20:
                return 8;
            case 21:
                return 48;
            case 22:
                return 49;
            case 23:
                return 50;
            case 24:
                return 9;
            case 25:
                return 51;
            case 26:
                return 52;
            case 27:
                return 53;
            case 28:
                return 10;
            case 29:
                return 54;
            case 30:
                return 11;
            case 31:
                return 55;
            case 32:
                return 12;
            case 33:
                return 56;
            case 34:
                return 57;
            case 35:
                return 58;
            case 36:
                return 13;
            case 37:
                return 59;
            case 38:
                return 60;
            case 39:
                return 61;
            default:
                return 1;
        }
    }

    static zzVE zzY(zzVE var0, zzVE var1, double var2) {
        if (var2 == 0.0D) {
            return var1;
        } else if (var2 == 1.0D) {
            return var0;
        } else if (var0.zzTK() && var1.zzTK()) {
            int var4 = (int)((double)var0.zzTO() * var2 + (double)var1.zzTO() * (1.0D - var2));
            return new zzVE(var4, var4, var4);
        } else {
            return zzBV.zzZ(var0, var1, var2);
        }
    }

    private static long zzx(double var0, double var2) {
        return zzAF.zzZO(zzWQ.zzB(var0), zzWQ.zzB(var2));
    }

    private static long zzw(double var0, double var2) {
        return zzAF.zzZO(zzWQ.zzq(var0), zzWQ.zzq(var2));
    }

    static {
        int var0 = zzL8.zzWx(17);
        zznz = new long[var0];
        zznz[0] = zzx(297.0D, 420.0D);
        zznz[1] = zzx(210.0D, 297.0D);
        zznz[2] = zzx(148.0D, 210.0D);
        zznz[3] = zzx(250.0D, 353.0D);
        zznz[4] = zzx(176.0D, 250.0D);
        zznz[5] = zzw(7.25D, 10.5D);
        zznz[6] = zzw(8.0D, 13.0D);
        zznz[7] = zzw(11.0D, 17.0D);
        zznz[8] = zzw(8.5D, 14.0D);
        zznz[9] = zzw(8.5D, 11.0D);
        zznz[10] = zzx(110.0D, 220.0D);
        zznz[11] = zzw(8.0D, 10.0D);
        zznz[12] = zzw(5.5D, 8.5D);
        zznz[13] = zzw(11.0D, 17.0D);
        zznz[14] = zzw(10.0D, 14.0D);
        zznz[15] = zzw(11.0D, 17.0D);
    }
}
