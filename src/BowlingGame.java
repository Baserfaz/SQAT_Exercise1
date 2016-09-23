import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		// create ten frames.. 
		// hardcoded -> manually have to change these every single time.
		
		//addFrame(new Frame(10, 0)); // strike
		//addFrame(new Frame(1,9)); // spare
		
		//addFrame(new Frame(1,5));
		//addFrame(new Frame(3,6));
		
		addFrame(new Frame(10,0));
		addFrame(new Frame(4,6));
		
		addFrame(new Frame(7,2));
		addFrame(new Frame(3,6));
		addFrame(new Frame(4,4));
		addFrame(new Frame(5,3));
		addFrame(new Frame(3,3));
		addFrame(new Frame(4,5));
		addFrame(new Frame(8,1));
		addFrame(new Frame(2,6));
	}
	
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
			Frame f_seq = frames.get(i + 1);
			
			if(f.isStrike()) {
				myScore += f.getFirstThrow() + frames.get(i + 1).score();
				
				// if the subsequential frame is a spare ...
				// -> calculate spare too and don't continue.
				
				if(!f.isSpare()) continue; 
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
