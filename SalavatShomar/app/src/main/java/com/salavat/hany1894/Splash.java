package com.salavat.hany1894;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Intent Intent = new Intent(Splash.this,SalavatShomar.class);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                startActivity(Intent);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}
