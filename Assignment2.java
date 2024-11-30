import java.util.Scanner;

class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            cars[i] = new Car(model, price);
        }

        double totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        double averagePrice = totalPrice / 3;

        System.out.println("Car Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Car " + (i + 1) + " - Model: " + cars[i].getModel() + ", Price: " + cars[i].getPrice());
        }
        System.out.println("Average Price: " + averagePrice);

    }
}
