package com.arhiser.mvp.main.component;

import com.arhiser.mvp.main.presenter.IMainPresenter;
import com.arhiser.mvp.main.presenter.MainPresenter;
import com.arhiser.mvp.main.view.IMainView;
import com.arhiser.mvp.main.view.MainFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    MainPresenter presenter;
    MainFragment mainFragment;

    public MainModule() {
        presenter = new MainPresenter();
        mainFragment = new MainFragment();
    }

    @Provides
    @Singleton
    public IMainPresenter providePresenterInterface() {
        return presenter;
    }

    @Provides
    @Singleton
    public IMainView provideView() {
        return mainFragment;
    }

    @Provides
    @Singleton
    public MainFragment provideFragment() {
        return mainFragment;
    }

    @Provides
    @Singleton
    public MainPresenter providePresenter() {
        return presenter;
    }
}
