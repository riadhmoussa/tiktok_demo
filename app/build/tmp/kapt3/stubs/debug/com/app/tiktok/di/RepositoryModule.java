package com.app.tiktok.di;

import com.app.tiktok.mock.Mock;
import com.app.tiktok.repository.DataRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/app/tiktok/di/RepositoryModule;", "", "()V", "providesDataRepository", "Lcom/app/tiktok/repository/DataRepository;", "mock", "Lcom/app/tiktok/mock/Mock;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    public static final com.app.tiktok.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.app.tiktok.repository.DataRepository providesDataRepository(@org.jetbrains.annotations.NotNull()
    com.app.tiktok.mock.Mock mock) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}