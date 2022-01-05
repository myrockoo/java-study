
public class b_car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;

	b_car() {

	}

	b_car(String model) {
		this.model = model;
	}

	b_car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
//	b_car(String model, String color) {
//		this.color = color;
//		this.model = model;
//	}
//	b_car(String color){
//		this.color = color;
//	}
	
	b_car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {
		b_car car1 = new b_car();
		System.out.println("car1.company : " + car1.company);
		System.out.println(car1.color);
		System.out.println();
		
		b_car car2 = new b_car("Sonata");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println(car2.color);
		System.out.println();
				
		b_car car3 = new b_car("Sonata", "Red");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		b_car car4 = new b_car("Sonata", "Red", 190);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
		b_car car5 = new b_car("ff", "ff");
		System.out.println(car5.color + car5.maxSpeed);

	}

}
