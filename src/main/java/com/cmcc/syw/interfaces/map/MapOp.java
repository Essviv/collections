package com.cmcc.syw.interfaces.map;

import java.util.Map;
import java.util.Set;

import static com.cmcc.syw.Utils.randMap;
import static com.cmcc.syw.Utils.randStr;

/**
 * code to practise basic operation of map
 * <p>
 * Created by sunyiwei on 16/4/13.
 */
public class MapOp {
    public static void main(String[] args) {
        final int COUNT = 10;

        Map<String, String> map = randMap(COUNT);
        map.put(randStr(10), randStr(5));

        System.out.println(map.containsKey("random"));

        //traverse by entry set
        Set<Map.Entry<String, String>> entrys = map.entrySet();
        for (Map.Entry entry : entrys) {
            System.out.format("%s: %s. %n", entry.getKey(), entry.getValue());
        }
    }
}
