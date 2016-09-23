import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int myScore = 0;
		//for(Frame f : frames) {
		for(int i = 0; i < frames.size(); i++) {
			
			Frame f = frames.get(i);

			if(f.isStrike()) {
				myScore += f.getFirstThrow() + frames.get(i + 1).score();
				continue;
			}
			
			if(f.isSpare()) {
				myScore += f.getFirstThrow() + f.getSecondThrow() + frames.get(i + 1).getFirstThrow();
				continue;
			}
			
			myScore += f.score();
		}
		return myScore;
	}
}
