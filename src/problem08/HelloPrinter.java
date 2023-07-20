package problem08;

public class HelloPrinter {
    public static void main(String[] args) {
        String greeting = "Hello World";
        String encoding;
        greeting = greeting.replace("e","@");
        greeting = greeting.replace("o","e");
        encoding = greeting.replace("@","o");
        System.out.println("Encoding: "+encoding);
        System.out.println("Expected: Holle Werld");
    }
}
