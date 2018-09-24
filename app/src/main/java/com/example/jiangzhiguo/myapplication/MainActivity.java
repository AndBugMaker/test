package com.example.jiangzhiguo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.java_websocket.client.WebSocketClient;

public class MainActivity extends AppCompatActivity {
    private WebSocketClient webSocketClient = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyBottomSheetDialog().show(getSupportFragmentManager(),"tag");
    }

}
