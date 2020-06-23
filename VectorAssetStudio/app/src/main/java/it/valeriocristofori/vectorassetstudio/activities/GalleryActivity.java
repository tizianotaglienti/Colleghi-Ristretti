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

    private int arrayImages[] = {R.drawable.android_logo_raster,  R.drawable.finn,  R.drawable.firefox, R.drawable.luigi, R.drawable.marge, R.drawable.pinocchio,  R.drawable.thunderbird};
    private int arrayImagesVector[] = {R.drawable.ic_android_logo_vector,R.drawable.ic_finn,R.drawable.ic_firefox, R.drawable.ic_luigi, R.drawable.ic_marge, R.drawable.ic_pinocchio, R.drawable.ic_thunderbird};

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


            RecyclerGallery recyclerGallery = new RecyclerGallery( this.context, arrayImages, arrayImagesVector );

            //setting
            rvGallery.setAdapter(recyclerGallery);
            rvGallery.setLayoutManager(new GridLayoutManager(this.context, 3));
        }
    }
}
