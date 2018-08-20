package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import integradora.ingenieria.yacalu.yacalu1.R;

public class BusinessEnglishActivity extends AppCompatActivity {

    private ImageView T1;
    private ImageView T2;
    private ImageView T3;
    private ImageView T4;
    private ImageView T5;
    private ImageView T6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_english);


        T1 = (ImageView) findViewById(R.id.iv_tip1);
        T1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessTips1Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        T2 = (ImageView) findViewById(R.id.iv_tip2);
        T2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessTips2Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        T3 = (ImageView) findViewById(R.id.iv_tip3);
        T3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTips3Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        T4 = (ImageView) findViewById(R.id.iv_tip4);
        T4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTips4Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        T5 = (ImageView) findViewById(R.id.iv_tip5);
        T5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTips5Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        T6 = (ImageView) findViewById(R.id.iv_tip6);
        T6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTips6Activity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
