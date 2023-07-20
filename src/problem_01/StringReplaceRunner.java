package problem_01;

public class StringReplaceRunner {
    public static void main(String[] args) {
        StringReplace object1 = new StringReplace();
        System.out.println(object1.replaceI().length());
        System.out.println(object1.replaceSS(object1.replaceI()).length());
    }
}
