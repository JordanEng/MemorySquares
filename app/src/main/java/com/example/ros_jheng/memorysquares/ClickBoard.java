package com.example.ros_jheng.memorysquares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClickBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_board);
    }

    /*
       private int size;
   private int dimension;
   ArrayList buttons = new ArrayList<JButton>();
   ArrayList correctButtons = new ArrayList<Integer>();

    // Constructor for the clickable board
   public ClickBoard(int size, ArrayList<Integer> list){
      this.size = size;
      dimension = size * 100;
      correctButtons = list;
   }

   // Generates a black board of buttons which the user is able to click.
   public void createFrame(){

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(dimension,dimension));
      frame.setLayout(new GridLayout(size,size));
      CustomButtonListener b1 = new CustomButtonListener(correctButtons, frame);

      for (int i = 1; i <= size * size; i++){
         JButton temp = new JButton();
         temp.setActionCommand(correctButtons.get(i - 1) + " " + (i - 1));
         temp.addActionListener(b1);
         frame.add(temp);
      }
      frame.setVisible(true);
   }
     */
}
