package creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop shop = new BookShop();
		shop.setShopName("V's Book Shopie");
		shop.loadData();
		
		
		
		BookShop shop2 = (BookShop) shop.clone();
		
		shop.getBooks().remove(3);
		System.out.println(shop);
		shop2.setShopName("R's Book Shopie");
		
		System.out.println(shop2);
		 
		
	}
}
