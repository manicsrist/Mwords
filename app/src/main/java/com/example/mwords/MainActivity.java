package com.example.mwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Numbers(View view) {
        final Intent intent = new Intent(this,NumbersActivity.class);
        Button Number = (Button) findViewById(R.id.numbers);
        Number.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }

    public void Family(View view){
        final Intent intent=new Intent(this,FamilyActivity.class);
        Button family=(Button)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });



    }
    public void Phrases(View view){
        final Intent intent=new Intent(this,PhraseActivity.class);
        Button phrase=(Button)findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });



    }

    public void Color(View view){
        final Intent intent=new Intent(this,ColorActivity.class);
        Button colour=(Button)findViewById(R.id.colour);
        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });



    }

}