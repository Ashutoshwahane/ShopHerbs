package com.omkar.shopherb.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.omkar.shopherb.R;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    Button checkout;
    TextView one, two, three, four, total;
    TextView pp,pm,pb,mb,ps,ms,pw,mw,pl,ml;
    TextView paraZero,bananaZero,syrupZero,weedZero,lastZero;
    int banana = 55, paracetamol = 60, syrup = 15, weed = 40, last =100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        pp = findViewById(R.id.plusPara);
        pm = findViewById(R.id.minusPara);
        pb = findViewById(R.id.plusBanana);
        pm = findViewById(R.id.minusBanana);
        ps = findViewById(R.id.plusSyrup);
        ms = findViewById(R.id.minusSyrup);
        pw = findViewById(R.id.plusWeed);
        mw = findViewById(R.id.minusWeed);
        pl = findViewById(R.id.lastplus);
        ml = findViewById(R.id.lastminus);

        paraZero = findViewById(R.id.zeroPara);
        bananaZero = findViewById(R.id.zeroBanana);
        syrupZero = findViewById(R.id.zeroSyrup);
        weedZero = findViewById(R.id.zeroweed);
        lastZero = findViewById(R.id.lastzero);

        pp.setOnClickListener(this);
        pm.setOnClickListener(this);
        ps.setOnClickListener(this);
        ms.setOnClickListener(this);
        pb.setOnClickListener(this);
        mb.setOnClickListener(this);
        pw.setOnClickListener(this);
        mw.setOnClickListener(this);
        pl.setOnClickListener(this);
        ml.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){


            case R.id.plusPara : {
                // plus para
            }

            case R.id.minusPara : {
                // minus para
            }

            case R.id.plusBanana : {
                // plus banana
            }

            case R.id.minusBanana : {
                // minus banana
            }

            case R.id.plusSyrup : {
                //
            }


        }

    }
}
