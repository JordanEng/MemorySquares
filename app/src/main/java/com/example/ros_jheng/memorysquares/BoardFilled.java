package com.example.ros_jheng.memorysquares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Random;

public class BoardFilled extends AppCompatActivity {

    ArrayList<Integer> actualList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_filled);
        setTitle("Watch the Squares");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(BoardFilled.this, ClickBoard.class);
                startActivity(i);

                Random rand = new Random();
                int random = rand.nextInt(2);
                if(random == 0){
                    actualList.add(1);
                } else{
                    actualList.add(0);
                }
                Integer[] intArray = actualList.toArray(new Integer[0]);


                ArrayAdapter<String> adapter = new ArrayAdapter<Integer>(this,
                        android.R.layout.simple_list_item_1, stringArray);

                finish();
            }
        }, 10000);
    }


    /*
       private int size;
   private int dimension;
   private ArrayList<Integer> redSquares;

   // Constructor for the filled board


   // Generates the board with randomly colored squares by
   // by taking the number the user submitted before.
   public void createBoard() throws InterruptedException{

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(dimension, dimension));
      frame.setTitle("Watch the Squares");

      frame.setLayout(new GridLayout(size, size));
      for(int i = 0; i < size * size; i++){
         Random rand = new Random();
         int random = rand.nextInt(2);

         JButton current = new JButton();
         frame.add(current);

         if(random == 0) {
            current.setBackground(Color.RED);
            redSquares.add(1);
         }
         else{
            redSquares.add(0);
         }
      }

      frame.setVisible(true);
      Thread.sleep(size * 1000);
      frame.setVisible(false);
   }


   // Returns an ArrayList of the squares in the grid,
   // the colored ones as 1, and the uncolored ones as 0.
   public ArrayList returnBoxes(){
      return redSquares;
   }
     */
}
