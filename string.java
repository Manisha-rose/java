import java.util.Scanner;
class string {
public static void main(String[] args) {
 
    String a =  new String ("Hi, world!");
    String b = new String ("Hello world");
    System.out.println("stringA =  " + a);
    System.out.println("stringB = " + b);
    
    int length =a.length();
    System.out.println("\nLength of String1:" + length);
    
    System.out.println("String concatenation: " + a.concat(b));
    
    char c1 = b.charAt(2);
    System.out.println("Character at index 2: " + c1);
    
    System.out.println("String equal comparison: " + a.equals(b));
   
    System.out.println("String comparison: "); 
    System.out.println (a.compareTo(b));
    
    int s = 10;
    System.out.println("String conversion: " + String.valueOf(s));
    
    
    String fruits = " Apple , Orange , Banana " ;
    String [] arr = fruits . split ( " ," ) ;
    System.out.println("String Split:" + arr [1] );
    
   
   
    String replaced = a.replace("Hi", "hello");
    System.out.println("String replacing: " + replaced);
    
    String upper = a.toUpperCase();
    System.out.println("String Upper: " + upper);
   
    StringBuffer S = new StringBuffer("bye");
    S.append("world");
    System.out.println("String appending:" + S);
    
    
    
    
    
    
    
    
    
       
  }
  
  

}
    
