.class Landroid/support/v4/app/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private acf:Landroid/view/ViewTreeObserver;

.field private final mRunnable:Ljava/lang/Runnable;

.field private final mView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Landroid/support/v4/app/ak;->mView:Landroid/view/View;

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ak;->acf:Landroid/view/ViewTreeObserver;

    .line 44
    iput-object p2, p0, Landroid/support/v4/app/ak;->mRunnable:Ljava/lang/Runnable;

    .line 45
    return-void
.end method

.method public static anV(Landroid/view/View;Ljava/lang/Runnable;)Landroid/support/v4/app/ak;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Landroid/support/v4/app/ak;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/app/ak;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 58
    return-object v0
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Landroid/support/v4/app/ak;->removeListener()V

    .line 64
    iget-object v0, p0, Landroid/support/v4/app/ak;->mRunnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 65
    const/4 v0, 0x1

    return v0
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ak;->acf:Landroid/view/ViewTreeObserver;

    .line 84
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 88
    invoke-virtual {p0}, Landroid/support/v4/app/ak;->removeListener()V

    .line 89
    return-void
.end method

.method public removeListener()V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Landroid/support/v4/app/ak;->acf:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    iget-object v0, p0, Landroid/support/v4/app/ak;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 78
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/ak;->mView:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 79
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/ak;->acf:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0
.end method
