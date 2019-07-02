public class Kithen extends Cat{
    //private String name;
    @Override
    public String toString() {
        return "Kithen "+ super.toString();
    }

    public Kithen(String name){
        super(name);
    }
}
