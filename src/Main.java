import hw_1.CustomHashMap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Object> map = new CustomHashMap<>();
        map.put("key1", "value1");
        map.put("key2", 32);

        if(map.getStr("key1") instanceof String){
            System.out.println(map.getStr("key1"));
        }

        if(map.getStr("key2") instanceof String){
            System.out.println(map.getStr("key2"));
        }
    }
}