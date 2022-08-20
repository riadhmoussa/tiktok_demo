package com.app.tiktok.di;

import com.app.tiktok.mock.Mock;
import com.app.tiktok.repository.DataRepository;
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
public final class RepositoryModule_ProvidesDataRepositoryFactory implements Factory<DataRepository> {
  private final Provider<Mock> mockProvider;

  public RepositoryModule_ProvidesDataRepositoryFactory(Provider<Mock> mockProvider) {
    this.mockProvider = mockProvider;
  }

  @Override
  public DataRepository get() {
    return providesDataRepository(mockProvider.get());
  }

  public static RepositoryModule_ProvidesDataRepositoryFactory create(Provider<Mock> mockProvider) {
    return new RepositoryModule_ProvidesDataRepositoryFactory(mockProvider);
  }

  public static DataRepository providesDataRepository(Mock mock) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.providesDataRepository(mock), "Cannot return null from a non-@Nullable @Provides method");
  }
}
