package com.survey.admindyn.manrunning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    protected  void onStart (){
        super.onStart();

        Button submit = (Button) findViewById(R.id.submitB);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logingClick();
            }
        });

    }

    void logingClick(){


        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("hello","what is your name");
        startActivity(intent);

    }



    @Override
    protected  void onRestart ()
    {
        super.onRestart();
    }
    @Override
    protected  void onResume ()
    {
        super.onResume();


    }
    @Override
    protected  void onPause ()
    {
        super.onPause();
    }
    @Override
    protected  void onStop ()
    {
        super.onStop();
    }
    @Override
    protected  void onDestroy ()
    {
        super.onDestroy();
    }
}
