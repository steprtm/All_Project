package com.example.allproject;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

public class ExoPlayerActivity extends AppCompatActivity {
    private ExoPlayer player;
    private StyledPlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo_player);

        playerView = findViewById(R.id.player_view);

        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this, "user-agent");

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.mifallout;

        MediaItem mediaItem = MediaItem.fromUri(Uri.parse(videoPath));

        player = new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(player);
        player.setMediaItem(mediaItem);

        player.prepare();
        player.setPlayWhenReady(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasePlayer();
    }

    private void releasePlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }
}
