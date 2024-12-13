

interface Animal {
    void eat();
    void sleep();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eat fish");
    }

    public void sleep() {
        System.out.println("Cat sleep at day");
    }
}

class Bear implements Animal {
    public void eat() {
        System.out.println("Bear eat honey");
    }

    public void sleep() {
        System.out.println("Bear sleep at night");
    }
}

public class Interface {
    public static void main (String[] args) {
        Animal animal1 = new Cat();
        animal1.eat();
        animal1.sleep();

        System.out.println();
        Animal animal2 = new Bear();
        animal2.eat();
    }
}
