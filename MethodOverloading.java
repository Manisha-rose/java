import java.util.Scanner;

class Geometry{
   double area(double r) {
     return Math.PI * r * r;
     }
   double area(double length,double breadth){
    return length*breadth;
    }
    double area(double a,double b,double c){
         if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Invalid triangle!");
            return 0.0;
        }
         double s=(a+b+c)/2;
          
          return Math.sqrt(s*(s-a)*(s-b)*(s-c));
       }
     }
public class MethodOverloading {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Geometry geo = new Geometry();
   System.out.println("--- Method Overloading: Area Calculation ---\n");
   System.out.print("Enter radius of the Circle: ");
   double r = sc.nextDouble();
   System.out.println("area of circle:"+geo.area(r));
   System.out.print("\nEnter length and breadth of the Rectangle: ");
   double l = sc.nextDouble();
   double b = sc.nextDouble();
   System.out.print("area of rectangle:"+geo.area(l,b));
   System.out.print("\nEnter three sides of the Triangle (a, b, c): ");
   double sideA = sc.nextDouble();
   double sideB = sc.nextDouble();
   double sideC = sc.nextDouble();
   System.out.print("Area of triangle:"+geo.area(sideA,sideB,sideC));
   sc.close();
   }
  }

