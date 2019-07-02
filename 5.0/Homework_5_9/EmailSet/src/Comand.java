import java.util.Optional;

public enum Comand {
    ADD("(^ADD\\s).*"),
    LIST("^LIST$");

    private String regexMatcher;

    Comand(String regexMatcher){
        this.regexMatcher = regexMatcher;
    }

    String getRegexMatcher(){
        return this.regexMatcher;
    }

    static Optional<Comand> getComand(String s){
        for (Comand comand : Comand.values()) {
            if (s.matches(comand.getRegexMatcher())) {
                return Optional.of(comand);
            }
        }
        return Optional.empty();
    }

    static String clearADDString(String s){
        return s.replaceFirst("^ADD\\s","");
    }

}
