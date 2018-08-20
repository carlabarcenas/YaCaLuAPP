package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuConecActivity extends AppCompatActivity {
    private Button CCbutton;
    private Button C2button;
    private Button ACbutton;
    private Button Practic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_conec);


        CCbutton = (Button) findViewById(R.id.btn_conclusive);
        CCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConclusiveConnectorsActivity.class);
                startActivityForResult(intent, 0);

            }

        });
        C2button = (Button) findViewById(R.id.btn_continuos);
        C2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ContinuativesConnectorsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        ACbutton = (Button) findViewById(R.id.btn_adverse);
        ACbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AdversativesConnectorsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        Practic = (Button) findViewById(R.id.btn_practic);
        Practic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConectorsPracticActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
        finish();
    }
}