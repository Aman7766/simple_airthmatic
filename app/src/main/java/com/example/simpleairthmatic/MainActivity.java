package com.example.simpleairthmatic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

EditText p1,p2,m1,m2,mul1,mul2,d1,d2;
Button sum,minus,multi,divide;
TextView presult,mresult,mulresult,dresult;
int p1vf,p2vf,m1vf,m2vf,mu1vf,mu2vf,d1vf,d2vf;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1=(EditText) findViewById(R.id.p1);
        p2=(EditText)findViewById(R.id.p2);

        m1=(EditText) findViewById(R.id.m1);
        m2=(EditText)findViewById(R.id.m2);

        mul1=(EditText) findViewById(R.id.multi1);
        mul2=(EditText)findViewById(R.id.multi2);

        d1=(EditText) findViewById(R.id.d1);
        d2=(EditText)findViewById(R.id.d2);

        presult=(TextView)findViewById(R.id.result);
        mresult=(TextView)findViewById(R.id.mresult);
        mulresult=(TextView)findViewById(R.id.multiresult);
        dresult=(TextView)findViewById(R.id.dresult);

        sum=(Button)findViewById(R.id.sum);
        minus=(Button)findViewById(R.id.minus);
        multi=(Button)findViewById(R.id.multi);
        divide=(Button)findViewById(R.id.divide);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1vf=Integer.parseInt(m1.getText().toString());
                m2vf=Integer.parseInt(m2.getText().toString());

                int fresult=m1vf-m2vf;


                mresult.setText("" +fresult);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mu1vf=Integer.parseInt(mul1.getText().toString());
                mu2vf=Integer.parseInt(mul2.getText().toString());

                int fresult=mu1vf*mu2vf;


                mulresult.setText("" +fresult);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1vf=Integer.parseInt(d1.getText().toString());
                d2vf=Integer.parseInt(d2.getText().toString());

                int fresult=d1vf/d2vf;


                dresult.setText("" +fresult);
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1vf=Integer.parseInt(p1.getText().toString());
                p2vf=Integer.parseInt(p2.getText().toString());

                int fresult=p1vf+p2vf;


                presult.setText(""+fresult);

            }
        });





    }


}
