package com.example.acer.myrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button Ffood, chinese, bbq, sweet;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ffood = (Button) findViewById(R.id.fastfood_id);
        chinese =  (Button) findViewById(R.id.Chinese_id);
        bbq =  (Button) findViewById(R.id.barbq_id);
        sweet =  (Button) findViewById(R.id.dessert_id);

        Ffood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fastintent = new Intent(MainActivity.this, Recipelist.class);
                fastintent.putExtra("name1", Ffood.getText());
                startActivity(fastintent);
            }
        });

        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chineseintent = new Intent(MainActivity.this, Recipelist.class);
                chineseintent.putExtra("name1", chinese.getText());
                startActivity(chineseintent);
            }
        });

        bbq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bbqintent = new Intent(MainActivity.this, Recipelist.class);
                bbqintent.putExtra("name1", bbq.getText());
                startActivity(bbqintent);
            }
        });


        sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sweetintent = new Intent(MainActivity.this, Recipelist.class);
                sweetintent.putExtra("name1", sweet.getText());
                startActivity(sweetintent);
            }
        });



    }
}
