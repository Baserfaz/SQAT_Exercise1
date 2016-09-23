import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
		Frame f = null;
		
		// create ten frames
		addFrame(new Frame(10,0));
		f = frames.get(frames.size() - 1);
		if(f.isStrike()) {
			
		}
		
		//addFrame(new Frame(1,5));
		
		addFrame(new Frame(3,6));
		
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
		for(Frame f : frames) {
			myScore += f.score();
		}
		return myScore;
	}
}
