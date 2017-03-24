package com.example.other.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity{
        String[] mobileArray = {"Smartphones","Pc","Tablets","Laptops"};
LoginButton loginButton;
    CallbackManager callbackManager;
    TextView textview;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            FacebookSdk.sdkInitialize(getApplicationContext());
            setContentView(R.layout.activity_main);

            callbackManager=CallbackManager.Factory.create();
            loginButton= (LoginButton)findViewById(R.id.fb_login_bn);


            ArrayAdapter adapter = new ArrayAdapter<String>(this,
                    R.layout.activity_listview, mobileArray);

            ListView listView = (ListView) findViewById(R.id.mobile_list);
            listView.setAdapter(adapter);

        }
}

