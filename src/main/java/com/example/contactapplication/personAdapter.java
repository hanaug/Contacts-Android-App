package com.example.contactapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class personAdapter extends RecyclerView.Adapter<personAdapter.ViewHolder> {
     public  interface contactSelected{
         public void oncontactclick(int index);
     }
    ArrayList<Person> persons;
     contactSelected myActivity;
    public personAdapter(Context context, ArrayList<Person>list){
        persons=list;
        myActivity=(contactSelected) context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

         TextView tvpersonname;
         TextView tvpersonnum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        tvpersonname=itemView.findViewById(R.id.cardname);
            tvpersonnum=itemView.findViewById(R.id.cardnumber);
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){
                   myActivity.oncontactclick(persons.indexOf((Person)itemView.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.tvpersonname.setText(persons.get(position).getName());
        holder.tvpersonnum.setText(persons.get(position).getPhoneNumber());
        holder.itemView.setTag(persons.get(position));
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

}
