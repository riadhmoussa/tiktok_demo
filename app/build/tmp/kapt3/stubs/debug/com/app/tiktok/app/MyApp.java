package com.app.tiktok.app;

import android.app.Application;
import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.ExoDatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import dagger.hilt.android.HiltAndroidApp;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/app/tiktok/app/MyApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MyApp extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static com.google.android.exoplayer2.upstream.cache.SimpleCache simpleCache;
    @org.jetbrains.annotations.Nullable()
    private static android.content.Context context;
    public static final com.app.tiktok.app.MyApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MyApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/app/tiktok/app/MyApp$Companion;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "getSimpleCache", "()Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "setSimpleCache", "(Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.exoplayer2.upstream.cache.SimpleCache getSimpleCache() {
            return null;
        }
        
        public final void setSimpleCache(@org.jetbrains.annotations.Nullable()
        com.google.android.exoplayer2.upstream.cache.SimpleCache p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        private Companion() {
            super();
        }
    }
}