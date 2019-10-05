package com.poliban.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btJunai = findViewById(R.id.btJunai);
        Button btAndi = findViewById(R.id.btAndi);
        Button btSari = findViewById(R.id.btSari);
        Button btVita = findViewById(R.id.btVita);
        //pasang object Button dengan listener onClick listener
        //
        btJunai.setOnClickListener(this);
        btAndi.setOnClickListener(this);
        btSari.setOnClickListener(this);
        btVita.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //penanganan kejadian (event handler)
        switch (view.getId()) {
            case R.id.btAndi :
                Toast.makeText(this, "Hi Andi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSari :
                Toast.makeText(this, "Hi Sari", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btJunai :
                Toast.makeText(this, "Hi Junai", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btVita :
                Toast.makeText(this, "Hi Vita", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
