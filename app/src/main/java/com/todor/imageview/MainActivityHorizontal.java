package com.todor.imageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivityHorizontal extends AppCompatActivity {

    private ListView listViewMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_horizontal);

        listViewMenu = (ListView) findViewById(R.id.listViewMenu);

    }


}
