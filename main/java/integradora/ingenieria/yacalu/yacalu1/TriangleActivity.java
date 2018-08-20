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

public class TriangleActivity extends AppCompatActivity  implements View.OnClickListener{



    private ImageButton btnTriangle;
    private Button btnNext;
    private Button btnPrevious;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int triangle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        btnTriangle = (ImageButton) findViewById(R.id.btn_triangle);
        btnNext = (Button) findViewById(R.id.btn_nextt);
        btnPrevious = (Button) findViewById(R.id.btn_previoust);


        btnTriangle.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        triangle = soundPool.load(this, R.raw.triangulo,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_triangle:
                soundPool.play(triangle, 1, 1,0,0,1);
                break;
            case R.id.btn_nextt:
                Intent i = new Intent(this,SquareActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.btn_previoust:
                Intent in = new Intent(this, DiamondActivity.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }
    }


}