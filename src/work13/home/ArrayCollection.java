package work13.home;

import java.util.Arrays;

public class ArrayCollection<T> {
    private T[] array, extendedArray;
    private int actualSize = 0;

    public ArrayCollection() {//default array
        array = (T[]) new Object[5];
    }

    public ArrayCollection(int size) {
        array = (T[]) new Object[size];
    }

    public void add(T object) {
        if (actualSize == array.length) {//увеличение в случаи переполнения
            extendedArray = (T[]) new Object[actualSize + 5];
            System.arraycopy(array, 0, extendedArray, 0, actualSize);
            array = extendedArray;
        }
        array[actualSize] = object;
        actualSize++;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public Integer length() {
        return actualSize;
    }

    public void remove(int index) {
        if (index > actualSize || index < -1)
            throw new ArrayIndexOutOfBoundsException("Exit of out the collection range bounds");
        if (index > -1) {
            for (int i = index; i < actualSize - 1; i++) {
                array[i] = array[i + 1];
            }
            array[actualSize - 1] = null;
            actualSize--;
        }
    }

    public void remove(T object) {
        for (int i = 0; i < actualSize; i++) {
            if (array[i].equals(object)) {
                remove(i);
                break;
            }
        }
    }

    public T get(int index) {
        if (index > actualSize || index < -1)
            throw new ArrayIndexOutOfBoundsException("Exit of out the collection range bounds");
        return array[index];
    }

    public boolean contains(T object) {
        for (int i = 0; i < actualSize; i++) {
            if (array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public T[] toArray() {
        return array;
    }

    public void clear() {
        array = (T[]) new Object[array.length];
        actualSize = 0;
    }
}
