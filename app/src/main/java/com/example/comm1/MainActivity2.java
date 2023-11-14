package com.example.comm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private TextView TextView;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView=findViewById(R.id.textView);
        button2=findViewById(R.id.button2);



        Bundle extras=getIntent().getExtras();
        if(extras!=null) {
            String message = extras.getString("Message2");
            TextView.setText(message);
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent=getIntent();
                returnIntent.putExtra("returnData","Heard!");
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });

    }
}