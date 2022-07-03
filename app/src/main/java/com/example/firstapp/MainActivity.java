package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    RegistrationFragment registrationFragment = new RegistrationFragment();
    CalculatorFragment calculatorFragment = new CalculatorFragment();
    QuizzFragment quizzFragment = new QuizzFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,registrationFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.registration:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,registrationFragment).commit();
                        return true;
                    case R.id.calculator:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,calculatorFragment).commit();
                        return true;
                    case R.id.quizz:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,quizzFragment).commit();
                        return true;

                }
                return false;
            }
        });
    }

}