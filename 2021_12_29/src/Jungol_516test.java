import java.util.Scanner;
 
public class Jungol_516test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        String s = sc.next(); // next�� ���鹮�� ������ next line ���� ����.
        
        char c = sc.next().charAt(0);
        String str = sc.next();
        char c1 = str.charAt(0);
        sc.close();
        
        System.out.printf("%.2f\n%.2f\n%s", i, j, s);
    }
}