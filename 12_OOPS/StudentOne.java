public class StudentOne {
    
    public String name;
    public int rollNumber;
    private int age;
    private int marks;

    // setter --> set value of age
    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    // getter --> get value of age
    public int getAge() {
        return this.age;
    }

    // setter --> set value of marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // getter --> get value of marks
    public int getMarks() {
        return this.marks;
    }
}
