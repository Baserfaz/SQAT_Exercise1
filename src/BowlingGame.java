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
	
	private int[] testGameValues_normal = {1,5,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
	private int[] testgameValues_strike = {10,0,3,6,7,2,3,6,4,4,5,3,3,3,4,5,8,1,2,6};
	
	private Map<Integer, Integer> testGame_normal = new HashMap<Integer, Integer>();
	
	public BowlingGame(){
		
		// for some reason Map.put doesn't work even when hardcoding 10 puts, it still counts as 7 pairs. ???
		
		// create a dictionary of values
		/*for(int i = 0; i < 10; i++) {
			
			if(i != 0) {
				if(i % 2 != 0) continue;
			}
			
			testGame_normal.put(testGameValues_normal[i], testGameValues_normal[i+1]);
		}*/
		
		// loop through each dictionary entry.
		/*for(Map.Entry<Integer, Integer> e : testGame_normal.entrySet()) {
			
			// key = first score
			// value = second score
			addFrame(new Frame(e.getKey(), e.getValue()));
		}*/
		
		// hardcoded addFrames...
		
		// create ten frames
		addFrame(new Frame(1,5));
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
	
	public int getTestGameNormalMapSize() {
		return testGame_normal.size();
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
			
			if(f.isStrike()) {
				myScore += f.getFirstThrow() + 
				continue;
			}
			
			myScore += f.score();
		}
		return myScore;
	}
}
