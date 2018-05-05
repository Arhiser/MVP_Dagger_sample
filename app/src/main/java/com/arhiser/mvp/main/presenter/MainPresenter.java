package com.arhiser.mvp.main.presenter;

import com.arhiser.mvp.main.view.IMainView;

import javax.inject.Inject;

public class MainPresenter implements IMainPresenter {

    @Inject
    IMainView view;

    public MainPresenter() {

    }
}
