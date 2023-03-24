package dev.ndauwa.mpesainterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Safaricom extends AppCompatActivity {
    private Button my_acc_plus;
    private Button banking;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plus);
        my_acc_plus = findViewById(R.id.account_plus);
        banking = findViewById(R.id.banking);
        my_acc_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Safaricom.this,accountplus.class);
                startActivity(intent);
            }
        });
        banking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Safaricom.this,m_banking.class);
                startActivity(intent);
            }
        });
    }
}
