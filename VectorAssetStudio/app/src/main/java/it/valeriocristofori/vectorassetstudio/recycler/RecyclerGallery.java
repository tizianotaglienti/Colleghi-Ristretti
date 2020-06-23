package it.valeriocristofori.vectorassetstudio.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import it.valeriocristofori.vectorassetstudio.R;

public class RecyclerGallery extends RecyclerView.Adapter<RecyclerGallery.MyViewHolder> {

    private Context context;
    private int images[];



    public RecyclerGallery(Context context, int images[] ) {
        this.context = context;
        this.images = images;

    }

    @NonNull
    @Override
    public RecyclerGallery.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.single_image,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerGallery.MyViewHolder holder, final int position) {
        holder.ivImageGallery.setImageResource(images[position]);

        //setting the click event

        holder.ivImageGallery.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {


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


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImageGallery = itemView.findViewById(R.id.ivImageGallery);
            clImage = itemView.findViewById(R.id.clImage);


        }
    }






}
