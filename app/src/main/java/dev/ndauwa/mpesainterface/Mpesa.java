package dev.ndauwa.mpesainterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mpesa extends AppCompatActivity {
    private Button withdraw;
    private Button buy_air;
    private Button loans;
    private Button lipa;
    private Button account;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mpesa);
        withdraw =findViewById(R.id.withdraw_cash);
        buy_air = findViewById(R.id.buy_airtime);
        loans = findViewById(R.id.loan_saving);
        lipa =  findViewById(R.id.lipa_mpesa);
        account =  findViewById(R.id.my_account);

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mpesa.this, withdraw.class);
                startActivity(intent);
            }
        });
        buy_air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mpesa.this, Buy_air.class);
                startActivity(intent);
            }
        });
        loans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mpesa.this, Loan_Savings.class);
                startActivity(intent);
            }
        });
        lipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mpesa.this, lipa.class);
                startActivity(intent);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mpesa.this, Account.class);
                startActivity(intent);
            }
        });

    }
}
