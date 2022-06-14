import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class SceneGame extends JPanel implements MyGame {
    public final int Width = 1000,HEIGHT = 500,ROWS=3,COLS=3;
    private boolean thisPlayerIsX;
    private int[][] square;

    public SceneGame(){
        thisPlayerIsX = true;
        this.setBounds(0,0,Width,HEIGHT);
        GridLayout gridLayout = new GridLayout(ROWS,COLS);
        this.setLayout(gridLayout);
        LinkedList<MyButton> list = new LinkedList<MyButton>();
        for (int i = 0; i < 9; i++) {
            MyButton temp =new MyButton();
            replaceButton(temp,i);
            list.add(temp);
        }
        for (MyButton v:list) {
            this.add(v);
        }
        square = new int[ROWS][COLS];
        new Thread(()->{

        });





    }
    public void replaceButton(MyButton myButton,int index){
        int col =0,row=index%3;
        if(index>2){
            if(index<5){
                col=2;
            }else {
                col=1;
            }

        }
        int finalCol = col;
        myButton.addActionListener((event) -> {
            if(myButton.getText()!=null){

            }
            else if(thisPlayerIsX==true){
                myButton.setText("X");
                this.thisPlayerIsX=!thisPlayerIsX;
                this.square[row][finalCol] = VAL_OF_X;

            }
            else {
                myButton.setText("O");
                this.square[row][finalCol] = VAL_OF_O;
                this.thisPlayerIsX=!thisPlayerIsX;
            }
            Logics.checkGame(square);
        });
    }


    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
