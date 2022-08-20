package com.app.tiktok.ui.main.viewmodel;

import com.app.tiktok.repository.DataRepository;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<DataRepository> dataRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<DataRepository> dataRepositoryProvider) {
    this.dataRepositoryProvider = dataRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(dataRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<DataRepository> dataRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(dataRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(Provider<DataRepository> dataRepository) {
    return new MainViewModel_AssistedFactory(dataRepository);
  }
}
