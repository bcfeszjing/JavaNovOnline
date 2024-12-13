abstract class Shape {
    abstract void draw();

    void description() {
        System.out.println("This shape is drawn");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Sqaure extends Shape {
    void draw() {
        System.out.println("Drawing a Sqaure");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.description();

        Shape shape2 = new Sqaure();
        shape2.draw();
        shape2.description();
    }
}
