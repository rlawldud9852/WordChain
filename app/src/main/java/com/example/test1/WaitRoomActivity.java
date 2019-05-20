package com.example.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class WaitRoomActivity extends AppCompatActivity {

    Button btnReady, btnStart, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReady=findViewById(R.id.btnReady);
        btnStart=findViewById(R.id.btnStart);
        btnExit=findViewById(R.id.btnExit);



    }
}
