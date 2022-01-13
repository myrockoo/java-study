package jan_13;

public class Member3 implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	protected Object clone() throws CloneNotSupportedException{
		//���� ���� ���縦 �Ͽ� name, age�� �����Ѵ�
		Member3 cloned =(Member3) super.clone(); 
		// scores�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
		
		try {
			cloned = (Member3) clone();
		}catch (CloneNotSupportedException e) {
		}
		return cloned;
	}
	

}
