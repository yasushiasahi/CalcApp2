package jp.techacademy.yasushi.asahi.calcapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double value = intent.getDoubleExtra("RESULT", 0);

        TextView textView = (TextView) findViewById(R.id.result2);
        textView.setText(String.valueOf(value));
    }
}
