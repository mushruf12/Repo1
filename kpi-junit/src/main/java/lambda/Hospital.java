package lambda;

public class Hospital implements Recovery1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h =new Hospital();
		
		Recovery1 p1 = (String P1, String status)-> {return status;};
		System.out.println("Patient 1 is "+h.recover1("P1","Recovered",p1));
		System.out.println("Patient 2 is "+h.recover1("P1","Recovered",p1));
		


	}
	
	private String recover1(String P1, String status,Recovery1 recovery1) {
		return recovery1.recover(P1,status);
		
		
	}

}
