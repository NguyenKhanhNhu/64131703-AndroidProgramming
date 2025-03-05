package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với điều khiển tương ứng
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetQua);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        // Gắn bộ lắng nghe sự kiện cho từng nút
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CHIA();
            }
        });
    }

    void XULY_CONG() {
        float num1 = Float.parseFloat(editTextSo1.getText().toString());
        float num2 = Float.parseFloat(editTextSo2.getText().toString());
        float tong = num1 + num2;
        editTextKQ.setText(String.valueOf(tong));
    }

    void XULY_TRU() {
        float num1 = Float.parseFloat(editTextSo1.getText().toString());
        float num2 = Float.parseFloat(editTextSo2.getText().toString());
        float hieu = num1 - num2;
        editTextKQ.setText(String.valueOf(hieu));
    }

    void XULY_NHAN() {
        float num1 = Float.parseFloat(editTextSo1.getText().toString());
        float num2 = Float.parseFloat(editTextSo2.getText().toString());
        float tich = num1 * num2;
        editTextKQ.setText(String.valueOf(tich));
    }

    void XULY_CHIA() {
        float num1 = Float.parseFloat(editTextSo1.getText().toString());
        float num2 = Float.parseFloat(editTextSo2.getText().toString());
        if (num2 != 0) {
            float thuong = num1 / num2;
            editTextKQ.setText(String.valueOf(thuong));
        } else {
            editTextKQ.setText("Lỗi: Chia cho 0");
        }
    }
}
