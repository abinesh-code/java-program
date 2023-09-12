import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {
    public static void main(String[] args) {
        double a = 1000.0/3.0;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
        String f = numberFormat.format(a);
        System.out.println(f);
    }
}
