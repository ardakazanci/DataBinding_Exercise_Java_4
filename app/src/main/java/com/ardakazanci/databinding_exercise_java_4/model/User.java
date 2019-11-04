package com.ardakazanci.databinding_exercise_java_4.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;



public class User extends BaseObservable {

    public String name;
    public String email;


    @Bindable // Observable Data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name); // New Observable Data UI Changed
    }

    @Bindable // Observable Data
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email); // New Observable Data UI Changed
    }
}
