import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_bowling_score_81() {
		BowlingGame myGame = new BowlingGame();
		assertEquals(81, myGame.score());
	}

	@Test
	public void test_bowling_score_one_strike_94() {
		BowlingGame myGame = new BowlingGame();
		
		assertEquals(94, myGame.score());
	}
	
	@Test
	public void test_bowling_score_one_spare_88() {
		BowlingGame myGame = new BowlingGame();
		
		assertEquals(88, myGame.score());
	}
	
	@Test
	public void test_bowling_score_strike_and_spare_103() {
		BowlingGame myGame = new BowlingGame();
		
		assertEquals(103, myGame.score());
	}
	
}
