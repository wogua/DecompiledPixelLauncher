// 
// Decompiled by Procyon v0.5.30
// 

package com.google.protobuf.nano.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.e;

public abstract class ParcelableExtendableMessageNano extends e implements Parcelable
{
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.protobuf.nano.android.a.UZ(this.getClass(), this, parcel);
    }
}
