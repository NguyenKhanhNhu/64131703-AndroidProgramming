package com.example.ot_gk;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class C4Activity extends AppCompatActivity {
    ImageView imgAvatar;
    TextView tvten, tvmssv, tvlop, tvmhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_c4);
        ImageView imgAvatar = findViewById(R.id.imageView);
        imgAvatar.setImageResource(R.drawable.anh);
        tvten = findViewById(R.id.textView);
        tvmssv = findViewById(R.id.textView2);
        tvlop = findViewById(R.id.textView3);
        tvmhp = findViewById(R.id.textView4);
    }
}