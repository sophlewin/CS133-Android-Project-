package com.example.noughtscrosses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_XORO = "com.example.noughtsCrosses.XORO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Boolean XGo = true;
    String X = "X";
    String O = "O";
    int goes = 0;

    int TL = 0;
    int TM = 0;
    int TR = 0;
    int ML = 0;
    int MM = 0;
    int MR = 0;
    int BL = 0;
    int BM = 0;
    int BR = 0;

    boolean TLDone = false;
    boolean TMDone = false;
    boolean TRDone = false;
    boolean MLDone = false;
    boolean MMDone = false;
    boolean MRDone = false;
    boolean BLDone = false;
    boolean BMDone = false;
    boolean BRDone = false;


    public void onClickTl(View view){

        if(TLDone==false){
            TLDone = true;
            goes = goes + 1;

            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                tl.setText(X);
                TL = 1;
                XGo = false; //flips go
            }
            else{
                tl.setText(O);
                TL = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickTm(View view){

        if(TMDone==false){
            TMDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                tm.setText(X);
                TM = 1;
                XGo = false; //flips go
            }
            else{
                tm.setText(O);
                TM = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickTr(View view){

        if(TRDone==false){
            TRDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                tr.setText(X);
                TR = 1;
                XGo = false; //flips go
            }
            else{
                tr.setText(O);
                TR = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickMl(View view){

        if(MLDone==false){
            MLDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                ml.setText(X);
                ML = 1;
                XGo = false; //flips go
            }
            else{
                ml.setText(O);
                ML = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickMm(View view){

        if(MMDone==false){
            MMDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                mm.setText(X);
                MM = 1;
                XGo = false; //flips go
            }
            else{
                mm.setText(O);
                MM = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickMr(View view){

        if(MRDone==false){
            MRDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                mr.setText(X);
                MR = 1;
                XGo = false; //flips go
            }
            else{
                mr.setText(O);
                MR = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickBl(View view){

        if(BLDone==false){
            BLDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                bl.setText(X);
                BL = 1;
                XGo = false; //flips go
            }
            else{
                bl.setText(O);
                BL = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickBm(View view){

        if(BMDone==false){
            BMDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                bm.setText(X);
                BM = 1;
                XGo = false; //flips go
            }
            else{
                bm.setText(O);
                BM = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }

    public void onClickBr(View view){

        if(BRDone==false){
            BRDone = true;
            goes = goes + 1;
            TextView welcome = findViewById(R.id.textView2);
            welcome.setText("");

            Button tl = findViewById(R.id.button2);
            Button tm = findViewById(R.id.button3);
            Button tr = findViewById(R.id.button4);
            Button ml = findViewById(R.id.button5);
            Button mm = findViewById(R.id.button6);
            Button mr = findViewById(R.id.button7);
            Button bl = findViewById(R.id.button8);
            Button bm = findViewById(R.id.button9);
            Button br = findViewById(R.id.button10);

            if(XGo == true){
                br.setText(X);
                BR = 1;
                XGo = false; //flips go
            }
            else{
                br.setText(O);
                BR = 10;
                XGo = true;
            }

            if((TL+TM+TR==3)||(ML+MM+MR==3)||(BL+BM+BR==3)||(TL+ML+BL==3)||(TM+MM+BM==3)||(TR+MR+BR==3)||(TL+MM+BR==3)||(TR+MM+BL==3)||(TL+TM+TR==30)||(ML+MM+MR==30)||(BL+BM+BR==30)||(TL+ML+BL==30)||(TM+MM+BM==30)||(TR+MR+BR==30)||(TL+MM+BR==30)||(TR+MM+BL==30)){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "temp";
                if(XGo == true){
                    XORO = "Naughts Win!";
                }
                else{
                    XORO = "Crosses Win!";
                }

                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);
            }
            else if(goes == 9){
                Intent intent = new Intent(this, winActivity.class);
                String XORO = "Draw!";
                intent.putExtra(EXTRA_XORO, XORO);
                startActivity(intent);

            }
        }
    }
}