    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

    public class MainActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  Snackbar  snb = Snackbar.make(findViewById(R.id.myView),"Done", Snackbar.LENGTH_LONG);
              //  snb.show();




                Snackbar snb = Snackbar.make(findViewById(





                        R.id.myView), "Action  Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Retry!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Snackbar Toast", Toast.LENGTH_LONG).show();
                    }
                });
snb.show();

            }
        });
    }

        }

