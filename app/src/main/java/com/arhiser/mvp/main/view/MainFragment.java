package com.arhiser.mvp.main.view;

import android.support.v4.app.Fragment;

import com.arhiser.mvp.main.presenter.IMainPresenter;

import javax.inject.Inject;

public class MainFragment extends Fragment implements IMainView {

    @Inject
    IMainPresenter presenter;

    public static MainFragment getInstance() {
        return new MainFragment();
    }

}
