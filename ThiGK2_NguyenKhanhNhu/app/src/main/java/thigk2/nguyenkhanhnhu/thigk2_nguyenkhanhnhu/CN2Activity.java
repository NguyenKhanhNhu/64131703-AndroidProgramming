package thigk2.nguyenkhanhnhu.thigk2_nguyenkhanhnhu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CN2Activity extends AppCompatActivity {
    EditText edtThang, edtNam, edtkq;
    Button btnKtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn2);
        edtThang = findViewById(R.id.edtThang);
        edtNam = findViewById(R.id.edtNam);
        edtkq = findViewById(R.id.edtkq);
        btnKtra = findViewById(R.id.btnKtra);

        btnKtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strThang = edtThang.getText().toString().trim();
                String strNam = edtNam.getText().toString().trim();

                if (strThang.equals("4") && strNam.equals("1975")) {
                    edtkq.setText("Đúng");
                } else {
                    edtkq.setText("Sai");
                }
            }
        });
    }
}