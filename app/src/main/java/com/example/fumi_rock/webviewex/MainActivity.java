package com.example.fumi_rock.webviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTab();
    }

    protected void initTab() {
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec spec ;

        //Tab1
        spec = tabHost.newTabSpec("tab1")
                .setIndicator("HOME")
                .setContent(R.id.tab1);
        tabHost.addTab(spec);

        //Tab2
        spec = tabHost.newTabSpec("tab2")
                .setIndicator("検索")
                .setContent(R.id.tab2);
        tabHost.addTab(spec);

        //Tab3
        spec = tabHost.newTabSpec("MAP")
                .setIndicator("WEB")
                .setContent(R.id.tab3);
        tabHost.addTab(spec);
    }
}
