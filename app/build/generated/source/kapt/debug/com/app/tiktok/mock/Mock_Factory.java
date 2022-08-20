package com.app.tiktok.mock;

import android.content.Context;
import dagger.internal.Factory;
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
public final class Mock_Factory implements Factory<Mock> {
  private final Provider<Context> contextProvider;

  public Mock_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Mock get() {
    return newInstance(contextProvider.get());
  }

  public static Mock_Factory create(Provider<Context> contextProvider) {
    return new Mock_Factory(contextProvider);
  }

  public static Mock newInstance(Context context) {
    return new Mock(context);
  }
}
