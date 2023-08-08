package ooponlineclass;

import java.util.HashMap;

public class Ooponlineclass {

    public static void main(String[] args) {
    HashMap<String,String> capitalCities = new HashMap<String,String>();
    
    capitalCities.put("England","Londin");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);
    for(String i : capitalCities.keySet()){
        System.out.println(i);
    }
    for(String i : capitalCities.values()){
        System.out.println(i);
    }
    for(String i : capitalCities.keySet()){
        System.out.println(" key." +i+ " value. " +capitalCities.get(i));
    }
    }    
}
