package com.example.yukitanaka.customlauncherdemo;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TabHost;
import android.content.res.Resources;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTabs();
    }

    protected void initTabs(){

        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        // Tab1
        intent = new Intent().setClass(this, AppsListActivity.class);
        spec = tabHost.newTabSpec("Tab1").setIndicator(
                "おしゃべり", getResources().getDrawable(android.R.drawable.alert_dark_frame))
                .setContent(intent);
        tabHost.addTab(spec);

        // Tab2
        intent = new Intent().setClass(this, AppsListActivity2.class);
        spec = tabHost.newTabSpec("Tab2").setIndicator(
                "カメラ" , getResources().getDrawable(android.R.drawable.dialog_frame))
                .setContent(intent);
        tabHost.addTab(spec);

        // Tab3
        intent = new Intent().setClass(this, AppsListActivity3.class);
        spec = tabHost.newTabSpec("Tab3").setIndicator(
                "調べもの", getResources().getDrawable(android.R.drawable.dialog_frame))
                .setContent(intent);
        tabHost.addTab(spec);

        // others tab
        intent = new Intent().setClass(this, AppsListActivity_others.class);
        spec = tabHost.newTabSpec("Tab4").setIndicator(
                "その他", getResources().getDrawable(android.R.drawable.dialog_frame))
                .setContent(intent);
        tabHost.addTab(spec);

        // Set Default Tab - zero based index
        tabHost.setCurrentTab(0);

    }



}