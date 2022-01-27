package jan_24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("SErvle/JSP");
		set.add("Java");
		set.add("iBaTIS");
		
		int size = set.size();
		System.out.println("�� ��ü�� : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü�� : " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}

}
