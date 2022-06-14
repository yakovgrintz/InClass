import javax.swing.*;
import java.awt.*;

public class SceneGame extends JPanel {
    public final int Width = 1000,HEIGHT = 500,ROWS=3,COLS=3;
    private boolean thisPlayerIsX;
    private int[][] square;

    public SceneGame(){
        thisPlayerIsX = true;
        this.setBounds(0,0,Width,HEIGHT);
        GridLayout gridLayout = new GridLayout(ROWS,COLS);
        this.setLayout(gridLayout);
        MyButton temp1=new MyButton();
        MyButton temp2 = new MyButton();
        MyButton temp3=new MyButton();
        MyButton temp4 = new MyButton();
        MyButton temp5=new MyButton();
        MyButton temp6 = new MyButton();
        MyButton temp7=new MyButton();
        MyButton temp8 = new MyButton();
        MyButton temp9=new MyButton();
        this.add(temp1);
        this.add(temp2);
        this.add(temp3);
        this.add(temp4);this.add(temp5);
        this.add(temp6);this.add(temp7);
        this.add(temp8);this.add(temp9);
        replaceButton(temp1);
        replaceButton(temp2);
        replaceButton(temp3);
        replaceButton(temp4);
        replaceButton(temp5);
        replaceButton(temp6);
        replaceButton(temp7);
        replaceButton(temp8);
        replaceButton(temp9);
        square = new int[ROWS][COLS];
        new Thread(()->{

        });





    }
    public void replaceButton(MyButton myButton){
        myButton.addActionListener((event) -> {
            if(myButton.getText()!=null){

            }
            else if(thisPlayerIsX==true){
                myButton.setText("X");
                this.thisPlayerIsX=!thisPlayerIsX;

            }
            else {
                myButton.setText("O");
                this.thisPlayerIsX=!thisPlayerIsX;
            }
        });
    }


    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
}
