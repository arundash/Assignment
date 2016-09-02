package com.example.arun.rncryptornative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public native byte[] encrypt(String raw,String password);
    public native String  decrypt(String encrypted,String password);

static {
    System.loadLibrary("rncryptor-native");
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        byte[] arr=encrypt("hello","pass");

        Toast.makeText(getApplicationContext(),"-----"+arr[0]+arr[1],Toast.LENGTH_SHORT).show();

        //decrypt(encrypted,password);
    }
}
