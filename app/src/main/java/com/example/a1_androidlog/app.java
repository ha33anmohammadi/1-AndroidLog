package com.example.a1_androidlog;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class app {

    public static class main{

        public static final String TAG="Android Log ";

    }

    public static void log(String message){

        Log.e(main.TAG,message);

    }

    public static void Toast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();

    }

}

