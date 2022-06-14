import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button {
    private int xOrCicle;
    public final int X=1,CICLE=2;
    private JButton button;
    private JLabel content;
    public Button(int temp){
        this.button=new JButton("X   | O");
        this.button.addActionListener((event) -> {
            if(temp==X){
                this.content = new JLabel("X");
            }
            else {
                this.content = new JLabel( "O");
            }
        });
    }
}
