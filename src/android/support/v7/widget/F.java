// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.database.Observable;

class f extends Observable
{
    public void XO(final int n, final int n2, final Object o) {
        for (int i = this.mObservers.size() - 1; i >= 0; --i) {
            ((h)this.mObservers.get(i)).onItemRangeChanged(n, n2, o);
        }
    }
    
    public void XP(final int n, final int n2) {
        this.XO(n, n2, null);
    }
    
    public void XQ() {
        for (int i = this.mObservers.size() - 1; i >= 0; --i) {
            ((h)this.mObservers.get(i)).onChanged();
        }
    }
}
