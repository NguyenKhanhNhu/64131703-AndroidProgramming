package com.example.ot_gk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class C1Activity extends AppCompatActivity {
    EditText editTextSoa;
    EditText editTextSob;
    EditText editTextKQ;
    Button nuttinhtong;

    void TimDieuKhien() {
        editTextSoa = findViewById(R.id.edta);
        editTextSob = findViewById(R.id.edtb);
        editTextKQ = findViewById(R.id.edtkq);
        nuttinhtong = findViewById(R.id.btnTinhTong);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_c1);
        TimDieuKhien();

        // Gắn bộ lắng nghe sự kiện cho từng nút
        nuttinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        });


    }

    void XULY_CONG() {
        float num1 = Float.parseFloat(editTextSoa.getText().toString());
        float num2 = Float.parseFloat(editTextSob.getText().toString());
        float tong = num1 + num2;
        editTextKQ.setText(String.valueOf(tong));
    }


}