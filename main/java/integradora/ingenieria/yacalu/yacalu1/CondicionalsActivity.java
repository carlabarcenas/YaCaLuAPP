package integradora.ingenieria.yacalu.yacalu1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import integradora.ingenieria.yacalu.yacalu1.R;

public class CondicionalsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicionals);
        VideoView videoView = findViewById(R.id.videoView_conditi);
        Uri path = Uri.parse("android.resource://integradora.ingenieria.yacalu.yacalu1/"+R.raw.conditionals);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}





