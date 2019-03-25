package com.example.myanimation;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.DialogInterface;
import  android.widget.Toast;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.Manifest;
import android.content.pm.PackageManager;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
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

    public void playC(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mCSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playD(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mDSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playE(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mESoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playF(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mFSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playG(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mGSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playA(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mASoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }
    public void playB(View v){
        Log.d("Xylaphone","played");
        mSoundPool.play(mBSoundId,LEFT_VOLUME, RIGHT_VOLUME,PRIORITY, NO_LOOP, NORMAL_PLAY_RATE  );
    }


    public void openActivity2(View view) {
        Log.d("Finished","kissodji");
       // Intent intent = new Intent(this, Activity2.class);
        startActivity(new Intent(this,Activity2.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }





}
