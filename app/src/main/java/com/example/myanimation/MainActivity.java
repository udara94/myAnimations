package com.example.myanimation;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void openActivity2(View view) {
        Log.d("Finished","kissodji");
       // Intent intent = new Intent(this, Activity2.class);
        startActivity(new Intent(this,Activity2.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }





}
