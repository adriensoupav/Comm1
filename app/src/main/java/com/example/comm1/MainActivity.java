package com.example.comm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Message1", "Bonjour- Message1");
                intent.putExtra("Message2", "Bonjour- Message2");
                intent.putExtra("Message3", "Bonjour- Message3");
                startActivity(intent);

            }
        });
    }
}