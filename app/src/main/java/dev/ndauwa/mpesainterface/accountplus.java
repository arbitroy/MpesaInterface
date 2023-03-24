package dev.ndauwa.mpesainterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class accountplus extends AppCompatActivity {

    private Button enquiry;
    private Button top_up;
    private Button self_care;
    private Button customer_care;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccountplus);
        enquiry = findViewById(R.id.balance_enquiry);
        top_up  = findViewById(R.id.top_up);
        self_care = findViewById(R.id.self_care);
        customer_care = findViewById(R.id.customer_care);

        enquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(accountplus.this, enquiry.class);
                startActivity(intent);
            }
        });

        top_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(accountplus.this, top_up.class);
                startActivity(intent);
            }
        });

        self_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(accountplus.this, selfcare.class);
                startActivity(intent);
            }
        });

        customer_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(accountplus.this, customer.class);
                startActivity(intent);
            }
        });
    }
}
