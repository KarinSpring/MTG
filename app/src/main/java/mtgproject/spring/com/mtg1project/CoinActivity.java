package mtgproject.spring.com.mtg1project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import android.app.Activity;
import android.view.animation.RotateAnimation;
import android.widget.Toast;


public class CoinActivity extends Activity {

    //Flip Coin
    //Source http://nbasercode.com/android/android-how-to-develop-simple-coin-flip-application/
    Button btnFlipCoin;
    ImageView imgCoin;
    Random random;
    int coinSideCount; //heads: 0 and tails: 1

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);


        btnFlipCoin = findViewById(R.id.btnFlip);
        imgCoin = findViewById(R.id.imgCoin);
        random = new Random();

        btnFlipCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinSideCount = random.nextInt(2);

                if (coinSideCount == 0) {
                    imgCoin.setImageResource(R.drawable.heads);
                    Toast.makeText(CoinActivity.this, "Heads", Toast.LENGTH_SHORT).show();
                } else if (coinSideCount == 1) {
                    imgCoin.setImageResource(R.drawable.tails);
                    Toast.makeText(CoinActivity.this, "Tails", Toast.LENGTH_SHORT).show();
                }

                RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                rotateAnimation.setDuration(1000);
                imgCoin.startAnimation(rotateAnimation);
            }
        });
    }
}

