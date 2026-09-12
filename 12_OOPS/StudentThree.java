public class StudentThree {
    
    public String name;
    public int age;
    public String college;

    public StudentThree(String name) {
        this.name = name;
        this.college = "SIT Sitamarhi";
    }

    // constructor overloading

    public StudentThree(String name , int x) {
        age = x;
        this.name = name;
        this.college = "IISc Banglore";
    }

}