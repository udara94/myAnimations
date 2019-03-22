package com.example.myanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 extends AppCompatActivity {


char[] notearr={};
String noteName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

//    public void openActivity3(View view) {
//        Intent intent = new Intent(this, Activity3.class);
//        startActivity(intent);
//    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    public void ButtonClicked(View v){
       int id= v.getId();

        EditText notes=(EditText)findViewById(R.id.editText);

       String name= notes.getText().toString();
        Log.d("Finished",name);

        switch (id){

            case R.id.btnA:
                Log.d("Finished","A");
                noteName=name+"A";
                notes.setText(noteName, TextView.BufferType.EDITABLE);

                break;


            case R.id.btnB:
                Log.d("Finished","B");
                noteName=name+"B";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnC:
                Log.d("Finished","C");
                noteName=name+"C";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;

            case R.id.btnD:
                Log.d("Finished","D");
                noteName=name+"D";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnE:
                Log.d("Finished","E");
                noteName=name+"E";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnF:
                Log.d("Finished","F");
                noteName=name+"F";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnG:
                Log.d("Finished","G");
                noteName=name+"G";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;



        }
    }


    public void Play(View v){

        notearr=noteName.toCharArray();
        Log.d("Finished", Arrays.toString(notearr));

        String singlenote;
        //super.finish();
        for (int i=0;i<notearr.length;i++){
            
        }
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


}
