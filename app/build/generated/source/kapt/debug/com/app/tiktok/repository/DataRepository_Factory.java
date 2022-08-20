package com.app.tiktok.repository;

import com.app.tiktok.mock.Mock;
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
public final class DataRepository_Factory implements Factory<DataRepository> {
  private final Provider<Mock> mockProvider;

  public DataRepository_Factory(Provider<Mock> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public DataRepository get() {
    return newInstance(mockProvider.get());
  }

  public static DataRepository_Factory create(Provider<Mock> mockProvider) {
    return new DataRepository_Factory(mockProvider);
  }

  public static DataRepository newInstance(Mock mock) {
    return new DataRepository(mock);
  }
}
