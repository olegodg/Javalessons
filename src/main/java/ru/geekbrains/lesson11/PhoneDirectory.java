package ru.geekbrains.lesson11;
import java.util.*;

public class PhoneDirectory {
    private List<String> phoneNumbers;
    private Map<String,List<String>> phoneDirectory = new HashMap<>();

    void add(String lastName, String phoneNumber){
        if (phoneDirectory.containsKey(lastName)){
            phoneNumbers=phoneDirectory.get(lastName);
            phoneNumbers.add(phoneNumber);
            phoneDirectory.put(lastName,phoneNumbers);
        }else{
            phoneNumbers=new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneDirectory.put(lastName,phoneNumbers);
        }
    }

    public List<String> getPhoneDirectory(String lastName) {
        return phoneDirectory.get(lastName);
    }
}
