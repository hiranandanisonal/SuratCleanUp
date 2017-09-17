package com.example.a4.suratcleanup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;


public class land extends AppCompatActivity {
    EditText Password;
    AutoCompleteTextView Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
        Email = (AutoCompleteTextView)findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);
    }

    public void OnLogin(View view) {
        String username = Email.getText().toString();
        String password1 = Password.getText().toString();
        String type = "login";
        backgroundWorker bg = new backgroundWorker(this);
        bg.execute(type, username, password1);
    }

}