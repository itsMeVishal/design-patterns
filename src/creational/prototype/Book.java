package creational.prototype;

public class Book {
	
	private int BId;
	private String BName;
	
	
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	
	@Override
	public String toString() {
		return "Book [BId=" + BId + ", BName=" + BName + "]";
	}
	
	
}
