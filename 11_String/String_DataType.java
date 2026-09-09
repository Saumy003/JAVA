public class String_DataType {
    
public static void main(String[] args) {
    // sequence of Character
    String name = "Saumy Kumar";
    System.out.println(name);

    String city = "Sitamarhi";
    System.out.println(city);

    String message = new String("Hello Java!");
    System.out.println(message);

    String number = "12345";
    System.out.println(number);

    // string pool vs heap
    String x = "Ram";

    String a = new String("Ram");
    String b = new String("Ram");

    String c = "Ram";
    String d = "Ram";

    System.out.println(a == b);   // false
    System.out.println(c == d);   // true
    System.out.println(x == c);   // true

    }
}