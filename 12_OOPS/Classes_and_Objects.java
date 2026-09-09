public class Classes_and_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Chiku";
        s1.age = 21;
        s1.nos = 6;

        s1.study();
        System.out.println(s1.name);
    }
}