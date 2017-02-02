package com.kilograpp.testmerge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by melkshake on 02.02.17.
 */

public class MelkshakeActivity extends Activity {

    private boolean isImageVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melkshake);

        findViewById(R.id.btn_show_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isImageVisible) {
                    findViewById(R.id.ib_image_container).setVisibility(View.GONE);
                    isImageVisible = false;
                } else {







                    findViewById(R.id.ib_image_container).setVisibility(View.VISIBLE);
                    isImageVisible = true;
                }
            }
        });
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MelkshakeActivity.class);
        starter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(starter);
    }
}
