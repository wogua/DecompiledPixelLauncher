// 
// Decompiled by Procyon v0.5.30
// 

package com.google.research.reflection.predictor;

import com.google.research.reflection.common.UncertaintyException;
import com.google.research.reflection.common.e;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;
import com.google.research.reflection.a.b;
import com.google.research.reflection.common.a;

public class d
{
    protected boolean MB;
    private int MC;
    protected a MD;
    private long ME;
    
    public d() {
        this.ME = 3600000L;
        this.MC = 100;
        this.MD = new a(this.MC, false);
    }
    
    public static d SA(final String s, final b b) {
        d sc = new d();
        if (s != null) {
            sc = SC(s.getBytes(StandardCharsets.ISO_8859_1), b);
        }
        return sc;
    }
    
    public static d SC(final byte[] array, final b b) {
        final d d = new d();
        try {
            final DataInputStream dataInputStream = new(java.io.DataInputStream.class);
            try {
                final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
                final DataInputStream dataInputStream2 = dataInputStream;
                try {
                    new DataInputStream(byteArrayInputStream);
                    d.SB(dataInputStream, b);
                    dataInputStream.close();
                    return d;
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            catch (IOException ex2) {}
        }
        catch (IOException ex3) {}
    }
    
    public static String SF(final d d) {
        if (d == null) {
            return null;
        }
        return new String(SH(d), StandardCharsets.ISO_8859_1);
    }
    
    public static byte[] SH(final d d) {
        try {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    d.SD(dataOutputStream);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                    return null;
                }
            }
            catch (IOException ex2) {}
        }
        catch (IOException ex3) {}
    }
    
    public void SB(final DataInputStream dataInputStream, final b b) {
        byte[] array = null;
        this.clear();
        for (int int1 = dataInputStream.readInt(), i = 0; i < int1; ++i) {
            final int int2 = dataInputStream.readInt();
            if (array == null || array.length < int2) {
                array = new byte[int2];
            }
            dataInputStream.read(array, 0, int2);
            final b j = b.I(array, 0, int2);
            if (this.SG(j)) {
                this.Sz(j);
            }
        }
    }
    
    public void SD(final DataOutputStream dataOutputStream) {
        final int size = this.size();
        dataOutputStream.writeInt(size);
        for (int i = 0; i < size; ++i) {
            final byte[] r = ((b)this.MD.ST(i)).R();
            dataOutputStream.writeInt(r.length);
            dataOutputStream.write(r, 0, r.length);
        }
        this.MB = false;
    }
    
    public a SE() {
        return this.MD;
    }
    
    protected boolean SG(final b b) {
        boolean b2 = false;
        if (b.Q() == null || b.Q().equals("") || b.Q().equals("app_launch")) {
            b2 = true;
        }
        return b2;
    }
    
    public void Sz(final b b) {
        final boolean mb = true;
        if (this.SG(b)) {
        Label_0028:
            while (this.MD.SV() > 0) {
                while (true) {
                    while (true) {
                        Label_0119: {
                            try {
                                final Object st = this.MD.ST(0);
                                try {
                                    final long tn = e.Tn((b)st, b);
                                    if (tn > this.ME) {
                                        break Label_0119;
                                    }
                                    final int n = mb ? 1 : 0;
                                    if (n == 0) {
                                        this.MD.SW();
                                        break;
                                    }
                                    break Label_0028;
                                }
                                catch (UncertaintyException ex) {
                                    final long tn = Long.MAX_VALUE;
                                }
                            }
                            catch (UncertaintyException ex2) {}
                        }
                        final int n = 0;
                        continue;
                    }
                }
            }
            this.MD.add(b);
            this.MB = mb;
        }
    }
    
    public void clear() {
        this.MD.clear();
    }
    
    public int size() {
        return this.MD.SV();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(size ");
        sb.append(this.MD.SV());
        sb.append("): ");
        for (int i = 0; i < this.MD.SV(); ++i) {
            sb.append(((b)this.MD.ST(i)).getId());
            sb.append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
