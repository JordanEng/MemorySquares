package com.example.ros_jheng.memorysquares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void buttonClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Welcome to android");
    }


    /*      Scanner console = new Scanner(System.in);

      int size = 0;
      System.out.println("Welcome to Memory Squares!");
      Thread.sleep(2000);
      System.out.println("In this game, you need to remember the plaement");
      System.out.println("of the red squares and try to get rid of them.");
      Thread.sleep(2000);
      System.out.println("");
      System.out.println("Good Luck!");
      System.out.println("");
      Thread.sleep(2000);
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
