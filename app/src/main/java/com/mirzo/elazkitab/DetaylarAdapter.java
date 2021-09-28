package com.mirzo.elazkitab;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mirzo.elazkitab.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class DetaylarAdapter extends RecyclerView.Adapter<DetaylarAdapter.DetaylarHolder> {
    ArrayList<Detaylar> detaylarArrayList;

    public DetaylarAdapter(ArrayList<Detaylar> detaylarArrayList) {
        this.detaylarArrayList = detaylarArrayList;
    }

    @NonNull
    @Override
    public DetaylarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new DetaylarHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetaylarHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(detaylarArrayList.get(position).ilce);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivitiy.class);
                intent.putExtra("detaylar",detaylarArrayList.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return detaylarArrayList.size();
    }

    public class DetaylarHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public DetaylarHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
