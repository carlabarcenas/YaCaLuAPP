package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import integradora.ingenieria.yacalu.yacalu1.R;

public class LanternActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnLantern;
    private Button btnNext;
    private Button btnPrevious;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int lanter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantern);


        btnLantern= (ImageButton) findViewById(R.id.btn_lantern);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnPrevious = (Button) findViewById(R.id.btn_previous);


        btnLantern.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        lanter = soundPool.load(this, R.raw.bedd,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dice:
                soundPool.play(lanter, 1, 1,0,0,1);
                break;
            case R.id.btn_next:
                Intent i = new Intent(this, PencilActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.btn_previous:
                Intent in = new Intent(this, LampActivity.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
        finish();
    }

}
