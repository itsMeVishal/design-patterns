package temp;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class cl = Class.forName("temp.stud");
		
		stud s1 = new stud(1,"vishal");
		stud s2=(stud) cl.newInstance();
		s2.roll=1;
		s2.name="vishal";
		if(s1==s2)

		System.out.println("Output from myEclipse goes here!!!!");

	}

}
