package com.example.ot_gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button nutc1;
    Button nutc2;
    Button nutc3;
    Button nutc4;
    void TimDieuKhien(){
        nutc1 = (Button) findViewById(R.id.btnc1);
        nutc2 = (Button) findViewById(R.id.btnc2);
        nutc3 = (Button) findViewById(R.id.btnc3);
        nutc4 = (Button) findViewById(R.id.btnc4);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        // Gắn bộ lắng nghe sự kiện
        nutc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentC1 = new Intent(MainActivity.this, C1Activity.class);
                //B2 gửi:
                startActivity(intentC1);
            }
        });
        nutc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH2.class)
                Intent intentC2 = new Intent(MainActivity.this, C2Activity.class);
                //B2 gửi:
                startActivity(intentC2);
            }
        });
        nutc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH3.class)
                Intent intentC3 = new Intent(MainActivity.this, C3Activity.class);
                //B2 gửi:
                startActivity(intentC3);
            }
        });
        nutc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH3.class)
                Intent intentC4 = new Intent(MainActivity.this, C4Activity.class);
                //B2 gửi:
                startActivity(intentC4);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}