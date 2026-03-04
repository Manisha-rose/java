import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;
    
    public Person(String name, String gender, String address, int age) {
       this.name = name;
       this.gender = gender;
       this.address = address;
       this.age = age;
    }
    public void display() {
       System.out.println("Name: " + name);
       System.out.println("Gender: " + gender);
       System.out.println("Address: " + address);
       System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    String company_name;
    String qualification;
    double salary;
    
    public Employee(String name, String gender, String address, int age, int empId, String company_name, String qualification, double salary) {  
        super(name,gender,address,age);
        this.empId = empId;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        }
}
class Teacher extends Employee {
        String subject;
        String department;
        int teacherId;

        public Teacher (String name, String gender, String address, int age, int empId, String company_name, String qualification, double salary, String subject, String department, int teacherId) {
            super(name, gender, address, age, empId, company_name, qualification, salary);
            this.subject = subject;
            this.department = department;
            this.teacherId = teacherId;
     }
     @Override
     public void display() {
         super.display();
         System.out.println("Teacher ID: " + teacherId);
         System.out.println("Subject: " + subject);
         System.out.println("Department: " + department);
         
     System.out.println("---------------------------------------------------------------------------------");
     }
 }
 
 public class MultilevelInheritanceDemo {
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the number of teachers (N): ");
        int n = sc.nextInt();
        
        Teacher[] teachers = new Teacher [n];
        
        for (int i=0; i<n; i++) {
            System.out.println("\n --- Enter Details of Teacher " + (i+1) + "----");
            sc.nextLine();
 
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Gender: ");
            String gender = sc.nextLine();
            System.out.println("Address: ");
            String address = sc.nextLine();
            System.out.println("Age: ");
            int age = sc.nextInt();
            
            System.out.println("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Company Name: ");
            String company_name = sc.nextLine();
            System.out.println("Qualification: ");
            String qualification = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            
            sc.nextLine();
            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();
            
            teachers[i] = new Teacher(name, gender,address, age, empId, company_name, qualification, salary, subject, department, teacherId);
            }
    System.out.println("\n=================================================");
    System.out.println("               Teacher Records");
    System.out.println("\n=================================================");
            for (int i =0; i<n; i++) {
                teachers[i].display();
            }
            sc.close();
      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
