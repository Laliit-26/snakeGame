package snake;

import javax.swing.JFrame;

public class snake {

public static void main(String[] args)
{
    JFrame frame = new JFrame("Snake Game");
    frame.setSize(600, 600);
    
    BoardPanel panel= new BoardPanel();
    frame.add(panel);
    frame.setVisible(true);
}
}
