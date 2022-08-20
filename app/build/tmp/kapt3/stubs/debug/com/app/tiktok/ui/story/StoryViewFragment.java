package com.app.tiktok.ui.story;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.app.tiktok.R;
import com.app.tiktok.app.MyApp;
import com.app.tiktok.model.StoriesDataModel;
import com.app.tiktok.ui.main.viewmodel.MainViewModel;
import com.app.tiktok.utils.*;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import kotlinx.android.synthetic.main.layout_story_view.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/app/tiktok/ui/story/StoryViewFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cacheDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/cache/CacheDataSourceFactory;", "playerCallback", "Lcom/google/android/exoplayer2/Player$EventListener;", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "simplePlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "storiesDataModel", "Lcom/app/tiktok/model/StoriesDataModel;", "storyUrl", "", "toPlayVideoPosition", "", "viewModel", "Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "getViewModel", "()Lcom/app/tiktok/ui/main/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getPlayer", "onDestroy", "", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pauseVideo", "playVideo", "prepareMedia", "linkUrl", "prepareVideoPlayer", "releasePlayer", "restartVideo", "setArtwork", "drawable", "Landroid/graphics/drawable/Drawable;", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "setData", "Companion", "app_debug"})
public final class StoryViewFragment extends androidx.fragment.app.Fragment {
    private java.lang.String storyUrl;
    private com.app.tiktok.model.StoriesDataModel storiesDataModel;
    private com.google.android.exoplayer2.SimpleExoPlayer simplePlayer;
    private com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory cacheDataSourceFactory;
    private final com.google.android.exoplayer2.upstream.cache.SimpleCache simpleCache = null;
    private int toPlayVideoPosition = -1;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.google.android.exoplayer2.Player.EventListener playerCallback = null;
    public static final com.app.tiktok.ui.story.StoryViewFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.tiktok.ui.main.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void prepareVideoPlayer() {
    }
    
    private final com.google.android.exoplayer2.SimpleExoPlayer getPlayer() {
        return null;
    }
    
    private final void prepareMedia(java.lang.String linkUrl) {
    }
    
    private final void setArtwork(android.graphics.drawable.Drawable drawable, com.google.android.exoplayer2.ui.PlayerView playerView) {
    }
    
    private final void playVideo() {
    }
    
    private final void restartVideo() {
    }
    
    private final void pauseVideo() {
    }
    
    private final void releasePlayer() {
    }
    
    public StoryViewFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/tiktok/ui/story/StoryViewFragment$Companion;", "", "()V", "newInstance", "Lcom/app/tiktok/ui/story/StoryViewFragment;", "storiesDataModel", "Lcom/app/tiktok/model/StoriesDataModel;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.tiktok.ui.story.StoryViewFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.app.tiktok.model.StoriesDataModel storiesDataModel) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}