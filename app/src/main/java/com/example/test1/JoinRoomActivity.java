package com.example.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class JoinRoomActivity extends AppCompatActivity {

    ListView JoinRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        JoinRoom=(ListView)findViewById(R.id.JoinRoom);

        JoinRoom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=(String)JoinRoom.getItemAtPosition(position);
            }
        });


    }
}
