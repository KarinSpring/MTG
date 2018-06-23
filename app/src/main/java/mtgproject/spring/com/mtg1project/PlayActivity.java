package mtgproject.spring.com.mtg1project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class PlayActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);

        //Buttons Lifepoints
        Button btnPlus10 = findViewById(R.id.btnPlus10);
        Button btnPlus5 = findViewById(R.id.btnPlus5);
        Button btnPlus1 = findViewById(R.id.btnPlus1);
        Button btnMinus10 = findViewById(R.id.btnMinus10);
        Button btnMinus5 = findViewById(R.id.btnMinus5);
        Button btnMinus1 = findViewById(R.id.btnMinus1);

        //EditText Lifepoint
        EditText showLP = findViewById(R.id.showLP);


        //Liste der Buttons für LP
        List<Button> lpbtn = new ArrayList<>();
        lpbtn.add(btnMinus1);
        lpbtn.add(btnMinus5);
        lpbtn.add(btnMinus10);
        lpbtn.add(btnPlus1);
        lpbtn.add(btnPlus5);
        lpbtn.add(btnPlus10);

        for(Button button : lpbtn)
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Button b = (Button) view;

                    EditText showLP = findViewById(R.id.showLP);
                    int lpzahl = Integer.parseInt(showLP.getText() + "");

                    int operation = Integer.parseInt(b.getText()+"".replaceAll("\\s",""));

                    lpzahl += operation;
                    showLP.setText(lpzahl);
                }
            });


    //Buttons Poisoncounter
    Button btnPlusPC = findViewById(R.id.btnPlusPC);
    Button btnMinusPC = findViewById(R.id.btnMinusPC);

    //Aktuelle Poisoncounter
    EditText showPC = findViewById(R.id.showPC);

    List<Button> pcbtn = new ArrayList<>();
        pcbtn.add(btnPlusPC);
        pcbtn.add(btnMinusPC);


        for(Button button : lpbtn)
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Button b = (Button) view;

                    EditText showPC = findViewById(R.id.showPC);
                    int pczahl = Integer.parseInt(showPC.getText() + "");

                    int operation = Integer.parseInt(b.getText()+"".replaceAll("\\s",""));

                    pczahl += operation;
                    showPC.setText(pczahl);
                }
            });
    }
}