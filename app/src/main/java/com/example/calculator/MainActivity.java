package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText num1,num2,num3;
Button btnTambah,btnKurang,btnKali,btnBagi,btnClear;
TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnClear = findViewById(R.id.btnClear);
        hasil = findViewById(R.id.hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()){
                    tambah();
                }else{
                    Toast.makeText(MainActivity.this,"Nilai Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }

            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()){
                   kurang();
                }else{
                    Toast.makeText(MainActivity.this,"Nilai Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()){
                    kali();
                }else{
                    Toast.makeText(MainActivity.this,"Nilai Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!num1.getText().toString().isEmpty() && !num2.getText().toString().isEmpty() && !num3.getText().toString().isEmpty()){
                    bagi();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("0");
            }
        });
    }

    private void bagi() {
        double a1 = Double.parseDouble(num1.getText().toString());
        double a2 = Double.parseDouble(num2.getText().toString());
        double a3 = Double.parseDouble(num3.getText().toString());
        double res = a1 / a2 / a3;
        hasil.setText(res+" ");
    }

    private void kali() {
        int a1 = Integer.parseInt(num1.getText().toString());
        int a2 = Integer.parseInt(num2.getText().toString());
        int a3 = Integer.parseInt(num3.getText().toString());
        int res = a1 * a2 * a3;
        hasil.setText(res+" ");
    }

    private void kurang() {
        int a1 = Integer.parseInt(num1.getText().toString());
        int a2 = Integer.parseInt(num2.getText().toString());
        int a3 = Integer.parseInt(num3.getText().toString());
        int res = a1 - a2 - a3;
        hasil.setText(res+" ");
    }

    private void tambah() {
        int a1 = Integer.parseInt(num1.getText().toString());
        int a2 = Integer.parseInt(num2.getText().toString());
        int a3 = Integer.parseInt(num3.getText().toString());
        int res = a1 +a2 + a3;
        hasil.setText(res+" ");
    }
}
