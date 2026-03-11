import java.util.Scanner;
import mathutils.Calculator;

public class packageDemo {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     Calculator calc = new Calculator();
     System.out.println("--User Defined Package--");
     System.out.println("Enter a number: ");
     int a = sc.nextInt();
     
     System.out.println("Enter another number: ");
     int b = sc.nextInt();
     
     System.out.println("Addition: " + calc.add(a,b));
     System.out.println("Subtraction: " + calc.subtract(a,b));
     System.out.println("Multiplication: " + calc.multiply(a,b));
     
      if (b != 0) {
           System.out.println("Division: " + calc.divide(a,b));
      } else {
           System.out.println("Division by Zero not allowed");
           }
     sc.close();
  }
}
