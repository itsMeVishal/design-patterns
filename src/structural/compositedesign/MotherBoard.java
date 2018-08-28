package structural.compositedesign;

public class MotherBoard implements Component{

	private String name;
	private double price = 200;
	
	public MotherBoard() {
	}

	public MotherBoard(String name) {
		this.name = name;
	}

	@Override
	public double showPrice() {
		return price;
	}
	

}
