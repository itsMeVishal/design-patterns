package singleton;

public class MainApp {

	public static void main(String[] args) {
		
		MySingleton s1= MySingleton.getInstance();
		MySingleton s2= MySingleton.getInstance();
	   /*MySingleton s2= new MySingleton();*/
		System.out.println(s1.toString()+"\t"+s2.toString());

	}

}
