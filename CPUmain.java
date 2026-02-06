import java.util.Scanner;

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manu;

        Processor(int cores, String manu) {
            this.cores = cores;
            this.manu = manu;
        }

        void display() {
            System.out.println("Processor cores: " + cores);
            System.out.println("Processor manufacturer: " + manu);
        }
    }

    static class RAM {
        int mem;
        String manu;

        RAM(int mem, String manu) {
            this.mem = mem;
            this.manu = manu;
        }

        void display() {
            System.out.println("RAM memory: " + mem + " GB");
            System.out.println("RAM manufacturer: " + manu);
        }
    }

    void display() {
        System.out.println("CPU price: " + price);
    }
}

public class CPUmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details: ");
        
        System.out.print("Enter CPU price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        CPU cpuObj = new CPU(price);
        
        System.out.print("Enter processor cores: ");
        int cores = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter processor manufacturer: ");
        String pManu = sc.nextLine();

        CPU.Processor p = cpuObj.new Processor(cores, pManu);


        System.out.print("Enter RAM memory (GB): ");
        int mem = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM manufacturer: ");
        String rManu = sc.nextLine();

        CPU.RAM r = new CPU.RAM(mem, rManu);

        System.out.println("\n--- CPU Details ---");
        cpuObj.display();
        p.display();
        r.display();

        sc.close();
    }
}

