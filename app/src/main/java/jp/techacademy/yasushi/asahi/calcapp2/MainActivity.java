package jp.techacademy.yasushi.asahi.calcapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.text1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText text1;
    EditText text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);

        Button buttonDraw = (Button) findViewById(R.id.buttonDraw);
        buttonDraw.setOnClickListener(this);

        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(this);

        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(this);

        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
    }

    @Override
    public void onClick(View v) {
        double double1 = Double.parseDouble(text1.getText().toString());
        double double2 = Double.parseDouble(text2.getText().toString());
        double result;
        if (v.getId() == R.id.buttonAdd) {
            result = double1 + double2;
        } else if (v.getId() == R.id.buttonDraw) {
            result = double1 - double2;
        } else if (v.getId() == R.id.buttonMultiply) {
            result = double1 * double2;
        } else {
            result = double1 / double2;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }
}