package dev.ndauwa.mpesainterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lipa extends AppCompatActivity {
    private Button paybill;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lipa);
        paybill =  findViewById(R.id.paybill);
        paybill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lipa.this, Paybill.class);
                startActivity(intent);
            }
        });
    }
}
