package snake_demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class BoardPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final int x = 30;
	static final int y = 40;
	static final int boxSize = 20;
	 int arcradius=boxSize/2;
	private snakeBoard board;
	
	public BoardPanel(snakeBoard board)
	{
		this.board=board;
	}
	



	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2= (Graphics2D)g;
		 drawGrid(g2);
        drawSnake(g2);
        drawFruit(g2);
}
	
	private void drawFruit(Graphics2D g2)
	{	g2.setColor(new Color(233,66,246));
		g2.fillRoundRect(x+board.fruitCol*boxSize, y+board.fruitRow*boxSize, boxSize,boxSize, arcradius, arcradius);
		
	}
	
	private void drawSnake(Graphics2D g2)
	{ 
		if(board.lis.isEmpty())
			return;
		
		g2.setColor(new Color(53,120,87));
	snakeCell snakehead =board.lis.get(0);
	g2.fillRoundRect(x+snakehead.col*boxSize, y+snakehead.row*boxSize, boxSize,boxSize, arcradius, arcradius);
	g2.setColor(new Color(245,126,66));
	for(int i=1;i<board.lis.size();i++)
	{
		snakeCell cell=board.lis.get(i);
		int orX=x+cell.col*boxSize;
		   int orY=y+cell.row*boxSize;
			g2.fillRoundRect(orX, orY, boxSize,boxSize , arcradius, arcradius);
	
	
	}}
	private void drawGrid(Graphics2D g2) {
		g2.setColor(Color.lightGray);
		for (int i = 0; i <= snakeBoard.row; i++) {
			g2.drawLine(x, y + i * boxSize, snakeBoard.col * boxSize + x, y + i * boxSize);
		}
		for (int j = 0; j <= snakeBoard.col; j++) {
			g2.drawLine(x + j * boxSize, y, x + j * boxSize, y + snakeBoard.row * boxSize);
		}

	}
}

