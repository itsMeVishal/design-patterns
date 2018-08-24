package builderPattern;

public class Shop {
	public static void main(String[] args) {
		
		Phone p = new PhoneBuilder().setBattary(3200)
				.setOs("KITKAT").getPhone();
		
		System.out.println("Builder design pattern working fine!!!"+p.toString());
		
		
		
	}
}
