package jan_17;

public class ArrayMain {
	public static void main(String[] args){
		String[] array = new String[3];

		array[0] = "Java";
		array[1] = "JSP";
		array[2] = "String";
		
		for(int i=0;i<array.length;i++) { 
			System.out.println(array[i]);
		}
		
		System.out.println("----------------");
		
		for (String s : array){
			System.out.println(s);
		}
	}
 }