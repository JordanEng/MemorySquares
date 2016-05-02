package com.example.ros_jheng.memorysquares;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class ClickBoard extends AppCompatActivity {

    ArrayList<Integer> actualList;
    ArrayList<Integer> inputList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_board);
    }

    public void onClick(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        int buttonNumber = Integer.parseInt(buttonText);
        if(s[0].equals("1")){
            b.setBackgroundColor(Color.RED);
        } else {
            b.setBackgroundColor(Color.BLACK);
        }
    }
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

// CustomButtonListener

//public class CustomButtonListener implements ActionListener{
//
//    ArrayList<Integer> list;
//    JFrame frame;
//    String value;
//    ArrayList<Integer> list2;
//    static boolean outcome = true;
//
//    // Constructor that takes in the correct ArrayList, the button frame
//    // and creates an ArrayList to store the users clicks
//    public CustomButtonListener(ArrayList<Integer> list, JFrame frame) {
//        this.list = list;
//        this.frame = frame;
//        list2 = new ArrayList<Integer>();
//        for (Integer aList : list) {
//            list2.add(0);
//        }
//    }
//
//    // Changes the colors of the buttons depending on which one is clicked by using
//    // the ArrayList to determine. If an incorrect button is clicked, the game ends.
//    // Also, it compares the ArrayLists of the user and the randomly generated one
//    // to determine when the user has won the game.
//    public void actionPerformed(ActionEvent event){
//        Scanner console = new Scanner(System.in);
//        value = event.getActionCommand();
//        JButton button = (JButton)event.getSource();
//        String[] s = value.split(" ");
//
//        if(s[0].equals("1")){
//            button.setBackground(Color.RED);
//        } else {
//            button.setBackground(Color.BLACK);
//
//            JOptionPane.showMessageDialog(null, "You Lost");
//            frame.dispose();
//          /*try {
//              if (!TestingTesting.playAgain()){
//                 System.exit(0);
//              }
//          } catch (InterruptedException e) {
//          }*/
//        }
//
//        int i = Integer.parseInt(s[1]);
//        int j = Integer.parseInt(s[0]);
//        list2.set(i, j);
//
//        if (list.equals(list2)) {
//            JOptionPane.showMessageDialog(null, "You Won");
//            frame.dispose();
//           /*try {
//               if (!TestingTesting.playAgain()){
//                  System.exit(0);
//               }
//           } catch (InterruptedException e) {
//           }*/
//        }
//    }
//}
