package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import integradora.ingenieria.yacalu.yacalu1.R;

public class EntryActivity extends AppCompatActivity implements View.OnClickListener{
private Button btnNext;
private ImageView btnObjets;

@Override
protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        btnNext = (Button)findViewById(R.id.btn_objets1);
        btnObjets = (ImageView)findViewById(R.id.btn_objets);
             btnNext.setOnClickListener(this);

        }


@Override
public void onClick(View v) {
        Intent i = new Intent(this, BedActivity.class );
        startActivity(i);

        }
        @Override
        public void onBackPressed() {
                Intent i = new Intent(this, MenuActivity.class);
                startActivity(i);
                finish();
        }

        }


