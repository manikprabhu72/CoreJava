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
public class CountryUnitMap {
    
    private static HashMap<String, String> countryMap;
    
    public static HashMap<String, String> getCountryUnitMap(){
        countryMap = new HashMap<>();
        countryMap.put("US", "inches");
        countryMap.put("UK","metres");
        countryMap.put("IN", "foot");
        countryMap.put("AUS", "yards");
        return countryMap;
    }
    
}
