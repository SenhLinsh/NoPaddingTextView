package com.linsh.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onClick(View view) {
        int layout = 0;
        switch (index) {
            case 1:
                layout = R.layout.activity_main2;
                break;
            case 2:
                layout = R.layout.activity_main3;
                break;
            case 3:
                layout = R.layout.activity_main4;
                break;
            case 4:
                layout = R.layout.activity_main5;
                break;
            case 5:
                layout = R.layout.activity_main6;
                break;
        }
        if (layout != 0)
            setContentView(layout);
        index++;
    }
}
