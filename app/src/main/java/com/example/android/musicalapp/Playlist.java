package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button favBtn = (Button) findViewById(R.id.playlist_fav_id);
        Button playBtn = (Button) findViewById(R.id.playlist_play_id);
        Button homeBtn = (Button) findViewById(R.id.playlist_home_btn_id);

        //Open Favorites activity when favorite button is clicked
        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FavoriteActivity.class);
                startActivity(intent);
            }
        });

        //Open Play activity when play button is clicked
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), play.class);
                startActivity(intent);
            }
        });

        //Open Main activity when home button is clicked
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
