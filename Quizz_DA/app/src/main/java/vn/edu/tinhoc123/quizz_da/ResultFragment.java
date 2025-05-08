package vn.edu.tinhoc123.quizz_da;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public class ResultFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);

        // Ánh xạ view
        TextView tvDiem = v.findViewById(R.id.tvDiem);
        TextView tvScore = v.findViewById(R.id.tvScore);
        LinearLayout llDetails = v.findViewById(R.id.llDetails);
        ImageButton btnHome = v.findViewById(R.id.btnHome);

        // Nhận dữ liệu từ bundle
        Bundle bundle = getArguments();
        int correct = bundle.getInt("correct");
        int total = bundle.getInt("total");
        List<String> details = bundle.getStringArrayList("details");

        // Hiển thị điểm
        tvDiem.setText(String.valueOf(correct));
        tvScore.setText("Bạn đúng " + correct + " / " + total + " câu");

        // Hiển thị chi tiết đáp án
        if (details != null && !details.isEmpty()) {
            for (String detail : details) {
                // Tách nội dung detail thành các phần
                String[] parts = detail.split("\n");
                String questionAndUserAns = parts[0] + "\n" + parts[2]; // Câu hỏi và đáp án người dùng
                String correctAns = parts[1]; // Đáp án đúng

                // TextView cho câu hỏi và đáp án người dùng (khung trắng)
                TextView tvQuestionUser = new TextView(getContext());
                tvQuestionUser.setText(questionAndUserAns);
                tvQuestionUser.setTextSize(18);
                tvQuestionUser.setPadding(24, 16, 24, 16);
                tvQuestionUser.setTextColor(Color.parseColor("#4F3054"));

                GradientDrawable bgWhite = new GradientDrawable();
                bgWhite.setColor(Color.parseColor("#FFFFFF")); // Nền trắng
                bgWhite.setCornerRadius(24); // Bo góc 24dp
                tvQuestionUser.setBackground(bgWhite);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(0, 16, 0, 8); // Margin trên và dưới
                tvQuestionUser.setLayoutParams(params);

                llDetails.addView(tvQuestionUser);

                // TextView cho đáp án đúng (khung hồng)
                TextView tvCorrect = new TextView(getContext());
                tvCorrect.setText(correctAns);
                tvCorrect.setTextSize(18);
                tvCorrect.setPadding(24, 16, 24, 16);
                tvCorrect.setTextColor(Color.parseColor("#4F3054"));

                GradientDrawable bgPink = new GradientDrawable();
                bgPink.setColor(Color.parseColor("#FCE2CE")); // Nền hồng nhạt
                bgPink.setCornerRadius(24); // Bo góc 24dp
                tvCorrect.setBackground(bgPink);

                LinearLayout.LayoutParams paramsCorrect = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                paramsCorrect.setMargins(0, 8, 0, 8); // Margin trên và dưới
                tvCorrect.setLayoutParams(paramsCorrect);

                llDetails.addView(tvCorrect);
            }
        }

        // Nút về màn hình chính
        btnHome.setOnClickListener(view -> {
            getParentFragmentManager().popBackStack(null,
                    androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
        });

        return v;
    }
}