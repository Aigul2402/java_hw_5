
import java.util.HashMap;




// Создайте программу для учета продуктов в корзине. Программа должна позволять добавлять, 
// удалять, обновлять количество продуктов, а также проверять наличие продуктов в корзине. Используйте HashMap дляхранения
// продуктов и их количества
public class ShoppingBasket5 {
//Метод для добавления продукта в карзину
private HashMap<String, Integer> basket = new HashMap<>();
public void addProduct(String product, Integer quantity){
    if (basket.containsKey(product)){
        basket.put(product, basket.get(product)+quantity);
    } else{
        basket.put(product, quantity);
    }
}  
// Метод для удаления продукта из карзины
public void removeProduct(String product){
    if (basket.containsKey(product)){
        basket.remove(product);
    }
}
// Метод для обновления количества продуктов в карзине
public void updateQuantity(String product, Integer quantity){
    if(basket.containsKey(product)){
        basket.put(product, quantity);
    }
}
// Метод для проверки колличества продуктов в корзине 

public int  checkProduct(String product){
    return basket.getOrDefault(product,0);
}
// метод для вывода всех продуктов и их количества
public  void showBasket(){
    if (basket.isEmpty()){
        System.out.println("Basket is empty");
    } else {
        for (HashMap.Entry<String, Integer> entry: basket.entrySet()){
            System.out.println(entry.getKey() + "-"+ entry.getValue());
        }            
        }
    }
}

