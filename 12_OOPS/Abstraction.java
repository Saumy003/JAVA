public class Abstraction {
    
    public abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    // Providing implementation
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

    public void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}

