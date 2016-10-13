package com.tasneembohra.mvvpdatabinding.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tasneembohra.mvvpdatabinding.R;
import com.tasneembohra.mvvpdatabinding.databinding.ActivityMainBinding;
import com.tasneembohra.mvvpdatabinding.model.User;
import com.tasneembohra.mvvpdatabinding.viewmodel.Handlers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Tasneem", "Bohra");
        binding.setUser(user);
        binding.setHandler(new Handlers());
    }
}
