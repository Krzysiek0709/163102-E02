import java.time.LocalTime;
import java.util.Arrays;

public class zadanie1 {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab) {
        if (tab.length <= 1)
            return true;

        for (int i = 0, k = tab.length - 1; i < (tab.length) / 2 & k > i ;i++,k--)
        {
            if (tab[i].compareTo(tab[k]) != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] ages) {
        Integer[] tabintiger_s = {2, 3, 4, 5, 7, 11};
        Integer[] tabintiger_u = {1, 2, 12, 2, 1};

        LocalTime[] tabLocalTime_s = {
                LocalTime.of(2, 15, 5),
                LocalTime.of(8, 9, 5),
                LocalTime.of(9, 7, 5),
                LocalTime.of(10, 4, 3)};

        LocalTime[] tabLocalTime_u = {
                LocalTime.of(9, 6, 5),
                LocalTime.of(4, 10, 5),
                LocalTime.of(4, 10, 5),
                LocalTime.of(9, 6, 5)};


        System.out.print("\nTablica z elementami intiger, posortowane:");
        System.out.println(Arrays.toString(tabintiger_s));
        System.out.println("Czy ta tablica jest palindromem ?" + zadanie1.jestPalindromem(tabintiger_s));

        System.out.print("\nTablica z elementami intiger, posortowane:");
        System.out.println(Arrays.toString(tabintiger_u));
        System.out.println("Czy ta tablica jest palindromem ?" + zadanie1.jestPalindromem(tabintiger_u));

        System.out.print("\nTablica z elementami intiger, posortowane:");
        System.out.println(Arrays.toString(tabLocalTime_s));
        System.out.println("Czy ta tablica jest palindromem ?" + zadanie1.jestPalindromem(tabLocalTime_s));

        System.out.print("\nTablica z elementami intiger, posortowane:");
        System.out.println(Arrays.toString(tabLocalTime_u));
        System.out.println("Czy ta tablica jest palindromem ?" + zadanie1.jestPalindromem(tabLocalTime_u));


    }
}


