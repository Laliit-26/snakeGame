package snake;

import java.awt.Graphics;

import javax.swing.JPanel;

public class BoardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	static final int cols=53;
	static final int  rows=50;
		static final int originX=23;
		static final int originY=37;
		static final int cellSide=10;
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<=rows;i++) {
		g.drawLine(originX,originY+i*cellSide, originX +cols*cellSide, originY+i*cellSide);
		}
		for(int i=0;i<=cols;i++)
		{
			g.drawLine(originX+i*cellSide, originY, originX+i*cellSide, originY+rows*cellSide);
		}
	}
}
