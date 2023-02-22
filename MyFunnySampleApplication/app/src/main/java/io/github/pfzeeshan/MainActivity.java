package io.github.pfzeeshan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.github.funnylibrary.FunnyMainClass;

import com.sp.myfunnysampleapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FunnyMainClass mainClass = new FunnyMainClass();
        mainClass.MainFunction(this,10,15);
    }
}