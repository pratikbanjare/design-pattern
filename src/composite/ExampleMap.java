package composite;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    public static void main (String[] args){

        /*
        In Map, one element of map is treated exactly as entire Map itself
         */


        Map<String, String> personMap = new HashMap<>();
        personMap.put("pratik","keyboard");
        personMap.put("Adi","harmonium");

        Map<String, String> groupMap = new HashMap<>();
        groupMap.put("sg","finance");

        Map<String, String> allMap = new HashMap<>();
        allMap.putAll(personMap);
        allMap.putAll(groupMap);

        System.out.println(allMap);
    }

}
