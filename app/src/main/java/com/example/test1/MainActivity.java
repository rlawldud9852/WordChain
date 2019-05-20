package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCreateRoom, btnjoinRoom,btnNickname;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateRoom=(Button)findViewById(R.id.btnCreateRoom);
        btnjoinRoom=(Button)findViewById(R.id.btnJoinRoom);
        btnNickname=(Button)findViewById(R.id.btnNickname);

        btnCreateRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 =new Intent(getApplicationContext(),CreateRoomActivity.class);
                startActivity(intent2);

            }
        });

        btnjoinRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 =new Intent(getApplicationContext(),JoinRoomActivity.class);
                startActivity(intent1);

            }
        });



    }
}
