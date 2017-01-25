package com.tl.joe.signintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button regBtn = (Button) findViewById(R.id.button3);
        Button logBtn = (Button) findViewById(R.id.button2);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRegister();
            }
        });
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogin
                        ();
            }
        });
    }

    private void goToRegister(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void goToLogin(){
        Intent intent = new Intent(this, LogActivity.class);
        startActivity(intent);

    }

}
