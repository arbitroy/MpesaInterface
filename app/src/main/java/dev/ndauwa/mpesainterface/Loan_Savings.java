package dev.ndauwa.mpesainterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Loan_Savings extends AppCompatActivity {
    private Button mshwari;
    private Button kcb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loan_saving);
        mshwari = findViewById(R.id.mshwari);
        kcb =  findViewById(R.id.kcb);

        mshwari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Loan_Savings.this, Mshwari.class);
                startActivity(intent);
            }
        });
        kcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Loan_Savings.this, Kcb.class);
                startActivity(intent);
            }
        });
    }
}
