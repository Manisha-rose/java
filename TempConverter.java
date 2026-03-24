import java.util.Scanner;
  
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(true) {
             System.out.println("\n---Temperature Converter ---");
             System.out.println("1.Celsius to Fahrenheit");
             System.out.println("2.Fahrenheit to Celsius"); 
             System.out.println("3.Exit");
             System.out.println("Select an option: ");
  
             int choice = sc.nextInt();
             sc.nextLine();
             
             if (choice == 3) {
               System.out.println("Program Exited..");
               break;
             }
             System.out.print("Enter temperature value: ");
             String userInput = sc.nextLine();
             
             try {
                double temp = Double.parseDouble(userInput);
                double convertedTemp;
                
                switch (choice) {
                   case 1:
                      convertedTemp = (temp * 9 / 5) + 32;
                      System.out.println( temp + "in Celsius is equal to " + convertedTemp + " in Fahrenheit");
                      break;
              
                   case 2:
                      convertedTemp = (temp - 32) * 5 / 9;
                      System.out.println(temp + "in Fahrenheit is equal to " + convertedTemp + "in Celsius");
                      break;
               
                   default:
                      System.out.println("Error: Invalid selection. Try again.");
                      continue;  
             }     
        } catch (NumberFormatException e) {
              System.out.println("Error: Invalid input. You must enter a numerical value.");
              System.out.println("Exception details:" + e);
              System.out.println("Reason: " + e.getMessage());
          }
        }
      }
}
