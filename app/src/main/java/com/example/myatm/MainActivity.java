package com.example.myatm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView miha = findViewById(R.id.miha);
        TextView ac = findViewById(R.id.aca);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Button wbtn = findViewById(R.id.wbtn);
                String n = adapterView.getItemAtPosition(i).toString();
                wbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        miha.setText(Withdraw.wd(miha.getText(), n, ac.getText()));
                        ac.setText(Withdraw.wdm(ac.getText(),n));
                    }
                });
                Button dbtn = findViewById(R.id.dbtn);
                dbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ac.setText(Deposit.dp(ac.getText(), n, miha.getText()));
                        miha.setText(Deposit.dpm(miha.getText(),n));
                    }
                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}