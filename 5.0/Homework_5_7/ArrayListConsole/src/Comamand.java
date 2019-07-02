import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Comamand {
    //ADD_EMAIL("(^ADD\\s)((\b[a-zA-Z0-9.]+@)+(.[a-zA-Z]{2..4})$)"),
    ADD("(^ADD\\s\\D+.*)|(^ADD\\s\\d+$)"),
    ADD_AT("(^ADD\\s)(\\d+)(\\D+.*)"),
    LIST("^LIST"),
    DELETE("(^DELETE\\s)(\\d+)"),
    EDIT("(^EDIT\\s)(\\d+)(\\D+.*)"),
    NOT_COMAND("");

    private String regexMatcher;

    private Comamand(String regex){
        this.regexMatcher = regexMatcher;
    }
    public String getRegexMatcher(){
        return this.regexMatcher;
    }
    public int getIndexComand(String s){
        Pattern p = Pattern.compile(this.getRegexMatcher());
        Matcher matcher = p.matcher("s");
        if (matcher.find() ){
            return Integer.parseInt(matcher.group(2));
        }
        else return -1;
    }



}
