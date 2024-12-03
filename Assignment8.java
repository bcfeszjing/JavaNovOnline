import java.util.Scanner;

public class Assignment8 {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBmi() {
        return bmi;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 ){
            this.age = age;
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Assignment8 asg = new Assignment8();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        asg.setName(name);
        asg.setAge(age);
        asg.setWeight(weight);
        asg.setHeight(height);

        double bmi = (asg.getHeight() - 100)/asg.getWeight();
        asg.setBmi(bmi);

        System.out.println("The person name is " + asg.getName() + " and he/she is " + 
        asg.getAge() + " years old and his/her bmi is " + asg.getBmi());

    }
}
