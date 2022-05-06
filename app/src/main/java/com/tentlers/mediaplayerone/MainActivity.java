package com.tentlers.mediaplayerone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tentlers.mediaplayerone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        mainBinding.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }
            }
        });
        mainBinding.pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    Log.d("pausebutton","pause");
                    mediaPlayer.pause();
                }
            }
        });

    }
}