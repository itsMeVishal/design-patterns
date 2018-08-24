package creational.factorydesign;

import creational.factorydesign.com.phone.OS;
import creational.factorydesign.com.phone.OSFactory;

public class FactoryMain {
	public static void main(String[] args) {
		
		OSFactory osf = new OSFactory();
		OS os = osf.getInstance("Old");
		os.spec();
		os = osf.getInstance("Open");
		os.spec();
		os = osf.getInstance("Other");
		os.spec();
		os = osf.getInstance("Closed");
		os.spec();
	}
}
