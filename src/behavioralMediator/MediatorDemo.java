package behavioralMediator;

public class MediatorDemo {

	public static void main(String[] args) {
		
		User vishal = new User("Vishal");
		User rupesh = new User("Rupesh");
		vishal.sendMessage("Hi Rupesh!");
		rupesh.sendMessage("Hi Vishal!");
		
	}
}
