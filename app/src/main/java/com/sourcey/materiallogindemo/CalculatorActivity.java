package com.sourcey.materiallogindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        et1 = findViewById(R.id.edit1);
        et2 = findViewById(R.id.edit2);
        tvHasil = findViewById(R.id.texthasil);
        btnHitung = findViewById(R.id.button);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();
                if (str1.equals("") || str2.equals("")){
                    Toast.makeText(CalculatorActivity.this, "Data Kosong", Toast.LENGTH_SHORT).show();
                }else {

                    int angka1 = Integer.parseInt(str1);
                    int angka2 = Integer.parseInt(str2);

                    int hasil = angka1 % angka2;

                    tvHasil.setText(hasil+"");
                }
            }
        });
    }
}
