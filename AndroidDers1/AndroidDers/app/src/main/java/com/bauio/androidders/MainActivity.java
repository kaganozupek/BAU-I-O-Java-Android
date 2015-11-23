package com.bauio.androidders;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public EditText etUserName;
    public EditText etPassword;
    public Button btnLogin;
    public TextView tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        tx  = (TextView) findViewById(R.id.txText);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etPassword.getText().toString().equals("123456"))
                {
                    tx.setText("Wellcome " + etUserName.getText().toString());
                    tx.setTextColor(Color.parseColor("#AABBCC"));
                } else {
                    tx.setText("Wrong Password");
                    tx.setTextColor(Color.RED);
                }

            }
        });


    }
}
