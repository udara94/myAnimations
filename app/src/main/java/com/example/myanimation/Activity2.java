package com.example.myanimation;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 extends AppCompatActivity {


    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool mSoundPool;
char[] notearr={};
String noteName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId= mSoundPool.load(getApplicationContext(), R.raw.note1_c,1);
        mDSoundId= mSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
        mESoundId= mSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
        mFSoundId= mSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
        mGSoundId= mSoundPool.load(getApplicationContext(), R.raw.note5_g,1);
        mASoundId= mSoundPool.load(getApplicationContext(), R.raw.note6_a,1);
        mBSoundId= mSoundPool.load(getApplicationContext(), R.raw.note7_b,1);
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
        Log.d("Xylaphone",name);

        switch (id){

            case R.id.btnA:
                Log.d("Xylaphone","A");
                noteName=name+"A";
                notes.setText(noteName, TextView.BufferType.EDITABLE);

                break;


            case R.id.btnB:
                Log.d("Xylaphone","B");
                noteName=name+"B";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnC:
                Log.d("Xylaphone","C");
                noteName=name+"C";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;

            case R.id.btnD:
                Log.d("Xylaphone","D");
                noteName=name+"D";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnE:
                Log.d("Xylaphone","E");
                noteName=name+"E";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnF:
                Log.d("Xylaphone","F");
                noteName=name+"F";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;
            case R.id.btnG:
                Log.d("Xylaphone","G");
                noteName=name+"G";
                notes.setText(noteName, TextView.BufferType.EDITABLE);
                break;

            case R.id.btnNewLine:
                Log.d("Xylaphone","new line");
                noteName=name+"\n";
                notes.setText(noteName, TextView.BufferType.EDITABLE);


        }
    }


    public void Play(View v){

        notearr=noteName.toCharArray();
       //Log.d("Xylaphone", Arrays.toString(notearr));

        String singlenote;
        //super.finish();


        for (int i=0;i<notearr.length;i++){


            String legth=Integer.toString(notearr[i]);
            Log.d("Xylaphone",legth);
            try {
                PlaySound(legth);
                Thread.sleep(500);
            }
           catch (InterruptedException e){
               Log.d("Xylaphone","error");
           }
        }
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public  void PlaySound(String ascii){
        switch (ascii){
            case "65":
                Log.d("Xylaphone","Play 65");
                mSoundPool.play(mASoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "66":
                Log.d("Xylaphone","Play 66");
                mSoundPool.play(mBSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "67":
                Log.d("Xylaphone","Play 67");
                mSoundPool.play(mCSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "68":
                Log.d("Xylaphone","Play 68");
                mSoundPool.play(mDSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "69":
                Log.d("Xylaphone","Play 69");
                mSoundPool.play(mESoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "70":
                Log.d("Xylaphone","Play 70");
                mSoundPool.play(mFSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;
            case "71":
                Log.d("Xylaphone","Play 71");
                mSoundPool.play(mGSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
                break;

        }
    }


}
