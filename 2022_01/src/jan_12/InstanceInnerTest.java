package jan_12;


public class InstanceInnerTest {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass in = oc.new InnerClass();
		
//		InnerClass ic = new InnerClass();
		
		in.printInfo();
	}

}
