package problem07;

public class ReplaceTester {
    public static void main(String[] args) {
        String state = "Mississippi";
        state = state.replace("i","!").replace("s","$");
        System.out.println("Expected string is: M!$$!$$!pp!");
        System.out.println("Actual string is: "+state);
    }
}
