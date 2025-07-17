package org.example.collection;

import java.util.Arrays;

public class SimpleArrayList<T> implements SimpleList<T> {

    private Object[] data;
    private int currentIndex;
    private int size;

    public SimpleArrayList() {
        this.size = 1;
        this.currentIndex = 0;
        this.data = new Object[size];
    }

    public SimpleArrayList(Object... objects) {
        this.data = objects;
        this.size = data.length + 1;
        this.currentIndex = data.length;
    }

    @Override
    public boolean add(final T value) {
        data[currentIndex] = value;

        currentIndex++;
        if (currentIndex == size) {
            grow();
        }
        return true;
    }

    private void grow() {
        size <<= 1;
        data = Arrays.copyOf(data, size);
    }

    @Override
    public void add(final int index, final T value) {
        if (currentIndex <= index) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = currentIndex; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;

        currentIndex++;
        if (currentIndex == size) {
            grow();
        }
    }

    @Override
    public T set(final int index, final T value) {
        if (currentIndex < index) {
            throw new IndexOutOfBoundsException();
        }
        final T prevData = elementData(data[index]);;
        data[index] = value;
        return prevData;
    }

    @Override
    public T get(final int index) {
        if (currentIndex < index) {
            throw new IndexOutOfBoundsException();
        }
        return elementData(data[index]);
    }

    @Override
    public boolean contains(final T value) {
        return Arrays.stream(data)
                .filter(d -> value.equals(d))
                .findAny()
                .isPresent();
    }

    @Override
    public int indexOf(final T value) {
        for (int i = 0; i < currentIndex; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    @Override
    public boolean remove(final T value) {
        final int valueIndex = indexOf(value);

        if (valueIndex == -1) {
            return false;
        }

        for (int i = valueIndex; i < currentIndex; i++) {
            data[i] = data[i + 1];
        }

        currentIndex--;
        if (size << 1 > currentIndex) {
            atrophy();
        }

        return true;
    }

    private void atrophy() {
        size >>= 1;
        data = Arrays.copyOf(data, size);
    }

    @Override
    public T remove(final int index) {
        if (currentIndex <= index) {
            throw new IndexOutOfBoundsException();
        }

        final T prevData = elementData(data[index]);

        for (int i = index; i < currentIndex; i++) {
            data[i] = data[i + 1];
        }

        currentIndex--;
        if (size << 1 > currentIndex) {
            atrophy();
        }

        return prevData;
    }

    @Override
    public void clear() {
        currentIndex = 0;
        size = 1;
        data = new Object[size];
    }

    private T elementData(final Object o){
        return (T) o;
    }
}
