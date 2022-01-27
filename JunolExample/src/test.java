import java.util.Scanner;

public class test {
   int num;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = 1;

      for (int i = 1; i <= n; i++) {// 고치지마
         for (int b = (n - 1); b >= i; b--) {
            System.out.print(" ");
            System.out.print(" ");
         }
         for (int j = 1; j <= i; j++) {
//            if (num > 26) {
//               num = num % 26;
//            }
            System.out.print((char) (num % 26 + 65) + " ");
            num += n - j;
         }
         num = i + 1;
         System.out.println();

      }
   }
}