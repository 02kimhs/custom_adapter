package com.example.guestuser.myapplication;

import android.util.Log;

public class List {

    int speed_a;
    int wheel = 4;
    int seat = 5;
    String speedview;

    List(int speed_b){
        speed_a = speed_b;
    }

    void speedUp(){
        speed_a = speed_a + 5;
         speedview = String.valueOf(speed_a);
        Log.d("tag", speedview);
    }

    void speedDown(){
        speed_a = speed_a - 5;
         speedview= String.valueOf(speed_a);
         Log.d("tag", speedview);
    }

    void Break(){
        speed_a = 0;
        speedview  = String.valueOf(speed_a);
        Log.d("tag", speedview);
    }


}
