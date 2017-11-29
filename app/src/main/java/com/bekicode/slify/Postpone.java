package com.bekicode.slify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Postpone extends AppCompatActivity {

    Button btnFb, btnSignIn, btnGoogle;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postpone);

        btnFb = (Button)findViewById(R.id.lgnFb);
        btnGoogle = (Button) findViewById(R.id.lgnGoogle);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        signUp = (TextView) findViewById(R.id.signUp);

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(Postpone.this, MainActivity.class);
                startActivity(signIn);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(Postpone.this, Signup.class);
                startActivity(signup);
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}
