package jan_06;

public class c_Calculator {
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	public static void main(String[] args) {
		c_Calculator myCalc = new c_Calculator();
		
		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0, 6.0);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
