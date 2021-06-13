package snake_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class snakeBoard {
	static int row=26;
	static int col=25;
	
	List<snakeCell> lis=new ArrayList<snakeCell>();
	private Random rnd;
	int fruitCol;
	int fruitRow;
	snakeBoard(){
    lis.add(new snakeCell(row/2,col/2));
//    lis.add(new snakeCell(1,2));
//    lis.add(new snakeCell(2,2));
//    lis.add(new snakeCell(2,3));
//    lis.add(new snakeCell(2,4));
    
    rnd=new Random();
    fruitCol=rnd.nextInt(col);              // generating random food if snake head encounter food
	fruitRow=rnd.nextInt(row); 
	}
	
	
	void updateSnake(snakeCell newcell)
	{  snake_demo sd=new snake_demo();
		if(lis.isEmpty())
			return;
		
		List<snakeCell> newSnake=new ArrayList<snakeCell>();   //creating new snake
		newSnake.add(newcell);                                 //moving snake 
		for(int i=0;i< lis.size() -1;i++)
		{
		newSnake.add(lis.get(i));
		}if(newcell.col==fruitCol && newcell.row==fruitRow)          // checking if snake got food or not
		{
			newSnake.add(lis.get(lis.size()-1));
			fruitCol=rnd.nextInt(col);              // generating random food if snake head encounter food
			fruitRow=rnd.nextInt(row);               
		}
		if(newcell.col<0 || newcell.col>col-1 || newcell.row<0 ||newcell.row>row-1)
		{
			
			((snake_demo) sd).exits();
		}
		for(snakeCell brk:lis)
		{
			if(newSnake.get(0).col==brk.col && newSnake.get(0).row==brk.row)
			{
				((snake_demo) sd).exits();
			}
		}
			lis=newSnake;	
	}
	
	
	void moveLeft()                                   //move left method
	{   
		snakeCell first=lis.get(0);
		snakeCell newcell=new snakeCell(first.row,first.col-1);
		updateSnake(newcell);

	}
	
	void moveDown()
	{   
		snakeCell first=lis.get(0);
		snakeCell newcell=new snakeCell(first.row+1,first.col);
		updateSnake(newcell);
	}
	
	void moveTop()
	{   
		snakeCell first=lis.get(0);
		snakeCell newcell=new snakeCell(first.row-1,first.col);
		updateSnake(newcell);
	}
	
	
	void moveRight()
	{   
		snakeCell first=lis.get(0);
		snakeCell newcell=new snakeCell(first.row,first.col+1);
		updateSnake(newcell);
	}
	
	
	
	boolean isonsnake(int row,int col)
	{
		for(snakeCell snake :lis)
		{
			if(snake.row==row && snake.col==col)
			{
				return true;
			}
		}
		return false;
	}
	

	@Override                                    //for testing purpose
	public String toString() {
		 String st=" ";
		for(int k=0;k<=col;k++)
		{
			st+=" "+k;
		}
		st+="\n";
	
	 for(int i=0;i<=row;i++)
	 {   st+=""+i;
		 
		 for(int j=0;j<=col;j++)
		 { 
			 if(isonsnake(i,j))           
			 {
				 snakeCell head= lis.get(0);
				 if(i==head.row && j==head.col)
				 {
					 st+=" 0";
				 }
				 else {
					 st+=" >";
				 }
		
			 }
			 else {
				 st+=" .";
			 }
		 }
		st+="\n";
	 }
		return st;
	}
}
