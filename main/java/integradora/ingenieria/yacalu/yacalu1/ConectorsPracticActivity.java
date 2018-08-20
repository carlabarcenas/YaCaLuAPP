package integradora.ingenieria.yacalu.yacalu1;


import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import integradora.ingenieria.yacalu.yacalu1.R;

import java.util.Random;



public class ConectorsPracticActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout target1, target2, target3;
    Button test1, test2, test3, btn1, btn2, btn3,  btnPregunta;

    int[] preg ={R.id.target1, R.id.target2, R.id.target3, };
    int [] resp={R.id.btn1, R.id.btn2, R.id.btn3, };
    int y;
    int aciertos;
    int errores;
    boolean[] correctas= new boolean[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_conectors_practic);




        target1 = (LinearLayout) findViewById(R.id.target1);
        target2 = (LinearLayout) findViewById(R.id.target2);
        target3 = (LinearLayout) findViewById(R.id.target3);


        test1 = (Button) findViewById(R.id.test1);
        test2 = (Button) findViewById(R.id.test2);
        test3 = (Button) findViewById(R.id.test3);


        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btnPregunta = (Button) findViewById(R.id.nuevo);

        target1.setOnDragListener(dragListenre);
        target2.setOnDragListener(dragListenre);
        target3.setOnDragListener(dragListenre);


        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btnPregunta.setOnClickListener(this);



    }



    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadwoBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadwoBuilder, v, 0);
            return true;

        }
    };

    View.OnDragListener dragListenre = new View.OnDragListener() {


        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();



            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    if (view.getId() == R.id.btn1){
                        test1.setText("I'm going to leave, however it's raining");
                    }else
                    if (view.getId() == R.id.btn2){
                        test2.setText("You need to rest, although you denied");

                    }
                    else
                    if (view.getId() == R.id.btn3){
                        test3.setText("My aunt come to the store when it opens, furthermore,\n buy the dress she wants.");

                    }
                    break;

                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    if(view.getId() == R.id.btn1){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[0]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn2 && v.getId() == R.id.target2){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[1]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn3 && v.getId() == R.id.target3) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[2] = true;
                        Toast.makeText(getApplication(), "Correcto!!", Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //  txtAciertos.setText(""+ aciertos);
                    }

                    else{
                        Toast.makeText(getApplication(),"Incorrecto!!",Toast.LENGTH_SHORT).show();
                        errores ++;
                        //txtErrores.setText(""+ errores);
                    }
                    if (aciertos==10){
                        int calif =aciertos*10/(aciertos+errores);
                        Toast.makeText(getApplication(),"Terminaste, tuviste "+aciertos+" aciertos, " +
                                errores + " errores. Tu calificación es: " + calif,Toast.LENGTH_LONG).show();
                        btnPregunta.setEnabled(false);
                    }
                    break;

            }
            return true;
        }

    };

    @Override
    public void onClick(View view) {
        Random rn = new Random();

        //for(int i =0; i < 5; i++)
        //{
        switch (y){
            case 0:
                test1.setVisibility(View.INVISIBLE);
                break;
            case 1:
                test2.setVisibility(View.INVISIBLE);
                break;
            case 2:
                test3.setVisibility(View.INVISIBLE);

        }
        do {
            y = rn.nextInt(preg.length);
        }while(correctas[y]);
        switch (y){
            case 0:
                target1.setOnDragListener(dragListenre);
                break;
            case 1:
                target2.setOnDragListener(dragListenre);
                break;
            case 2:
                target3.setOnDragListener(dragListenre);
                break;

        }
        ;
        //System.out.println(preg[x]);
        //}
        switch (y){
            case 0:
                test1.setText("The car is ___");
                test1.setVisibility(View.VISIBLE);
                break;
            case 1:
                test2.setText("What you wrote her is ______");
                test2.setVisibility(View.VISIBLE);
                break;
            case 2:
                test3.setText("There is no ______ time");
                test3.setVisibility(View.VISIBLE);

        }
    }
}
