import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class MyWindow extends JFrame {
    public final int Width = 1000,HEIGHT = 500,ROWS=3,COLS=3;
    public static boolean player = true;
    public MyWindow(){
        boolean thisPlayerIsX = true;
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        GridLayout gridLayout = new GridLayout(ROWS,COLS);
        this.setLayout(gridLayout);
        this.add(new SceneGame());

        this.setVisible(true);
    }
}
