package com.example.ros_jheng.memorysquares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import java.util.ArrayList;

public class BoardFilled extends AppCompatActivity {

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
                finish();
            }
        }, 10000);
    }
}

//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        GridView gridview = (GridView) findViewById(R.id.gridview);
//        gridview.setAdapter(new CustomButtonListener(this));
//
//        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View v,
//                                    int position, long id) {
//                Toast.makeText(BoardFilled.this, "" + position,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


//    public class CustomGrid extends BaseAdapter {
//        private Context mContext;
//        CustomGrid adgg;
//        int mNumColumns = 2;
//        private Random rand = new Random();
//        GridView gg;
//        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
//        float alfa = 0.1f;
//        int rand_ind = rand.nextInt((2 * 2) - 0) + 0;
//
//        public CustomGrid(Context c) {
//            mContext = c;
//            // this.Imageid = Imageid;
//            // this.web = web;
//        }
//
//        @Override
//        public int getCount() {
//            // TODO Auto-generated method stub
//            return mNumColumns * mNumColumns;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            // TODO Auto-generated method stub
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            // TODO Auto-generated method stub
//            return 0;
//        }
//
//        @Override
//        public View getView(final int position, View convertView, ViewGroup parent) {
//            // TODO Auto-generated method stub
//
//            View gridView;
//
//            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View grid = new View(mContext);
//            grid = inflater.inflate(R.layout.activity_board_filled, null);
//            final View imageView = (ImageView) grid.findViewById(R.id.image_grid);
//
//            if (convertView == null) {
//                if (position == rand_ind) {
//                    imageView.setBackgroundColor(getColorWithAlpha(color, alfa));
//                } else {
//                    imageView.setBackgroundColor(color);
//                }
//            } else {
//                grid = (View) convertView;
//            }
//
//            grid.setOnClickListener(new View.OnClickListener() {
//
//
//                public void onClick(View v) {
//
//
//                    if (position == rand_ind) {
//
//                        // Correct postion click time if condition occur..........
//
//
//                        if (counter == 2) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.1f;
//                        } else if (counter == 6) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.08f;
//                        } else if (counter == 8) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.1f;
//                        } else if (counter == 12) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.1f;
//                        } else if (counter == 14) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.1f;
//                        } else if (counter == 16) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.1f;
//                        } else if (counter == 18) {
//                            mNumColumns = mNumColumns + 1;
//                            alfa = alfa + 0.05f;
//                        } else if (counter >= 18) {
//                            // mNumColumns = mNumColumns + 1;
//                            alfa = 0.8f;
//
//                        }
//
//                        gridview.setNumColumns(mNumColumns);
//                        gridview.setAdapter(adapter);
//                        adapter.notifyDataSetChanged();
//
//                        rand_ind = rand.nextInt((mNumColumns * mNumColumns) - 0) + 0;
//
//                    } else {
//
//                        // Here code for nagative click............ whem click
//                        // nagative at time geanarate this code.........
//                    }
//                }
//            });
//
//            return grid;
//        }
//
//        public int getColorWithAlpha(int color, float ratio) {
//            int newColor = 0;
//            int alpha = Math.round(Color.alpha(color) * ratio);
//            int r = Color.red(color);
//            int g = Color.green(color);
//            int b = Color.blue(color);
//            newColor = Color.argb(alpha, r, g, b);
//            return newColor;
//        }
//    }
//
//    public void onClick(View v) {
//    }

//       private int size;
//   private int dimension;
//   private ArrayList<Integer> redSquares;
//
//   // Constructor for the filled board
//
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
