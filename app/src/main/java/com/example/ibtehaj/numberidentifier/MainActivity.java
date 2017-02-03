package com.example.ibtehaj.numberidentifier;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterNum;
    private TextView ansTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNum = (EditText) findViewById(R.id.enterNum);
        ansTextField = (TextView) findViewById(R.id.ansTextField);
    }

    public void onClick(View view){
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        try {
        String n = enterNum.getText().toString();

            String num =n.substring(0,3);


            if (num.equals("034")) {
                ansTextField.setText("The Number is TELENOR");
            } else if (num.equals("030")) {
                ansTextField.setText("The Number is JAZZ/MOBLINK");
            } else if (num.equals("032")) {
                ansTextField.setText("The Number is WARID");
            } else if (num.equals("031")) {
                ansTextField.setText("The Number is ZONG");
            } else if (num.equals("033")) {
                ansTextField.setText("The Number is UFONE");
            } else if (num.equals("035")) {
                ansTextField.setText("Special Communication Organization");
            } else {
                ansTextField.setText("SORRY! BUT NUMBER YOU TYPED IS NOT ACCEPTABLE...");
            }
        }
        catch (Exception e){
        }






    }
}
