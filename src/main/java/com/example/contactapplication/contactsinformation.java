package com.example.contactapplication;

import android.app.Application;

import java.util.ArrayList;

public class contactsinformation extends Application {

    public static ArrayList<Person>contacts;
    @Override
    public void onCreate() {
        super.onCreate();
        contacts=new ArrayList<>();
        contacts.add(new Person("Ali","03030766432"));
        contacts.add(new Person("haroon","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));
        contacts.add(new Person("hammas","03030766432"));

    }
}
