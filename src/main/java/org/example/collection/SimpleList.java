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

    static <T extends Number> SimpleList<T> filterNegative(SimpleList<T> simpleList) {
        final SimpleArrayList<T> filteredList = new SimpleArrayList<>();
        for (int i = 0; i < filteredList.size(); i++) {
            if (simpleList.get(i).doubleValue() >= 0) {
                filteredList.add(simpleList.get(i));
            }
        }
        return filteredList;
    }

    static <T> void copy(SimpleList<? extends T> origin, SimpleList<T> target) {
        target.clear();
        for (int i = 0; i < origin.size(); i++) {
            target.add(origin.get(i));
        }
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
