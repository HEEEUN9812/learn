package hw_1;

import java.util.HashMap;

public class CustomHashMap<K, V> extends HashMap<K, V> {

    public String getStr(K key){
        return super.get(key).toString();
    }
}
