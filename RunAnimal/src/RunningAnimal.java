
public class RunningAnimal {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
//		ani1.name = "cat";
		ani1.setName("cat2");
//		ani1.age = 10;
		ani1.setAge(-99);
		
//		System.out.println(ani1.name);
		System.out.println(ani1.getName());
//		System.out.println(ani1.age);
		System.out.println(ani1.getAge());
		
		ani1.setAge(23);
		System.out.println(ani1.getAge());
	}

}
