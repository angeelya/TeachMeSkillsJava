package work35.home;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        checkCountStrings(List.of(new String[]{"a", "c", "love", "c", "b", "a"}));
        System.out.println("Task 2");
        getFirstAndLastSymbolWords(List.of(new String[]{"moon", "love", "cy", "bi", "man"}));
        System.out.println("Task*");
        if (checkBrackets("{{[]()}}}}")) System.out.println("line is balanced");
        else System.out.println("line isn't balanced");
    }

    private static void getFirstAndLastSymbolWords(List<String> strings) {
        Map<String, String> map = strings.stream().filter(line -> line.length() >= 2).collect(Collectors.toMap(
                line -> String.valueOf(line.charAt(0)), line -> String.valueOf(line.charAt(line.length() - 1)), (l1, l2) -> l1));
        //(l1,l2)->l1 resolve problem with duplicate
        System.out.println(map);
    }

    private static void checkCountStrings(List<String> lines) {
        Map<String, Boolean> map = new HashMap<>();
        for (String line : lines) {
            map.put(line, map.containsKey(line));
        }
        System.out.println(map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).toList());
    }

    private static boolean checkBrackets(String brackets) {
        LinkedList<Character> bracket = new LinkedList<>();
        for (int i = 0; i < brackets.length(); i++) {
            char b = brackets.charAt(i);
            if (b == '(' || b == '[' || b == '{') {
                bracket.push(b);
            } else if (bracket.isEmpty()) return false;
            else {
                char opening = bracket.pop();
                if (opening != '(' && b == ')' || opening != '[' && b == ']' || opening != '{' && b == '}')
                    return false;
            }
        }
        return bracket.isEmpty();
    }
}
