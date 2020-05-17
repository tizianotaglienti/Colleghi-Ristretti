package it.valeriocristofori.vectorassetstudio.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import it.valeriocristofori.vectorassetstudio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Holder(this);
    }

    class Holder implements View.OnClickListener {

        private Context context;
        private Intent intent;
        private Button btnRaster;
        private Button btnVector;


        public Holder( Context context ){

            this.context = context;
            this.btnRaster = findViewById(R.id.btnRaster);
            this.btnVector = findViewById(R.id.btnVector);

            this.btnRaster.setOnClickListener(this);
            this.btnVector.setOnClickListener(this);



        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){

                case R.id.btnRaster:
                    this.intent = new Intent(this.context, RasterActivity.class);
                    startActivityForResult(intent, 0);
                    break;

                case R.id.btnVector:
                    this.intent = new Intent(this.context, VectorActivity.class);
                    startActivityForResult(intent, 0);
                    break;


            }
        }
    }
}
