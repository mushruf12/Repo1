package collectiospackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class CList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("C");
		list.add("C");
		System.out.println(list);
		Set <String> set = new HashSet<String>();
		Set set2 = new HashSet();
		set.add("a");
		set.add("a");
		System.out.println(set);
	}

}
