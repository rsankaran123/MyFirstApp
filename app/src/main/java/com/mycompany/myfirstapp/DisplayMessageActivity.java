package com.mycompany.myfirstapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.*;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        LinearLayout LL = new LinearLayout(this);
        LL.setBackgroundColor(Color.CYAN);
        LL.setOrientation(LinearLayout.VERTICAL);

        LayoutParams LLParams = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);

        LL.setWeightSum(6f);
        LL.setLayoutParams(LLParams);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.hello_world);

        TextView textView1 = new TextView(this);
        textView1.setTextSize(40);
        textView1.setText(hello);

        LL.addView(textView);
        LL.addView(textView1);
        setContentView(LL);

    }

}
