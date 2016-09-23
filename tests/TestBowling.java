import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_bowling_score_81() {
		BowlingGame myGame = new BowlingGame();
		
		/*myGame.addFrame(new Frame(1,5));
		myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(7,2));
		myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(4,4));
		myGame.addFrame(new Frame(5,3));
		myGame.addFrame(new Frame(3,3));
		myGame.addFrame(new Frame(4,5));
		myGame.addFrame(new Frame(8,1));
		myGame.addFrame(new Frame(2,6));*/
		
		assertEquals(81, myGame.score());
	}

	@Test
	public void test_bowling_score_one_strike_94() {
		BowlingGame myGame = new BowlingGame();
		
		myGame.addFrame(new Frame(10, 0)); // strike
		
		/*myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(7,2));
		myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(4,4));
		myGame.addFrame(new Frame(5,3));
		myGame.addFrame(new Frame(3,3));
		myGame.addFrame(new Frame(4,5));
		myGame.addFrame(new Frame(8,1));
		myGame.addFrame(new Frame(2,6));*/
		
		
		assertEquals(94, myGame.score());
	}
	
	@Test
	public void test_bowling_score_one_spare_88() {
		BowlingGame myGame = new BowlingGame();
		
		myGame.addFrame(new Frame(1,9)); // spare
		
		/*myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(7,2));
		myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(4,4));
		myGame.addFrame(new Frame(5,3));
		myGame.addFrame(new Frame(3,3));
		myGame.addFrame(new Frame(4,5));
		myGame.addFrame(new Frame(8,1));
		myGame.addFrame(new Frame(2,6));*/
		
		assertEquals(88, myGame.score());
	}
	
	@Test
	public void test_bowling_score_strike_and_spare_103() {
		BowlingGame myGame = new BowlingGame();
		
		/*myGame.addFrame(new Frame(10,0));
		myGame.addFrame(new Frame(4,6));
		
		myGame.addFrame(new Frame(7,2));
		myGame.addFrame(new Frame(3,6));
		myGame.addFrame(new Frame(4,4));
		myGame.addFrame(new Frame(5,3));
		myGame.addFrame(new Frame(3,3));
		myGame.addFrame(new Frame(4,5));
		myGame.addFrame(new Frame(8,1));
		myGame.addFrame(new Frame(2,6));*/
		
		assertEquals(103, myGame.score());
	}
	
}
