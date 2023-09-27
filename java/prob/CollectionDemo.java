import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List al = new ArrayList<>();
        al.add(2);
        al.add(7);
        al.add(5);
        //for(int i=0;i<al.size();i++)
        //    System.out.println(al.get(i));
        //for(Object e : al)
        //    System.out.println(e);

        //Iterator it = al.iterator();
        //while(it.hasNext())
        //    System.out.println(it.next());

        Collections.sort(al,Collections.reverse(al));
        System.out.println(al);
    }
}