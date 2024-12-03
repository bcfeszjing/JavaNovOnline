public class Encapsulation {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Tan");
        person.setAge(25);

        System.out.println("The name of person is: " + person.getName());
        System.out.println("The age of person is: " + person.getAge());
        
    }
}
