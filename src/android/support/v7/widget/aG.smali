.class Landroid/support/v7/widget/aG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field final synthetic Ut:Landroid/support/v7/widget/FastScroller;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/FastScroller;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Landroid/support/v7/widget/aG;->Ut:Landroid/support/v7/widget/FastScroller;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/FastScroller;Landroid/support/v7/widget/ab;)V
    .locals 0

    .prologue
    .line 576
    invoke-direct {p0, p1}, Landroid/support/v7/widget/aG;-><init>(Landroid/support/v7/widget/FastScroller;)V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .prologue
    .line 580
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 581
    iget-object v1, p0, Landroid/support/v7/widget/aG;->Ut:Landroid/support/v7/widget/FastScroller;

    invoke-static {v1}, Landroid/support/v7/widget/FastScroller;->acd(Landroid/support/v7/widget/FastScroller;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/StateListDrawable;->setAlpha(I)V

    .line 582
    iget-object v1, p0, Landroid/support/v7/widget/aG;->Ut:Landroid/support/v7/widget/FastScroller;

    invoke-static {v1}, Landroid/support/v7/widget/FastScroller;->abP(Landroid/support/v7/widget/FastScroller;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 583
    iget-object v0, p0, Landroid/support/v7/widget/aG;->Ut:Landroid/support/v7/widget/FastScroller;

    invoke-static {v0}, Landroid/support/v7/widget/FastScroller;->abU(Landroid/support/v7/widget/FastScroller;)V

    .line 584
    return-void
.end method
