package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List<T> asListedSorted(T[] array, Comparator<T> comparator) {

        List<T> orderedList = new ArrayList<>();

        for (T elem : array)
            orderedList.add(elem);

        Collections.sort(orderedList, comparator);

        return orderedList;

    }

}
