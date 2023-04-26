package com.example.harkkatyo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder{
    ImageView lutemonImage;
    TextView lutemonName, lutemonColor;

    public LutemonViewHolder(@NonNull View itemView){
        super(itemView);
        lutemonImage = itemView.findViewById(R.id.pictures);
        lutemonName = itemView.findViewById(R.id.LutemonName);
    }

}