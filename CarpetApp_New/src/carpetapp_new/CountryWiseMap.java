/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetapp_new;

import java.util.HashMap;

/**
 *
 * @author Manik
 */
public class CountryWiseMap {
    
    private static HashMap<String, String> countryUnitMap;
    private static HashMap<String, Integer> countryPriceMap;
    
    public static HashMap<String, String> getCountryUnitMap(){
        countryUnitMap = new HashMap<>();
        countryUnitMap.put("US", "inches");
        countryUnitMap.put("UK","metres");
        countryUnitMap.put("IN", "foot");
        countryUnitMap.put("AUS", "yards");
        return countryUnitMap;
    }
    
    public static HashMap<String, Integer> getCountryPriceMap(){
        countryPriceMap = new HashMap<>();
        countryPriceMap.put("US", 10);
        countryPriceMap.put("UK", 8);
        countryPriceMap.put("IN", 21);
        countryPriceMap.put("AUS", 16);
        return countryPriceMap;
    }
    
}
