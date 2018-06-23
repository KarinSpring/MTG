package mtgproject.spring.com.mtg1project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        //zum Spielemenü (btnPlay)
        Button btnPlay = findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);

        //zum Tauschmenü (btnTrade)
        Button btnTrade = findViewById(R.id.btnTrade);
        btnTrade.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnPlay:
                Intent playIntent1 = new Intent(MainActivity.this, PlayActivity.class);
                Intent playIntent2 = new Intent(MainActivity.this, CoinActivity.class);
                startActivityForResult(playIntent1, 0);
                startActivityForResult(playIntent2,0);
                break;

            case R.id.btnTrade:
                Intent tradeIntent1 = new Intent(MainActivity.this, TradeActivity.class);
                startActivityForResult(tradeIntent1, 0);
                break;
    } }
}