public class Inheritance {
    
    public static class Animal {

        // Animals Behaviour
        public String name = "Animal";
        public int age;

        // Animals property
        public void eat() {
            System.out.println("This animal eats food.");
        }

        public void sayHello() {
            System.out.println("Hello");
        }
    }


    public static class Dog extends Animal {
        public int legs = 4;
            // override
        public String name = "Bob";

            // override
        public void sayHello() {
            System.out.println("Woof");
        }
    }


    public static class Test {
        public static void main(String[] args) {
            Dog dog = new Dog();

            dog.eat();
            System.out.println(dog.legs);
            System.out.println(dog.name);
            dog.sayHello();
        }
    }
}
