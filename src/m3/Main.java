package m3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n############################### START ###############################\n");

        Integer[] luckyNumbers = { 25, 7, 1992, 2, 5, 1, 9 };

        System.out.println("Array de inteiros original: " + Arrays.asList(luckyNumbers));

        List<Integer> luckyList = MyOwnLists.asListedSorted(luckyNumbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        System.out.println("Lista de inteiros ordenada gerada: " + luckyList);

        String[] catBreeds = { "Sphynx", "Bengal", "British Shorthair", "Russian Blue", "Persa", "Savannah",
                "Ashera", "Maine Coon" };

        System.out.println("Array de strings original: " + Arrays.asList(catBreeds));

        List<String> catBreedsList = MyOwnLists.asListedSorted(catBreeds, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        System.out.println("Lista de strings ordenada gerada: " + catBreedsList);

        Double[] realNumbers = { 2.25, 7.33, 9.66, 3.99, 8.57, 3.0, 19.92 };

        System.out.println("Array de doubles original: " + Arrays.asList(realNumbers));

        List<Double> realNumbersList = MyOwnLists.asListedSorted(realNumbers, new Comparator<Double>() {

            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }

        });

        System.out.println("Lista de doubles ordenada gerada: " + realNumbersList);

        Cat[] gatitos = { new Cat("Brithsh Short Hair"), new Cat("Bengal"), new Cat("Savanna") };

        System.out.println("Array de gatos original: " + Arrays.asList(gatitos));

        List<Cat> gatitosList = MyOwnLists.asListedSorted(gatitos, new Comparator<Cat>() {

            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getRace().compareTo(o2.getRace());
            }

        });

        System.out.println("Lista de gatos ordenada gerada: " + gatitosList);

        System.out.println("\n################################ END ################################\n");

    }

}
