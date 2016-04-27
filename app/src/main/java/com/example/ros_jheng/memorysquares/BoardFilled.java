package com.example.ros_jheng.memorysquares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class BoardFilled extends AppCompatActivity {
    private int size;
    private int dimension;
    private ArrayList<Integer> redSquares;

    public BoardFilled(int size){
        this.size = size;
        dimension = size * 100;
        redSquares = new ArrayList<Integer>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_filled);
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
