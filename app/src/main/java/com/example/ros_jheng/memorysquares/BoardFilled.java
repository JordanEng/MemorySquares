package com.example.ros_jheng.memorysquares;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.Random;

public class BoardFilled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_filled);
        setTitle("Watch the Squares");

        GridLayout gridLayout = (GridLayout) findViewById(R.id.image_grid);
        assert gridLayout != null;
        gridLayout.setUseDefaultMargins(true);
        gridLayout.setAlignmentMode(GridLayout.ALIGN_BOUNDS);

        int total = 25;
        int column = 5;
        int row = total / column;
        gridLayout.setColumnCount(column);
        gridLayout.setRowCount(row);
        int currentRow = 0;
        int currentColumn = 0;

        for (int i = 0; i < total; i++) {
            if (currentColumn == column ) {
                currentColumn = 0;
                currentRow++;
            }
                Button button = new Button(this);

                Random rand = new Random();
                int random = rand.nextInt(2);

                if(random == 1) {
                    button.setBackgroundColor(Color.RED);
                }
                button.setHeight(100);
                button.setWidth(50);

                GridLayout.Spec rowspan = GridLayout.spec(currentRow, 1);
                GridLayout.Spec colspan = GridLayout.spec(currentColumn, 1);
                GridLayout.LayoutParams gridLayoutParam = new GridLayout.LayoutParams(rowspan, colspan);
                gridLayout.addView(button,gridLayoutParam);
                currentColumn++;

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(BoardFilled.this, ClickBoard.class);
                startActivity(i);
                finish();
            }
        }, 10000);
    }
}

//
//   // Generates the board with randomly colored squares by
//   // by taking the number the user submitted before.
//   public void createBoard() throws InterruptedException{
//
//      JFrame frame = new JFrame();
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setSize(new Dimension(dimension, dimension));
//      frame.setTitle("Watch the Squares");
//
//      frame.setLayout(new GridLayout(size, size));
//      for(int i = 0; i < size * size; i++){
//         Random rand = new Random();
//         int random = rand.nextInt(2);
//
//         JButton current = new JButton();
//         frame.add(current);
//
//         if(random == 0) {
//            current.setBackground(Color.RED);
//            redSquares.add(1);
//         }
//         else{
//            redSquares.add(0);
//         }
//      }
//
//      frame.setVisible(true);
//      Thread.sleep(size * 1000);
//      frame.setVisible(false);
//   }
//
//
//   // Returns an ArrayList of the squares in the grid,
//   // the colored ones as 1, and the uncolored ones as 0.
//   public ArrayList returnBoxes(){
//      return redSquares;
//   }
//}
