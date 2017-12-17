package com.salavat.hany1894;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import java.util.Calendar;
///////imports for menu
import java.lang.Boolean;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
public class SalavatShomar extends AppCompatActivity {
    Calendar rightNow = Calendar.getInstance();
    final int today =rightNow.get(Calendar.DAY_OF_WEEK);
    Boolean iszahra;
    int counter;
    @Override
    //////Start of menu shit/////////////////////
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    final Context con=getApplicationContext();

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.go_main:
                 Toast tost = Toast.makeText(con,"شما در صفحه اصلی می باشید",Toast.LENGTH_SHORT);
                tost.show();
                ////go main
                return true;
            case R.id.go_book:

                //////Adeeye
                return true;
            case R.id.help:
                Intent navhelp = new Intent(SalavatShomar.this,help.class);
                Toast tst = Toast.makeText(con,"راهنما",Toast.LENGTH_SHORT);
                tst.show();
                startActivity(navhelp);
                /////help
                return true;
            case R.id.about:
                /////about
                return true;
            case R.id.exit:
                Toast byby = Toast.makeText(con,"در پناه حق",Toast.LENGTH_SHORT);
                byby.show();
                ////exit
                finish();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //////End of menu shit/////////////////////
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salavat_shomar);
        counter=0;

        final int toastshort=Toast.LENGTH_SHORT;
        final int toastlong=Toast.LENGTH_SHORT;
        final String archive34="شما قسمت اول را به پایان رساندید";
        final String archive67="شما قسمت دوم را به پایان رساندید";
        final String archive100="شما یک دور را به پایان رساندید";
        final LinearLayout rooz =(LinearLayout)findViewById(R.id.rooz);
        final String Hisdel="سابقه پاک شد";
        iszahra=false;
        final TextView bar= (TextView)findViewById(R.id.Xbar);
        final TextView zikr=(TextView)findViewById(R.id.zekr);
        final TextView day=(TextView)findViewById(R.id.today);
        final TextView Number= (TextView)findViewById(R.id.resultText);
        final Button change =(Button)findViewById(R.id.button_select);
        Button plus = (Button)findViewById(R.id.button_plus);
        Button minus = (Button)findViewById(R.id.button_minus);

        change.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                counter=0;
                Number.setText(Integer.toString(counter));
                iszahra=!iszahra;
            if (iszahra==true){
                zikr.setText("الله اکبر");
                bar.setText("سی و چهار مرتبه");
                rooz.setVisibility(View.INVISIBLE);
                change.setText("ذکر روز");
            }
                if (iszahra==false) {
                    rooz.setVisibility(View.VISIBLE);
                change.setText("تسبیحات حضرت زهرا (س)");
                    bar.setText("صد مرتبه");
                switch (today) {
                    case Calendar.SATURDAY:
                        day.setText("شنبه");
                        zikr.setText("یا رب العالمین");
                        break;
                    case Calendar.SUNDAY:
                        day.setText("یک شنبه");
                        zikr.setText("یا ذوالجلال و الکرام");
                        break;
                    case Calendar.MONDAY:
                        day.setText("دوشنبه");
                        zikr.setText("یا قاضی الحاجات");
                        break;
                    case Calendar.TUESDAY:
                        day.setText("سه شنبه");
                        zikr.setText("یا الرحمن الراحمین");
                        break;
                    case Calendar.WEDNESDAY:
                        day.setText("چهار شنبه");
                        zikr.setText("یا حی و یا قیوم");
                        break;
                    case Calendar.THURSDAY:
                        day.setText("پنج شنبه");
                        zikr.setText("لا اله الا الله الملک الحق المبین");
                        break;
                    case Calendar.FRIDAY:
                        day.setText("جمعه");
                        zikr.setText("الهم صلی علی محمد و آل محمد");
                        break;
                }
            }



            }});

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
       counter++;
        Number.setText(Integer.toString(counter));
            if (iszahra==true){
             switch (counter){
                 case 1 : {
                     zikr.setText("الله اکبر");
                     bar.setText("سی و چهار مرتبه");
                     break;
                 }
                 case 34:{
                     zikr.setText("الحمد لله");
                     bar.setText("سی و سه مرتبه");
                     Toast tost=Toast.makeText(con , archive34 ,toastshort);
                     tost.show();
                     break;
                 }

                 case 67:{
                     zikr.setText("سبحان الله");
                     bar.setText("سی و سه مرتبه");
                     Toast tost=Toast.makeText(con , archive67 , toastshort);
                     tost.show();
                     break;
                 }
                 case 100:{
                     Toast tost=Toast.makeText(con, archive100 ,toastlong);
                     tost.show();
                     break;
                 }
                 case 101:{
                     rooz.setVisibility(View.VISIBLE);
                     counter=0;
                     Number.setText(Integer.toString(counter));
                     bar.setText("صد مرتبه");
                     change.setText("تسبیحات حضرت زهرا (س)");
                     switch (today) {
                         case Calendar.SATURDAY:
                             day.setText("شنبه");
                             zikr.setText("یا رب العالمین");
                             break;
                         case Calendar.SUNDAY:
                             day.setText("یک شنبه");
                             zikr.setText("یا ذوالجلال و الکرام");
                             break;
                         case Calendar.MONDAY:
                             day.setText("دوشنبه");
                             zikr.setText("یا قاضی الحاجات");
                             break;
                         case Calendar.TUESDAY:
                             day.setText("سه شنبه");
                             zikr.setText("یا الرحمن الراحمین");
                             break;
                         case Calendar.WEDNESDAY:
                             day.setText("چهار شنبه");
                             zikr.setText("یا حی و یا قیوم");
                             break;
                         case Calendar.THURSDAY:
                             day.setText("پنج شنبه");
                             zikr.setText("لا اله الا الله الملک الحق المبین");
                             break;
                         case Calendar.FRIDAY:
                             day.setText("جمعه");
                             zikr.setText("الهم صلی علی محمد و آل محمد");
                             break;
                     }


                 }

             }
            }

                                        }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter--;
                if (counter<0){
                counter=0;
                }
                    Number.setText(Integer.toString(counter));

            }
        });
        plus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if (counter<34 && iszahra==true)
                {counter = 34;
                    zikr.setText("الحمد للله");
                    bar.setText("سی و سه مرتبه");
                    Number.setText(Integer.toString(counter));
                    Toast tost=Toast.makeText(con,"شما یک قسمت به جلو رفتید",toastshort);
                    tost.show();
                }
                else if (counter<67 && iszahra==true) {
                   counter=67;
                    zikr.setText("سبحان الله");
                    bar.setText("سی و سه مرتبه");
                    Number.setText(Integer.toString(counter));
                    Toast tost=Toast.makeText(con,"شما یک قسمت به جلو رفتید",toastshort);
                    tost.show();
                }

                return true;
            }
        });
        minus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (counter!=0)
                {counter = 0;
                Number.setText(Integer.toString(counter));
                 Toast tost=Toast.makeText(con, Hisdel ,toastlong);
                    tost.show();
                }
                else {
                    Toast tost=Toast.makeText(con,"سابقه پاک است",toastlong);
                    tost.show();
                }
                return true;
            }
        });

        if (iszahra==false) {
            rooz.setVisibility(View.VISIBLE);
            switch (today) {
                case Calendar.SATURDAY:
                    day.setText("شنبه");
                    zikr.setText("یا رب العالمین");
                    break;
                case Calendar.SUNDAY:
                    day.setText("یک شنبه");
                    zikr.setText("یا ذوالجلال و الکرام");
                    break;
                case Calendar.MONDAY:
                    day.setText("دوشنبه");
                    zikr.setText("یا قاضی الحاجات");
                    break;
                case Calendar.TUESDAY:
                    day.setText("سه شنبه");
                    zikr.setText("یا الرحمن الراحمین");
                    break;
                case Calendar.WEDNESDAY:
                    day.setText("چهار شنبه");
                    zikr.setText("یا حی و یا قیوم");
                    break;
                case Calendar.THURSDAY:
                    day.setText("پنج شنبه");
                    zikr.setText("لا اله الا الله الملک الحق المبین");
                    break;
                case Calendar.FRIDAY:
                    day.setText("جمعه");
                    break;
            }
        }
    }
}
