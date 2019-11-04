package com.ardakazanci.databinding_exercise_java_4.util;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.ardakazanci.databinding_exercise_java_4.model.User;

public class MyClickHandlers {

    Context context;
    User user;

    public MyClickHandlers(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public void onFabClicked(View view) {
        
        // Obje değeri değişince direkt olarak değer ' de değişti.
        // Trick burada.
        user.setName("Test2");
        user.setEmail("test2@yopmail.com");
    }
}
