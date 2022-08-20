package com.app.tiktok.ui.main.viewmodel;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.app.tiktok.model.ResultData;
import com.app.tiktok.model.StoriesDataModel;
import com.app.tiktok.repository.DataRepository;
import kotlinx.coroutines.Dispatchers;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/app/tiktok/repository/DataRepository;", "(Lcom/app/tiktok/repository/DataRepository;)V", "getDataList", "Landroidx/lifecycle/LiveData;", "Lcom/app/tiktok/model/ResultData;", "Ljava/util/ArrayList;", "Lcom/app/tiktok/model/StoriesDataModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.app.tiktok.repository.DataRepository dataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.app.tiktok.model.ResultData<java.util.ArrayList<com.app.tiktok.model.StoriesDataModel>>> getDataList() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.app.tiktok.repository.DataRepository dataRepository) {
        super();
    }
}