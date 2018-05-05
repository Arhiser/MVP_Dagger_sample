package com.arhiser.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arhiser.mvp.main.component.DaggerMainComponent;
import com.arhiser.mvp.main.component.MainComponent;
import com.arhiser.mvp.main.component.MainModule;
import com.arhiser.mvp.main.presenter.MainPresenter;
import com.arhiser.mvp.main.view.MainFragment;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainFragment fragment;

    @Inject
    MainPresenter presenter;

    MainComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = createMainComponent();
        component.inject(this);
        component.inject(presenter);
        component.inject(fragment);
    }

    private MainComponent createMainComponent() {
        return DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build();
    }

}
