package builderPattern;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battary;
	
	public Phone(String os, int ram, String processor, double screenSize, int battary) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battary = battary;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battary=" + battary + "]";
	}
	

	

}
