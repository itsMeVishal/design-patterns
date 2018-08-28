package behavioralTempletMethod;

public class Cricket extends Game{

	@Override
	void init() {
		System.out.println("Initialising the game of cricket!!!");
		
	}

	@Override
	void startPlay() {
		System.out.println("You are ready to play cricket!!!");
		
	}

	@Override
	void stopPlay() {
		System.out.println("Cricket game finished!!!");
		
	}
}
