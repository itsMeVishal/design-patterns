package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

	private String shopName;
	private List<Book> books= new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {
		
		for(int i=0;i<5;i++) {
			Book book = new Book();
			book.setBId(i);
			book.setBName("b name"+ i);
			getBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		for(Book b: this.getBooks()) {
			
			bookShop.getBooks().add(b);
		}
		return bookShop;
	}
	
	
}
