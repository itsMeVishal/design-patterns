package behavioralTempletMethod;

public class Football extends Game{

	@Override
	void init() {
		System.out.println("Initialising the game of football!!!");
		
	}

	@Override
	void startPlay() {
		System.out.println("You are ready to play football!!!");
		
	}

	@Override
	void stopPlay() {
		System.out.println("Cricket game finished!!!");
		
	}

}
