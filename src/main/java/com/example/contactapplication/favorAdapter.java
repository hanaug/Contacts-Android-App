package com.example.contactapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class favorAdapter extends RecyclerView.Adapter<favorAdapter.ViewHolder> {
    ArrayList<Person> favpersons;
    public favorAdapter(Context context, ArrayList<Person>list){
        favpersons=list;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvfavpersonname;
        TextView tvfavpersonnum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvfavpersonname=itemView.findViewById(R.id.cardname1);
            tvfavpersonnum=itemView.findViewById(R.id.cardNumber1);
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){

                }
            });
        }
    }

    @NonNull
    @Override
    public favorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.column_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull favorAdapter.ViewHolder holder, int position) {
        holder.tvfavpersonname.setText(favpersons.get(position).getName());
        holder.tvfavpersonnum.setText(favpersons.get(position).getPhoneNumber());
        holder.itemView.setTag(favpersons.get(position));
    }


    @Override
    public int getItemCount() {
        return favpersons.size();
    }
}