package com.kilograpp.testmerge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by kepar on 02.02.17.
 */

public class IlyichActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilyich);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, IlyichActivity.class);
        context.startActivity(starter);
    }
}
