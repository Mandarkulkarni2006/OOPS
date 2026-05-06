abstract class Shape {

    // Abstract method
    abstract void draw();
}

// Subclass
class Circle extends Shape {

    // Implementation of abstract method
    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
    }
}