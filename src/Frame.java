import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {
    Cube cube;
    public Frame(Cube cube){
        JFrame frame = new JFrame("Кубстер");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }
    public  void paint(Graphics g){
        System.out.println(1111);
        cube.draw(g);
    }
}
