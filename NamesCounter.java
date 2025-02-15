import java.util.HashMap;

public class NamesCounter {
     private HashMap<String, Integer>  names = new  HashMap<>();

     // Добавляет или обнавляет запись в тел. книге 

    public  void  addName(String name){
        names.compute(name, (k,v) -> (v==null) ? 1 :v +1 );
    }
    public HashMap<String, Integer> getNamesCounter(){
        return names; 
    }
}


