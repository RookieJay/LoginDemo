package com.example.practice.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.practice.test.view.LoginFragment;
import com.example.practice.test.view.MainFragment;

public class LoginActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        goToLoginFragment();
    }

    public void goToLoginFragment() {
        LoginFragment loginFragment = new LoginFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mainFrame, loginFragment).commit();
    }
}
