package com.example.myapplicationfoodapp;

import static android.widget.Toast.makeText;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SignIn {

}

        import android.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.material.button.MaterialButton;

class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("mandalvishal710") && password.getText().toString().equals("1234567890")){
                    //Correct password
                    makeText(mainActivity.this, "", Toast.LENGTH_SHORT).show();
                    makeText(mainActivity.this, "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect password
                    makeText(mainActivity.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
