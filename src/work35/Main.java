package work35;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithHashMap();
        System.out.println("Practice 2");
        getFrequencyWord();
    }


    private static void getFrequencyWord() {
        Integer k;
        System.out.println("Enter line");
        String[] lines = in.nextLine().split(" ");
        System.out.println("Enter count max frequency");
        if (in.hasNextInt()) {
            k = in.nextInt();
            frequency(lines, k);
        } else System.out.println("It isn't number");

    }

    private static void frequency(String[] lines, Integer k) {
        Integer count = 0;
        Map<String, Integer> frequency = new HashMap<>();
        for (String line : lines) {
            if (frequency.containsKey(line)) {
                count = frequency.get(line);
                frequency.put(line, ++count);
            } else {
                frequency.put(line, 1);
            }
        }
        frequency.entrySet().stream().sorted((e1, e2) -> {
            int  val = Integer.compare(e2.getValue(), e1.getValue());
            if (val == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return val;
        }).limit(k).forEach(e->{System.out.println(e);});
    }

    private static void workWithHashMap() {
        Map<String, BigDecimal> map = new HashMap<>();
        String[] keys = {"6346537456345", "34343434344", "4347364364"};
        map.put(keys[0], new BigDecimal(34));
        map.put(keys[1], new BigDecimal(23));
        map.put(keys[2], new BigDecimal(44));
        map.remove(keys[1]);
        map.remove(keys[2]);
        System.out.println(map.get(keys[0]));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsValue(34));
    }
}
