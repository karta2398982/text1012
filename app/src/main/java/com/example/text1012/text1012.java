package com.example.text1012;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import text1012.xml.ResultActivity;

public class text1012 extends AppCompatActivity {

    private Button submit;
    private Button help;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text1012);
        submit = (Button) this.findViewById(R.id.submit);
        help = (Button) this.findViewById(R.id.help);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(text1012.this, ResultActivity.class);
                startActivity(intent);

            }

        });
                help.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(text1012.this, page3.class);
            startActivity(intent);

        }
        });

    }

}







