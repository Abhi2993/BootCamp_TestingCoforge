//Create program to get the duplicate character from strings using Hash Map



package PracticeQuestions;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {

        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        System.out.println("Duplicate Characters:");

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " = " + map.get(ch));
            }
        }
    }
}
