package thigk2.nguyenkhanhnhu.thigk2_nguyenkhanhnhu;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CN3Activity extends AppCompatActivity {

    ListView listViewNCM;
    ArrayList<String> dsNhacCachMang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewNCM = findViewById(R.id.lvNCM);
        dsNhacCachMang = new ArrayList<String>();
        dsNhacCachMang.add("Tiến về Sài Gòn");
        dsNhacCachMang.add("Giải phóng Miền Nam");
        dsNhacCachMang.add("Đất nước trọn niềm vui");
        dsNhacCachMang.add("Bài ca thống nhất");
        dsNhacCachMang.add(".....");

        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsNhacCachMang);
        listViewNCM.setAdapter(adapterNNLT);

        listViewNCM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon = dsNhacCachMang.get(position);
                Toast.makeText(CN3Activity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}