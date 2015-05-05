package com.fragments.justus.moringatimes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.github.clans.fab.FloatingActionButton;


public class Main extends Activity {
     FloatingActionButton soldier1;
    FloatingActionButton soldier2;
    FloatingActionButton soldier3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        soldier1 = (FloatingActionButton)findViewById(R.id.menu_item);
        soldier2 = (FloatingActionButton)findViewById(R.id.menu_item1);
        soldier3 = (FloatingActionButton)findViewById(R.id.menu_item2);
        soldier1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveNext = new Intent(Main.this, Info.class);
                startActivity(moveNext);
            }
        });

        soldier2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveNext = new Intent(Main.this, Info.class);
                startActivity(moveNext);
            }
        });

        soldier3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveNext = new Intent(Main.this, Info.class);
                startActivity(moveNext);
            }
        });


    }


}
