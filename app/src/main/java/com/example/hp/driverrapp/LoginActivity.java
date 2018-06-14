package com.example.hp.driverrapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        /**** Button btn = (Button) findViewById(R.id.UpBtn);
         btn.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) {
        openFragment();
        }
        });
         */
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                Fragment fragment = null;
                if (view == findViewById(R.id.UpBtn)) {
                    fragment = new SignUpFrag();
                }

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.SFrag, fragment);
                transaction.commit();
            }
        };


    }
}


