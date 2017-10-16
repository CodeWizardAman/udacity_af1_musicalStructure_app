package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        Button artistBtn = (Button) findViewById(R.id.fav_artist_id);
        Button playlistBtn = (Button) findViewById(R.id.fav_playlist_id);
        Button homeBtn = (Button) findViewById(R.id.fav_home_btn_id);

        //Open Settings activity when settings button is clicked
        artistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Artist.class);
                startActivity(intent);
            }
        });

        //Open Playlist activity when playlist button is clicked
        playlistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Playlist.class);
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
