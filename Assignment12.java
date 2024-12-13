import java.util.Scanner;

interface Car {
    void message();
    void price();
}

class Tesla implements Car {
    public void message() {
        System.out.println("Yes Tesla is the best electric car");
    }
    public void price() {
        System.out.println("RM75000");
    }
}

class Toyota implements Car {
    public void message() {
        System.out.println("");
    }
    public void price() {
        System.out.println("RM45000");
    }
}

class BMW implements Car {
    public void message() {
        System.out.println("BMW is one of the coolest car in the world");
    }
    public void price() {
        System.out.println("RM85000");
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Toyota");
        System.out.println("2. BMW");
        System.out.println("3. Tesla");
        System.out.println();

        System.out.print("Enter a car name: ");
        String carName = scanner.nextLine();

        if (carName.equalsIgnoreCase("BMW")){
            Car car1 = new BMW();
            car1.price();
            car1.message();            
        }
        else if (carName.equalsIgnoreCase("Tesla")){
            Car car2 = new Tesla();
            car2.price();
            car2.message();
        }
        else if (carName.equalsIgnoreCase("toyota")){
            Car car3 = new Toyota();
            car3.price();
            car3.message();
        }
    }
}
