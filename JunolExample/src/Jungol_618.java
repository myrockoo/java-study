import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Jungol_618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person arr[] = new Person[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
		}
		sc.close();
		
		List<Person> personToSort = Arrays.asList(arr);
		personToSort.sort(Comparator.comparing(Person::getName));
				
		System.out.println("name");
		for(int i = 0; i < arr.length; i ++) {
			arr[i].print();
		}
		
		personToSort.sort(Comparator.comparing(Person::getWeight).reversed());
		
		System.out.println("\nweight");
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
	}
}

class Person {
	private String name;
	private int height;
	private double weight;
	
	Person(String name, int height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	void print() {
		System.out.printf("%s %d %.1f\n", name, height,weight);		
	}
	
	String getName() {
		return name;
	}
	
	double getWeight() {
		return weight;
	}
}
