package study.kt.study15;

import java.util.*;

public class Study15Java {

    public static void main(String[] args) {

        // array
        int[] i_array = {100, 200};

        for(int idx = 0; idx < i_array.length; idx++){
            System.out.printf("%s %s", idx, i_array[idx]);
        }

        // List
        List<Integer> i_list = new ArrayList<>();
        i_list = Arrays.asList(100, 200);

        // Map
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Monday");
        map1.put(2, "Tuesday");
    }

}
