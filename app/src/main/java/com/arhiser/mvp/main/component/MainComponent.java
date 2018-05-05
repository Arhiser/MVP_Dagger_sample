package com.arhiser.mvp.main.component;

import com.arhiser.mvp.MainActivity;
import com.arhiser.mvp.main.presenter.MainPresenter;
import com.arhiser.mvp.main.view.MainFragment;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {MainModule.class})
@Singleton
public interface MainComponent {

    void inject(MainPresenter presenter);
    void inject(MainFragment view);
    void inject(MainActivity mainActivity);
}
