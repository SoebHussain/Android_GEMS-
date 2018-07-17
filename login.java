package com.soeb.gemsattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton();


    }
    public void loginButton(){
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login_button);

        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("Faizaan Shabbir") && password.getText().toString().equals("adminlogin")){
                            Toast.makeText(login.this,"correct username and password ",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent("com.soeb.gemsattendance.user");
                            startActivity(i);
                        }
                        else Toast.makeText(login.this,"Faizaan Shabbir adminlogin",Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
