package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import integradora.ingenieria.yacalu.yacalu1.R;

import org.w3c.dom.Text;

public class CompletarFrasesActivity extends AppCompatActivity {
    Text editComplete;
    String strInput;
    private Button btnCheck,nx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completar_frases);


        final Button button2 = (Button) findViewById(R.id.btn_nx);
        button2.setEnabled(false); //Asigna valor false.

        Button button1 = (Button) findViewById(R.id.btn_check);
        button1.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {


                TextView TEXT = (TextView) findViewById(R.id.tv_res);
                EditText cuadroTexto = (EditText) findViewById(R.id.et_complete);

                if(cuadroTexto.getText().toString().toLowerCase().equals("under")){
                    TEXT.setText(" RESPUESTA CORRECTA"); button2.setEnabled(true);
                }else{
                    TEXT.setText(" RESPUESTA INCORRECTA, INTENTALO DE NUEVO");

                }




            }

        });

        Button btn = (Button) findViewById(R.id.btn_nx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Sentence4Activity.class);
                startActivityForResult(intent, 0);
            }

        });

        Button btnm = (Button) findViewById(R.id.btn_menu);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GameComplementationActivity.class);
                startActivityForResult(intent, 0);
            }

        });
    }


}