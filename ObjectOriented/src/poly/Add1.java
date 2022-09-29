package poly;

public interface Add1 {
	
	void addition();
	
	default int add(int a , int b) {
		
		return a+b;
	}

}