.class public final Lcom/google/android/gms/location/internal/FusedLocationProviderResult;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field public static final Ci:Lcom/google/android/gms/location/internal/FusedLocationProviderResult;


# instance fields
.field private final Cg:Lcom/google/android/gms/common/api/Status;

.field private final Ch:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->hn:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, v1}, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;-><init>(Lcom/google/android/gms/common/api/Status;)V

    sput-object v0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->Ci:Lcom/google/android/gms/location/internal/FusedLocationProviderResult;

    new-instance v0, Lcom/google/android/gms/location/internal/l;

    invoke-direct {v0}, Lcom/google/android/gms/location/internal/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->Ch:I

    iput-object p2, p0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->Cg:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;-><init>(ILcom/google/android/gms/common/api/Status;)V

    return-void
.end method


# virtual methods
.method public Ga()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->Ch:I

    return v0
.end method

.method public gV()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/FusedLocationProviderResult;->Cg:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/internal/l;->Gy(Lcom/google/android/gms/location/internal/FusedLocationProviderResult;Landroid/os/Parcel;I)V

    return-void
.end method
