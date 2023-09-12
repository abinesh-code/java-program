import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                integerList.add(num);
            } else {
                String str = scanner.next();
                stringList.add(str);
            }
        }

        // Convert the List<Integer> to an array of integers
        int[] numbers = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            numbers[i] = integerList.get(i);
        }

        // Convert the List<String> to an array of strings
        String[] strings = stringList.toArray(new String[0]);

        // Call the appropriate sum method based on the input type
        if (numbers.length > 0) {
            int total = sum(numbers);
            System.out.println(total);
        }

        if (strings.length > 0) {
            String concatenated = sum(strings);
            System.out.println(concatenated);
        }

        // Close the scanner
        scanner.close();
    }

    public static int sum(int[] num) {
        int result = 0;

        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }

        return result;
    }

    public static String sum(String[] strings) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
        }

        return result.toString();
    }
}

