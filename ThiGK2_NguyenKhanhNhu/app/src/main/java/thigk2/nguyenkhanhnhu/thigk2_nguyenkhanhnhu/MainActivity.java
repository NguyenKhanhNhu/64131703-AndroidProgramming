package thigk2.nguyenkhanhnhu.thigk2_nguyenkhanhnhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgAvatar;
    Button nutc1;
    Button nutc2;
    Button nutc3;
    Button nutc4;
    void TimDieuKhien(){
        nutc1 = (Button) findViewById(R.id.btncn2);
        nutc2 = (Button) findViewById(R.id.btncn3);
        nutc3 = (Button) findViewById(R.id.btncn4);
        nutc4 = (Button) findViewById(R.id.btnabout);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ImageView imgAvatar = findViewById(R.id.imageView);
        imgAvatar.setImageResource(R.drawable.anh1);
        // Gắn bộ lắng nghe sự kiện
        nutc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCN2 = new Intent(MainActivity.this, CN2Activity.class);
                //B2 gửi:
                startActivity(intentCN2);
            }
        });
        nutc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH2.class)
                Intent intentCN3 = new Intent(MainActivity.this, CN3Activity.class);
                //B2 gửi:
                startActivity(intentCN3);
            }
        });
        nutc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH3.class)
                Intent intentCN4 = new Intent(MainActivity.this, CN4Activity.class);
                //B2 gửi:
                startActivity(intentCN4);
            }
        });
        nutc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo intent 2 tham số (MH hiện tại.this> MH3.class)
                Intent intentAboutMe = new Intent(MainActivity.this, AboutMeActivity.class);
                //B2 gửi:
                startActivity(intentAboutMe);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}