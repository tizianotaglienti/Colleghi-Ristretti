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
        private Button button_gallery;


        public Holder( Context context ){

            this.context = context;
            this.button_gallery = findViewById(R.id.button_gallery);


            this.button_gallery.setOnClickListener(this);



        }

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button_gallery){
                    this.intent = new Intent(this.context, GalleryActivity.class);
                    startActivityForResult(intent, 0);

            }
        }
    }
}
