import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Pair <Integer, String> pair = new Pair<Integer,String>(10, "A");
        System.out.println("First Elemen : " + pair.getFirst());
        System.out.println("Second Elemen : " + pair.getSecond());

        List <Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        Set<String> stringSet = new HashSet<>(Arrays.asList("A", "B", "C"));

        System.out.println("Printing elemens of IntegerList :");
        CollectionPrinter.printCollection(integerList);

        System.out.println("Printing elements of String :");
        CollectionPrinter.printCollection(stringSet);


    }
}
