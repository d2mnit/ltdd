package com.example.ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button bntoke,bntthoat;
   TextView texttitle;
   EditText userdtt,pwedt;
   Switch onoff;
   ImageView background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        Batsukien();
    }

    private void Batsukien()
    {
        bntoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userdtt.getText().toString().equals("admin") && (pwedt.getText().toString().equals("123")))
                {
                    Toast.makeText(MainActivity.this ,"Login Successful",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Username or password are wrong",Toast.LENGTH_LONG).show();
                }
            }
        });
        bntthoat.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        }));

        onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    background.setVisibility(View.VISIBLE);
                }else {
                    background.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void Anhxa() {
        bntthoat = findViewById(R.id.bntthoat);
        bntoke = findViewById(R.id.bntoke);
        userdtt = findViewById(R.id.user);
        pwedt = findViewById(R.id.password);
        texttitle = findViewById(R.id.txtHello);
    }
}