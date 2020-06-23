package it.valeriocristofori.vectorassetstudio.activities;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import it.valeriocristofori.vectorassetstudio.R;
import it.valeriocristofori.vectorassetstudio.recycler.RecyclerGallery;

import static it.valeriocristofori.vectorassetstudio.R.layout.layout_gallery;

public class GalleryActivity extends AppCompatActivity {

    private int arrayImages[] = {R.drawable.android_logo_raster,R.drawable.drago, R.drawable.pinocchio, R.drawable.finn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout_gallery);

        new Holder(this);
    }


    class Holder{

        private RecyclerView rvGallery;
        private Context context;

        public Holder(final Context context) {

            this.context = context;
            this.rvGallery = findViewById(R.id.rvGallery);

            //setup array images with drawables


            RecyclerGallery recyclerGallery = new RecyclerGallery( this.context, arrayImages );

            //setting
            rvGallery.setAdapter(recyclerGallery);
            rvGallery.setLayoutManager(new GridLayoutManager(this.context, 3));
        }
    }
}
