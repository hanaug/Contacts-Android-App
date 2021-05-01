package com.example.contactapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements personAdapter.contactSelected {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
TextView tvname;
 TextView tvtel;
 ImageView ivcall;

    private void init(){

        tvname=findViewById(R.id.tvname);
        tvtel=findViewById(R.id.tvphone);
        ivcall=findViewById(R.id.ivcall);

    }
    @Override
    public void oncontactclick(int index) {
       tvname.setText(contactsinformation.contacts.get(index).getName());
        tvtel.setText(contactsinformation.contacts.get(index).getPhoneNumber());
    }
}