package dev.ndauwa.mpesainterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button safaricom;
    private Button m_pesa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stk_main);
        safaricom = findViewById(R.id.safaricom);
        m_pesa = findViewById(R.id.m_pesa);
        safaricom.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Safaricom.class);
            startActivity(intent);
        });
        m_pesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Mpesa.class);
                startActivity(intent);
            }
        });


    }


}