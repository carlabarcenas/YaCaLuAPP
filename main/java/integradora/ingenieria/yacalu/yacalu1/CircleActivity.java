package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class CircleActivity extends AppCompatActivity implements View.OnClickListener{



private ImageButton btnCircule;
private Button btnNext;
private Button btnPrevious;
private MediaPlayer mediaPlayer;
private SoundPool soundPool;
private int circule;



@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circule);

        btnCircule = (ImageButton) findViewById(R.id.btn_circle);
        btnNext = (Button) findViewById(R.id.btn_nextc);
        btnPrevious = (Button) findViewById(R.id.btn_previousci);


        btnCircule.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        circule = soundPool.load(this, R.raw.circulo,1);
        mediaPlayer = new MediaPlayer();

        }
@Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.btn_circle:
        soundPool.play(circule, 1, 1,0,0,1);
        break;
        case R.id.btn_nextc:
        Intent i = new Intent(this, DiamondActivity.class);
        startActivity(i);
        finish();
        break;
        case R.id.btn_previousci:
        Intent in = new Intent(this, FigureActivity.class);
        startActivity(in);
        finish();
        break;
default:
        break;


        }
        }


        }
