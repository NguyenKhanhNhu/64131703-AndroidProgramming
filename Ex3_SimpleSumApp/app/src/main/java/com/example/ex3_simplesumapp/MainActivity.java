package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dl về ở điều kiển số a
        String strA= editTextSoA.getText().toString();
        //Lấy dl về ở điều kiển số b
        String strB= editTextSoB.getText().toString();

        //Chuyển dl sang dạng số
        int so_A= Integer.parseInt(strA); //2
        int so_B= Integer.parseInt(strB); //4

        //Tính toán theo ycau
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        //Hien ra mh
        editTextKetQua.setText(strTong);
    }
}