public class Encapsulation {
    public static void main(String[] args) {
        StudentOne s1 = new StudentOne();

        s1.name = "Ned Stack";
        s1.rollNumber = 46;
        // private
        s1.setAge(15);
        System.out.println(s1.getAge());

        s1.setMarks(90);
        System.out.println(s1.getMarks());
    }
}