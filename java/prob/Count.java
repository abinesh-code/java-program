public class Count {
    private static int count;
    private static String city[] = new String[] {
        "Washington",
        "Monroe",
        "Jackson",
        "LaSalle"
    };
    public static void main(String[] args) {
        while(count<city.length) {
            if(city[count++].length()<8)
                break;
        }
        System.out.println("\nCount: "+count);
    }
}