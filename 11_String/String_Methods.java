public class String_Methods {
    public static void main(String[] args) {
        // length()
        String s = "Hello";
        System.out.println(s.length());

        // charAt()
        String a = "Hello";
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(4));

        // toUpperCase()
        String b = "hello";
        System.out.println(b.toUpperCase());

        // toLowerCase()
        String c = "HELLO";
        System.out.println(c.toLowerCase());

        // concat()
        String first = "Hello";
        String second = " Java";
        String result = first.concat(second);
        System.out.println(result);

        // substring()
        String d = "Hello Java";
        System.out.println(d.substring(6));

        // contains()
        String e = "Hello Java";
        System.out.println(e.contains("Java"));

        // equals()
        String x = "Hello";
        String y = "Hello";
        System.out.println(x.equals(y));

        // equalsIgnoreCase()
        String p = "hello";
        String q = "HELLO";
        System.out.println(p.equalsIgnoreCase(q));

        // trim()
        String z = "   Hello   ";
        System.out.println(z.trim());
    }
}
