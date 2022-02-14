import java.io.File;
import java.io.IOException;
import java.util.*;

public class zadanie3 {

    public static File[] zad3_foo(File katalog){

        return katalog.listFiles(File::isDirectory);
    }

    public static void main(String[]ages) throws IOException{

        File katalog = new File("C:/Users");

        File[]podkatalog = zadanie3.zad3_foo(katalog);

        ArrayList<File> podkatalogiArray = new ArrayList<>(List.of(podkatalog));
        System.out.println(podkatalogiArray + "\n");
    }

}
