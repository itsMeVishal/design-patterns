package structural.compositedesign;

public class Ram implements Component{

	private String name;
	private double price = 2000;
	public Ram() {
	}

	public Ram(String name) {
		name = this.name;
	}

	@Override
	public double showPrice() {
		return price;
	}
	

}
