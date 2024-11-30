import java.util.Scanner;

class Car { 
    private String cModel;
    private String cName;
    private double cPrice;

    public Car(String cModel, String cName, double cPrice) {
        this.cModel = cModel;
        this.cName = cName;
        this.cPrice = cPrice;
    }

    public String getcModel() {
        return cModel;
    }

    public String getcName() {
        return cName;
    }

    public double getcPrice() {
        return cPrice;
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Car 1");
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Make: ");
        String name1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); 
        Car car1 = new Car(model1, name1, price1);

        System.out.println("Car 2");
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Make: ");
        String name2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine(); 
        Car car2 = new Car(model2, name2, price2);

        System.out.println("Car 3");
        System.out.print("Model: ");
        String model3 = scanner.nextLine();
        System.out.print("Make: ");
        String name3 = scanner.nextLine();
        System.out.print("Price: ");
        double price3 = scanner.nextDouble();
        scanner.nextLine(); 
        Car car3 = new Car(model3, name3, price3);

        double totalPrice = car1.getcPrice() + car2.getcPrice() + car3.getcPrice();
        double averagePrice = totalPrice / 3;

        System.out.println("\nCar Details:");
        System.out.println("Car 1 - Model: " + car1.getcModel() + ", Name: " + car1.getcName() + ", Price: " + car1.getcPrice());
        System.out.println("Car 2 - Model: " + car2.getcModel() + ", Name: " + car2.getcName() + ", Price: " + car2.getcPrice());
        System.out.println("Car 3 - Model: " + car3.getcModel() + ", Name: " + car3.getcName() + ", Price: " + car3.getcPrice());
        System.out.printf("Average Price: %.2f\n", averagePrice);

    }
}
