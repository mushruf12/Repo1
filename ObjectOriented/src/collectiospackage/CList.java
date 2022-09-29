package collectiospackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
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
		//System.out.println(list);
		Set <String> set = new HashSet<String>();
		Set set2 = new HashSet();
		set.add("a");
		set.add("a");
		//System.out.println(set);
		Map <String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a",100);
		hm.put("b",200);
		hm.put("c",300);
		hm.put("d",400);
		hm.put("a",200);
		System.out.println(hm.get("a"));
		System.out.println(hm);
	}

}
