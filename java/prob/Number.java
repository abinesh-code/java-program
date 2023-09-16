public class Number {
    // Find the minimum value in an array of comparable elements
    public static <T extends Comparable<T>> T min(T... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        T minValue = array[0];
        for (T element : array) {
            if (element.compareTo(minValue) < 0)
                minValue = element;
        }
        return minValue;
    }

    // Find the minimum value in an array of integers
    public static int min(int... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        int minValue = array[0];
        for (int element : array) {
            if (element < minValue)
                minValue = element;
        }
        return minValue;
    }

    // Find the minimum value in an array of doubles
    public static double min(double... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        double minValue = array[0];
        for (double element : array) {
            if (element < minValue)
                minValue = element;
        }
        return minValue;
    }

    // Find the maximum value in an array of comparable elements
    public static <T extends Comparable<T>> T max(T... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        T maxValue = array[0];
        for (T element : array) {
            if (element.compareTo(maxValue) > 0)
                maxValue = element;
        }
        return maxValue;
    }

    // Find the maximum value in an array of integers
    public static int max(int... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        int maxValue = array[0];
        for (int element : array) {
            if (element > maxValue)
                maxValue = element;
        }
        return maxValue;
    }

    // Find the maximum value in an array of doubles
    public static double max(double... array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        double maxValue = array[0];
        for (double element : array) {
            if (element > maxValue)
                maxValue = element;
        }
        return maxValue;
    }
}
