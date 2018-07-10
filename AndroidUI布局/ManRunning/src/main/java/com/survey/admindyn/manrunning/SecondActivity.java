package com.survey.admindyn.manrunning;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);



        WebView web = (WebView) findViewById(R.id.webfirst);



        WebSettings websets = web.getSettings();

        websets.setJavaScriptEnabled(true);

        websets.setUseWideViewPort(true);

        websets.setLoadWithOverviewMode(true);

        websets.setCacheMode(WebSettings.LOAD_NO_CACHE);


        web.loadUrl("http://192.168.3.127:63342/Views/test.html");




    }
    protected void hideKeyboard() {

        EditText textV = (EditText) findViewById(R.id.urlinput);
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive()) {

            textV.requestFocus();

            System.out.println("软键盘被弹出------");


            if (textV.getWindowToken() != null) {
                System.out.println("软键盘因为谁获取焦点被弹出------");

                imm.hideSoftInputFromWindow(textV.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }

    public void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setTitle("title");
        builder.setMessage("message");
        builder.setPositiveButton("确定", null);
        builder.setNegativeButton("取消", null);
        AlertDialog dia = builder.create();
        // show(getFragmentManager(),"tag");
        dia.show();

    }
    @Override
    protected  void onStart (){
        super.onStart();


        EditText textV = (EditText) findViewById(R.id.urlinput);

        Button btn1 = (Button)findViewById(R.id.button1);

        Button btn3 = (Button)findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WebView web = (WebView) findViewById(R.id.webfirst);

                web.loadUrl("http://192.168.3.127:63342/Views/test.html");


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


        //textV.setFocusable(true);
        // textV.setFocusableInTouchMode(true);
        // textV.setText("请输入网址");
        //textV.clearFocus();

        textV.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText _v = (EditText)v;
                if(!hasFocus)
                {
                    _v.setHint("美女");

                }
                else
                {


                    _v.setHint("野兽");
                }
            }
        });

        TextView v = new TextView(getApplicationContext());
        v.setFocusable(true);
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.clearFocus();
//
//        hideKeyboard();
//
//       InputMethodManager imm = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
//       imm.hideSoftInputFromWindow(textV.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
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

        hideKeyboard();
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