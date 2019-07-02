import java.util.HashMap;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String,Phone> nameIsKeyMap;
    private TreeMap<Phone,String> phoneIsKeyMap;
    public PhoneDirectory(){
        nameIsKeyMap = new TreeMap<>();
        phoneIsKeyMap = new TreeMap<>();
    }

    public boolean isPhoneInDirectory(Phone phone){
        return phoneIsKeyMap.get(phone) != null;
    }
    public boolean isNameInDirectory(String phone){
        return nameIsKeyMap.get(phone) != null;
    }

    public void add(String text, Phone phone){
        if(nameIsKeyMap.get(text) == null && phoneIsKeyMap.get(phone) == null) {
            nameIsKeyMap.put(text, phone);
            phoneIsKeyMap.put(phone, text);
        }
    }

    public void printDirectory(){
        for(String key:nameIsKeyMap.keySet()){
            System.out.println(key + "\t" + nameIsKeyMap.get(key));
        }
        System.out.println("----------");
        for (Phone key:phoneIsKeyMap.keySet()) {
            System.out.println(key + "\t" + phoneIsKeyMap.get(key));
        }
    }

    public void printContactInfo(Phone phone){
        System.out.println(phoneIsKeyMap.get(phone.toString()) + "\t" + phone);
    }

    public void printContactInfo(String name){
        System.out.println(name + "\t" + nameIsKeyMap.get(name));
    }
}
