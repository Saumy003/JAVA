public class Interface {
    
    interface Vehicle {

        void start();
    }

    class Car implements Vehicle {

        @Override
        public void start() {
            System.out.println("Car starts with a button");
        }
    }

    public void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}
