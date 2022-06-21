package com.shriganeshsaini.newandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edFistValue,edSceValue;
    TextView tvAns;
    Button add,subtract, multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate SEC", Toast.LENGTH_SHORT).show();

        edFistValue = findViewById(R.id.edFistValue);
        edSceValue = findViewById(R.id.edSecValue);

        tvAns = findViewById(R.id.edAns);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMult);
        divide = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(edFistValue.getText().toString());
                secondValue = Integer.parseInt(edSceValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Ans is = "+ans);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int firstValue,secondValue,ans;
                    firstValue = Integer.parseInt(edFistValue.getText().toString());
                    secondValue = Integer.parseInt(edSceValue.getText().toString());

                    ans = firstValue - secondValue;

                    tvAns.setText("Ans is = "+ans);

                }
            });
        multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int firstValue,secondValue,ans;
                    firstValue = Integer.parseInt(edFistValue.getText().toString());
                    secondValue = Integer.parseInt(edSceValue.getText().toString());

                    ans = firstValue * secondValue;

                    tvAns.setText("Ans is = "+ans);

                }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double firstValue,secondValue,ans;
                firstValue = Double.parseDouble(edFistValue.getText().toString());
                secondValue = Double.parseDouble(edSceValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Ans is = " + String.format("%.4f",ans));

            }
        });





    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStartSEC", Toast.LENGTH_SHORT).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResumeSEC", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPauseSCE", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStopSCE", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroySCE", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestartSCE", Toast.LENGTH_SHORT).show();
    }
}