package integradora.ingenieria.yacalu.yacalu1;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import integradora.ingenieria.yacalu.yacalu1.R;
public class VocabularyActivity extends AppCompatActivity {

    //Variables que se van a mover
    private ImageView btnParty;
    private ImageView btnAsk;
    private ImageView btnWeb;
    private ImageView btnThrottle;
    private ImageView btnLuggage;
    private ImageView btnkeyboard;


    //Variables de ayuda
    private ImageView btnParty1;
    private ImageView btnAsk1;
    private ImageView btnWeb1;
    private ImageView btnThrottle1;
    private ImageView btnLuggage1;
    private ImageView btnKeyboard1;

    //Variables de contenedor
    private LinearLayout btnParty2;
    private LinearLayout btnAsk2;
    private LinearLayout btnWeb2;
    private LinearLayout btnThrottle2;
    private LinearLayout btnLuggage2;
    private LinearLayout btnKeyboard2;

    //Variables para el sonido
    private MediaPlayer mediaParty;
    private MediaPlayer mediaAsk;
    private MediaPlayer mediaWeb;
    private MediaPlayer mediaThrottle;
    private MediaPlayer mediaLuggage;
    private MediaPlayer mediaKeyboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);


        //Se asigna a la variable su correspondiente de la vista
        btnParty = (ImageView)findViewById(R.id.btn_party);
        btnAsk = (ImageView)findViewById(R.id.btn_ask);
        btnWeb = (ImageView)findViewById(R.id.btn_web);
        btnThrottle = (ImageView)findViewById(R.id.btn_throttle);
        btnLuggage = (ImageView)findViewById(R.id.btn_luggage);
        btnkeyboard = (ImageView)findViewById(R.id.btn_keyboard);

        btnParty1 = (ImageView)findViewById(R.id.btn_party1);
        btnAsk1 = (ImageView)findViewById(R.id.btn_ask1);
        btnWeb1 = (ImageView)findViewById(R.id.btn_server1);
        btnThrottle1 = (ImageView)findViewById(R.id.btn_throttle1);
        btnLuggage1 = (ImageView)findViewById(R.id.btn_luggage1);
        btnKeyboard1 = (ImageView)findViewById(R.id.btn_keyboard1);

        btnParty2 = (LinearLayout)findViewById(R.id.ll_par);
        btnAsk2 = (LinearLayout)findViewById(R.id.ll_as);
        btnWeb2 = (LinearLayout)findViewById(R.id.ll);
        btnThrottle2= (LinearLayout)findViewById(R.id.ll_acel);
        btnLuggage2 = (LinearLayout)findViewById(R.id.lug);
        btnKeyboard2 = (LinearLayout)findViewById(R.id.ll_key);

        //Se asina el metodo de sombra de arrastre longClickListener
        btnParty.setOnLongClickListener(longClickListener);
        btnAsk.setOnLongClickListener(longClickListener);
        btnWeb.setOnLongClickListener(longClickListener);
        btnThrottle.setOnLongClickListener(longClickListener);
        btnLuggage.setOnLongClickListener(longClickListener);
        btnkeyboard.setOnLongClickListener(longClickListener);

        //Se le asigna el metodo de arrastrar y soltar dragListener
        btnParty2.setOnDragListener(dragListener);
        btnAsk2.setOnDragListener(dragListener);
        btnWeb2.setOnDragListener(dragListener);
        btnThrottle2.setOnDragListener(dragListener);
        btnLuggage2.setOnDragListener(dragListener);
        btnKeyboard2.setOnDragListener(dragListener);

        //Se extrae el audio y se prepara para su reproduccion
        mediaParty = MediaPlayer.create(this, R.raw.party);
        mediaAsk = MediaPlayer.create(this, R.raw.ask);
        mediaWeb = MediaPlayer.create(this, R.raw.web);
        mediaThrottle = MediaPlayer.create(this, R.raw.th);
        mediaLuggage = MediaPlayer.create(this, R.raw.lugg);
        mediaKeyboard = MediaPlayer.create(this, R.raw.key);
    }


    /**
     * se crea una sombra del objeto que se decea mover
     * @param
     */
    View.OnLongClickListener longClickListener = new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,shadowBuilder,v,0);
            return true;
        }
    };

    /**
     * se captura el momento que el ususario deja precionado la tecla por un tiempo
     * y cuando arrastra el objeto hasta el momento en que lo suelta
     * @param v,event
     */
    View.OnDragListener dragListener = new View.OnDragListener(){
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            final View view =(View)event.getLocalState();
            switch (dragEvent){
                case DragEvent.ACTION_DROP:
                    if (view.getId() == R.id.btn_party && v.getId()==R.id.ll_par){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnParty1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaParty.start();

                    }else if (view.getId() == R.id.btn_ask && v.getId()==R.id.ll_as){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnAsk1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaAsk.start();

                    }else if (view.getId()==R.id.btn_web && v.getId()==R.id.ll){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnWeb1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaWeb.start();

                    }else if (view.getId()==R.id.btn_throttle && v.getId()==R.id.ll_acel){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnThrottle1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaThrottle.start();

                    }else if (view.getId()==R.id.btn_luggage && v.getId()==R.id.lug){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnLuggage1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaLuggage.start();

                    }else if (view.getId()==R.id.btn_keyboard && v.getId()==R.id.ll_key){
                        LinearLayout oldParent = (LinearLayout) view.getParent();
                        oldParent.removeView(view);
                        LinearLayout newParent = (LinearLayout)v;
                        btnKeyboard1.setVisibility(View.GONE);
                        newParent.addView(view);

                        mediaKeyboard.start();
                    }
                    break;
            }
            return true;
        }
    };
}
