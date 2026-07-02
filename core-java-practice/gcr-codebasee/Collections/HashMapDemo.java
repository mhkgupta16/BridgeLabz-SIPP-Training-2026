import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "mahak");
    map.put(2, "teesha");
    //using keyset
    for(Integer key:map.keySet()){
      System.out.println(key + ": " + map.get(key));
    }
    //using values
    for(String value:map.values()){
      System.out.println(value);
    }
    //using entryset
    for(HashMap.Entry<Integer, String> entry:map.entrySet()){
      System.out.println(entry.getKey() + " "+ entry.getValue());
    }
    //using foreach 
    map.forEach((key, value) -> System.out.println(key +" " + value));
    
  }

}
