package jan_25;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple\t");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry\t");
		
		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet.descendingSet()) {
			System.out.println(word);
		}
		

	}

}
