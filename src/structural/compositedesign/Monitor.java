package structural.compositedesign;

public class Monitor implements Component{



	private String name;
	private double price = 10000;
	public Monitor() {
	}

	public Monitor(String name) {
		name = this.name;
	}

	@Override
	public double showPrice() {
		return price;
	}
	


}
