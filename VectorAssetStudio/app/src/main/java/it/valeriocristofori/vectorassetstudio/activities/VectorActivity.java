package it.valeriocristofori.vectorassetstudio.activities;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

import it.valeriocristofori.vectorassetstudio.R;

public class VectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vector);
        new Holder(this);
    }

    class Holder{

        private Context context;
        private PhotoView pvVector;

        public Holder(Context context){

            this.context = context;
            this.pvVector = findViewById(R.id.pvVector);

            this.pvVector.setImageResource(R.drawable.ic_android_logo_vector);



        }

    }

}
