import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class zadanie2 {

    public static<E extends Iterable<?>> void wypiszCoDrugi(E obj){

        Iterator<?>iter= obj.iterator();
        int i=0;
        while(iter.hasNext()){
            if(i%2==0){

                System.out.print(iter.next());

                if(iter.hasNext())
                    System.out.print(",");
            }
            else iter.next();
            i++;
        }
    }


    public static void main(String[]ages){

        HashSet<Integer>HS1 = new HashSet<>(List.of(0,7,8,11,21,24,61));

        ArrayList<LocalTime>LT1 = new ArrayList<LocalTime>(List.of(LocalTime.of(18,16,24),
                LocalTime.of(3,22,31),
                LocalTime.of(7,21,15),
                        LocalTime.of(6,23,23),
                        LocalTime.of(4,25,24)));


        LinkedList<String>LL1=new LinkedList<>(List.of("E","F","G","H","i"));

        System.out.println("\n\nHashset:");
        System.out.println(HS1);
        System.out.println("Hashset co dwa:");
        zadanie2.<HashSet<Integer>>wypiszCoDrugi(HS1);

        System.out.println("\n\nLinkedList:");
        System.out.println(LL1);
        System.out.println("LinkedList co dwa:");
        zadanie2.<LinkedList<String>>wypiszCoDrugi(LL1);

        System.out.println("\n\nLocalTime:");
        System.out.println(LT1);
        System.out.println("LocalTime co dwa:");
        zadanie2.<ArrayList<LocalTime>>wypiszCoDrugi(LT1);


    }

}
