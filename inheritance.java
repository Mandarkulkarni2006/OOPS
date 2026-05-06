class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Calling superclass method
        d.eat();

        // Calling subclass method
        d.bark();
    }
}
