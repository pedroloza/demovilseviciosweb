package com.example.servicioweb_posteadordedatos.ui.enter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.servicioweb_posteadordedatos.R;

public class MainActivity extends AppCompatActivity {
Button buttonpost;
EditText Edittexttitle ,Edittextdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitViews();
        buttonpost.setOnClickListener(this);


    }
    private void InitViews(){

        buttonpost=findViewById(R.id.button);
        Edittexttitle=findViewById(R.id.editText);
        Edittextdescripcion=findViewById(R.id.editText2);
        provt
    }
}
