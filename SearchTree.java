package domashKa;

import java.util.List;

public interface SearchTree<T extends Comparable<T>> {
    T find(T element);
    List<T> getSortedList();
}