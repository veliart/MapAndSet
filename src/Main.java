import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task2(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task3(new ArrayList<>(List.of("one", "two", "three", "two", "people", "one")));
        task4(new ArrayList<>(List.of("один", "два","два", "три", "три", "три")));
    }

    public static void task1(List<Integer> nums) {
        System.out.println("Task 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void task2(List<Integer> nums) {
        System.out.println("Task 2");
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !uniqueNums.contains(num)) {
                System.out.print(num + " ");
                uniqueNums.add(num);
            }
        }
    }
    public static void task3(List<String> words) {
        System.out.println("Task 3");
        Set<String> uniqueStrings = new HashSet<>(words);
        System.out.println(uniqueStrings);
    }

    public static void task4(List<String> words) {
        System.out.println("Task 4");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                Integer counterRepeats = wordsMap.get(word);
                wordsMap.put(word, counterRepeats + 1);
            }
            else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }

}