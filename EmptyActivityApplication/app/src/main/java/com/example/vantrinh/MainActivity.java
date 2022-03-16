package com.example.vantrinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView  Cbutton ;
    private TextView  addsubtractbutton ;
    private TextView percentButton ;
    private TextView zeroButton ;
    private TextView oneButton ;
    private TextView twoButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cbutton = findViewById(R.id.Cbutton);
        addsubtractbutton = findViewById(R.id.addMinusButton);
        zeroButton = findViewById(R.id.zeroButton);
        oneButton = findViewById(R.id.oneButton);

    }

}