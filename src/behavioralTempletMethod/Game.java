package behavioralTempletMethod;

public abstract class Game {
	
	abstract void init();
	abstract void startPlay();
	abstract void stopPlay();
	//Templete Method
	public void play() {
		init();
		startPlay();
		stopPlay();
	}
}
