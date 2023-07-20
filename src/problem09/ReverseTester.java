package problem09;

public class ReverseTester {
    public static void main(String[] args) {
        String input = "desserts";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reversedString = sb.toString();

        System.out.println("Reversed string: "+reversedString);
        System.out.println("Expected value: "+reversedString(input));
    }
    private static String  reversedString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
