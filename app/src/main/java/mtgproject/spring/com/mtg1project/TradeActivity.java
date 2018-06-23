package mtgproject.spring.com.mtg1project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TradeActivity  extends Activity {

    //https://docs.tcgplayer.com/v1.10.0/reference#stores
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trade);
        btn = findViewById(R.id.btnBack);
        btn.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent backIntent = new Intent( TradeActivity.this, MainActivity.class);
                startActivityForResult(backIntent, 0);
            }
        });
    }
}

