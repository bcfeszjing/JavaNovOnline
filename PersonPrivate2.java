public class PersonPrivate2 {
    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonPrivate2(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        PersonPrivate2 person = new PersonPrivate2("Tan",22, 1.75, 55.0);
        person.displayDetails();
    }
}
