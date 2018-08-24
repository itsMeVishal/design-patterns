package singleton;

public class MySingleton {
	
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
	/*public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}*/

	@Override
	public String toString() {
		return "MySingleton [id=" + id + ", name=" + name + ", country=" + country + "]"+super.toString();
	}
	
}
