package collectiospackage;

import java.util.ArrayList;

public class Testcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList();
		list.add("M");
		list.add("u");
		//list2.add(1);
		//list2.add("s");
		System.out.println(list.get(0));
		System.out.println(list2);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="u") {
				System.out.println(i);
			}
			
		}
		for(int j=0;j<10;j++) {
			list2.add(j);
		}
		System.out.println(list2);
	}

}
