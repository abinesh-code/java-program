import java.util.List;

public class ArrayListExample {
    public static <T extends Comparable<T>> T min(T... array) {
        if(array.length == 0)
            throw new IllegalArgumentException("Array is Empty");
        
        T minValue = array[0];
        for(int i=0;i<array.length;i++) {
            if(array[i].compareTo(minValue)<0)
                minValue = array[i];
        }
        return minValue;
    }
    public static void main(String[] args) {
        Integer[] arr = {5,33,2,5};
        System.out.println(ArrayListExample.min(arr));
    }
}
