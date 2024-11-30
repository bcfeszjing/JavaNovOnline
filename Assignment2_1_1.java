import java.util.Scanner;

public class Assignment2_1_1 {
    private class Car {
        private String model;
        private String make;
        private double price;

        public Car(String model, String make, double price) {
            this.model = model;
            this.make = make;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment2_1_1 ass = new Assignment2_1_1();

        Car car1 = ass.getCarDetails(scanner);
        Car car2 = ass.getCarDetails(scanner);
        Car car3 = ass.getCarDetails(scanner);

        double averagePrice = (car1.getPrice() + car2.getPrice() + car3.getPrice()) / 3;
        System.out.println("The average price of the cars is: " + averagePrice);

        if (averagePrice > 100000) {
            System.out.println("The cars are expensive");
        } else if (averagePrice > 50000 && averagePrice < 99999) {
            System.out.println("The cars are normal price");
        } else if (averagePrice < 49999) {
            System.out.println("The cars are cheap");
        }
    }

    public Car getCarDetails(Scanner scanner) {
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter car price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        return new Car(model, make, price);
    }

}
