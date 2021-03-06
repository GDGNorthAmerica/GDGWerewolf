package com.gdg.jamescha.gdgwerewolf;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class WhoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new WhoFragment())
                    .commit();
        }
    }
}
