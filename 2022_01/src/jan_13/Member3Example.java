package jan_13;

public class Member3Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member3 original = new Member3("홍길동", 25, new int[] { 90, 80 }, new Car("소나타"));

		Member3 cloned = original.getMember();
		cloned.scores[0] = 101;
		cloned.car.model = "k5";

		System.out.println("복제 객체의 필드값");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1) ? "" : " , "));
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
		System.out.println();

		System.out.println("원본 객체의 필드값");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length - 1) ? "" : " , "));
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
		System.out.println();
	}

}
