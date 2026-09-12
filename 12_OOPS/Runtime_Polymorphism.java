public class Runtime_Polymorphism {

    public static class Animal {
        void sound() {
            System.out.println("Animals make sound.");
        }
    }

    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof Woof");
        }
    }

    public static class Cat extends Animal {
        @Override 
        void sound() {
            System.out.println("Meow Meow");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}