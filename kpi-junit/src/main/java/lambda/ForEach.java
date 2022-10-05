package lambda;
import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface TestForEach{
	void print (List test);
}
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> List = new ArrayList<String>();
		List.add("1");
		List.add("2");
		List.add("3");
		List.add("4");
		List.add("5");
		List.add("6");
		List.forEach(list->System.out.println(list));
		
		//TestForEach tef = ()->System.out.println(games);
		

	}

}
