package lession_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLearning2 {
    public static void main(String[] args) {
        //Map<key,Value>
        Map<Integer,String> emergencyList = new HashMap();
        emergencyList.put(113,"CSCD");
        emergencyList.put(114,"cuu hoa");
        emergencyList.put(115,"cap cuu");
        emergencyList.put(116,"Others");
        emergencyList.put(117,"Others");
//        emergencyList.put(114,"something else"); // = voi replace

        Set<Integer> allKey= emergencyList.keySet();
        for (Integer key : allKey) {
            if (emergencyList.get(key).equals("Others")){
                emergencyList.remove(key);
            }
        }

        Iterator<Map.Entry<Integer,String>> emergencyListIterator =emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()) {
            Map.Entry<Integer,String> entry = emergencyListIterator.next();
            String entryValue=entry.getValue();
            if(entryValue.equals("Others")){
                emergencyListIterator.remove();
            }
        }



    }

}
