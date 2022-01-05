
public class a_car {
	String color;
	int cc;
	
	a_car(){
		
	}
	
	a_car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}

	public static void main(String[] args) {
		a_car myCar1 = new a_car();
//		The Constructor Car is undefined
		int j = myCar1.cc;
		
		System.out.println(j);
		
		a_car myCar2 = new a_car("black", 3000);
		
		int k = myCar2.cc;
		System.out.println(k);

		
		System.out.println(myCar1.color);
		System.out.println(myCar2.color);
		System.out.println(myCar1.cc);
		System.out.println(myCar2.cc);
		
		

	}

}
