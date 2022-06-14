import javax.swing.*;

public class MyButton extends JButton {
    private int xOrCicle;
    public final int X=1,CICLE=2;
    private JButton button;
    private JLabel content;
    public MyButton(){
        this.button=new JButton("X   | O");
        this.button.setText("click");
        this.button.addActionListener((event) -> {
            if(this.button.getText()!="click"){

            }
            else if(MyWindow.player==true){
                this.button.setText("X");
               MyWindow.player=!MyWindow.player;

            }
            else {
                this.button.setText("O");
                MyWindow.player=!MyWindow.player;
            }
        });

    }//end of constructor

    public void setxOrCicle(int xOrCicle) {
        this.xOrCicle = xOrCicle;
    }
    public int getxOrCicle(){
        return this.xOrCicle;
    }
}
