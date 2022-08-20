package com.app.tiktok.ui.home.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.work.Data;
import androidx.work.WorkManager;
import com.app.tiktok.R;
import com.app.tiktok.base.BaseFragment;
import com.app.tiktok.model.ResultData;
import com.app.tiktok.model.StoriesDataModel;
import com.app.tiktok.ui.home.adapter.StoriesPagerAdapter;
import com.app.tiktok.ui.main.viewmodel.MainViewModel;
import com.app.tiktok.utils.Constants;
import com.app.tiktok.work.PreCachingService;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.fragment_home.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J \u0010\u0011\u001a\u00020\f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/app/tiktok/ui/home/fragment/HomeFragment;", "Lcom/app/tiktok/base/BaseFragment;", "()V", "homeViewModel", "Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "getHomeViewModel", "()Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "storiesPagerAdapter", "Lcom/app/tiktok/ui/home/adapter/StoriesPagerAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "startPreCaching", "dataList", "Ljava/util/ArrayList;", "Lcom/app/tiktok/model/StoriesDataModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.app.tiktok.base.BaseFragment {
    private final kotlin.Lazy homeViewModel$delegate = null;
    private com.app.tiktok.ui.home.adapter.StoriesPagerAdapter storiesPagerAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.tiktok.ui.main.viewmodel.MainViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startPreCaching(java.util.ArrayList<com.app.tiktok.model.StoriesDataModel> dataList) {
    }
    
    public HomeFragment() {
        super(0);
    }
}