.class Landroid/support/v4/app/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic aaP:I

.field final synthetic aaQ:Ljava/util/ArrayList;

.field final synthetic aaR:Ljava/util/ArrayList;

.field final synthetic aaS:Ljava/util/ArrayList;

.field final synthetic aaT:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 343
    iput p1, p0, Landroid/support/v4/app/X;->aaP:I

    iput-object p2, p0, Landroid/support/v4/app/X;->aaS:Ljava/util/ArrayList;

    iput-object p3, p0, Landroid/support/v4/app/X;->aaT:Ljava/util/ArrayList;

    iput-object p4, p0, Landroid/support/v4/app/X;->aaQ:Ljava/util/ArrayList;

    iput-object p5, p0, Landroid/support/v4/app/X;->aaR:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 346
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget v0, p0, Landroid/support/v4/app/X;->aaP:I

    if-lt v2, v0, :cond_0

    .line 350
    return-void

    .line 347
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/X;->aaS:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/X;->aaT:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Landroid/support/v4/app/X;->aaQ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/X;->aaR:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 346
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method
