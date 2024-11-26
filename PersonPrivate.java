public class PersonPrivate {
    private String name;
    private int age;

    public PersonPrivate(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("Tan",20);
        person.displayDetails();
    }
}
