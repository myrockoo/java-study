package jan_06;

public class b_Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double plus(double x, double y) {
		double result2 = x + y;
		return result2;
	}
	public static void main(String[] args) {
		b_Calculator myCalc = new b_Calculator();
		int res1 = myCalc.plus(5, 10);
		double res2 = myCalc.plus(10.5, 20.3);
		
		System.out.println(res1);
		System.out.println(res2);
	}

}
