import java.sql.Array;
import java.util.ArrayList;

public enum Comamand {
    ADD("(^ADD\\s\\D+.*)|(^ADD\\s\\d+$)"),
    ADD_AT("(^ADD\\s)(\\d+)(\\D+.*)"),
    LIST("^LIST"),
    DELETE("^DELETE\\s\\d+"),
    EDIT("^EDIT\\s\\d+\\D+.*"),
    NOT_COMAND("");

    private String regex;

    private Comamand(String regex){
        this.regex = regex;
    }
    private Comamand(String regex,String n){
        this.regex = regex;
    }
    public String getRegex(){
        return this.regex;
    }

}
