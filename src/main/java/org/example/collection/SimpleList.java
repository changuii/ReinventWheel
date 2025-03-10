package org.example.collection;

public interface SimpleList<T> {

    static <T> SimpleArrayList<T> fromArrayToList(Object... values) {
        return new SimpleArrayList<>(values);
    }

    static <T extends Number> double sum(SimpleList<T> simpleList) {
        Double sum = 0D;
        for (int i = 0; i < simpleList.size(); i++) {
            sum += simpleList.get(i).doubleValue();
        }
        return sum;
    }


    boolean add(T value);

    void add(int index, T value);

    T set(int index, T value);

    T get(int index);

    boolean contains(T value);

    int indexOf(T value);

    int size();

    boolean isEmpty();

    boolean remove(T value);

    T remove(int index);

    void clear();
}
