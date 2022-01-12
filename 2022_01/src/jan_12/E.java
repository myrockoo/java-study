package jan_12;

public class E {
	void method() {
		class F{
			F(){}
			int filed1;
//			static int field2;
			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
//			static void method2();
		}
//		E e = new E();
		F f = new F();
		f.filed1 = 7;
		System.out.println("f.field1 : " + f.filed1);
		f.method1();
//		e.method(); // Àç±Í
		
	}

}
