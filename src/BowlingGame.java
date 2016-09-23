import java.util.ArrayList;
import java.util.List;

//Finish time: 16:37
//ID: 144

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
		bonus = new Frame(firstThrow, secondThrow);
		frames.add(bonus);
	}
	
	// Returns the game score
	public int score(){
		int myScore = 0;
		for(int i = 0; i < frames.size(); i++) {
			Frame f = frames.get(i);
			boolean lastFrame = false;
			
			if(i == frames.size() - 1) {
				lastFrame = true;
			}
			
			if(f.isStrike()) {
				myScore += f.getFirstThrow() + frames.get(i + 1).score();
				
				// if the next frame is strike ...
				if(frames.get(i + 1).isStrike()) {
					myScore += frames.get(i + 2).getFirstThrow();
					continue;
				}
				
				continue;
			}
			
			if(f.isSpare()) {
					
				if(lastFrame) {
					if(bonus != null) {
						myScore += bonus.getFirstThrow();
					}
				}
				
				myScore += f.getFirstThrow() + f.getSecondThrow() + frames.get(i + 1).getFirstThrow();
				continue;
				
			}
			
			myScore += f.score();
		}
		return myScore;
	}
}
