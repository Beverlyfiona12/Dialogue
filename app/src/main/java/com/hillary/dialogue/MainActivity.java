package com.hillary.dialogue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Register(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Register here");
        dialog.setMessage("fill in all details");
        LayoutInflater inflator=LayoutInflater.from(this);
        View register=inflator.inflate(R.layout.register,null);
        dialog.setView(register);
        final EditText InputNames=register.findViewById(R.id.InputNames);
        final EditText InputEmail=register.findViewById(R.id.InputEmail);
        dialog.setPositiveButton("SIGN UP", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String names=InputNames.getText().toString();
                String email=InputEmail.getText().toString();
                Toast.makeText(MainActivity.this,names+""+email,Toast.LENGTH_SHORT);

            }
        });
        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
    }
}
