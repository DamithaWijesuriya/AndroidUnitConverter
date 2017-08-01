package com.example.hsenid.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConverterActivity extends AppCompatActivity {

    private double centemeer;
    private double inch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }



    public void toConvert(View view) {

        EditText CM=(EditText)findViewById(R.id.centemeter);
        EditText Inch=(EditText)findViewById(R.id.inch);

        if(!CM.getText().toString().matches(""))
        {
            inch=Double.valueOf(CM.getText().toString())*0.393701;
            Inch.setText(String.valueOf( inch));
        }
        else
        {
            Toast.makeText(getApplicationContext(),"No value entered !!!!",Toast.LENGTH_SHORT);
        }
    }

    public void convertToCM(View view) {
        EditText Inch=(EditText)findViewById(R.id.inch);
        EditText CM=(EditText)findViewById(R.id.centemeter);

        if(!Inch.getText().toString().matches(""))
        {
            centemeer=Double.valueOf(Inch.getText().toString())/0.393701;
            CM.setText(String.valueOf(centemeer));
        }
        else {
            Toast.makeText(getApplicationContext(),"No Value entered!!",Toast.LENGTH_SHORT);
        }
    }
}
