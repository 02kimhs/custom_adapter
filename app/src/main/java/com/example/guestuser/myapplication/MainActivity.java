package com.example.guestuser.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<HashMap<String, String >> Data = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> input1 = new HashMap<String, String>();
    HashMap<String, String> input2 = new HashMap<String, String>();

    ListView listView;
    Toast toast;
    String speedview2;

    List bus = new List(30);
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        input1.put("이름", "김현수");
        input1.put("설명", "설명");
        Data.add(input1);

        input2.put("이름", "김현수");
        input2.put("설명", "설명");
        Data.add(input2);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, Data, android.R.layout.simple_list_item_2,
                new String[]{"이름", "설명"}, new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(simpleAdapter);

        bus.speedUp();
        bus.speedUp();
        bus.speedDown();
        bus.Break();


        button = findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1){
            if(toast != null){
                toast.cancel();
            }
            speedview2 = String.valueOf(bus.speed_a);
            Toast.makeText(getApplicationContext(),speedview2,Toast.LENGTH_SHORT).show();
        }
    }
}


