package com.example.tanveer.assignment_fragment;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        Fragment_1 frag =new Fragment_1();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment_1()).commit();

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==button1.getId())
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment_1()).commit();

        }
        else
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment_2()).commit();
        }

    }
}
