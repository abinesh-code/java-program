class A{

}
public class Demo3 {
    public static void main(String[] args) {
        /*A e = new A();
        boolean a = true;
        double x = 9.76f;
        System.out.println(printObject(e));
        System.out.println(printName(x));
        */
        double a = 9.97;
        var b = Math.round(a);
        System.out.println(printName(b));
        System.out.println(b);
    }
    public static String printObject(Object a) {

        return a.getClass().getName()+"@"+Integer.toHexString(a.hashCode());
    }
    public static String printName(Object a) {

        return a.getClass().getSimpleName();
    }
}
