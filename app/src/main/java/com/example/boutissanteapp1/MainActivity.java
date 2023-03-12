package com.example.boutissanteapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    TextView text1,text2;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup =  findViewById(R.id.radioGroup);
        btnDisplay = findViewById(R.id.btnCalculer);
        text1 =  findViewById(R.id.text1);
        text2 =  findViewById(R.id.text2);
        edt = findViewById(R.id.val);
        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton =  findViewById(selectedId);
                double cal1 ,cal2;
                int val = Integer.parseInt(edt.getText().toString());
                if(radioButton.getText().equals("EUR")){
                    cal1 = val * 1.07;
                    cal2 = val * 11.02;
                    text1.setText("USD : "+cal1);
                    text2.setText("MAD : "+cal2);

                } else if (radioButton.getText().equals("USD")) {
                    cal1 = val * 0.94;
                    cal2 = val * 10.34;
                    text1.setText("EUR : "+cal1);
                    text2.setText("MAD : "+cal2);
                }
                else if (radioButton.getText().equals("MAD")) {
                    cal1 = val * 0.091;
                    cal2 = val * 0.097;
                    text1.setText("EUR : "+cal1);
                    text2.setText("USD : "+cal2);
                }

            }

        });
    }
}