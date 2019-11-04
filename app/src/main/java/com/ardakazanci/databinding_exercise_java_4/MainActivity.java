package com.ardakazanci.databinding_exercise_java_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ardakazanci.databinding_exercise_java_4.databinding.ActivityMainBinding;
import com.ardakazanci.databinding_exercise_java_4.model.User;
import com.ardakazanci.databinding_exercise_java_4.util.MyClickHandlers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //setSupportActionBar(mainBinding.toolbar);

        User user1 = new User();
        user1.setName("Test");
        user1.setEmail("test@yopmail.com");

        mainBinding.setUser(user1);

        MyClickHandlers handlers = new MyClickHandlers(getApplicationContext(), user1);
        mainBinding.setHandlers(handlers);

    }
}
