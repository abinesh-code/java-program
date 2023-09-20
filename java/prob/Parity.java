package numbers;
import java.lang.Number;

public class Parity {
    public static <T extends Number> String check(T number) {
        if(number.intValue() % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
