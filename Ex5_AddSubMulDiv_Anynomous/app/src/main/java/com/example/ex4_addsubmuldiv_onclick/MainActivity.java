package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng gắn với đkhien t.ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong =(Button) findViewById(R.id.btnCong);
        nutTru =(Button) findViewById(R.id.btnTru);
        nutNhan =(Button) findViewById(R.id.btnNhan);
        nutChia =(Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Xử lý cộng
    public void XuLyCong(View v){
        //Code xử lý cộng
        //b1. Lấy dữ liệu 2 số
        //b1.1 Tìm EditText số 1 và 2

        //b1.2. Lấy dữ liệu từ 2 dkhien đó
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tong = soA + soB;
        //b3. Hiện kq
        //b3.1
        EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        //b3.2 cbi dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.3. gắn kq lên đk
        editTextKQ.setText(chuoiKQ);
    }
    //Xử lý trừ
    public void XuLyTru(View v){
        //Code xử lý trừ
//b1. Lấy dữ liệu 2 số
        //b1.1 Tìm EditText số 1 và 2

        //b1.2. Lấy dữ liệu từ 2 dkhien đó
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Hieu = soA - soB;
        //b3. Hiện kq
        //b3.1

        //b3.2 cbi dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //B3.3. gắn kq lên đk
        editTextKQ.setText(chuoiKQ);
    }
    //Xử lý nhân
    public void XuLyNhan(View v){
        //Code xử lý nhân
        //b1. Lấy dữ liệu 2 số
        //b1.1 Tìm EditText số 1 và 2

        //b1.2. Lấy dữ liệu từ 2 dkhien đó
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tich = soA * soB;
        //b3. Hiện kq
        //b3.1

        //b3.2 cbi dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //B3.3. gắn kq lên đk
        editTextKQ.setText(chuoiKQ);

    }
    //xử lý chia
    public void XuLyChia(View v){
        //Code xuử lý chia
//b1. Lấy dữ liệu 2 số
        //b1.1 Tìm EditText số 1 và 2

        //b1.2. Lấy dữ liệu từ 2 dkhien đó
        String soThu1= editTextSo1.getText().toString();
        String soThu2= editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Thuong = soA / soB;
        //b3. Hiện kq
        //b3.1

        //b3.2 cbi dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //B3.3. gắn kq lên đk
        editTextKQ.setText(chuoiKQ);
    }
}