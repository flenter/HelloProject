package com.wercker.world;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GreetActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.greet, menu);
        return true;
    }

}
