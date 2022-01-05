package sedanfactory;

import component.Tire;

public class Sedan {

	public static void main(String[] args) {
		Tire compoTire = new Tire();
//		compoTire.size = 20;
		compoTire.setSize(20);
		
//		System.out.println(compoTire.size);
		System.out.println(compoTire.getSize());
		compoTire.gotSize(10);
//		System.out.println(t);
	}

}
