package com.example.app_hitungkeliling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText ePanjang;
    EditText eLebar;
    TextView eHasil;
    Button bKeliling;
    EditText eHasil1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //perintah menangkap inputan dari user
        ePanjang = (EditText)findViewById(R.id.ePanjang);
        eLebar = (EditText)findViewById(R.id.eLebar);
        eHasil = (TextView)findViewById(R.id.eHasil);
        eHasil1 = (EditText)findViewById(R.id.eHasil1);
        bKeliling = (Button)findViewById(R.id.bKeliling);

        bKeliling.setOnClickListener(this::onClick);

    }
    public void onClick (View view) {
        double Panjang = Double.parseDouble(String.valueOf(ePanjang.getText()));
        double Lebar = Double.parseDouble(String.valueOf(eLebar.getText()));
        double Hasil = 2*(Panjang+Lebar);

        eHasil.setText(String.valueOf(Hasil));
        eHasil1.setText(String.valueOf(Hasil));
    };

}