package com.example.fragmentdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_click);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                new FragmentDialogBox().show(getSupportFragmentManager(), "fragmentDialog");
            }

        });
    }
}