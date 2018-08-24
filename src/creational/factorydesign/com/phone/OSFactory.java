package creational.factorydesign.com.phone;

public class OSFactory {

	public OS getInstance(String str) {
		
		switch (str) {
		case "Open":
			return new Android();
		case "Closed":
			return new IOS();
		case "Old":
			return new Windows();
		}
	
		return new Android();
	}
}
