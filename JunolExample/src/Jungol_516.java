import java.util.Scanner;
 
public class Jungol_516 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        String s = sc.next();
        sc.close();
        
        System.out.printf("%.2f\n%.2f\n%s", i, j, s);
    }
}