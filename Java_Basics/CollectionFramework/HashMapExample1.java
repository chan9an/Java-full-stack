package CollectionFramework;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(101, "ABC");
        hm.put(102, "null");
        hm.put(103, "CAB");
        hm.put(104, "null1");
        for(Map.Entry en : hm.entrySet()){
            System.out.println(en.getKey()+" " + en.getValue());
        } 
    }

}
