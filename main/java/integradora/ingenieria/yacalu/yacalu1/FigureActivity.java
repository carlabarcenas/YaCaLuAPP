package integradora.ingenieria.yacalu.yacalu1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FigureActivity extends AppCompatActivity {
    private ImageButton ibtFiguras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);
        ibtFiguras = (ImageButton) findViewById(R.id.ibt_figura);

        ibtFiguras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FigureActivity.this,CircleActivity.class);
                startActivity(i);
            }
        });
    }
}
