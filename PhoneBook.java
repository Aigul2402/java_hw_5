
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<Integer>>  phoneMap = new  HashMap<>();

     // Добавляет или обнавляет запись в тел. книге 

    public  void  addPhoneBook(String name, Integer number){
        phoneMap.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }
    // Поиск номера телефона по имени

    public ArrayList<Integer> find(String name){
        return phoneMap.getOrDefault(name, new ArrayList<>());
    } 
    //Печать справочника
    public HashMap<String, ArrayList<Integer>> getPhoneBook(){
        return phoneMap; 
    }
}
