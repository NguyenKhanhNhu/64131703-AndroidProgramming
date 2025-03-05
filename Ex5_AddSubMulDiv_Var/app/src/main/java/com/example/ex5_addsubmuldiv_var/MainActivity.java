package com.example.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    Button nutCong, nutTru, nutNhan, nutChia;
    TextView tvKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm view
        TimView();

        // Gắn các bộ lắng nghe
        nutCong.setOnClickListener(boLangNghe_XuLyCong);
        nutTru.setOnClickListener(boLangNghe_XuLyTru);
        nutNhan.setOnClickListener(boLangNghe_XuLyNhan);
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code xử lý chia ở đây
                String strSo1 = edtSoA.getText().toString();
                String strSo2 = edtSoB.getText().toString();
                double soA = Double.parseDouble(strSo1);
                double soB = Double.parseDouble(strSo2);
                double thuong = soA / soB;
                tvKQ.setText(String.valueOf(thuong));
            }
        });
    }

    // Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double tong = soA + soB;
            tvKQ.setText(String.valueOf(tong));
        }
    };

    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double hieu = soA - soB;
            tvKQ.setText(String.valueOf(hieu));
        }
    };

    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double tich = soA * soB;
            tvKQ.setText(String.valueOf(tich));
        }
    };

    public void TimView() {
        edtSoA = findViewById(R.id.edtSo1);
        edtSoB = findViewById(R.id.edtSo2);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
        tvKQ = findViewById(R.id.tvKetQua);
    }
}
