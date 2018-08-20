package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import integradora.ingenieria.yacalu.yacalu1.R;


public class IntroductionActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageSwitcher sw;
    private Button pr,nx;
    private Button btnGoMenu;
    private int[] imagenes = new int[3];
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        sw = (ImageSwitcher) findViewById(R.id.is_intr);
        pr = (Button) findViewById(R.id.btn_pr);
        nx = (Button) findViewById(R.id.btn_nx);
        pr.setOnClickListener(this);
        nx.setOnClickListener(this);
        imagenes[0]=R.drawable.ic_introduccion1;
        imagenes[1]=R.drawable.ic_introduccion2;
        imagenes[2]=R.drawable.ic_introduccion3;

        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;


            }
        });
        btnGoMenu = (Button) findViewById(R.id.btn_go_menu);
        btnGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btn_nx && n<3) {
            n++;
        }else if(v.getId()==R.id.btn_pr && n>0) {
            n--;
        }
        sw.setImageResource(imagenes[n]);
        if (n==0){
            pr.setEnabled(false);
        }
        else {
            pr.setEnabled(true);
        }
        if (n==2){
            nx.setEnabled(false);
        }else{
            nx.setEnabled(true);
        }
    }
    {

    }
}

