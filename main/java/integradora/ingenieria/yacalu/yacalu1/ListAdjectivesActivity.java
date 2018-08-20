package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import integradora.ingenieria.yacalu.yacalu1.R;
import java.util.Random;




public class ListAdjectivesActivity extends AppCompatActivity implements View.OnClickListener {
    private Button newint;
    LinearLayout target1, target2, target3, target4,target5, target6,target7, target8, target9, target10;
    Button test1, test2, test3, test4, test5, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9, btn10,
            test6, test7, test8, test9, test10,  btnPregunta;

    EditText txtAciertos, txtErrores;


    int[] preg ={R.id.target_new, R.id.target_dreaf, R.id.target_round, R.id.target_inter, R.id.target_beaut, R.id.target_blue, R.id.target_this, R.id.target_thos, R.id.target_many, R.id.target_much};
    int [] resp={R.id.btn_new, R.id.btn_dreaf, R.id.btn_round,  R.id.btn_inter,  R.id.btn_beaut,
            R.id.btn_blue,  R.id.btn_this, R.id.btn_thos,  R.id.btn_many,  R.id.btn_much,  R.id.btn_much};
    int y;
    int aciertos;
    int errores;
    boolean[] correctas= new boolean[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_list_adjectives);

        newint = (Button) findViewById(R.id.btn_newintent);
        newint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), NewListAdjectActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        target1 = (LinearLayout) findViewById(R.id.target_new);
        target2 = (LinearLayout) findViewById(R.id.target_dreaf);
        target3 = (LinearLayout) findViewById(R.id.target_round);
        target4 = (LinearLayout) findViewById(R.id.target_inter);
        target5 = (LinearLayout) findViewById(R.id.target_beaut);
        target6 = (LinearLayout) findViewById(R.id.target_blue);
        target7 = (LinearLayout) findViewById(R.id.target_this);
        target8 = (LinearLayout) findViewById(R.id.target_thos);
        target9 = (LinearLayout) findViewById(R.id.target_many);
        target10 = (LinearLayout) findViewById(R.id.target_much);


        test1 = (Button) findViewById(R.id.test_new);
        test2 = (Button) findViewById(R.id.test_dreaf);
        test3 = (Button) findViewById(R.id.test_round);
        test4 = (Button) findViewById(R.id.test_inter);
        test5 = (Button) findViewById(R.id.test_beaut);
        test6 = (Button) findViewById(R.id.test_blue);
        test7 = (Button) findViewById(R.id.test_this);
        test8 = (Button) findViewById(R.id.test_thos);
        test9 = (Button) findViewById(R.id.test_many);
        test10 = (Button) findViewById(R.id.test_much);



        btn1 = (Button) findViewById(R.id.btn_new);
        btn2 = (Button) findViewById(R.id.btn_dreaf);
        btn3 = (Button) findViewById(R.id.btn_round);
        btn4 = (Button) findViewById(R.id.btn_inter);
        btn5 = (Button) findViewById(R.id.btn_beaut);
        btn6 = (Button) findViewById(R.id.btn_blue);
        btn7 = (Button) findViewById(R.id.btn_this);
        btn8 = (Button) findViewById(R.id.btn_thos);
        btn9 = (Button) findViewById(R.id. btn_many);
        btn10 = (Button) findViewById(R.id.btn_much);
        btnPregunta = (Button) findViewById(R.id.btn_newquestion);



        //txtAciertos = (EditText) findViewById(R.id.txt_aciertos);
        //  txtErrores = (EditText) findViewById(R.id.txt_errores);
        //target1.setOnDragListener(dragListenre);
        //target2.setOnDragListener(dragListenre);
        //target3.setOnDragListener(dragListenre);
        //target4.setOnDragListener(dragListenre);
        //target5.setOnDragListener(dragListenre);


        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btn5.setOnLongClickListener(longClickListener);
        btn6.setOnLongClickListener(longClickListener);
        btn7.setOnLongClickListener(longClickListener);
        btn8.setOnLongClickListener(longClickListener);
        btn9.setOnLongClickListener(longClickListener);
        btn10.setOnLongClickListener(longClickListener);
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
                    if (view.getId() == R.id.btn_new){
                        test1.setText("The Car is new");
                    }else
                    if (view.getId() == R.id.btn_dreaf){
                        test2.setText("What you wrote her is dreadful");

                    }
                    else
                    if (view.getId() == R.id.btn_round){
                        test3.setText("The Earth is round");

                    }
                    else
                    if (view.getId() == R.id.btn_inter){
                        test4.setText("The meeting was interesting.");

                    }
                    else
                    if (view.getId() == R.id.btn_beaut){
                        test5.setText("It is a beautiful dog");

                    }
                    else
                    if (view.getId() == R.id.btn_blue){
                        test6.setText("I have a blue skirt");

                    }
                    else
                    if (view.getId() == R.id.btn_this){
                        test7.setText("This car is very fast");

                    }
                    else
                    if (view.getId() == R.id.btn_thos){
                        test8.setText("Those are my shoes");

                    }
                    else
                    if (view.getId() == R.id.btn_many){
                        test9.setText("There are so many thigs to do.");

                    }
                    else
                    if (view.getId() == R.id.btn_much){
                        test10.setText("there is no much time.");

                    }
                    break;

                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    if(view.getId() == R.id.btn_new){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[0]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_dreaf && v.getId() == R.id.target_dreaf){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[1]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_round && v.getId() == R.id.target_round) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[2]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //  txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_inter && v.getId() == R.id.target_inter) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[3]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //    txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_beaut && v.getId() == R.id.target_beaut){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[4]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_blue && v.getId() == R.id.target_blue){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[5]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_this && v.getId() == R.id.target_this){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[6]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_thos && v.getId() == R.id.target_thos){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[7]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_many && v.getId() == R.id.target_many){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[8]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_much && v.getId() == R.id.target_much){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[9]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
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
                break;
            case 3:
                test4.setVisibility(View.INVISIBLE);
                break;
            case 4:
                test5.setVisibility(View.INVISIBLE);
            case 5:
                test6.setVisibility(View.INVISIBLE);
                break;
            case 6:
                test7.setVisibility(View.INVISIBLE);
                break;
            case 7:
                test8.setVisibility(View.INVISIBLE);
                break;
            case 8:
                test9.setVisibility(View.INVISIBLE);
                break;
            case 9:
                test10.setVisibility(View.INVISIBLE);

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
            case 3:
                target4.setOnDragListener(dragListenre);
                break;
            case 4:
                target5.setOnDragListener(dragListenre);
                break;
            case 5:
                target6.setOnDragListener(dragListenre);
                break;
            case 6:
                target7.setOnDragListener(dragListenre);
                break;
            case 7:
                target8.setOnDragListener(dragListenre);
                break;
            case 8:
                target9.setOnDragListener(dragListenre);
                break;
            case 9:
                target10.setOnDragListener(dragListenre);
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
                test3.setText("The Earth is ______");
                test3.setVisibility(View.VISIBLE);
                break;
            case 3:
                test4.setText("The meeting was _____");
                test4.setVisibility(View.VISIBLE);
                break;
            case 4:
                test5.setText("It is a ________ dog");
                test5.setVisibility(View.VISIBLE);
                break;
            case 5:
                test6.setText("I have a ______ skirt");
                test6.setVisibility(View.VISIBLE);
                break;
            case 6:
                test7.setText("____ car is very fast");
                test7.setVisibility(View.VISIBLE);
                break;
            case 7:
                test8.setText("_______ are my shoes");
                test8.setVisibility(View.VISIBLE);
                break;
            case 8:
                test9.setText("There are so _____ things to do");
                test9.setVisibility(View.VISIBLE);
                break;
            case 9:
                test10.setText("There is no ______ time");
                test10.setVisibility(View.VISIBLE);

        }
    }
}
