package com.kilograpp.testmerge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Тут переход на экран

                //Тут переход на экран

                //Тут переход на экран

            }
        });

        findViewById(R.id.btn_go_melkshake).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MelkshakeActivity.start(getApplication());
            }





        });

    }
}
