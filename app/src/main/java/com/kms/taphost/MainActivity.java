package com.kms.taphost;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Dog");
        spec.setContent(R.id.dog);
        spec.setIndicator("강아지");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Cat");
        spec.setContent(R.id.cat);
        spec.setIndicator("고양이");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Rabbit");
        spec.setContent(R.id.rabbit);
        spec.setIndicator("토끼");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Horse");
        spec.setContent(R.id.horse);
        spec.setIndicator("말");
        tabHost.addTab(spec);
    }
}
