package it.valeriocristofori.vectorassetstudio.recycler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import it.valeriocristofori.vectorassetstudio.R;
import it.valeriocristofori.vectorassetstudio.activities.RasterActivity;
import it.valeriocristofori.vectorassetstudio.activities.VectorActivity;

public class RecyclerGallery extends RecyclerView.Adapter<RecyclerGallery.MyViewHolder> {

    private Context context;
    private int images[];
    private int images_vector[];



    public RecyclerGallery(Context context, int images[], int images_vector[] ) {
        this.context = context;
        this.images = images;
        this.images_vector = images_vector;

    }

    @NonNull
    @Override
    public RecyclerGallery.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_view_image,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerGallery.MyViewHolder holder, final int position) {
        holder.ivImageGallery.setImageResource(images[position]);

        //setting the click event
        holder.btnVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, VectorActivity.class);
                intent.putExtra("image", images_vector[position]);
                context.startActivity(intent);
            }
        });


        holder.btnRaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, RasterActivity.class);
                intent.putExtra("image", images[position]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView ivImageGallery;
        ConstraintLayout clImage;
        Button btnVector;
        Button btnRaster;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImageGallery = itemView.findViewById(R.id.ivImageGallery);
            clImage = itemView.findViewById(R.id.clImage);
            btnRaster = itemView.findViewById(R.id.btnRaster);
            btnVector = itemView.findViewById(R.id.btnVector);


        }
    }






}
