package snake_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;

enum Direction{
	LEFT,RIGHT,UP,DOWN;
}
public class snake_demo implements KeyListener {
	static JFrame frame;
	static BoardPanel panel;
  

	
	public void exits()
	{
		frame.setVisible(false);
		frame.dispose();
		
	}
	
	 static Direction direction=Direction.DOWN;
	public static void main(String[] args) {
		frame=new JFrame("snake game");
		frame.setSize(600, 700);
		frame.setLayout(null);

		snakeBoard brd=new snakeBoard();
		 panel= new BoardPanel(brd);
		 panel.setBackground(new Color(220,250,250));
	
		panel.setBounds(0, 0, 600,600);
//		 Container contentPane = frame.getContentPane();
//		    contentPane.add(contentPane, new snake_demo());
		frame.add(panel);

		
		
		JButton btnLeft=new JButton("Left");
		btnLeft.setBounds(20, 610, 100, 40);
		frame.add(btnLeft);
		
		JButton btnRight=new JButton("Right");
		btnRight.setBounds(150, 610, 100, 40);
		frame.add(btnRight);
		
		JButton btnTop=new JButton("Up");
		btnTop.setBounds(280, 610, 100, 40);
		frame.add(btnTop);
		
		JButton btnDown=new JButton("Down");
		btnDown.setBounds(410, 610, 100, 40);
		frame.add(btnDown);
		
		frame.setVisible(true);
		
		
		Timer timer= new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
			switch(direction)
			{
			case LEFT:
				brd.moveLeft();
				break;
			case RIGHT:
				brd.moveRight();
				break;
			case UP:
				brd.moveTop();
				break;
			case DOWN:
				brd.moveDown();
				break;
			}
			
				panel.repaint();
			}
			
		}, 250, 250);
		
		
		btnLeft.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				direction=Direction.LEFT;
			}});
		
		
		btnRight.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		direction=Direction.RIGHT;
	}});

		
		btnTop.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		direction=Direction.UP;
	}});

		btnDown.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		direction=Direction.DOWN;
	}});
	
	

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_UP)
		{
			direction=Direction.UP;
		}
		if(key==KeyEvent.VK_DOWN)
		{
			direction=Direction.DOWN;
		}
		if(key==KeyEvent.VK_LEFT)
		{
			direction=Direction.LEFT;
		}
		if(key==KeyEvent.VK_RIGHT)
		{
			direction=Direction.RIGHT;
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
