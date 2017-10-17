// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.b;

import android.graphics.Color;

public final class a
{
    private static final ThreadLocal aeH;
    
    static {
        aeH = new ThreadLocal();
    }
    
    private static int arK(final int n, final int n2) {
        return 255 - (255 - n2) * (255 - n) / 255;
    }
    
    public static double arL(int asf, final int n) {
        final int n2 = 255;
        final double n3 = 0.05;
        if (Color.alpha(n) == n2) {
            if (Color.alpha(asf) < n2) {
                asf = asf(asf, n);
            }
            final double n4 = arP(asf) + n3;
            final double n5 = arP(n) + n3;
            return Math.max(n4, n5) / Math.min(n4, n5);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(n));
    }
    
    private static double[] arM() {
        double[] array = a.aeH.get();
        if (array == null) {
            array = new double[3];
            a.aeH.set(array);
        }
        return array;
    }
    
    private static int arN(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 != 0) {
            return (n * 255 * n2 + n3 * n4 * (255 - n2)) / (n5 * 255);
        }
        return 0;
    }
    
    public static void arO(final int n, final int n2, final int n3, final float[] array) {
        final float n4 = 360.0f;
        final float n5 = 255.0f;
        final float n6 = 2.0f;
        final float n7 = 1.0f;
        final float n8 = n / n5;
        final float n9 = n2 / n5;
        final float n10 = n3 / n5;
        final float max = Math.max(n8, Math.max(n9, n10));
        final float min = Math.min(n8, Math.min(n9, n10));
        final float n11 = max - min;
        final float n12 = (max + min) / n6;
        float n13;
        float n14;
        if (max == min) {
            n13 = 0.0f;
            n14 = 0.0f;
        }
        else {
            if (max == n8) {
                n13 = (n9 - n10) / n11 % 6.0f;
            }
            else if (max == n9) {
                n13 = (n10 - n8) / n11 + n6;
            }
            else {
                n13 = (n8 - n9) / n11 + 4.0f;
            }
            n14 = n11 / (n7 - Math.abs(n6 * n12 - n7));
        }
        float n15 = n13 * 60.0f % n4;
        if (n15 < 0.0f) {
            n15 += n4;
        }
        array[0] = asd(n15, 0.0f, n4);
        array[1] = asd(n14, 0.0f, n7);
        array[2] = asd(n12, 0.0f, n7);
    }
    
    public static double arP(final int n) {
        final double[] arM = arM();
        arS(n, arM);
        return arM[1] / 100.0;
    }
    
    public static int arQ(final double n, final double n2, final double n3) {
        final double[] arM = arM();
        arZ(n, n2, n3, arM);
        return arW(arM[0], arM[1], arM[2]);
    }
    
    private static double arR(final double n) {
        double pow;
        if (n > 0.008856) {
            pow = Math.pow(n, 0.3333333333333333);
        }
        else {
            pow = (903.3 * n + 16.0) / 116.0;
        }
        return pow;
    }
    
    public static void arS(final int n, final double[] array) {
        asc(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static void arT(final double n, final double n2, final double n3, final double[] array) {
        if (array.length == 3) {
            final double arR = arR(n / 95.047);
            final double arR2 = arR(n2 / 100.0);
            final double arR3 = arR(n3 / 108.883);
            array[0] = Math.max(0.0, 116.0 * arR2 - 16.0);
            array[1] = (arR - arR2) * 500.0;
            array[2] = (arR2 - arR3) * 200.0;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }
    
    public static void arU(final int n, final float[] array) {
        arO(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    private static int arV(int n, final int n2, final int n3) {
        if (n >= n2) {
            if (n > n3) {
                n = n3;
            }
        }
        else {
            n = n2;
        }
        return n;
    }
    
    public static int arW(final double n, final double n2, final double n3) {
        final double n4 = (3.2406 * n + -1.5372 * n2 + -0.4986 * n3) / 100.0;
        final double n5 = (-0.9689 * n + 1.8758 * n2 + 0.0415 * n3) / 100.0;
        final double n6 = (0.0557 * n + -0.204 * n2 + 1.057 * n3) / 100.0;
        double n7;
        if (n4 > 0.0031308) {
            n7 = Math.pow(n4, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n7 = n4 * 12.92;
        }
        double n8;
        if (n5 > 0.0031308) {
            n8 = Math.pow(n5, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n8 = n5 * 12.92;
        }
        double n9;
        if (n6 > 0.0031308) {
            n9 = Math.pow(n6, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n9 = n6 * 12.92;
        }
        return Color.rgb(arV((int)Math.round(n7 * 255.0), 0, 255), arV((int)Math.round(n8 * 255.0), 0, 255), arV((int)Math.round(255.0 * n9), 0, 255));
    }
    
    public static void arX(final int n, final int n2, final int n3, final double[] array) {
        asc(n, n2, n3, array);
        arT(array[0], array[1], array[2], array);
    }
    
    public static void arY(final int n, final double[] array) {
        arX(Color.red(n), Color.green(n), Color.blue(n), array);
    }
    
    public static void arZ(final double n, final double n2, final double n3, final double[] array) {
        final double n4 = (16.0 + n) / 116.0;
        final double n5 = n2 / 500.0 + n4;
        final double n6 = n4 - n3 / 200.0;
        double pow = Math.pow(n5, 3.0);
        if (pow <= 0.008856) {
            pow = (116.0 * n5 - 16.0) / 903.3;
        }
        double pow2;
        if (n > 7.9996247999999985) {
            pow2 = Math.pow(n4, 3.0);
        }
        else {
            pow2 = n / 903.3;
        }
        double pow3 = Math.pow(n6, 3.0);
        if (pow3 <= 0.008856) {
            pow3 = (116.0 * n6 - 16.0) / 903.3;
        }
        array[0] = pow * 95.047;
        array[1] = 100.0 * pow2;
        array[2] = 108.883 * pow3;
    }
    
    public static int asa(final float[] array) {
        final float n = 2.0f;
        final int n2 = 255;
        final float n3 = 1.0f;
        final float n4 = 255.0f;
        final float n5 = array[0];
        final float n6 = array[1];
        final float n7 = array[2];
        final float n8 = (n3 - Math.abs(n * n7 - n3)) * n6;
        final float n9 = n7 - 0.5f * n8;
        final float n10 = n8 * (n3 - Math.abs(n5 / 60.0f % n - n3));
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        switch ((int)n5 / 60) {
            default: {
                n11 = 0;
                n12 = 0;
                n13 = 0;
                break;
            }
            case 0: {
                n13 = Math.round((n8 + n9) * n4);
                n12 = Math.round((n10 + n9) * n4);
                n11 = Math.round(n4 * n9);
                break;
            }
            case 1: {
                n13 = Math.round((n10 + n9) * n4);
                n12 = Math.round((n8 + n9) * n4);
                n11 = Math.round(n4 * n9);
                break;
            }
            case 2: {
                n13 = Math.round(n4 * n9);
                n12 = Math.round((n8 + n9) * n4);
                n11 = Math.round((n10 + n9) * n4);
                break;
            }
            case 3: {
                n13 = Math.round(n4 * n9);
                n12 = Math.round((n10 + n9) * n4);
                n11 = Math.round((n8 + n9) * n4);
                break;
            }
            case 4: {
                n13 = Math.round((n10 + n9) * n4);
                n12 = Math.round(n4 * n9);
                n11 = Math.round((n8 + n9) * n4);
                break;
            }
            case 5:
            case 6: {
                n13 = Math.round((n8 + n9) * n4);
                n12 = Math.round(n4 * n9);
                n11 = Math.round((n10 + n9) * n4);
                break;
            }
        }
        return Color.rgb(arV(n13, 0, n2), arV(n12, 0, n2), arV(n11, 0, n2));
    }
    
    public static int asb(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (0xFFFFFF & n) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
    
    public static void asc(final int n, final int n2, final int n3, final double[] array) {
        if (array.length == 3) {
            final double n4 = n / 255.0;
            double pow;
            if (n4 < 0.04045) {
                pow = n4 / 12.92;
            }
            else {
                pow = Math.pow((n4 + 0.055) / 1.055, 2.4);
            }
            final double n5 = n2 / 255.0;
            double pow2;
            if (n5 < 0.04045) {
                pow2 = n5 / 12.92;
            }
            else {
                pow2 = Math.pow((n5 + 0.055) / 1.055, 2.4);
            }
            final double n6 = n3 / 255.0;
            double pow3;
            if (n6 < 0.04045) {
                pow3 = n6 / 12.92;
            }
            else {
                pow3 = Math.pow((n6 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.4124 * pow + 0.3576 * pow2 + 0.1805 * pow3) * 100.0;
            array[1] = (0.2126 * pow + 0.7152 * pow2 + 0.0722 * pow3) * 100.0;
            array[2] = (pow * 0.0193 + pow2 * 0.1192 + 0.9505 * pow3) * 100.0;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    private static float asd(final float n, float n2, final float n3) {
        if (n >= n2) {
            if (n > n3) {
                n2 = n3;
            }
            else {
                n2 = n;
            }
        }
        return n2;
    }
    
    public static int ase(final int n, final int n2, final float n3) {
        int n4 = 0;
        int n5 = 255;
        if (Color.alpha(n2) != n5) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(n2));
        }
        if (arL(asb(n, n5), n2) < n3) {
            return -1;
        }
        int n7;
        for (int n6 = 0; n6 <= 10 && n5 - n4 > 1; ++n6, n4 = n7) {
            n7 = (n4 + n5) / 2;
            if (arL(asb(n, n7), n2) >= n3) {
                n5 = n7;
                n7 = n4;
            }
        }
        return n5;
    }
    
    public static int asf(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int arK = arK(alpha2, alpha);
        return Color.argb(arK, arN(Color.red(n), alpha2, Color.red(n2), alpha, arK), arN(Color.green(n), alpha2, Color.green(n2), alpha, arK), arN(Color.blue(n), alpha2, Color.blue(n2), alpha, arK));
    }
    
    static float circularInterpolate(float n, float n2, final float n3) {
        final float n4 = 360.0f;
        if (Math.abs(n2 - n) > 180.0f) {
            if (n2 > n) {
                n += n4;
            }
            else {
                n2 += n4;
            }
        }
        return ((n2 - n) * n3 + n) % n4;
    }
}
