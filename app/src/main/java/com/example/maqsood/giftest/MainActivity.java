package com.example.maqsood.giftest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PlayGifView playGifView;
    GifImageView gifImageView;
    EasyGifView easyGifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        easyGifView = findViewById(R.id.gifView);
        easyGifView.setGifFromResource(R.drawable.cycle_gif);
    }
}
