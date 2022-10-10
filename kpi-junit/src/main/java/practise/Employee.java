package practise;
@FunctionalInterface
interface Salary{
	int salary();
}

interface Leaves{
	int sickleaves(int a);
	int payoffleaves(int a);
}

public class Employee implements Salary, Leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		System.out.println(e.salary());
		System.out.println(e.sickleaves(1));
		System.out.println(e.payoffleaves(3));

	}

	@Override
	public int sickleaves(int a) {
		// TODO Auto-generated method stub
		
		return a;
	}

	@Override
	public int payoffleaves(int b) {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 10000;
	}

	
}
