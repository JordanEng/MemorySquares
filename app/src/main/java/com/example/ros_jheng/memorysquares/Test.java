package com.example.ros_jheng.memorysquares;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;

public class Test extends AppCompatActivity {
    int countPress = 0;
    int boardSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void buttonClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        ArrayList<String> intro = new ArrayList<>();
//        intro.add(0, "In this game, you need to remember the " +
//                "placement of the red squares and try to replicate them");
//        intro.add(1, "Good Luck!");
//        assert tv != null;
//        tv.setText(intro.get(countPress));
        countPress++;

        if(countPress == 1){
            tv.setText("In this game, you need to remember the " +
                    "placement of the red squares and try to replicate them");
        }

        if (countPress == 2){
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            tv.setText("Good Luck!");
        }

//        if(countPress == 3){
//            tv.setText("Input the size of your board (2-10)");
//            EditText et = (EditText)findViewById(R.id.boardSize);
//            et.setVisibility(View.VISIBLE);
//            String boardString = et.getText().toString();
//            boardSize = Integer.parseInt(boardString);
//        }

        if(countPress >= 3){
            BoardFilled board1 = new BoardFilled(boardSize);
            Intent intent = new Intent(this, BoardFilled.class);
            startActivity(intent);
        }
    }

    /*
      System.out.print("Input the size of your board (2-10): ");
      size = console.nextInt();
      System.out.println("You have " + size + " seconds. Get ready...");
      Thread.sleep(2000);

      BoardFilled board1 = new BoardFilled(size);
      board1.createBoard();
      ArrayList<Integer> lengthGrid = board1.returnBoxes();

      ClickBoard board2 = new ClickBoard(size, lengthGrid);
      board2.createFrame();

     */
}
