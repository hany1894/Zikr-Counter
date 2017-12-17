package com.salavat.hany1894;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
       final Intent main=new Intent(help.this,SalavatShomar.class);
        Button BTNOK =(Button)findViewById(R.id.ok);
        BTNOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(main);
                finish();
            }
        });
    }

}
