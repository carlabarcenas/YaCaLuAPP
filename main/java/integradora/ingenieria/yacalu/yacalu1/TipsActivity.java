package integradora.ingenieria.yacalu.yacalu1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import integradora.ingenieria.yacalu.yacalu1.R;

public class TipsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        VideoView videoView = findViewById(R.id.videoView_tips);
        Uri path = Uri.parse("android.resource://integradora.ingenieria.yacalu.yacalu1/"+R.raw.ingles);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}



