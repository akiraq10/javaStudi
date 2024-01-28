package lession_06;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        //Map<key,Value>
        Map<Integer,String> emergencyList = new HashMap();
        emergencyList.put(113,"CSCD");
        emergencyList.put(114,"cuu hoa");
        emergencyList.put(115,"cap cuu");
        emergencyList.put(116,"Others");
//        emergencyList.put(114,"something else"); // = voi replace


        //remove key
        for (Integer key : emergencyList.keySet()) {
            emergencyList.remove(key,"Others");
//            if(emergencyList.get(key).equals("Others")){
//                emergencyList.remove(key);
//            }
        }

        //replace key

        emergencyList.replace(115,"something else");
        emergencyList.replace(115,"cap cuu", "sth else" );

        //show key
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }


    }

}
