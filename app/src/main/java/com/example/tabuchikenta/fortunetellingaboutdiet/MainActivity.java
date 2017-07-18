package com.example.tabuchikenta.fortunetellingaboutdiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView resultText;
    private TextView luckyColorText;
    private TextView luckyAction;
    private Button button;
    private FotuneTeller teller = new FotuneTeller(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.resultText = (TextView)findViewById(R.id.resultText);
        this.luckyColorText = (TextView)findViewById(R.id.luckyColorText);
        this.luckyAction = (TextView)findViewById(R.id.luckyAction);
        this.button = (Button)findViewById(R.id.button);

        this.button.setOnClickListener(this);
        Log.d("test2",teller.getFotune());
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            resultText.setText(teller.getFotune());
            luckyColorText.setText((teller.getLuckyColor()));
            luckyAction.setText((teller.getLuckyAction()));
        }
    }
}
