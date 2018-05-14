package com.example.dinusha.todolist;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout =(ConstraintLayout) findViewById(R.id.layoutmain);
        TextView textView = new TextView(getApplicationContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(layoutParams);
        textView.setText("setting text to me...");
        constraintLayout.addView(textView);

        TextView textView1 ;

        textView1= (TextView) findViewById(R.id.txthl);
        textView1.setText("todayyyyyyyy");
    }
}
