package com.example.dilaadiliani_10119098;
//nim : 10119098
//nama : Dila Adiliani
//kelas : IF 3

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnNote             = findViewById(R.id.btnNote);
        Button btnAbout             = findViewById(R.id.btnAbout);
        btnNote.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNote:
                Intent pindahIntent1 = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindahIntent1);
                break;
            case R.id.btnAbout:
                Intent pindahIntent2 = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }
}