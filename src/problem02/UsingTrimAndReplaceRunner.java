package problem02;

public class UsingTrimAndReplaceRunner {
    public static void main(String[] args) {
        String something = "Md Momin Sarker";
        UsingTrimAndReplace object = new UsingTrimAndReplace();
        System.out.println(object.useTrim(something));
        System.out.println(object.UseReplaceAllSpace(object.useTrim(something)));
    }
}
