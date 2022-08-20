package com.app.tiktok.ui.main.activity;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.app.tiktok.R;
import com.app.tiktok.base.BaseActivity;
import com.app.tiktok.ui.main.viewmodel.MainViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.activity_main.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/app/tiktok/ui/main/activity/MainActivity;", "Lcom/app/tiktok/base/BaseActivity;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "()V", "homeViewModel", "Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "getHomeViewModel", "()Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestinationChanged", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.app.tiktok.base.BaseActivity implements androidx.navigation.NavController.OnDestinationChangedListener {
    private final kotlin.Lazy homeViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.tiktok.ui.main.viewmodel.MainViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestinationChanged(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController controller, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDestination destination, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
    }
    
    public MainActivity() {
        super();
    }
}