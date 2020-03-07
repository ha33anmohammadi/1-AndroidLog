package com.example.a1_androidlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // public static final String TAG = "AndroidLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
       // Log.d(TAG, "Hello D Log"); inja az tag error migire chon comment shode

        Log.i(app.main.TAG, "Hello I Log");

        Log.e(app.main.TAG, "Hello E Log");
        */


        app.log("Test"); //in ravesh nesbate b khate haye bala sari tar hast

       // Toast.makeText(this,"Message",Toast.LENGTH_LONG).show();

        app.Toast(this,"hello");
    }
}
