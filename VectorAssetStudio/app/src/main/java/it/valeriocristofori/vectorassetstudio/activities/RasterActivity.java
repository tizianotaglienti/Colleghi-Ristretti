package it.valeriocristofori.vectorassetstudio.activities;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

import it.valeriocristofori.vectorassetstudio.R;

public class RasterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_raster);
        new Holder(this);
    }

    class Holder{

        private Context context;
        private PhotoView pvRaster;

        public Holder(Context context){

            this.context = context;
            this.pvRaster = findViewById(R.id.pvRaster);

            this.pvRaster.setImageResource(getIntent().getIntExtra("image", 1));



        }

    }

}
