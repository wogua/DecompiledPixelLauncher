.class public final Lcom/google/android/gms/internal/aH;
.super Ljava/lang/Object;


# static fields
.field public static final sP:[Ljava/lang/String;

.field public static final sQ:[D

.field public static final sR:[F

.field public static final sS:[[B

.field public static final sT:[Z

.field public static final sU:[I

.field public static final sV:[J

.field public static final sW:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/aH;->sU:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/aH;->sV:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/aH;->sR:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/aH;->sQ:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/aH;->sT:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/aH;->sP:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/aH;->sS:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/aH;->sW:[B

    return-void
.end method

.method public static vi(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method

.method public static final vj(Lcom/google/android/gms/internal/aY;I)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aY;->xK()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aY;->xU(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aY;->xF()I

    move-result v2

    if-eq v2, p1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/aY;->xY(I)V

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aY;->xU(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static vk(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method static vl(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static vm(Lcom/google/android/gms/internal/aY;I)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aY;->xU(I)Z

    move-result v0

    return v0
.end method
