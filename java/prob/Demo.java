public class Demo {
    public static void main(String[] args) {
        int a[] = {59,5,55,6,2,6,77,88};

        int temp = a[0];
        for(int i: a) {
            if(i < temp)
                temp = i;
        }
        System.out.println(temp);
    }
}
