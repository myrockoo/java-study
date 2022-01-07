package jan_07;

public class a_Car {
	String model;
	int speed;
	
	a_Car(String m) {
		this.model = m;
	}
	void setspeed(int s) {
		this.speed = s;
	}
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setspeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}
	public static void main(String[] args) {
		a_Car car1 = new a_Car("Hyundai");
		a_Car car2 = new a_Car("BMW");
		
		car1.run();
		car2.run();
	}

}
