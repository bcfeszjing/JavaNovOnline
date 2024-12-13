import java.util.Scanner;

abstract class Car {
    abstract void price();

    void description() {
        System.out.println("Low Price We Sell");
    }
}

class Toyota extends Car {
    void price() {
        System.out.println("RM25000");
    }
}

class BMW extends Car {
    void price() {
        System.out.println("RM85000");
    }
}

class Tesla extends Car {
    void price() {
        System.out.println("RM75000");
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Toyota");
        System.out.println("2. BMW");
        System.out.println("3. Tesla");
        System.out.println();

        System.out.print("Enter a car name: ");
        String carName = scanner.nextLine();

        if (carName.equalsIgnoreCase("Toyota")) {
            Car car1 = new Toyota();
            car1.description();
            car1.price();
        }
        else if (carName.equalsIgnoreCase("BMW")){
            Car car2 = new BMW();
            car2.description();
            car2.price();
        }
        else if (carName.equalsIgnoreCase("Tesla")){
            Car car3 = new Tesla();
            car3.description();
            car3.price();
        }
    }
}
