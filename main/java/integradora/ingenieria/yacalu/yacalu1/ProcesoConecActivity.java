package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import integradora.ingenieria.yacalu.yacalu1.R;

public class ProcesoConecActivity extends AppCompatActivity {

    private Button menucon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_proceso_conec);
        menucon = (Button) findViewById(R.id.btn_gomenu);
        menucon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MenuConecActivity.class);
                startActivityForResult(intent, 0);
            }

        });

    }
}
