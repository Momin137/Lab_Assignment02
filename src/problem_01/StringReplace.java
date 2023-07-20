package problem_01;

public class StringReplace {

    private String stateName;
    public StringReplace(){
        stateName = "Mississippi";
    }
    public StringReplace (String statename){
        this.stateName = statename;
    }
    public String replaceI(){
        String NewStateName = stateName.replace("i","ii");
        return NewStateName;
    }
    public String replaceI(String statename){
        String NewStateName = statename.replace("i","ii");
        return NewStateName;
    }
    public String replaceSS(){
        String NewStateName = stateName.replace("ss","s");
        return NewStateName;
    }
    public String replaceSS(String statename){
        String NewStateName = stateName.replace("ss","s");
        return NewStateName;
    }

}
