package lambda;
import java.util.ArrayList;
import java.util.List;

public class John {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		John john = new John();
		List<John> j = new ArrayList<John>();
		j.add(john);
		j.forEach(name-> System.out.println(name));
	}

}
