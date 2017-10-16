package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playListBtn = (Button) findViewById(R.id.playlist_button_id);
        Button playBtn = (Button) findViewById(R.id.play_button_id);
        Button artistBtn = (Button) findViewById(R.id.artist_button_id);
        Button settingsBtn = (Button) findViewById(R.id.settings_button_id);
        Button paymentBtn = (Button) findViewById(R.id.payment_id);

        // Open Payment activity when payment button is clicked
        paymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PaymentActivity.class);
                startActivity(intent);
            }
        });

        // Open Playlist activity when playlist button is clicked
        playListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Playlist.class);
                startActivity(intent);
            }
        });

        //Open NowPlaying activity when play button is clicked
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), play.class);
                startActivity(intent);
            }
        });

        //Open Artist activity when artist button is clicked
        artistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Artist.class);
                startActivity(intent);
            }
        });

        //Open Settings activity when settings button is clicked
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
