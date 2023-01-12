package com.example.mycalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // タイトル入力欄
    private EditText etTitle;
    //場所入力欄
    private EditText etPlace;
    //予定追加ボタン
    private Button btAddPlan;
    //予定詳細画面へ遷移するためのボタン
    private ImageButton ibtReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ビューの変数を初期化する
        etTitle = findViewById(R.id.etTitle);
        etPlace = findViewById(R.id.etPlace);
        btAddPlan = findViewById(R.id.btAddPlan);
        ibtReturn = findViewById(R.id.ibtReturn);

        btAddPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}