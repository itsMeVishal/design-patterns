package structual.adapterdesign;

public class School {

	public static void main(String[] args) {
		
		//PilotPen pp = new PilotPen(); insted 
		Pen p = new PenAdapter();
		AssignmentWork asw = new AssignmentWork();
		asw.setP(p);
		asw.writeAssignment("Writing assignment!!!");
	}
}
