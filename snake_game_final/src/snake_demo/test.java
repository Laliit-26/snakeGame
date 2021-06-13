package snake_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testPrintBoard() {
		snakeBoard sb=new snakeBoard();
		System.out.println(sb);
	}
	
	@Test
	void testMoveLeft() {
		snakeBoard sb=new snakeBoard();
		System.out.println(sb);
		sb.moveLeft();
		System.out.println(sb);
}
		@Test
		
		void testMoveRight() {
			snakeBoard sb=new snakeBoard();
			System.out.println(sb);
			sb.moveRight();
			System.out.println(sb);
	}
		@Test
		void testMoveTop() {
			snakeBoard sb=new snakeBoard();
			System.out.println(sb);
			sb.moveTop();
			System.out.println(sb);
	}
		@Test
		void testMoveDown() {
			snakeBoard sb=new snakeBoard();
			System.out.println(sb);
			sb.moveDown();
			System.out.println(sb);
	}
	

}
