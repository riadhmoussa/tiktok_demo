package com.app.tiktok.di;

import android.content.Context;
import com.app.tiktok.mock.Mock;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MockModule_ProvidesMockDependencyFactory implements Factory<Mock> {
  private final Provider<Context> contextProvider;

  public MockModule_ProvidesMockDependencyFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Mock get() {
    return providesMockDependency(contextProvider.get());
  }

  public static MockModule_ProvidesMockDependencyFactory create(Provider<Context> contextProvider) {
    return new MockModule_ProvidesMockDependencyFactory(contextProvider);
  }

  public static Mock providesMockDependency(Context context) {
    return Preconditions.checkNotNull(MockModule.INSTANCE.providesMockDependency(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
