import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
}
