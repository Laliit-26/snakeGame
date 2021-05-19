package snake;

public class SnakeBoard {
	static final int cols=53;
	static final int  rows=50;
	
	@Override
	public String toString() {
		String brdStr="";
		for(int row=0;row<rows;row++) {
		for(int col=0;col<cols;col++)
		{
	brdStr+=" .";}
		brdStr+="\n";
		}
		return brdStr;
	}
}
