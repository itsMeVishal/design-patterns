package structural.compositedesign;

public class CompositeTest {

	public static void main(String[] args) {
		
		Ram ram = new Ram();
		Monitor monitor = new Monitor();
		MotherBoard mb = new MotherBoard();
		Cabinate cab = new Cabinate();
		cab.cabinateComponents.add(ram);
		cab.cabinateComponents.add(mb);
		Computer camp = new Computer();
		camp.computerComponents.add(monitor);
		camp.computerComponents.add(cab);
		
		System.out.println("Price of Ram:"+ram.showPrice());
		System.out.println("Price of MotherBoard:"+mb.showPrice());
		System.out.println("Price of Cabinate:"+cab.showPrice());
		System.out.println("Price of monitor:"+monitor.showPrice());
		System.out.println("Price of whole Computer:"+camp.showPrice());
		
	}

}
