package com.forestnewark;

import java.util.HashMap;
import java.util.Map;

/**
 * "mapAB4 "
 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different
 * lengths, then set "c" to have the longer value. If the values exist and have the same length, change
 * them both to the empty string in the map.
 */

public class Map1 {


    public static Map<String, String> mapAB4(Map<String, String> map) {

        //Return Map if HashMap is empty
        if (map.size() == 0) {
            return map;
        }
        //Return Map if it does not have "a" key or "b" key
        else if (map.containsKey("a") && map.containsKey("b")) {

            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
                return map;
            } else if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
                return map;
            } else if (map.get("b").length() > map.get("a").length()) {
                map.put("c", map.get("b"));
            }

        } else {
            return map;
        }
        return map;
    }
}
