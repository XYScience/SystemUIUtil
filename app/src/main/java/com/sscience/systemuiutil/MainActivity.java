package com.sscience.systemuiutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private boolean statusBar = true, navigationBar = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_statusBar:
                SystemUIUtil.setStatusBarStyle(this, statusBar);
                statusBar = !statusBar;
                break;
            case R.id.btn_navigationBar:
                SystemUIUtil.setNavigationStyle(this, navigationBar);
                navigationBar = !navigationBar;
                break;
        }
    }

}
