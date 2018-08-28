package singleton;

public final class MySingleton {
	
	private static MySingleton obj = null; 
	private Long id;
	private String name;
	private String country;
	
	private MySingleton() {
		
		System.out.println("Instance Created");
	}
	
	//Lazy Initilization
	static MySingleton getInstance() {
		if(obj==null)
			return obj = new MySingleton();
		return obj ;
	}
	

	@Override
	public String toString() {
		return "MySingleton [id=" + id + ", name=" + name + ", country=" + country + "]"+super.toString();
	}
	
}
