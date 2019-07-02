import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Comamand {
    ADD_EMAIL("(^ADD\\s)(([A-Za-z0-9.!#%&*_])+@([a-zA-Z0-9])+\\.(([a-zA-Z]){2}|([a-zA-Z]){3})$)"),
    ADD("(^ADD\\s\\D+.*)|(^ADD\\s\\d+$)"),
    ADD_AT("(^ADD\\s)(\\d+)(\\D+.*)"),
    LIST("^LIST"),
    DELETE("(^DELETE\\s)(\\d+)"),
    EDIT("(^EDIT\\s)(\\d+)(\\D+.*)"),
    NOT_COMAND("");

    private String regexMatcher;
    String re = "(^ADD\\s)(([A-Za-z0-9.!#$%^&*_])+@(([a-zA-Z0-9])+\\.)+([a-zA-Z]){2}|(([a-zA-Z]){3})$)";
    boolean k = "".matches(re);

    private Comamand(String regexMatcher){
        this.regexMatcher = regexMatcher;
    }
    public String getRegexMatcher(){
        return this.regexMatcher;
    }
    public int getIndexComand(String s){
        Pattern p = Pattern.compile(this.getRegexMatcher());
        Matcher matcher = p.matcher(s);
        if (matcher.find() ){
            return Integer.parseInt(matcher.group(2));
        }
        else return -1;
    }

    public String getSecondPart(String s){
        Pattern p = Pattern.compile(this.getRegexMatcher());
        Matcher matcher = p.matcher(s);
        if (matcher.find() ){
            return s = s.replaceFirst(matcher.group(1), "");
        }
        else return null;
    }



}
