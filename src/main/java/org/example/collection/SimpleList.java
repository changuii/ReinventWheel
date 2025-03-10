package org.example.collection;

public interface SimpleList<T> {

    public static <T> SimpleArrayList<T> fromArrayToList(Object... values){
        return new SimpleArrayList<>(values);
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
