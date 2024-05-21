import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Prom{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ",";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 123123, bookPhone);
        addNumber("Ivanov", 122234, bookPhone);
        addNumber("Petrov", 555, bookPhone);
        addNumber("Sidorov", 777, bookPhone);
        addNumber("Ivanov", 1234567, bookPhone);
        addNumber("Petrov", 111111, bookPhone);
        printBook(bookPhone);
       }
}